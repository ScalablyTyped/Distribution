package typings.azureArmResource

import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managementModelsMod {
  
  @JSImport("azure-arm-resource/lib/management/models", "BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/management/models", "CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  trait ErrorDetails extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object ErrorDetails {
    
    inline def apply(): ErrorDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorDetails]
    }
    
    extension [Self <: ErrorDetails](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait ErrorResponse extends StObject {
    
    var error: js.UndefOr[ErrorDetails] = js.undefined
  }
  object ErrorResponse {
    
    inline def apply(): ErrorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorResponse]
    }
    
    extension [Self <: ErrorResponse](x: Self) {
      
      inline def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  trait ManagementGroup extends StObject {
    
    var details: js.UndefOr[ManagementGroupDetailsProperties] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
  }
  object ManagementGroup {
    
    inline def apply(): ManagementGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroup]
    }
    
    extension [Self <: ManagementGroup](x: Self) {
      
      inline def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ManagementGroupChildInfo extends StObject {
    
    var childId: js.UndefOr[String] = js.undefined
    
    var childType: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object ManagementGroupChildInfo {
    
    inline def apply(): ManagementGroupChildInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupChildInfo]
    }
    
    extension [Self <: ManagementGroupChildInfo](x: Self) {
      
      inline def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
      
      inline def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
      
      inline def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      inline def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait ManagementGroupDetailsProperties extends StObject {
    
    var managementGroupType: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[ParentGroupInfo] = js.undefined
    
    var updatedBy: js.UndefOr[String] = js.undefined
    
    var updatedTime: js.UndefOr[js.Date] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object ManagementGroupDetailsProperties {
    
    inline def apply(): ManagementGroupDetailsProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupDetailsProperties]
    }
    
    extension [Self <: ManagementGroupDetailsProperties](x: Self) {
      
      inline def setManagementGroupType(value: String): Self = StObject.set(x, "managementGroupType", value.asInstanceOf[js.Any])
      
      inline def setManagementGroupTypeUndefined: Self = StObject.set(x, "managementGroupType", js.undefined)
      
      inline def setParent(value: ParentGroupInfo): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setUpdatedBy(value: String): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
      
      inline def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
      
      inline def setUpdatedTime(value: js.Date): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
      
      inline def setUpdatedTimeUndefined: Self = StObject.set(x, "updatedTime", js.undefined)
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait ManagementGroupInfo extends StObject {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
  }
  object ManagementGroupInfo {
    
    inline def apply(): ManagementGroupInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupInfo]
    }
    
    extension [Self <: ManagementGroupInfo](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ManagementGroupListResult
    extends StObject
       with Array[ManagementGroupInfo] {
    
    val nextLink: js.UndefOr[String] = js.native
  }
  
  trait ManagementGroupRecursiveChildInfo extends StObject {
    
    var childId: js.UndefOr[String] = js.undefined
    
    var childType: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[js.Array[ManagementGroupRecursiveChildInfo]] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object ManagementGroupRecursiveChildInfo {
    
    inline def apply(): ManagementGroupRecursiveChildInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupRecursiveChildInfo]
    }
    
    extension [Self <: ManagementGroupRecursiveChildInfo](x: Self) {
      
      inline def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
      
      inline def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
      
      inline def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      inline def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      inline def setChildren(value: js.Array[ManagementGroupRecursiveChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ManagementGroupRecursiveChildInfo*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait ManagementGroupWithChildren extends StObject {
    
    var children: js.UndefOr[js.Array[ManagementGroupChildInfo]] = js.undefined
    
    var details: js.UndefOr[ManagementGroupDetailsProperties] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
  }
  object ManagementGroupWithChildren {
    
    inline def apply(): ManagementGroupWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupWithChildren]
    }
    
    extension [Self <: ManagementGroupWithChildren](x: Self) {
      
      inline def setChildren(value: js.Array[ManagementGroupChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ManagementGroupChildInfo*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ManagementGroupWithHierarchy extends StObject {
    
    var children: js.UndefOr[js.Array[ManagementGroupRecursiveChildInfo]] = js.undefined
    
    var details: js.UndefOr[ManagementGroupDetailsProperties] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    val id: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
    
    val `type`: js.UndefOr[String] = js.undefined
  }
  object ManagementGroupWithHierarchy {
    
    inline def apply(): ManagementGroupWithHierarchy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupWithHierarchy]
    }
    
    extension [Self <: ManagementGroupWithHierarchy](x: Self) {
      
      inline def setChildren(value: js.Array[ManagementGroupRecursiveChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ManagementGroupRecursiveChildInfo*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Operation extends StObject {
    
    var display: js.UndefOr[OperationDisplay] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
  }
  object Operation {
    
    inline def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    extension [Self <: Operation](x: Self) {
      
      inline def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait OperationDisplay extends StObject {
    
    val operation: js.UndefOr[String] = js.undefined
    
    val provider: js.UndefOr[String] = js.undefined
    
    val resource: js.UndefOr[String] = js.undefined
  }
  object OperationDisplay {
    
    inline def apply(): OperationDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDisplay]
    }
    
    extension [Self <: OperationDisplay](x: Self) {
      
      inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    }
  }
  
  @js.native
  trait OperationListResult
    extends StObject
       with Array[Operation] {
    
    val nextLink: js.UndefOr[String] = js.native
  }
  
  trait ParentGroupInfo extends StObject {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var parentId: js.UndefOr[String] = js.undefined
  }
  object ParentGroupInfo {
    
    inline def apply(): ParentGroupInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParentGroupInfo]
    }
    
    extension [Self <: ParentGroupInfo](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
}
