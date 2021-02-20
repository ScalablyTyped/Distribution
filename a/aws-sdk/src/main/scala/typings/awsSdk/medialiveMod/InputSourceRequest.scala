package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputSourceRequest extends StObject {
  
  /**
    * The key used to extract the password from EC2 Parameter store.
    */
  var PasswordParam: js.UndefOr[string] = js.native
  
  /**
    * This represents the customer's source URL where stream is
  pulled from.
    */
  var Url: js.UndefOr[string] = js.native
  
  /**
    * The username for the input source.
    */
  var Username: js.UndefOr[string] = js.native
}
object InputSourceRequest {
  
  @scala.inline
  def apply(): InputSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSourceRequest]
  }
  
  @scala.inline
  implicit class InputSourceRequestMutableBuilder[Self <: InputSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswordParam(value: string): Self = StObject.set(x, "PasswordParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordParamUndefined: Self = StObject.set(x, "PasswordParam", js.undefined)
    
    @scala.inline
    def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    @scala.inline
    def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
