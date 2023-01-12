package typings.braintreeWeb.modulesHostedFieldsMod

import typings.braintreeWeb.anon.Options
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsField extends StObject {
  
  var container: js.UndefOr[String | HTMLElement] = js.undefined
  
  var formatInput: js.UndefOr[Boolean] = js.undefined
  
  var maskInput: js.UndefOr[Boolean | HostedFieldsFieldMaskInput] = js.undefined
  
  var maxCardLength: js.UndefOr[Double] = js.undefined
  
  var maxlength: js.UndefOr[Double] = js.undefined
  
  var minlength: js.UndefOr[Double] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var prefill: js.UndefOr[String] = js.undefined
  
  var rejectUnsupportedCards: js.UndefOr[Boolean] = js.undefined
  
  var select: js.UndefOr[Boolean | Options] = js.undefined
  
  /**
    * @deprecated Now an alias for `container`.
    */
  var selector: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object HostedFieldsField {
  
  inline def apply(): HostedFieldsField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedFieldsField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsField] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setFormatInput(value: Boolean): Self = StObject.set(x, "formatInput", value.asInstanceOf[js.Any])
    
    inline def setFormatInputUndefined: Self = StObject.set(x, "formatInput", js.undefined)
    
    inline def setMaskInput(value: Boolean | HostedFieldsFieldMaskInput): Self = StObject.set(x, "maskInput", value.asInstanceOf[js.Any])
    
    inline def setMaskInputUndefined: Self = StObject.set(x, "maskInput", js.undefined)
    
    inline def setMaxCardLength(value: Double): Self = StObject.set(x, "maxCardLength", value.asInstanceOf[js.Any])
    
    inline def setMaxCardLengthUndefined: Self = StObject.set(x, "maxCardLength", js.undefined)
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefill(value: String): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
    
    inline def setPrefillUndefined: Self = StObject.set(x, "prefill", js.undefined)
    
    inline def setRejectUnsupportedCards(value: Boolean): Self = StObject.set(x, "rejectUnsupportedCards", value.asInstanceOf[js.Any])
    
    inline def setRejectUnsupportedCardsUndefined: Self = StObject.set(x, "rejectUnsupportedCards", js.undefined)
    
    inline def setSelect(value: Boolean | Options): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
