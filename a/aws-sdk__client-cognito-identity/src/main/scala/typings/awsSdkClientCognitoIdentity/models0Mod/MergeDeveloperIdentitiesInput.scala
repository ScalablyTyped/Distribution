package typings.awsSdkClientCognitoIdentity.models0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeDeveloperIdentitiesInput extends js.Object {
  
  /**
    * <p>User identifier for the destination user. The value should be a
    *             <code>DeveloperUserIdentifier</code>.</p>
    */
  var DestinationUserIdentifier: js.UndefOr[String] = js.native
  
  /**
    * <p>The "domain" by which Cognito will refer to your users. This is a (pseudo) domain
    *          name that you provide while creating an identity pool. This name acts as a placeholder that
    *          allows your backend and the Cognito service to communicate about the developer provider.
    *          For the <code>DeveloperProviderName</code>, you can use letters as well as period (.),
    *          underscore (_), and dash (-).</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.native
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
  
  /**
    * <p>User identifier for the source user. The value should be a
    *             <code>DeveloperUserIdentifier</code>.</p>
    */
  var SourceUserIdentifier: js.UndefOr[String] = js.native
}
@JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "MergeDeveloperIdentitiesInput")
@js.native
object MergeDeveloperIdentitiesInput extends js.Object {
  
  def filterSensitiveLog(obj: MergeDeveloperIdentitiesInput): js.Any = js.native
}
