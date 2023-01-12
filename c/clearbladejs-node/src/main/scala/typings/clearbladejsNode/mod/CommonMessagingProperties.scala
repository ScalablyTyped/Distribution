package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMessagingProperties extends StObject {
  
  var hosts: js.UndefOr[String] = js.undefined
  
  var ports: js.UndefOr[String] = js.undefined
}
object CommonMessagingProperties {
  
  inline def apply(): CommonMessagingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMessagingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonMessagingProperties] (val x: Self) extends AnyVal {
    
    inline def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setPorts(value: String): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
  }
}
