package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InvalidIdentityPoolConfigurationException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InvalidIdentityPoolConfigurationException: client = js.native
  
  /**
    * <p>The message returned for an <code>InvalidIdentityPoolConfigurationException</code>
    *          </p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_InvalidIdentityPoolConfigurationException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidIdentityPoolConfigurationException = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InvalidIdentityPoolConfigurationException")
@js.native
object InvalidIdentityPoolConfigurationException extends js.Object {
  
  def filterSensitiveLog(obj: InvalidIdentityPoolConfigurationException): js.Any = js.native
}
