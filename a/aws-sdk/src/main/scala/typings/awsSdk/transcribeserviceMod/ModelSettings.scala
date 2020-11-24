package typings.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelSettings extends js.Object {
  
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
  implicit class ModelSettingsOps[Self <: ModelSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLanguageModelName(value: ModelName): Self = this.set("LanguageModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageModelName: Self = this.set("LanguageModelName", js.undefined)
  }
}
