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
object ResourceConflictException {
  
  @scala.inline
  def apply(
    $fault: client,
    $metadata: ResponseMetadata,
    name: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceConflictException
  ): ResourceConflictException = {
    val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConflictException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ResourceConflictException.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: ResourceConflictException): js.Any = js.native
  
  @scala.inline
  implicit class ResourceConflictExceptionMutableBuilder[Self <: ResourceConflictException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceConflictException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
