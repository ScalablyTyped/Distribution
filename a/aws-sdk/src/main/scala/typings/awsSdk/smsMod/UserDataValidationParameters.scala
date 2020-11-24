package typings.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDataValidationParameters extends js.Object {
  
  /**
    * The type of validation script.
    */
  var scriptType: js.UndefOr[ScriptType] = js.native
  
  /**
    * The location of the validation script.
    */
  var source: js.UndefOr[Source] = js.native
}
object UserDataValidationParameters {
  
  @scala.inline
  def apply(): UserDataValidationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDataValidationParameters]
  }
  
  @scala.inline
  implicit class UserDataValidationParametersOps[Self <: UserDataValidationParameters] (val x: Self) extends AnyVal {
    
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
    def setScriptType(value: ScriptType): Self = this.set("scriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptType: Self = this.set("scriptType", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
