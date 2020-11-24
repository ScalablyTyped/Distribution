package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidParameterException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InvalidParameterException: client = js.native
  
  /**
    * <p>The message returned by an InvalidParameterException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_InvalidParameterException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidParameterException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InvalidParameterException")
@js.native
object InvalidParameterException extends js.Object {
  
  def filterSensitiveLog(obj: InvalidParameterException): js.Any = js.native
}
