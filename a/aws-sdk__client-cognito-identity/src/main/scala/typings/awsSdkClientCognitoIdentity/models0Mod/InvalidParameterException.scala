package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeInvali
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkClientCognitoIdentity.cognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "InvalidParameterException")
@js.native
open class InvalidParameterException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeInvali) = this()
  
  @JSName("$fault")
  val $fault_InvalidParameterException: client = js.native
  
  @JSName("name")
  val name_InvalidParameterException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidParameterException = js.native
}
