package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddLayerVersionPermissionRequest extends StObject {
  
  /**
    * The API action that grants access to the layer. For example, lambda:GetLayerVersion.
    */
  var Action: LayerPermissionAllowedAction
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName
  
  /**
    * With the principal set to *, grant permission to all accounts in the specified organization.
    */
  var OrganizationId: js.UndefOr[typings.awsSdk.lambdaMod.OrganizationId] = js.undefined
  
  /**
    * An account ID, or * to grant permission to all AWS accounts.
    */
  var Principal: LayerPermissionAllowedPrincipal
  
  /**
    * Only update the policy if the revision ID matches the ID specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier that distinguishes the policy from others on the same layer version.
    */
  var StatementId: typings.awsSdk.lambdaMod.StatementId
  
  /**
    * The version number.
    */
  var VersionNumber: LayerVersionNumber
}
object AddLayerVersionPermissionRequest {
  
  inline def apply(
    Action: LayerPermissionAllowedAction,
    LayerName: LayerName,
    Principal: LayerPermissionAllowedPrincipal,
    StatementId: StatementId,
    VersionNumber: LayerVersionNumber
  ): AddLayerVersionPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], LayerName = LayerName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddLayerVersionPermissionRequest]
  }
  
  extension [Self <: AddLayerVersionPermissionRequest](x: Self) {
    
    inline def setAction(value: LayerPermissionAllowedAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "OrganizationId", js.undefined)
    
    inline def setPrincipal(value: LayerPermissionAllowedPrincipal): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setStatementId(value: StatementId): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
    
    inline def setVersionNumber(value: LayerVersionNumber): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
  }
}
