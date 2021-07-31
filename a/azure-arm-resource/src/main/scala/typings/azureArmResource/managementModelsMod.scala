package typings.azureArmResource

import typings.msRestAzure.mod.CloudErrorParameters
import typings.std.Array
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managementModelsMod {
  
  @JSImport("azure-arm-resource/lib/management/models", "BaseResource")
  @js.native
  class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @JSImport("azure-arm-resource/lib/management/models", "CloudError")
  @js.native
  class CloudError protected ()
    extends typings.msRestAzure.mod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
  trait ErrorDetails extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object ErrorDetails {
    
    @scala.inline
    def apply(): ErrorDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorDetails]
    }
    
    @scala.inline
    implicit class ErrorDetailsMutableBuilder[Self <: ErrorDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait ErrorResponse extends StObject {
    
    var error: js.UndefOr[ErrorDetails] = js.undefined
  }
  object ErrorResponse {
    
    @scala.inline
    def apply(): ErrorResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorResponse]
    }
    
    @scala.inline
    implicit class ErrorResponseMutableBuilder[Self <: ErrorResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
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
    
    @scala.inline
    def apply(): ManagementGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroup]
    }
    
    @scala.inline
    implicit class ManagementGroupMutableBuilder[Self <: ManagementGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ManagementGroupChildInfo extends StObject {
    
    var childId: js.UndefOr[String] = js.undefined
    
    var childType: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var tenantId: js.UndefOr[String] = js.undefined
  }
  object ManagementGroupChildInfo {
    
    @scala.inline
    def apply(): ManagementGroupChildInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupChildInfo]
    }
    
    @scala.inline
    implicit class ManagementGroupChildInfoMutableBuilder[Self <: ManagementGroupChildInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
      
      @scala.inline
      def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
    }
  }
  
  trait ManagementGroupDetailsProperties extends StObject {
    
    var managementGroupType: js.UndefOr[String] = js.undefined
    
    var parent: js.UndefOr[ParentGroupInfo] = js.undefined
    
    var updatedBy: js.UndefOr[String] = js.undefined
    
    var updatedTime: js.UndefOr[Date] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object ManagementGroupDetailsProperties {
    
    @scala.inline
    def apply(): ManagementGroupDetailsProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupDetailsProperties]
    }
    
    @scala.inline
    implicit class ManagementGroupDetailsPropertiesMutableBuilder[Self <: ManagementGroupDetailsProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManagementGroupType(value: String): Self = StObject.set(x, "managementGroupType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagementGroupTypeUndefined: Self = StObject.set(x, "managementGroupType", js.undefined)
      
      @scala.inline
      def setParent(value: ParentGroupInfo): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setUpdatedBy(value: String): Self = StObject.set(x, "updatedBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedByUndefined: Self = StObject.set(x, "updatedBy", js.undefined)
      
      @scala.inline
      def setUpdatedTime(value: Date): Self = StObject.set(x, "updatedTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedTimeUndefined: Self = StObject.set(x, "updatedTime", js.undefined)
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
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
    
    @scala.inline
    def apply(): ManagementGroupInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupInfo]
    }
    
    @scala.inline
    implicit class ManagementGroupInfoMutableBuilder[Self <: ManagementGroupInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    @scala.inline
    def apply(): ManagementGroupRecursiveChildInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupRecursiveChildInfo]
    }
    
    @scala.inline
    implicit class ManagementGroupRecursiveChildInfoMutableBuilder[Self <: ManagementGroupRecursiveChildInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildId(value: String): Self = StObject.set(x, "childId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildIdUndefined: Self = StObject.set(x, "childId", js.undefined)
      
      @scala.inline
      def setChildType(value: String): Self = StObject.set(x, "childType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildTypeUndefined: Self = StObject.set(x, "childType", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[ManagementGroupRecursiveChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ManagementGroupRecursiveChildInfo*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
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
    
    @scala.inline
    def apply(): ManagementGroupWithChildren = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupWithChildren]
    }
    
    @scala.inline
    implicit class ManagementGroupWithChildrenMutableBuilder[Self <: ManagementGroupWithChildren] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ManagementGroupChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ManagementGroupChildInfo*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    @scala.inline
    def apply(): ManagementGroupWithHierarchy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ManagementGroupWithHierarchy]
    }
    
    @scala.inline
    implicit class ManagementGroupWithHierarchyMutableBuilder[Self <: ManagementGroupWithHierarchy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[ManagementGroupRecursiveChildInfo]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: ManagementGroupRecursiveChildInfo*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setDetails(value: ManagementGroupDetailsProperties): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Operation extends StObject {
    
    var display: js.UndefOr[OperationDisplay] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
  }
  object Operation {
    
    @scala.inline
    def apply(): Operation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Operation]
    }
    
    @scala.inline
    implicit class OperationMutableBuilder[Self <: Operation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: OperationDisplay): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait OperationDisplay extends StObject {
    
    val operation: js.UndefOr[String] = js.undefined
    
    val provider: js.UndefOr[String] = js.undefined
    
    val resource: js.UndefOr[String] = js.undefined
  }
  object OperationDisplay {
    
    @scala.inline
    def apply(): OperationDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OperationDisplay]
    }
    
    @scala.inline
    implicit class OperationDisplayMutableBuilder[Self <: OperationDisplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      @scala.inline
      def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
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
    
    @scala.inline
    def apply(): ParentGroupInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParentGroupInfo]
    }
    
    @scala.inline
    implicit class ParentGroupInfoMutableBuilder[Self <: ParentGroupInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
    }
  }
}
