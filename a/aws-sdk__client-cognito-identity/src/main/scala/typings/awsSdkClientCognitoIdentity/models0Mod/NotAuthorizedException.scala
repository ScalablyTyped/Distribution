package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotAuthorizedException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_NotAuthorizedException: client = js.native
  
  /**
    * <p>The message returned by a NotAuthorizedException</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_NotAuthorizedException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.NotAuthorizedException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "NotAuthorizedException")
@js.native
object NotAuthorizedException extends js.Object {
  
  def filterSensitiveLog(obj: NotAuthorizedException): js.Any = js.native
}
