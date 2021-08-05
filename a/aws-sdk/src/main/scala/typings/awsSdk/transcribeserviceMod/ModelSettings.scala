package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelSettings extends StObject {
  
  /**
    * The name of your custom language model.
    */
  var LanguageModelName: js.UndefOr[ModelName] = js.undefined
}
object ModelSettings {
  
  inline def apply(): ModelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSettings]
  }
  
  extension [Self <: ModelSettings](x: Self) {
    
    inline def setLanguageModelName(value: ModelName): Self = StObject.set(x, "LanguageModelName", value.asInstanceOf[js.Any])
    
    inline def setLanguageModelNameUndefined: Self = StObject.set(x, "LanguageModelName", js.undefined)
  }
}
