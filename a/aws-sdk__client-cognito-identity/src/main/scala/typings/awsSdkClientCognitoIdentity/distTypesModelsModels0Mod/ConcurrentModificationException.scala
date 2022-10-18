package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.awsSdkClientCognitoIdentity.anon.ExceptionOptionTypeConcur
import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkClientCognitoIdentity.distTypesModelsCognitoIdentityServiceExceptionMod.CognitoIdentityServiceException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/client-cognito-identity/dist-types/models/models_0", "ConcurrentModificationException")
@js.native
open class ConcurrentModificationException protected () extends CognitoIdentityServiceException {
  /**
    * @internal
    */
  def this(opts: ExceptionOptionTypeConcur) = this()
  
  @JSName("$fault")
  val $fault_ConcurrentModificationException: client = js.native
  
  @JSName("name")
  val name_ConcurrentModificationException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ConcurrentModificationException = js.native
}
