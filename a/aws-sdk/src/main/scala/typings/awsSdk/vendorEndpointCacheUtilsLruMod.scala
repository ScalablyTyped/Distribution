package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vendorEndpointCacheUtilsLruMod {
  
  @JSImport("aws-sdk/vendor/endpoint-cache/utils/LRU", "LRUCache")
  @js.native
  open class LRUCache[T] protected () extends StObject {
    def this(size: Double) = this()
    
    /* private */ var detachFromList: Any = js.native
    
    def empty(): Unit = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    
    /* private */ var headerNode: Any = js.native
    
    val length: Double = js.native
    
    /* private */ var nodeMap: Any = js.native
    
    /* private */ var prependToList: Any = js.native
    
    def put(key: String, value: T): Unit = js.native
    
    def remove(key: String): Unit = js.native
    
    /* private */ var removeFromTail: Any = js.native
    
    /* private */ var size: Any = js.native
    
    /* private */ val sizeLimit: Any = js.native
    
    /* private */ var tailNode: Any = js.native
  }
}
