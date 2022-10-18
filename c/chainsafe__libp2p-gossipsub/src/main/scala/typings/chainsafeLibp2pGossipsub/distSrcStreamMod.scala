package typings.chainsafeLibp2pGossipsub

import typings.libp2pInterfaceConnection.mod.Stream
import typings.std.AsyncIterable
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStreamMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/stream", "InboundStream")
  @js.native
  open class InboundStream protected () extends StObject {
    def this(rawStream: Stream) = this()
    
    def close(): Unit = js.native
    
    /* private */ val closeController: Any = js.native
    
    /* private */ val rawStream: Any = js.native
    
    val source: AsyncIterable[Uint8ArrayList] = js.native
  }
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/stream", "OutboundStream")
  @js.native
  open class OutboundStream protected () extends StObject {
    def this(rawStream: Stream, errCallback: js.Function1[/* e */ js.Error, Unit], opts: OutboundStreamOpts) = this()
    
    def close(): Unit = js.native
    
    /* private */ val closeController: Any = js.native
    
    /* private */ val maxBufferSize: Any = js.native
    
    def protocol: String = js.native
    
    def push(data: js.typedarray.Uint8Array): Unit = js.native
    
    /* private */ val pushable: Any = js.native
    
    /* private */ val rawStream: Any = js.native
  }
  
  trait OutboundStreamOpts extends StObject {
    
    /** Max size in bytes for pushable buffer. If full, will throw on .push */
    var maxBufferSize: js.UndefOr[Double] = js.undefined
  }
  object OutboundStreamOpts {
    
    inline def apply(): OutboundStreamOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutboundStreamOpts]
    }
    
    extension [Self <: OutboundStreamOpts](x: Self) {
      
      inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
      
      inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
    }
  }
}
