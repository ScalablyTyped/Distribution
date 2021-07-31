package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AWSSessionCredentials extends StObject {
  
  /**
    * The access key for the session.
    */
  var accessKeyId: AccessKeyId
  
  /**
    * The secret access key for the session.
    */
  var secretAccessKey: SecretAccessKey
  
  /**
    * The token for the session.
    */
  var sessionToken: SessionToken
}
object AWSSessionCredentials {
  
  @scala.inline
  def apply(accessKeyId: AccessKeyId, secretAccessKey: SecretAccessKey, sessionToken: SessionToken): AWSSessionCredentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AWSSessionCredentials]
  }
  
  @scala.inline
  implicit class AWSSessionCredentialsMutableBuilder[Self <: AWSSessionCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: AccessKeyId): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKey(value: SecretAccessKey): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionToken(value: SessionToken): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
  }
}
