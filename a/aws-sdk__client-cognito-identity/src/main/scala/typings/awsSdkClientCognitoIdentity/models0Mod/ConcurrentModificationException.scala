package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcurrentModificationException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ConcurrentModificationException: client = js.native
  
  /**
    * <p>The message returned by a ConcurrentModificationException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_ConcurrentModificationException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ConcurrentModificationException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ConcurrentModificationException")
@js.native
object ConcurrentModificationException extends js.Object {
  
  def filterSensitiveLog(obj: ConcurrentModificationException): js.Any = js.native
}
