package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelSettings extends StObject {
  
  /**
    * The name of your custom language model.
    */
  var LanguageModelName: js.UndefOr[ModelName] = js.native
}
object ModelSettings {
  
  @scala.inline
  def apply(): ModelSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelSettings]
  }
  
  @scala.inline
  implicit class ModelSettingsMutableBuilder[Self <: ModelSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageModelName(value: ModelName): Self = StObject.set(x, "LanguageModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageModelNameUndefined: Self = StObject.set(x, "LanguageModelName", js.undefined)
  }
}
