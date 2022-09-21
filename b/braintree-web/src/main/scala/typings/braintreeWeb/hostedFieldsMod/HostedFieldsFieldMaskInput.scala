package typings.braintreeWeb.hostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsFieldMaskInput extends StObject {
  
  /**
    * The character to use when masking the input.
    * @default '•'
    */
  var character: js.UndefOr[String] = js.undefined
  
  /**
    * Only applicable for the credit card field. Whether or not to show the last 4 digits of the card when masking.
    */
  var showLastFour: js.UndefOr[Boolean] = js.undefined
}
object HostedFieldsFieldMaskInput {
  
  inline def apply(): HostedFieldsFieldMaskInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedFieldsFieldMaskInput]
  }
  
  extension [Self <: HostedFieldsFieldMaskInput](x: Self) {
    
    inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
    
    inline def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
    
    inline def setShowLastFour(value: Boolean): Self = StObject.set(x, "showLastFour", value.asInstanceOf[js.Any])
    
    inline def setShowLastFourUndefined: Self = StObject.set(x, "showLastFour", js.undefined)
  }
}
