package typings.awsSdkClientSts.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FederatedUser extends StObject {
  
  /**
    * <p>The ARN that specifies the federated user that is associated with the credentials. For
    *          more information about ARNs and how to use them in policies, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM
    *             Identifiers</a> in the <i>IAM User Guide</i>. </p>
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The string that identifies the federated user associated with the credentials, similar
    *          to the unique ID of an IAM user.</p>
    */
  var FederatedUserId: js.UndefOr[String] = js.undefined
}
object FederatedUser {
  
  inline def apply(): FederatedUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FederatedUser]
  }
  
  extension [Self <: FederatedUser](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setFederatedUserId(value: String): Self = StObject.set(x, "FederatedUserId", value.asInstanceOf[js.Any])
    
    inline def setFederatedUserIdUndefined: Self = StObject.set(x, "FederatedUserId", js.undefined)
  }
}
