package typings.awsSdkClientCognitoIdentity.models0Mod

import typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.client
import typings.awsSdkSmithyClient.exceptionMod.SmithyException
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcurrentModificationException
  extends StObject
     with SmithyException
     with MetadataBearer {
  
  @JSName("$fault")
  var $fault_ConcurrentModificationException: client
  
  /**
    * <p>The message returned by a ConcurrentModificationException.</p>
    */
  var message: js.UndefOr[String] = js.undefined
  
  @JSName("name")
  var name_ConcurrentModificationException: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ConcurrentModificationException
}
object ConcurrentModificationException {
  
  @scala.inline
  def apply($metadata: ResponseMetadata): ConcurrentModificationException = {
    val __obj = js.Dynamic.literal($fault = "client", $metadata = $metadata.asInstanceOf[js.Any], name = "ConcurrentModificationException")
    __obj.asInstanceOf[ConcurrentModificationException]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "ConcurrentModificationException")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: ConcurrentModificationException): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class ConcurrentModificationExceptionMutableBuilder[Self <: ConcurrentModificationException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$fault(value: client): Self = StObject.set(x, "$fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setName(
      value: typings.awsSdkClientCognitoIdentity.awsSdkClientCognitoIdentityStrings.ConcurrentModificationException
    ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
