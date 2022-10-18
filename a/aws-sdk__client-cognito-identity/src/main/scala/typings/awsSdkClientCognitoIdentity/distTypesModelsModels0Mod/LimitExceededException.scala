package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeLimitE
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkClientCognitoIdentity.distTypesModelsCognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "LimitExceededException")
@js.native
open class LimitExceededException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeLimitE) = this()
  
  @JSName("$fault")
  val $fault_LimitExceededException: client = js.native
  
  @JSName("name")
  val name_LimitExceededException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.LimitExceededException = js.native
}
