package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterTypeOutput extends StObject {
  
  /**
    * The identifier for this registration request. Use this registration token when calling  DescribeTypeRegistration , which returns information about the status and IDs of the extension registration.
    */
  var RegistrationToken: js.UndefOr[typings.awsSdk.cloudformationMod.RegistrationToken] = js.undefined
}
object RegisterTypeOutput {
  
  inline def apply(): RegisterTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTypeOutput]
  }
  
  extension [Self <: RegisterTypeOutput](x: Self) {
    
    inline def setRegistrationToken(value: RegistrationToken): Self = StObject.set(x, "RegistrationToken", value.asInstanceOf[js.Any])
    
    inline def setRegistrationTokenUndefined: Self = StObject.set(x, "RegistrationToken", js.undefined)
  }
}
