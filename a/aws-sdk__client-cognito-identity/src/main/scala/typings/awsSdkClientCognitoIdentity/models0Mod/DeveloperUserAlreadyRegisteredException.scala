package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeveloperUserAlreadyRegisteredException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_DeveloperUserAlreadyRegisteredException: client = js.native
  
  /**
    * <p>This developer user identifier is already registered with Cognito.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_DeveloperUserAlreadyRegisteredException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.DeveloperUserAlreadyRegisteredException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeveloperUserAlreadyRegisteredException")
@js.native
object DeveloperUserAlreadyRegisteredException extends js.Object {
  
  def filterSensitiveLog(obj: DeveloperUserAlreadyRegisteredException): js.Any = js.native
}
