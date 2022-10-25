package typings.chainsafeLibp2pGossipsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsTimeCacheMod {
  
  @JSImport("@chainsafe/libp2p-gossipsub/dist/src/utils/time-cache", "SimpleTimeCache")
  @js.native
  open class SimpleTimeCache[T] protected () extends StObject {
    def this(opts: SimpleTimeCacheOpts) = this()
    
    def clear(): Unit = js.native
    
    /* private */ val entries: Any = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    def get(key: Double): js.UndefOr[T] = js.native
    
    def has(key: String): Boolean = js.native
    
    def prune(): Unit = js.native
    
    /** Returns true if there was a key collision and the entry is dropped */
    def put(key: String, value: T): Boolean = js.native
    def put(key: Double, value: T): Boolean = js.native
    
    def size: Double = js.native
    
    /* private */ val validityMs: Any = js.native
  }
  
  trait SimpleTimeCacheOpts extends StObject {
    
    var validityMs: Double
  }
  object SimpleTimeCacheOpts {
    
    inline def apply(validityMs: Double): SimpleTimeCacheOpts = {
      val __obj = js.Dynamic.literal(validityMs = validityMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleTimeCacheOpts]
    }
    
    extension [Self <: SimpleTimeCacheOpts](x: Self) {
      
      inline def setValidityMs(value: Double): Self = StObject.set(x, "validityMs", value.asInstanceOf[js.Any])
    }
  }
}
