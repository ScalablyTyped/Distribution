package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceConflictException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ResourceConflictException: client = js.native
  
  /**
    * <p>The message returned by a ResourceConflictException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_ResourceConflictException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceConflictException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ResourceConflictException")
@js.native
object ResourceConflictException extends js.Object {
  
  def filterSensitiveLog(obj: ResourceConflictException): js.Any = js.native
}
