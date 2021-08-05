package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeDeveloperIdentitiesInput extends StObject {
  
  /**
    * <p>User identifier for the destination user. The value should be a
    *             <code>DeveloperUserIdentifier</code>.</p>
    */
  var DestinationUserIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The "domain" by which Cognito will refer to your users. This is a (pseudo) domain
    *          name that you provide while creating an identity pool. This name acts as a placeholder that
    *          allows your backend and the Cognito service to communicate about the developer provider.
    *          For the <code>DeveloperProviderName</code>, you can use letters as well as period (.),
    *          underscore (_), and dash (-).</p>
    */
  var DeveloperProviderName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>User identifier for the source user. The value should be a
    *             <code>DeveloperUserIdentifier</code>.</p>
    */
  var SourceUserIdentifier: js.UndefOr[String] = js.undefined
}
object MergeDeveloperIdentitiesInput {
  
  inline def apply(): MergeDeveloperIdentitiesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeDeveloperIdentitiesInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "MergeDeveloperIdentitiesInput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: MergeDeveloperIdentitiesInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: MergeDeveloperIdentitiesInput](x: Self) {
    
    inline def setDestinationUserIdentifier(value: String): Self = StObject.set(x, "DestinationUserIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDestinationUserIdentifierUndefined: Self = StObject.set(x, "DestinationUserIdentifier", js.undefined)
    
    inline def setDeveloperProviderName(value: String): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
    
    inline def setDeveloperProviderNameUndefined: Self = StObject.set(x, "DeveloperProviderName", js.undefined)
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setSourceUserIdentifier(value: String): Self = StObject.set(x, "SourceUserIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceUserIdentifierUndefined: Self = StObject.set(x, "SourceUserIdentifier", js.undefined)
  }
}
