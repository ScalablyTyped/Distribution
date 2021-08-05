package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetShippingLabelOutput extends StObject {
  
  var ShippingLabelURL: js.UndefOr[GenericString] = js.undefined
  
  var Warning: js.UndefOr[GenericString] = js.undefined
}
object GetShippingLabelOutput {
  
  inline def apply(): GetShippingLabelOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetShippingLabelOutput]
  }
  
  extension [Self <: GetShippingLabelOutput](x: Self) {
    
    inline def setShippingLabelURL(value: GenericString): Self = StObject.set(x, "ShippingLabelURL", value.asInstanceOf[js.Any])
    
    inline def setShippingLabelURLUndefined: Self = StObject.set(x, "ShippingLabelURL", js.undefined)
    
    inline def setWarning(value: GenericString): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
