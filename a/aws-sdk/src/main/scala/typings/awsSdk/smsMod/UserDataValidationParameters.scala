package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDataValidationParameters extends StObject {
  
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
  implicit class UserDataValidationParametersMutableBuilder[Self <: UserDataValidationParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScriptType(value: ScriptType): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptTypeUndefined: Self = StObject.set(x, "scriptType", js.undefined)
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
