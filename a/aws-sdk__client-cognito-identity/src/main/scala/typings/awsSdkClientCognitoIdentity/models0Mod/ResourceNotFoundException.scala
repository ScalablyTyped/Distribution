package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeResour
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkClientCognitoIdentity.cognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "ResourceNotFoundException")
@js.native
open class ResourceNotFoundException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeResour) = this()
  
  @JSName("$fault")
  val $fault_ResourceNotFoundException: client = js.native
  
  @JSName("name")
  val name_ResourceNotFoundException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceNotFoundException = js.native
}
