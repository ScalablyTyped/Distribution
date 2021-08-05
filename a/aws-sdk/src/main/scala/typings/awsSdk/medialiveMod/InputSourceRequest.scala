package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSourceRequest extends StObject {
  
  /**
    * The key used to extract the password from EC2 Parameter store.
    */
  var PasswordParam: js.UndefOr[string] = js.undefined
  
  /**
    * This represents the customer's source URL where stream is
  pulled from.
    */
  var Url: js.UndefOr[string] = js.undefined
  
  /**
    * The username for the input source.
    */
  var Username: js.UndefOr[string] = js.undefined
}
object InputSourceRequest {
  
  inline def apply(): InputSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSourceRequest]
  }
  
  extension [Self <: InputSourceRequest](x: Self) {
    
    inline def setPasswordParam(value: string): Self = StObject.set(x, "PasswordParam", value.asInstanceOf[js.Any])
    
    inline def setPasswordParamUndefined: Self = StObject.set(x, "PasswordParam", js.undefined)
    
    inline def setUrl(value: string): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    
    inline def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
