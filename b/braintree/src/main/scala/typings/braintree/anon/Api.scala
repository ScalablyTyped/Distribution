package typings.braintree.anon

import typings.braintree.braintreeStrings.ControlPanel
import typings.braintree.braintreeStrings.Recurring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Api extends StObject {
  
  var Api: typings.braintree.braintreeStrings.Api
  
  var ControlPanel: typings.braintree.braintreeStrings.ControlPanel
  
  var Recurring: typings.braintree.braintreeStrings.Recurring
}
object Api {
  
  inline def apply(): Api = {
    val __obj = js.Dynamic.literal(Api = "Api", ControlPanel = "ControlPanel", Recurring = "Recurring")
    __obj.asInstanceOf[Api]
  }
  
  extension [Self <: Api](x: Self) {
    
    inline def setApi(value: typings.braintree.braintreeStrings.Api): Self = StObject.set(x, "Api", value.asInstanceOf[js.Any])
    
    inline def setControlPanel(value: ControlPanel): Self = StObject.set(x, "ControlPanel", value.asInstanceOf[js.Any])
    
    inline def setRecurring(value: Recurring): Self = StObject.set(x, "Recurring", value.asInstanceOf[js.Any])
  }
}
