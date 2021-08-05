package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InvalidIdentityPoolConfigurationException
  extends StObject
     with SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_InvalidIdentityPoolConfigurationException: client
  
  /**
    * <p>The message returned for an <code>InvalidIdentityPoolConfigurationException</code>
    *          </p>
    */
  var message: js.UndefOr[String] = js.undefined
  
  @JSName("name")
  var name_InvalidIdentityPoolConfigurationException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidIdentityPoolConfigurationException
}
object InvalidIdentityPoolConfigurationException {
  
  inline def apply($metadata: ResponseMetadata): InvalidIdentityPoolConfigurationException = {
    val __obj = js.Dynamic.literal($fault = "client", $metadata = $metadata.asInstanceOf[js.Any], name = "InvalidIdentityPoolConfigurationException")
    __obj.asInstanceOf[InvalidIdentityPoolConfigurationException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "InvalidIdentityPoolConfigurationException")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: InvalidIdentityPoolConfigurationException): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: InvalidIdentityPoolConfigurationException](x: Self) {
    
    inline def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.InvalidIdentityPoolConfigurationException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
