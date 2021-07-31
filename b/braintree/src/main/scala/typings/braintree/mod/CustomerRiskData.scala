package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerRiskData extends StObject {
  
  var customerBrowser: js.UndefOr[String] = js.undefined
  
  var customerIp: js.UndefOr[String] = js.undefined
}
object CustomerRiskData {
  
  @scala.inline
  def apply(): CustomerRiskData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerRiskData]
  }
  
  @scala.inline
  implicit class CustomerRiskDataMutableBuilder[Self <: CustomerRiskData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerBrowser(value: String): Self = StObject.set(x, "customerBrowser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerBrowserUndefined: Self = StObject.set(x, "customerBrowser", js.undefined)
    
    @scala.inline
    def setCustomerIp(value: String): Self = StObject.set(x, "customerIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIpUndefined: Self = StObject.set(x, "customerIp", js.undefined)
  }
}
