package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.server
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalErrorException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InternalErrorException: server = js.native
  
  /**
    * <p>The message returned by an InternalErrorException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_InternalErrorException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalErrorException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InternalErrorException")
@js.native
object InternalErrorException extends js.Object {
  
  def filterSensitiveLog(obj: InternalErrorException): js.Any = js.native
}
