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
object ResourceNotFoundException {
  
  @scala.inline
  def apply(
    $fault: client,
    $metadata: ResponseMetadata,
    name: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceNotFoundException
  ): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceNotFoundException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ResourceNotFoundException.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: ResourceNotFoundException): js.Any = js.native
  
  @scala.inline
  implicit class ResourceNotFoundExceptionMutableBuilder[Self <: ResourceNotFoundException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceNotFoundException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
