package typings.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepDefinitionOptions extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var wrapperOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}
object StepDefinitionOptions {
  
  inline def apply(): StepDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepDefinitionOptions]
  }
  
  extension [Self <: StepDefinitionOptions](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWrapperOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
    
    inline def setWrapperOptionsUndefined: Self = StObject.set(x, "wrapperOptions", js.undefined)
  }
}
