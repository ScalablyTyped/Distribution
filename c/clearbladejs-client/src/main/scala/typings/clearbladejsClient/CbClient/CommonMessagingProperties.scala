package typings.clearbladejsClient.CbClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonMessagingProperties extends StObject {
  
  var cleanSession: js.UndefOr[Boolean] = js.undefined
  
  var hosts: js.UndefOr[String] = js.undefined
  
  var onFailure: js.UndefOr[js.Function] = js.undefined
  
  var onSuccess: js.UndefOr[js.Function] = js.undefined
  
  var ports: js.UndefOr[String] = js.undefined
  
  var useSSL: js.UndefOr[Boolean] = js.undefined
}
object CommonMessagingProperties {
  
  inline def apply(): CommonMessagingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMessagingProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonMessagingProperties] (val x: Self) extends AnyVal {
    
    inline def setCleanSession(value: Boolean): Self = StObject.set(x, "cleanSession", value.asInstanceOf[js.Any])
    
    inline def setCleanSessionUndefined: Self = StObject.set(x, "cleanSession", js.undefined)
    
    inline def setHosts(value: String): Self = StObject.set(x, "hosts", value.asInstanceOf[js.Any])
    
    inline def setHostsUndefined: Self = StObject.set(x, "hosts", js.undefined)
    
    inline def setOnFailure(value: js.Function): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnSuccess(value: js.Function): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setPorts(value: String): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
    
    inline def setUseSSL(value: Boolean): Self = StObject.set(x, "useSSL", value.asInstanceOf[js.Any])
    
    inline def setUseSSLUndefined: Self = StObject.set(x, "useSSL", js.undefined)
  }
}
