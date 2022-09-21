package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoOptionsStatus extends StObject {
  
  /**
    * Cognito options for the specified domain.
    */
  var Options: CognitoOptions
  
  /**
    * The status of the Cognito options for the specified domain.
    */
  var Status: OptionStatus
}
object CognitoOptionsStatus {
  
  inline def apply(Options: CognitoOptions, Status: OptionStatus): CognitoOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoOptionsStatus]
  }
  
  extension [Self <: CognitoOptionsStatus](x: Self) {
    
    inline def setOptions(value: CognitoOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OptionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
