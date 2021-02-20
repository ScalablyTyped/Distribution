package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsCredentials extends StObject {
  
  /**
    * Temporary key allowing access to the Amazon GameLift S3 account.
    */
  var AccessKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Temporary secret key allowing access to the Amazon GameLift S3 account.
    */
  var SecretAccessKey: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Token used to associate a specific build ID with the files uploaded using these credentials.
    */
  var SessionToken: js.UndefOr[NonEmptyString] = js.native
}
object AwsCredentials {
  
  @scala.inline
  def apply(): AwsCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCredentials]
  }
  
  @scala.inline
  implicit class AwsCredentialsMutableBuilder[Self <: AwsCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: NonEmptyString): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    @scala.inline
    def setSecretAccessKey(value: NonEmptyString): Self = StObject.set(x, "SecretAccessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretAccessKeyUndefined: Self = StObject.set(x, "SecretAccessKey", js.undefined)
    
    @scala.inline
    def setSessionToken(value: NonEmptyString): Self = StObject.set(x, "SessionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionTokenUndefined: Self = StObject.set(x, "SessionToken", js.undefined)
  }
}
