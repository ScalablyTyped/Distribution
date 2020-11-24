package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalServiceException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ExternalServiceException: client = js.native
  
  /**
    * <p>The message returned by an ExternalServiceException</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_ExternalServiceException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ExternalServiceException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ExternalServiceException")
@js.native
object ExternalServiceException extends js.Object {
  
  def filterSensitiveLog(obj: ExternalServiceException): js.Any = js.native
}
