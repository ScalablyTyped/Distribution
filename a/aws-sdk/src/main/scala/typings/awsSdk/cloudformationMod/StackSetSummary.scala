package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackSetSummary extends StObject {
  
  /**
    * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to a target organizational unit (OU).
    */
  var AutoDeployment: js.UndefOr[typings.awsSdk.cloudformationMod.AutoDeployment] = js.undefined
  
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.undefined
  
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.undefined
  
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * Describes how the IAM roles required for stack set operations are created.   With self-managed permissions, you must create the administrator and execution roles required to deploy to target accounts. For more information, see Grant Self-Managed Stack Set Permissions.   With service-managed permissions, StackSets automatically creates the IAM roles required to deploy to accounts managed by AWS Organizations. For more information, see Grant Service-Managed Stack Set Permissions.  
    */
  var PermissionModel: js.UndefOr[PermissionModels] = js.undefined
  
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetId] = js.undefined
  
  /**
    * The name of the stack set.
    */
  var StackSetName: js.UndefOr[typings.awsSdk.cloudformationMod.StackSetName] = js.undefined
  
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.undefined
}
object StackSetSummary {
  
  @scala.inline
  def apply(): StackSetSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackSetSummary]
  }
  
  @scala.inline
  implicit class StackSetSummaryMutableBuilder[Self <: StackSetSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoDeployment(value: AutoDeployment): Self = StObject.set(x, "AutoDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoDeploymentUndefined: Self = StObject.set(x, "AutoDeployment", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDriftStatus(value: StackDriftStatus): Self = StObject.set(x, "DriftStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriftStatusUndefined: Self = StObject.set(x, "DriftStatus", js.undefined)
    
    @scala.inline
    def setLastDriftCheckTimestamp(value: Timestamp): Self = StObject.set(x, "LastDriftCheckTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDriftCheckTimestampUndefined: Self = StObject.set(x, "LastDriftCheckTimestamp", js.undefined)
    
    @scala.inline
    def setPermissionModel(value: PermissionModels): Self = StObject.set(x, "PermissionModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionModelUndefined: Self = StObject.set(x, "PermissionModel", js.undefined)
    
    @scala.inline
    def setStackSetId(value: StackSetId): Self = StObject.set(x, "StackSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetIdUndefined: Self = StObject.set(x, "StackSetId", js.undefined)
    
    @scala.inline
    def setStackSetName(value: StackSetName): Self = StObject.set(x, "StackSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetNameUndefined: Self = StObject.set(x, "StackSetName", js.undefined)
    
    @scala.inline
    def setStatus(value: StackSetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
