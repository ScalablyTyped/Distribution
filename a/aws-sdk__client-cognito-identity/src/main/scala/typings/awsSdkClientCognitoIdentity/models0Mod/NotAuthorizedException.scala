package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotAuthorizedException
  extends StObject
     with SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_NotAuthorizedException: client
  
  /**
    * <p>The message returned by a NotAuthorizedException</p>
    */
  var message: js.UndefOr[String] = js.undefined
  
  @JSName("name")
  var name_NotAuthorizedException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.NotAuthorizedException
}
object NotAuthorizedException {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): NotAuthorizedException = {
    val __obj = js.Dynamic.literal($fault = "client", $metadata = $metadata.asInstanceOf[js.Any], name = "NotAuthorizedException")
    __obj.asInstanceOf[NotAuthorizedException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "NotAuthorizedException")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: NotAuthorizedException): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class NotAuthorizedExceptionMutableBuilder[Self <: NotAuthorizedException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.NotAuthorizedException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
