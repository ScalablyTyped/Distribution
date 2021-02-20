package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterTypeOutput extends StObject {
  
  /**
    * The identifier for this registration request. Use this registration token when calling  DescribeTypeRegistration , which returns information about the status and IDs of the type registration. 
    */
  var RegistrationToken: js.UndefOr[typings.awsSdk.cloudformationMod.RegistrationToken] = js.native
}
object RegisterTypeOutput {
  
  @scala.inline
  def apply(): RegisterTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterTypeOutput]
  }
  
  @scala.inline
  implicit class RegisterTypeOutputMutableBuilder[Self <: RegisterTypeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistrationToken(value: RegistrationToken): Self = StObject.set(x, "RegistrationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationTokenUndefined: Self = StObject.set(x, "RegistrationToken", js.undefined)
  }
}
