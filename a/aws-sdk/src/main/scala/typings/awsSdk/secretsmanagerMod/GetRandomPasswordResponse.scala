package typings.awsSdk.secretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRandomPasswordResponse extends StObject {
  
  /**
    * A string with the generated password.
    */
  var RandomPassword: js.UndefOr[RandomPasswordType] = js.native
}
object GetRandomPasswordResponse {
  
  @scala.inline
  def apply(): GetRandomPasswordResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRandomPasswordResponse]
  }
  
  @scala.inline
  implicit class GetRandomPasswordResponseMutableBuilder[Self <: GetRandomPasswordResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRandomPassword(value: RandomPasswordType): Self = StObject.set(x, "RandomPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRandomPasswordUndefined: Self = StObject.set(x, "RandomPassword", js.undefined)
  }
}
