package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.server
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalErrorException
  extends StObject
     with SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InternalErrorException: server
  
  /**
    * <p>The message returned by an InternalErrorException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  
  @JSName("name")
  var name_InternalErrorException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InternalErrorException
}
object InternalErrorException {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): InternalErrorException = {
    val __obj = js.Dynamic.literal($fault = "server", $metadata = $metadata.asInstanceOf[js.Any], name = "InternalErrorException")
    __obj.asInstanceOf[InternalErrorException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InternalErrorException")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: InternalErrorException): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
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
