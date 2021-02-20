package typings.cote.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Advertisement extends StObject {
  
  /**
    * Tunes the performance by grouping certain components. Two components
    * with exact same `environment`s with different `key`s wouldn't be able
    * to communicate. Think of it as `${environment}_${key}`.
    */
  var key: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  /**
    * Maps to a socket.io namespace. Shields a service from the rest of the
    * system. Components with different namespaces won't recognize each other
    * and try to communicate.
    */
  var namespace: js.UndefOr[String] = js.native
}
object Advertisement {
  
  @scala.inline
  def apply(name: String): Advertisement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advertisement]
  }
  
  @scala.inline
  implicit class AdvertisementMutableBuilder[Self <: Advertisement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
