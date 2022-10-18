package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeNotAut
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkClientCognitoIdentity.distTypesModelsCognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "NotAuthorizedException")
@js.native
open class NotAuthorizedException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeNotAut) = this()
  
  @JSName("$fault")
  val $fault_NotAuthorizedException: client = js.native
  
  @JSName("name")
  val name_NotAuthorizedException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.NotAuthorizedException = js.native
}
