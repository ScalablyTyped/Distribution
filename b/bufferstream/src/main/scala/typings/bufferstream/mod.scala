package typings.bufferstream

import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bufferstream", JSImport.Namespace)
  @js.native
  open class ^ () extends BufferStream {
    def this(options: Opts) = this()
  }
  
  object fn {
    
    @JSImport("bufferstream", "fn")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bufferstream", "fn.warn")
    @js.native
    def warn: Boolean = js.native
    inline def warn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BufferStream extends Duplex {
    
    /*
      returns Buffer.
      */
    var buffer: Buffer = js.native
    
    /*
      flushes buffer and disables stream buffering. BufferStream now pipes all data as long as the output accepting data. when the output is draining BufferStream will buffer all input temporary.
      token[s] buffer splitters (should be String or Buffer)
      disables given tokens. wont flush until no splitter tokens are left.
      */
    def disable(): Unit = js.native
    def disable(token: String, tokens: String*): Unit = js.native
    def disable(tokens: js.Array[Buffer | String]): Unit = js.native
    def disable(token: Buffer, tokens: Buffer*): Unit = js.native
    
    // can be one of ['none', 'flexible', <number>]
    /*
      enables stream buffering default
      */
    def enable(): Unit = js.native
    
    /*
      returns Buffer.
      */
    def getBuffer(): Buffer = js.native
    
    /*
      shortcut for buffer.length
      */
    var length: Double = js.native
    
    /*
      different buffer behaviors can be triggered by size:
      none when output drains, bufferstream drains too
      flexible buffers everthing that it gets and not piping out
      <number> TODO buffer has given size. buffers everthing until buffer is full. when buffer is full then the stream will drain
      */
    def setSize(size: String): Unit = js.native
    def setSize(size: Double): Unit = js.native
    
    def split(token: String, tokens: String*): Unit = js.native
    /*
      each time BufferStream finds a splitter token in the input data it will emit a split event. this also works for binary data.
      token[s] buffer splitters (should be String or Buffer)
      */
    def split(tokens: js.Array[Buffer | String]): Unit = js.native
    def split(token: Buffer, tokens: Buffer*): Unit = js.native
  }
  
  trait Opts extends StObject {
    
    /*
      if true and the source is a child_process the stream will block the entire process (timeouts wont work anymore, but splitting and listening on data still works, because they work sync)
      */
    var blocking: js.UndefOr[Boolean] = js.undefined
    
    /*
      immediately call disable
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /*
      default encoding for writing strings
      */
    var encoding: js.UndefOr[String] = js.undefined
    
    /*
      defines buffer level or sets buffer to given size (see ↓setSize for more)
      */
    var size: js.UndefOr[Any] = js.undefined
    
    /*
      short form for:
      split(token, function (chunk) {emit('data', chunk)})
      */
    // String or Buffer
    var split: js.UndefOr[Any] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setBlocking(value: Boolean): Self = StObject.set(x, "blocking", value.asInstanceOf[js.Any])
      
      inline def setBlockingUndefined: Self = StObject.set(x, "blocking", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSplit(value: Any): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
}
