package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntegrationWorkflowRequest extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: name
  
  /**
    * Configuration data for integration workflow.
    */
  var IntegrationConfig: typings.awsSdk.customerprofilesMod.IntegrationConfig
  
  /**
    * The name of the profile object type.
    */
  var ObjectTypeName: typeName
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role. Customer Profiles assumes this role to create resources on your behalf as part of workflow execution.
    */
  var RoleArn: typings.awsSdk.customerprofilesMod.RoleArn
  
  /**
    * The tags used to organize, track, or control access for this resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The type of workflow. The only supported value is APPFLOW_INTEGRATION.
    */
  var WorkflowType: typings.awsSdk.customerprofilesMod.WorkflowType
}
object CreateIntegrationWorkflowRequest {
  
  inline def apply(
    DomainName: name,
    IntegrationConfig: IntegrationConfig,
    ObjectTypeName: typeName,
    RoleArn: RoleArn,
    WorkflowType: WorkflowType
  ): CreateIntegrationWorkflowRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], IntegrationConfig = IntegrationConfig.asInstanceOf[js.Any], ObjectTypeName = ObjectTypeName.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], WorkflowType = WorkflowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationWorkflowRequest]
  }
  
  extension [Self <: CreateIntegrationWorkflowRequest](x: Self) {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setIntegrationConfig(value: IntegrationConfig): Self = StObject.set(x, "IntegrationConfig", value.asInstanceOf[js.Any])
    
    inline def setObjectTypeName(value: typeName): Self = StObject.set(x, "ObjectTypeName", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setWorkflowType(value: WorkflowType): Self = StObject.set(x, "WorkflowType", value.asInstanceOf[js.Any])
  }
}
