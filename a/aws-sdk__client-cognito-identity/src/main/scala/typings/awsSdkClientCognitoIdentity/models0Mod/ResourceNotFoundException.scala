package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceNotFoundException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ResourceNotFoundException: client = js.native
  
  /**
    * <p>The message returned by a ResourceNotFoundException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_ResourceNotFoundException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceNotFoundException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ResourceNotFoundException")
@js.native
object ResourceNotFoundException extends js.Object {
  
  def filterSensitiveLog(obj: ResourceNotFoundException): js.Any = js.native
}
