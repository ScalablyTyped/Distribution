package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceNotFoundException
  extends StObject
     with SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ResourceNotFoundException: client
  
  /**
    * <p>The message returned by a ResourceNotFoundException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  
  @JSName("name")
  var name_ResourceNotFoundException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceNotFoundException
}
object ResourceNotFoundException {
  
  inline def apply($metadata: ResponseMetadata): ResourceNotFoundException = {
    val __obj = js.Dynamic.literal($fault = "client", $metadata = $metadata.asInstanceOf[js.Any], name = "ResourceNotFoundException")
    __obj.asInstanceOf[ResourceNotFoundException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ResourceNotFoundException")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: ResourceNotFoundException): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: ResourceNotFoundException](x: Self) {
    
    inline def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ResourceNotFoundException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
