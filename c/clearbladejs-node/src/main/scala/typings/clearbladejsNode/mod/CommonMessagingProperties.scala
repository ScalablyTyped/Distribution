package typings.clearbladejsNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMessagingProperties extends StObject {
  
  var hosts: js.UndefOr[String] = js.undefined
  
  var ports: js.UndefOr[String] = js.undefined
}
object CommonMessagingProperties {
  
  @scala.inline
  def apply(): CommonMessagingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMessagingProperties]
  }
  
  @scala.inline
  implicit class CommonMessagingPropertiesMutableBuilder[Self <: CommonMessagingProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    @scala.inline
    def setPorts(value: String): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
  }
}
