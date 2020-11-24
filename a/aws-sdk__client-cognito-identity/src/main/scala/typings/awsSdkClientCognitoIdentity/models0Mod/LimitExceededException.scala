package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LimitExceededException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_LimitExceededException: client = js.native
  
  /**
    * <p>The message returned by a LimitExceededException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_LimitExceededException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.LimitExceededException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "LimitExceededException")
@js.native
object LimitExceededException extends js.Object {
  
  def filterSensitiveLog(obj: LimitExceededException): js.Any = js.native
}
