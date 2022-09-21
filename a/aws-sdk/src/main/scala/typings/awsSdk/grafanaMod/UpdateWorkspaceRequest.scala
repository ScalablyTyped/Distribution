package typings.awsSdk.grafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceRequest extends StObject {
  
  /**
    * Specifies whether the workspace can access Amazon Web Services resources in this Amazon Web Services account only, or whether it can also access Amazon Web Services resources in other accounts in the same organization. If you specify ORGANIZATION, you must specify which organizational units the workspace can access in the workspaceOrganizationalUnits parameter.
    */
  var accountAccessType: js.UndefOr[AccountAccessType] = js.undefined
  
  /**
    * The name of an IAM role that already exists to use to access resources through Organizations.
    */
  var organizationRoleName: js.UndefOr[OrganizationRoleName] = js.undefined
  
  /**
    * If you specify Service Managed, Amazon Managed Grafana automatically creates the IAM roles and provisions the permissions that the workspace needs to use Amazon Web Services data sources and notification channels. If you specify CUSTOMER_MANAGED, you will manage those roles and permissions yourself. If you are creating this workspace in a member account of an organization and that account is not a delegated administrator account, and you want the workspace to access data sources in other Amazon Web Services accounts in the organization, you must choose CUSTOMER_MANAGED. For more information, see Amazon Managed Grafana permissions and policies for Amazon Web Services data sources and notification channels 
    */
  var permissionType: js.UndefOr[PermissionType] = js.undefined
  
  /**
    * The name of the CloudFormation stack set to use to generate IAM roles to be used for this workspace.
    */
  var stackSetName: js.UndefOr[StackSetName] = js.undefined
  
  /**
    * Specify the Amazon Web Services data sources that you want to be queried in this workspace. Specifying these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana to read data from these sources. You must still add them as data sources in the Grafana console in the workspace. If you don't specify a data source here, you can still add it as a data source later in the workspace console. However, you will then have to manually configure permissions for it.
    */
  var workspaceDataSources: js.UndefOr[DataSourceTypesList] = js.undefined
  
  /**
    * A description for the workspace. This is used only to help you identify this workspace.
    */
  var workspaceDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the workspace to update.
    */
  var workspaceId: WorkspaceId
  
  /**
    * A new name for the workspace to update.
    */
  var workspaceName: js.UndefOr[WorkspaceName] = js.undefined
  
  /**
    * Specify the Amazon Web Services notification channels that you plan to use in this workspace. Specifying these data sources here enables Amazon Managed Grafana to create IAM roles and permissions that allow Amazon Managed Grafana to use these channels.
    */
  var workspaceNotificationDestinations: js.UndefOr[NotificationDestinationsList] = js.undefined
  
  /**
    * Specifies the organizational units that this workspace is allowed to use data sources from, if this workspace is in an account that is part of an organization.
    */
  var workspaceOrganizationalUnits: js.UndefOr[OrganizationalUnitList] = js.undefined
  
  /**
    * The workspace needs an IAM role that grants permissions to the Amazon Web Services resources that the workspace will view data from. If you already have a role that you want to use, specify it here. If you omit this field and you specify some Amazon Web Services resources in workspaceDataSources or workspaceNotificationDestinations, a new IAM role with the necessary permissions is automatically created.
    */
  var workspaceRoleArn: js.UndefOr[IamRoleArn] = js.undefined
}
object UpdateWorkspaceRequest {
  
  inline def apply(workspaceId: WorkspaceId): UpdateWorkspaceRequest = {
    val __obj = js.Dynamic.literal(workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceRequest]
  }
  
  extension [Self <: UpdateWorkspaceRequest](x: Self) {
    
    inline def setAccountAccessType(value: AccountAccessType): Self = StObject.set(x, "accountAccessType", value.asInstanceOf[js.Any])
    
    inline def setAccountAccessTypeUndefined: Self = StObject.set(x, "accountAccessType", js.undefined)
    
    inline def setOrganizationRoleName(value: OrganizationRoleName): Self = StObject.set(x, "organizationRoleName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationRoleNameUndefined: Self = StObject.set(x, "organizationRoleName", js.undefined)
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "permissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "permissionType", js.undefined)
    
    inline def setStackSetName(value: StackSetName): Self = StObject.set(x, "stackSetName", value.asInstanceOf[js.Any])
    
    inline def setStackSetNameUndefined: Self = StObject.set(x, "stackSetName", js.undefined)
    
    inline def setWorkspaceDataSources(value: DataSourceTypesList): Self = StObject.set(x, "workspaceDataSources", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceDataSourcesUndefined: Self = StObject.set(x, "workspaceDataSources", js.undefined)
    
    inline def setWorkspaceDataSourcesVarargs(value: DataSourceType*): Self = StObject.set(x, "workspaceDataSources", js.Array(value*))
    
    inline def setWorkspaceDescription(value: Description): Self = StObject.set(x, "workspaceDescription", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceDescriptionUndefined: Self = StObject.set(x, "workspaceDescription", js.undefined)
    
    inline def setWorkspaceId(value: WorkspaceId): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceName(value: WorkspaceName): Self = StObject.set(x, "workspaceName", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceNameUndefined: Self = StObject.set(x, "workspaceName", js.undefined)
    
    inline def setWorkspaceNotificationDestinations(value: NotificationDestinationsList): Self = StObject.set(x, "workspaceNotificationDestinations", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceNotificationDestinationsUndefined: Self = StObject.set(x, "workspaceNotificationDestinations", js.undefined)
    
    inline def setWorkspaceNotificationDestinationsVarargs(value: NotificationDestinationType*): Self = StObject.set(x, "workspaceNotificationDestinations", js.Array(value*))
    
    inline def setWorkspaceOrganizationalUnits(value: OrganizationalUnitList): Self = StObject.set(x, "workspaceOrganizationalUnits", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceOrganizationalUnitsUndefined: Self = StObject.set(x, "workspaceOrganizationalUnits", js.undefined)
    
    inline def setWorkspaceOrganizationalUnitsVarargs(value: OrganizationalUnit*): Self = StObject.set(x, "workspaceOrganizationalUnits", js.Array(value*))
    
    inline def setWorkspaceRoleArn(value: IamRoleArn): Self = StObject.set(x, "workspaceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceRoleArnUndefined: Self = StObject.set(x, "workspaceRoleArn", js.undefined)
  }
}
