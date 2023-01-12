package typings.carbonComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<carbon-components.carbon-components/components/checkbox/checkbox.CheckboxOptions> */
trait PartialCheckboxOptions extends StObject {
  
  var attribContainedCheckboxDisabled: js.UndefOr[String] = js.undefined
  
  var attribContainedCheckboxState: js.UndefOr[String] = js.undefined
  
  var classLabel: js.UndefOr[String] = js.undefined
  
  var classLabelFocused: js.UndefOr[String] = js.undefined
  
  var selectorContainedCheckboxDisabled: js.UndefOr[String] = js.undefined
  
  var selectorContainedCheckboxState: js.UndefOr[String] = js.undefined
  
  var selectorInit: js.UndefOr[String] = js.undefined
}
object PartialCheckboxOptions {
  
  inline def apply(): PartialCheckboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckboxOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCheckboxOptions] (val x: Self) extends AnyVal {
    
    inline def setAttribContainedCheckboxDisabled(value: String): Self = StObject.set(x, "attribContainedCheckboxDisabled", value.asInstanceOf[js.Any])
    
    inline def setAttribContainedCheckboxDisabledUndefined: Self = StObject.set(x, "attribContainedCheckboxDisabled", js.undefined)
    
    inline def setAttribContainedCheckboxState(value: String): Self = StObject.set(x, "attribContainedCheckboxState", value.asInstanceOf[js.Any])
    
    inline def setAttribContainedCheckboxStateUndefined: Self = StObject.set(x, "attribContainedCheckboxState", js.undefined)
    
    inline def setClassLabel(value: String): Self = StObject.set(x, "classLabel", value.asInstanceOf[js.Any])
    
    inline def setClassLabelFocused(value: String): Self = StObject.set(x, "classLabelFocused", value.asInstanceOf[js.Any])
    
    inline def setClassLabelFocusedUndefined: Self = StObject.set(x, "classLabelFocused", js.undefined)
    
    inline def setClassLabelUndefined: Self = StObject.set(x, "classLabel", js.undefined)
    
    inline def setSelectorContainedCheckboxDisabled(value: String): Self = StObject.set(x, "selectorContainedCheckboxDisabled", value.asInstanceOf[js.Any])
    
    inline def setSelectorContainedCheckboxDisabledUndefined: Self = StObject.set(x, "selectorContainedCheckboxDisabled", js.undefined)
    
    inline def setSelectorContainedCheckboxState(value: String): Self = StObject.set(x, "selectorContainedCheckboxState", value.asInstanceOf[js.Any])
    
    inline def setSelectorContainedCheckboxStateUndefined: Self = StObject.set(x, "selectorContainedCheckboxState", js.undefined)
    
    inline def setSelectorInit(value: String): Self = StObject.set(x, "selectorInit", value.asInstanceOf[js.Any])
    
    inline def setSelectorInitUndefined: Self = StObject.set(x, "selectorInit", js.undefined)
  }
}
