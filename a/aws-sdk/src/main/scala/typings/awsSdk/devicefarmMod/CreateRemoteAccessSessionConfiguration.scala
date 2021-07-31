package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRemoteAccessSessionConfiguration extends StObject {
  
  /**
    * The billing method for the remote access session.
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.undefined
  
  /**
    * An array of ARNs included in the VPC endpoint configuration.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined
}
object CreateRemoteAccessSessionConfiguration {
  
  @scala.inline
  def apply(): CreateRemoteAccessSessionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRemoteAccessSessionConfiguration]
  }
  
  @scala.inline
  implicit class CreateRemoteAccessSessionConfigurationMutableBuilder[Self <: CreateRemoteAccessSessionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingMethod(value: BillingMethod): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
    
    @scala.inline
    def setVpceConfigurationArns(value: AmazonResourceNames): Self = StObject.set(x, "vpceConfigurationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationArnsUndefined: Self = StObject.set(x, "vpceConfigurationArns", js.undefined)
    
    @scala.inline
    def setVpceConfigurationArnsVarargs(value: AmazonResourceName*): Self = StObject.set(x, "vpceConfigurationArns", js.Array(value :_*))
  }
}
