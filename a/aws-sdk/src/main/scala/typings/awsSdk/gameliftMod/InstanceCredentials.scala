package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceCredentials extends StObject {
  
  /**
    * Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For Linux instances, it is a private key (which must be saved as a .pem file) for use with SSH.
    */
  var Secret: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * User login string.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.undefined
}
object InstanceCredentials {
  
  inline def apply(): InstanceCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCredentials]
  }
  
  extension [Self <: InstanceCredentials](x: Self) {
    
    inline def setSecret(value: NonEmptyString): Self = StObject.set(x, "Secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "Secret", js.undefined)
    
    inline def setUserName(value: NonEmptyString): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
