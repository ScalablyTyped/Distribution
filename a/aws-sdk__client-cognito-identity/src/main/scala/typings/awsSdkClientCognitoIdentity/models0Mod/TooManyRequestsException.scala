package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooManyRequestsException
  extends StObject
     with SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_TooManyRequestsException: client
  
  /**
    * <p>Message returned by a TooManyRequestsException</p>
    */
  var message: js.UndefOr[String] = js.undefined
  
  @JSName("name")
  var name_TooManyRequestsException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.TooManyRequestsException
}
object TooManyRequestsException {
  
  inline def apply($metadata: ResponseMetadata): TooManyRequestsException = {
    val __obj = js.Dynamic.literal($fault = "client", $metadata = $metadata.asInstanceOf[js.Any], name = "TooManyRequestsException")
    __obj.asInstanceOf[TooManyRequestsException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "TooManyRequestsException")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: TooManyRequestsException): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: TooManyRequestsException](x: Self) {
    
    inline def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.TooManyRequestsException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
