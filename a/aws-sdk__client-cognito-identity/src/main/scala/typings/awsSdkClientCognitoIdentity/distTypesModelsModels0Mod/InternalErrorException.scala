package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeIntern
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.server
import typings.awsSdkClientCognitoIdentity.distTypesModelsCognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "InternalErrorException")
@js.native
open class InternalErrorException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeIntern) = this()
  
  @JSName("$fault")
  val $fault_InternalErrorException: server = js.native
  
  @JSName("name")
  val name_InternalErrorException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalErrorException = js.native
}
