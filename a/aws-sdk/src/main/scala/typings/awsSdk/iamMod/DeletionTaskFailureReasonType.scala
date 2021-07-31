package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletionTaskFailureReasonType extends StObject {
  
  /**
    * A short description of the reason that the service-linked role deletion failed.
    */
  var Reason: js.UndefOr[ReasonType] = js.undefined
  
  /**
    * A list of objects that contains details about the service-linked role deletion failure, if that information is returned by the service. If the service-linked role has active sessions or if any resources that were used by the role have not been deleted from the linked service, the role can't be deleted. This parameter includes a list of the resources that are associated with the role and the Region in which the resources are being used.
    */
  var RoleUsageList: js.UndefOr[RoleUsageListType] = js.undefined
}
object DeletionTaskFailureReasonType {
  
  @scala.inline
  def apply(): DeletionTaskFailureReasonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletionTaskFailureReasonType]
  }
  
  @scala.inline
  implicit class DeletionTaskFailureReasonTypeMutableBuilder[Self <: DeletionTaskFailureReasonType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: ReasonType): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setRoleUsageList(value: RoleUsageListType): Self = StObject.set(x, "RoleUsageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUsageListUndefined: Self = StObject.set(x, "RoleUsageList", js.undefined)
    
    @scala.inline
    def setRoleUsageListVarargs(value: RoleUsageType*): Self = StObject.set(x, "RoleUsageList", js.Array(value :_*))
  }
}
