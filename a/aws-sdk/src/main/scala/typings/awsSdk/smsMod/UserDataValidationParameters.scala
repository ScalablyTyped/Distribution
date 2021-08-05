package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserDataValidationParameters extends StObject {
  
  /**
    * The type of validation script.
    */
  var scriptType: js.UndefOr[ScriptType] = js.undefined
  
  /**
    * The location of the validation script.
    */
  var source: js.UndefOr[Source] = js.undefined
}
object UserDataValidationParameters {
  
  inline def apply(): UserDataValidationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDataValidationParameters]
  }
  
  extension [Self <: UserDataValidationParameters](x: Self) {
    
    inline def setScriptType(value: ScriptType): Self = StObject.set(x, "scriptType", value.asInstanceOf[js.Any])
    
    inline def setScriptTypeUndefined: Self = StObject.set(x, "scriptType", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
