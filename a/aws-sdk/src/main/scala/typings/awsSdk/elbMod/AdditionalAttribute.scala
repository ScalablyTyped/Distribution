package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalAttribute extends StObject {
  
  /**
    * The name of the attribute. The following attribute is supported.    elb.http.desyncmitigationmode - Determines how the load balancer handles requests that might pose a security risk to your application. The possible values are monitor, defensive, and strictest. The default is defensive.  
    */
  var Key: js.UndefOr[AdditionalAttributeKey] = js.undefined
  
  /**
    * This value of the attribute.
    */
  var Value: js.UndefOr[AdditionalAttributeValue] = js.undefined
}
object AdditionalAttribute {
  
  @scala.inline
  def apply(): AdditionalAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalAttribute]
  }
  
  @scala.inline
  implicit class AdditionalAttributeMutableBuilder[Self <: AdditionalAttribute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: AdditionalAttributeKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setValue(value: AdditionalAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
