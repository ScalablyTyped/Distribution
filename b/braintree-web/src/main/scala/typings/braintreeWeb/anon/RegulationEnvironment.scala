package typings.braintreeWeb.anon

import typings.braintreeWeb.braintreeWebStrings.psd2
import typings.braintreeWeb.braintreeWebStrings.unavailable
import typings.braintreeWeb.braintreeWebStrings.unregulated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegulationEnvironment extends StObject {
  
  var regulationEnvironment: js.UndefOr[psd2 | unregulated | unavailable] = js.undefined
}
object RegulationEnvironment {
  
  inline def apply(): RegulationEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegulationEnvironment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegulationEnvironment] (val x: Self) extends AnyVal {
    
    inline def setRegulationEnvironment(value: psd2 | unregulated | unavailable): Self = StObject.set(x, "regulationEnvironment", value.asInstanceOf[js.Any])
    
    inline def setRegulationEnvironmentUndefined: Self = StObject.set(x, "regulationEnvironment", js.undefined)
  }
}
