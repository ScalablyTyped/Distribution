package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAddonRequest extends StObject {
  
  /**
    * The name of the add-on. The name must match one of the names returned by  ListAddons .
    */
  var addonName: String
  
  /**
    * The version of the add-on. The version must match one of the versions returned by  DescribeAddonVersions .
    */
  var addonVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cluster.
    */
  var clusterName: ClusterName
  
  /**
    * How to resolve field value conflicts for an Amazon EKS add-on if you've changed a value from the Amazon EKS default value. Conflicts are handled based on the option you choose:    None – Amazon EKS doesn't change the value. The update might fail.    Overwrite – Amazon EKS overwrites the changed value back to the Amazon EKS default value.    Preserve – Amazon EKS preserves the value. If you choose this option, we recommend that you test any field and value changes on a non-production cluster before updating the add-on on your production cluster.  
    */
  var resolveConflicts: js.UndefOr[ResolveConflicts] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account. The role must be assigned the IAM permissions required by the add-on. If you don't specify an existing IAM role, then the add-on uses the permissions assigned to the node IAM role. For more information, see Amazon EKS node IAM role in the Amazon EKS User Guide.  To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created for your cluster. For more information, see Enabling IAM roles for service accounts on your cluster in the Amazon EKS User Guide. 
    */
  var serviceAccountRoleArn: js.UndefOr[RoleArn] = js.undefined
}
object UpdateAddonRequest {
  
  inline def apply(addonName: String, clusterName: ClusterName): UpdateAddonRequest = {
    val __obj = js.Dynamic.literal(addonName = addonName.asInstanceOf[js.Any], clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAddonRequest]
  }
  
  extension [Self <: UpdateAddonRequest](x: Self) {
    
    inline def setAddonName(value: String): Self = StObject.set(x, "addonName", value.asInstanceOf[js.Any])
    
    inline def setAddonVersion(value: String): Self = StObject.set(x, "addonVersion", value.asInstanceOf[js.Any])
    
    inline def setAddonVersionUndefined: Self = StObject.set(x, "addonVersion", js.undefined)
    
    inline def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setClusterName(value: ClusterName): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    inline def setResolveConflicts(value: ResolveConflicts): Self = StObject.set(x, "resolveConflicts", value.asInstanceOf[js.Any])
    
    inline def setResolveConflictsUndefined: Self = StObject.set(x, "resolveConflicts", js.undefined)
    
    inline def setServiceAccountRoleArn(value: RoleArn): Self = StObject.set(x, "serviceAccountRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountRoleArnUndefined: Self = StObject.set(x, "serviceAccountRoleArn", js.undefined)
  }
}
