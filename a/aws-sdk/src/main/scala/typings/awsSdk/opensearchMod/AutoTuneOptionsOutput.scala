package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTuneOptionsOutput extends StObject {
  
  /**
    * The error message while enabling or disabling Auto-Tune.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The AutoTuneState for the domain. 
    */
  var State: js.UndefOr[AutoTuneState] = js.undefined
}
object AutoTuneOptionsOutput {
  
  inline def apply(): AutoTuneOptionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoTuneOptionsOutput]
  }
  
  extension [Self <: AutoTuneOptionsOutput](x: Self) {
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setState(value: AutoTuneState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
