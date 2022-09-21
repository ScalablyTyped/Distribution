package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkPolicy extends StObject {
  
  /**
    * Whether a core network policy is the current LIVE policy or the most recently submitted policy.
    */
  var Alias: js.UndefOr[CoreNetworkPolicyAlias] = js.undefined
  
  /**
    * The state of a core network policy.
    */
  var ChangeSetState: js.UndefOr[typings.awsSdk.networkmanagerMod.ChangeSetState] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.networkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The timestamp when a core network policy was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of a core network policy.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * Describes a core network policy.
    */
  var PolicyDocument: js.UndefOr[CoreNetworkPolicyDocument] = js.undefined
  
  /**
    * Describes any errors in a core network policy.
    */
  var PolicyErrors: js.UndefOr[CoreNetworkPolicyErrorList] = js.undefined
  
  /**
    * The ID of the policy version.
    */
  var PolicyVersionId: js.UndefOr[Integer] = js.undefined
}
object CoreNetworkPolicy {
  
  inline def apply(): CoreNetworkPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkPolicy]
  }
  
  extension [Self <: CoreNetworkPolicy](x: Self) {
    
    inline def setAlias(value: CoreNetworkPolicyAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setChangeSetState(value: ChangeSetState): Self = StObject.set(x, "ChangeSetState", value.asInstanceOf[js.Any])
    
    inline def setChangeSetStateUndefined: Self = StObject.set(x, "ChangeSetState", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPolicyDocument(value: CoreNetworkPolicyDocument): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setPolicyErrors(value: CoreNetworkPolicyErrorList): Self = StObject.set(x, "PolicyErrors", value.asInstanceOf[js.Any])
    
    inline def setPolicyErrorsUndefined: Self = StObject.set(x, "PolicyErrors", js.undefined)
    
    inline def setPolicyErrorsVarargs(value: CoreNetworkPolicyError*): Self = StObject.set(x, "PolicyErrors", js.Array(value*))
    
    inline def setPolicyVersionId(value: Integer): Self = StObject.set(x, "PolicyVersionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionIdUndefined: Self = StObject.set(x, "PolicyVersionId", js.undefined)
  }
}
