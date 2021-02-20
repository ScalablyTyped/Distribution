package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
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
object DeveloperUserAlreadyRegisteredException {
  
  @scala.inline
  def apply(
    $fault: client,
    $metadata: ResponseMetadata,
    name: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.DeveloperUserAlreadyRegisteredException
  ): DeveloperUserAlreadyRegisteredException = {
    val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeveloperUserAlreadyRegisteredException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeveloperUserAlreadyRegisteredException.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: DeveloperUserAlreadyRegisteredException): js.Any = js.native
  
  @scala.inline
  implicit class DeveloperUserAlreadyRegisteredExceptionMutableBuilder[Self <: DeveloperUserAlreadyRegisteredException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.DeveloperUserAlreadyRegisteredException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
