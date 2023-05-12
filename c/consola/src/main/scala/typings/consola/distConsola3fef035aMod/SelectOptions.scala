package typings.consola.distConsola3fef035aMod

import typings.consola.consolaStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectOptions
  extends StObject
     with PromptOptions {
  
  var initial: js.UndefOr[String] = js.undefined
  
  var options: js.Array[SelectOption | String]
  
  var `type`: select
}
object SelectOptions {
  
  inline def apply(options: js.Array[SelectOption | String]): SelectOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("select")
    __obj.asInstanceOf[SelectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectOptions] (val x: Self) extends AnyVal {
    
    inline def setInitial(value: String): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    inline def setOptions(value: js.Array[SelectOption | String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: (SelectOption | String)*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setType(value: select): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
