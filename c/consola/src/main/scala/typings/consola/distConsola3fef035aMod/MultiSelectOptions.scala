package typings.consola.distConsola3fef035aMod

import typings.consola.consolaStrings.multiselect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiSelectOptions
  extends StObject
     with PromptOptions {
  
  var initial: js.UndefOr[String] = js.undefined
  
  var options: js.Array[SelectOption | String]
  
  var required: js.UndefOr[Boolean] = js.undefined
  
  var `type`: multiselect
}
object MultiSelectOptions {
  
  inline def apply(options: js.Array[SelectOption | String]): MultiSelectOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("multiselect")
    __obj.asInstanceOf[MultiSelectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiSelectOptions] (val x: Self) extends AnyVal {
    
    inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setOptions(value: js.Array[SelectOption | String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: (SelectOption | String)*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setType(value: multiselect): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
