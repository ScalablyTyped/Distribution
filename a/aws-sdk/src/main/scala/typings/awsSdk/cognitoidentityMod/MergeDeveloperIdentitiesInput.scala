package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeDeveloperIdentitiesInput extends StObject {
  
  /**
    * User identifier for the destination user. The value should be a DeveloperUserIdentifier.
    */
  var DestinationUserIdentifier: DeveloperUserIdentifier
  
  /**
    * The "domain" by which Cognito will refer to your users. This is a (pseudo) domain name that you provide while creating an identity pool. This name acts as a placeholder that allows your backend and the Cognito service to communicate about the developer provider. For the DeveloperProviderName, you can use letters as well as period (.), underscore (_), and dash (-).
    */
  var DeveloperProviderName: typings.awsSdk.cognitoidentityMod.DeveloperProviderName
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: typings.awsSdk.cognitoidentityMod.IdentityPoolId
  
  /**
    * User identifier for the source user. The value should be a DeveloperUserIdentifier.
    */
  var SourceUserIdentifier: DeveloperUserIdentifier
}
object MergeDeveloperIdentitiesInput {
  
  @scala.inline
  def apply(
    DestinationUserIdentifier: DeveloperUserIdentifier,
    DeveloperProviderName: DeveloperProviderName,
    IdentityPoolId: IdentityPoolId,
    SourceUserIdentifier: DeveloperUserIdentifier
  ): MergeDeveloperIdentitiesInput = {
    val __obj = js.Dynamic.literal(DestinationUserIdentifier = DestinationUserIdentifier.asInstanceOf[js.Any], DeveloperProviderName = DeveloperProviderName.asInstanceOf[js.Any], IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any], SourceUserIdentifier = SourceUserIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeDeveloperIdentitiesInput]
  }
  
  @scala.inline
  implicit class MergeDeveloperIdentitiesInputMutableBuilder[Self <: MergeDeveloperIdentitiesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationUserIdentifier(value: DeveloperUserIdentifier): Self = StObject.set(x, "DestinationUserIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperProviderName(value: DeveloperProviderName): Self = StObject.set(x, "DeveloperProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUserIdentifier(value: DeveloperUserIdentifier): Self = StObject.set(x, "SourceUserIdentifier", value.asInstanceOf[js.Any])
  }
}
