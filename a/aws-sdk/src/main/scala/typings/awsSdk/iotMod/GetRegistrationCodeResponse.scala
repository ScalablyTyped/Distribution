package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRegistrationCodeResponse extends StObject {
  
  /**
    * The CA certificate registration code.
    */
  var registrationCode: js.UndefOr[RegistrationCode] = js.native
}
object GetRegistrationCodeResponse {
  
  @scala.inline
  def apply(): GetRegistrationCodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRegistrationCodeResponse]
  }
  
  @scala.inline
  implicit class GetRegistrationCodeResponseMutableBuilder[Self <: GetRegistrationCodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistrationCode(value: RegistrationCode): Self = StObject.set(x, "registrationCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationCodeUndefined: Self = StObject.set(x, "registrationCode", js.undefined)
  }
}
