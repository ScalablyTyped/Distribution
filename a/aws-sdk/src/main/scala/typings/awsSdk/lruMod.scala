package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lruMod {
  
  @JSImport("aws-sdk/vendor/endpoint-cache/utils/LRU", "LRUCache")
  @js.native
  class LRUCache[T] protected () extends StObject {
    def this(size: Double) = this()
    
    /* private */ var detachFromList: js.Any = js.native
    
    def empty(): Unit = js.native
    
    def get(key: String): js.UndefOr[T] = js.native
    
    /* private */ var headerNode: js.Any = js.native
    
    val length: Double = js.native
    
    /* private */ var nodeMap: js.Any = js.native
    
    /* private */ var prependToList: js.Any = js.native
    
    def put(key: String, value: T): Unit = js.native
    
    def remove(key: String): Unit = js.native
    
    /* private */ var removeFromTail: js.Any = js.native
    
    /* private */ var size: js.Any = js.native
    
    /* private */ val sizeLimit: js.Any = js.native
    
    /* private */ var tailNode: js.Any = js.native
  }
}
