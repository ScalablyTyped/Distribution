package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.server
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalErrorException
  extends SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InternalErrorException: server = js.native
  
  /**
    * <p>The message returned by an InternalErrorException.</p>
    */
  var message: js.UndefOr[String] = js.native
  
  @JSName("name")
  var name_InternalErrorException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalErrorException = js.native
}
object InternalErrorException {
  
  @scala.inline
  def apply(
    $fault: server,
    $metadata: ResponseMetadata,
    name: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalErrorException
  ): InternalErrorException = {
    val __obj = js.Dynamic.literal($fault = $fault.asInstanceOf[js.Any], $metadata = $metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalErrorException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InternalErrorException.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: InternalErrorException): js.Any = js.native
  
  @scala.inline
  implicit class InternalErrorExceptionMutableBuilder[Self <: InternalErrorException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: server): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalErrorException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
