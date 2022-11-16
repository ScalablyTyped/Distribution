package typings.combinedStream

import typings.combinedStream.combinedStreamStrings.close
import typings.combinedStream.combinedStreamStrings.data
import typings.combinedStream.combinedStreamStrings.end
import typings.combinedStream.combinedStreamStrings.error
import typings.combinedStream.combinedStreamStrings.pause
import typings.combinedStream.combinedStreamStrings.resume
import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("combined-stream", JSImport.Namespace)
  @js.native
  open class ^ () extends CombinedStream
  @JSImport("combined-stream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(): CombinedStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[CombinedStream]
  inline def create(options: Options): CombinedStream = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[CombinedStream]
  
  /* static member */
  inline def isStreamLike(stream: Any): /* is node.stream.Stream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStreamLike")(stream.asInstanceOf[js.Any]).asInstanceOf[/* is node.stream.Stream */ Boolean]
  
  type Appendable = ReadableStream | WritableStream | Buffer | String | NextFunction
  
  @js.native
  trait CombinedStream
    extends Stream
       with Options {
    
    def _checkDataSize(): Unit = js.native
    
    var _currentStream: Stream | Buffer | String | Null = js.native
    
    def _emitError(error: js.Error): Unit = js.native
    
    def _getNext(): Unit = js.native
    
    def _handleErrors(stream: EventEmitter): Unit = js.native
    
    def _pipeNext(): Unit = js.native
    
    // private properties
    var _released: Boolean = js.native
    
    def _reset(): Unit = js.native
    
    // @TODO it should be a type of Array<'delayed-stream' instance | Buffer | string>
    var _streams: js.Array[Stream | Buffer | String] = js.native
    
    def _updateDataSize(): Unit = js.native
    
    def append(stream: Appendable): this.type = js.native
    
    val dataSize: Double = js.native
    
    def destroy(): Unit = js.native
    
    def end(): Unit = js.native
    
    @JSName("maxDataSize")
    var maxDataSize_CombinedStream: Double = js.native
    
    // events
    def on(event: close | end | resume | pause, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def once(event: close | end | resume | pause, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_data(event: data, cb: js.Function1[/* data */ Any, Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, cb: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    def pause(): Unit = js.native
    
    @JSName("pauseStreams")
    var pauseStreams_CombinedStream: Boolean = js.native
    
    val readable: Boolean = js.native
    
    def resume(): Unit = js.native
    
    val writable: Boolean = js.native
    
    def write(data: Any): Unit = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type NextFunction = (next : (stream : combined-stream.combined-stream.Appendable): any): any
  }}}
  to avoid circular code involving: 
  - combined-stream.combined-stream.Appendable
  - combined-stream.combined-stream.NextFunction
  */
  @js.native
  trait NextFunction extends StObject {
    
    def apply(next: js.Function1[/* stream */ Appendable, Any]): Any = js.native
  }
  
  trait Options extends StObject {
    
    var maxDataSize: js.UndefOr[Double] = js.undefined
    
    var pauseStreams: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMaxDataSize(value: Double): Self = StObject.set(x, "maxDataSize", value.asInstanceOf[js.Any])
      
      inline def setMaxDataSizeUndefined: Self = StObject.set(x, "maxDataSize", js.undefined)
      
      inline def setPauseStreams(value: Boolean): Self = StObject.set(x, "pauseStreams", value.asInstanceOf[js.Any])
      
      inline def setPauseStreamsUndefined: Self = StObject.set(x, "pauseStreams", js.undefined)
    }
  }
}
