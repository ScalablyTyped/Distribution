package typings.awsSdk.quicksightMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuickSight extends Service {
  
  /**
    * Cancels an ongoing ingestion of data into SPICE.
    */
  def cancelIngestion(): Request[CancelIngestionResponse, AWSError] = js.native
  def cancelIngestion(callback: js.Function2[/* err */ AWSError, /* data */ CancelIngestionResponse, Unit]): Request[CancelIngestionResponse, AWSError] = js.native
  /**
    * Cancels an ongoing ingestion of data into SPICE.
    */
  def cancelIngestion(params: CancelIngestionRequest): Request[CancelIngestionResponse, AWSError] = js.native
  def cancelIngestion(
    params: CancelIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CancelIngestionResponse, Unit]
  ): Request[CancelIngestionResponse, AWSError] = js.native
  
  @JSName("config")
  var config_QuickSight: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Creates Amazon QuickSight customizations the current AWS Region. Currently, you can add a custom default theme by using the CreateAccountCustomization or UpdateAccountCustomization API operation. To further customize QuickSight by removing QuickSight sample assets and videos for all new users, see Customizing QuickSight in the Amazon QuickSight User Guide.  You can create customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace instead. Customizations that apply to a namespace always override customizations that apply to an AWS account. To find out which customizations apply, use the DescribeAccountCustomization API operation. Before you use the CreateAccountCustomization API operation to add a theme as the namespace default, make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the current permissions by using the  DescribeThemePermissions  API operation. To share the theme, grant permissions by using the  UpdateThemePermissions  API operation. 
    */
  def createAccountCustomization(): Request[CreateAccountCustomizationResponse, AWSError] = js.native
  def createAccountCustomization(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountCustomizationResponse, Unit]): Request[CreateAccountCustomizationResponse, AWSError] = js.native
  /**
    * Creates Amazon QuickSight customizations the current AWS Region. Currently, you can add a custom default theme by using the CreateAccountCustomization or UpdateAccountCustomization API operation. To further customize QuickSight by removing QuickSight sample assets and videos for all new users, see Customizing QuickSight in the Amazon QuickSight User Guide.  You can create customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace instead. Customizations that apply to a namespace always override customizations that apply to an AWS account. To find out which customizations apply, use the DescribeAccountCustomization API operation. Before you use the CreateAccountCustomization API operation to add a theme as the namespace default, make sure that you first share the theme with the namespace. If you don't share it with the namespace, the theme isn't visible to your users even if you make it the default theme. To check if the theme is shared, view the current permissions by using the  DescribeThemePermissions  API operation. To share the theme, grant permissions by using the  UpdateThemePermissions  API operation. 
    */
  def createAccountCustomization(params: CreateAccountCustomizationRequest): Request[CreateAccountCustomizationResponse, AWSError] = js.native
  def createAccountCustomization(
    params: CreateAccountCustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountCustomizationResponse, Unit]
  ): Request[CreateAccountCustomizationResponse, AWSError] = js.native
  
  /**
    * Creates an analysis in Amazon QuickSight.
    */
  def createAnalysis(): Request[CreateAnalysisResponse, AWSError] = js.native
  def createAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ CreateAnalysisResponse, Unit]): Request[CreateAnalysisResponse, AWSError] = js.native
  /**
    * Creates an analysis in Amazon QuickSight.
    */
  def createAnalysis(params: CreateAnalysisRequest): Request[CreateAnalysisResponse, AWSError] = js.native
  def createAnalysis(
    params: CreateAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAnalysisResponse, Unit]
  ): Request[CreateAnalysisResponse, AWSError] = js.native
  
  /**
    * Creates a dashboard from a template. To first create a template, see the  CreateTemplate  API operation. A dashboard is an entity in QuickSight that identifies QuickSight reports, created from analyses. You can share QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. If you have the correct permissions, you can create a dashboard from a template that exists in a different AWS account.
    */
  def createDashboard(): Request[CreateDashboardResponse, AWSError] = js.native
  def createDashboard(callback: js.Function2[/* err */ AWSError, /* data */ CreateDashboardResponse, Unit]): Request[CreateDashboardResponse, AWSError] = js.native
  /**
    * Creates a dashboard from a template. To first create a template, see the  CreateTemplate  API operation. A dashboard is an entity in QuickSight that identifies QuickSight reports, created from analyses. You can share QuickSight dashboards. With the right permissions, you can create scheduled email reports from them. If you have the correct permissions, you can create a dashboard from a template that exists in a different AWS account.
    */
  def createDashboard(params: CreateDashboardRequest): Request[CreateDashboardResponse, AWSError] = js.native
  def createDashboard(
    params: CreateDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDashboardResponse, Unit]
  ): Request[CreateDashboardResponse, AWSError] = js.native
  
  /**
    * Creates a dataset.
    */
  def createDataSet(): Request[CreateDataSetResponse, AWSError] = js.native
  def createDataSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetResponse, Unit]): Request[CreateDataSetResponse, AWSError] = js.native
  /**
    * Creates a dataset.
    */
  def createDataSet(params: CreateDataSetRequest): Request[CreateDataSetResponse, AWSError] = js.native
  def createDataSet(
    params: CreateDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetResponse, Unit]
  ): Request[CreateDataSetResponse, AWSError] = js.native
  
  /**
    * Creates a data source.
    */
  def createDataSource(): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]): Request[CreateDataSourceResponse, AWSError] = js.native
  /**
    * Creates a data source.
    */
  def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse, AWSError] = js.native
  def createDataSource(
    params: CreateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSourceResponse, Unit]
  ): Request[CreateDataSourceResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.
    */
  def createGroup(): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]): Request[CreateGroupResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight group. The permissions resource is arn:aws:quicksight:us-east-1:&lt;relevant-aws-account-id&gt;:group/default/&lt;group-name&gt; . The response is a group object.
    */
  def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse, AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupResponse, Unit]
  ): Request[CreateGroupResponse, AWSError] = js.native
  
  /**
    * Adds an Amazon QuickSight user to an Amazon QuickSight group. 
    */
  def createGroupMembership(): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]): Request[CreateGroupMembershipResponse, AWSError] = js.native
  /**
    * Adds an Amazon QuickSight user to an Amazon QuickSight group. 
    */
  def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse, AWSError] = js.native
  def createGroupMembership(
    params: CreateGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGroupMembershipResponse, Unit]
  ): Request[CreateGroupMembershipResponse, AWSError] = js.native
  
  /**
    * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy assignment is attached to the specified groups or users of Amazon QuickSight. Assignment names are unique per AWS account. To avoid overwriting rules in other namespaces, use assignment names that are unique.
    */
  def createIAMPolicyAssignment(): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  def createIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ CreateIAMPolicyAssignmentResponse, Unit]): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Creates an assignment with one specified IAM policy, identified by its Amazon Resource Name (ARN). This policy assignment is attached to the specified groups or users of Amazon QuickSight. Assignment names are unique per AWS account. To avoid overwriting rules in other namespaces, use assignment names that are unique.
    */
  def createIAMPolicyAssignment(params: CreateIAMPolicyAssignmentRequest): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  def createIAMPolicyAssignment(
    params: CreateIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIAMPolicyAssignmentResponse, Unit]
  ): Request[CreateIAMPolicyAssignmentResponse, AWSError] = js.native
  
  /**
    * Creates and starts a new SPICE ingestion on a dataset Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an example, see How do I create an IAM policy to control access to Amazon EC2 resources using tags? in the AWS Knowledge Center. Tags are visible on the tagged dataset, but not on the ingestion resource.
    */
  def createIngestion(): Request[CreateIngestionResponse, AWSError] = js.native
  def createIngestion(callback: js.Function2[/* err */ AWSError, /* data */ CreateIngestionResponse, Unit]): Request[CreateIngestionResponse, AWSError] = js.native
  /**
    * Creates and starts a new SPICE ingestion on a dataset Any ingestions operating on tagged datasets inherit the same tags automatically for use in access control. For an example, see How do I create an IAM policy to control access to Amazon EC2 resources using tags? in the AWS Knowledge Center. Tags are visible on the tagged dataset, but not on the ingestion resource.
    */
  def createIngestion(params: CreateIngestionRequest): Request[CreateIngestionResponse, AWSError] = js.native
  def createIngestion(
    params: CreateIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateIngestionResponse, Unit]
  ): Request[CreateIngestionResponse, AWSError] = js.native
  
  /**
    * (Enterprise edition only) Creates a new namespace for you to use with Amazon QuickSight. A namespace allows you to isolate the QuickSight users and groups that are registered for that namespace. Users that access the namespace can share assets only with other users or groups in the same namespace. They can't see users and groups in other namespaces. You can create a namespace after your AWS account is subscribed to QuickSight. The namespace must be unique within the AWS account. By default, there is a limit of 100 namespaces per AWS account. To increase your limit, create a ticket with AWS Support. 
    */
  def createNamespace(): Request[CreateNamespaceResponse, AWSError] = js.native
  def createNamespace(callback: js.Function2[/* err */ AWSError, /* data */ CreateNamespaceResponse, Unit]): Request[CreateNamespaceResponse, AWSError] = js.native
  /**
    * (Enterprise edition only) Creates a new namespace for you to use with Amazon QuickSight. A namespace allows you to isolate the QuickSight users and groups that are registered for that namespace. Users that access the namespace can share assets only with other users or groups in the same namespace. They can't see users and groups in other namespaces. You can create a namespace after your AWS account is subscribed to QuickSight. The namespace must be unique within the AWS account. By default, there is a limit of 100 namespaces per AWS account. To increase your limit, create a ticket with AWS Support. 
    */
  def createNamespace(params: CreateNamespaceRequest): Request[CreateNamespaceResponse, AWSError] = js.native
  def createNamespace(
    params: CreateNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNamespaceResponse, Unit]
  ): Request[CreateNamespaceResponse, AWSError] = js.native
  
  /**
    * Creates a template from an existing QuickSight analysis or template. You can use the resulting template to create a dashboard. A template is an entity in QuickSight that encapsulates the metadata required to create an analysis and that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets that follow the same schema that was used to create the source analysis and template.
    */
  def createTemplate(): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]): Request[CreateTemplateResponse, AWSError] = js.native
  /**
    * Creates a template from an existing QuickSight analysis or template. You can use the resulting template to create a dashboard. A template is an entity in QuickSight that encapsulates the metadata required to create an analysis and that you can use to create s dashboard. A template adds a layer of abstraction by using placeholders to replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets that follow the same schema that was used to create the source analysis and template.
    */
  def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse, AWSError] = js.native
  def createTemplate(
    params: CreateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateResponse, Unit]
  ): Request[CreateTemplateResponse, AWSError] = js.native
  
  /**
    * Creates a template alias for a template.
    */
  def createTemplateAlias(): Request[CreateTemplateAliasResponse, AWSError] = js.native
  def createTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateAliasResponse, Unit]): Request[CreateTemplateAliasResponse, AWSError] = js.native
  /**
    * Creates a template alias for a template.
    */
  def createTemplateAlias(params: CreateTemplateAliasRequest): Request[CreateTemplateAliasResponse, AWSError] = js.native
  def createTemplateAlias(
    params: CreateTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateTemplateAliasResponse, Unit]
  ): Request[CreateTemplateAliasResponse, AWSError] = js.native
  
  /**
    * Creates a theme. A theme is set of configuration options for color and layout. Themes apply to analyses and dashboards. For more information, see Using Themes in Amazon QuickSight in the Amazon QuickSight User Guide.
    */
  def createTheme(): Request[CreateThemeResponse, AWSError] = js.native
  def createTheme(callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeResponse, Unit]): Request[CreateThemeResponse, AWSError] = js.native
  /**
    * Creates a theme. A theme is set of configuration options for color and layout. Themes apply to analyses and dashboards. For more information, see Using Themes in Amazon QuickSight in the Amazon QuickSight User Guide.
    */
  def createTheme(params: CreateThemeRequest): Request[CreateThemeResponse, AWSError] = js.native
  def createTheme(
    params: CreateThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeResponse, Unit]
  ): Request[CreateThemeResponse, AWSError] = js.native
  
  /**
    * Creates a theme alias for a theme.
    */
  def createThemeAlias(): Request[CreateThemeAliasResponse, AWSError] = js.native
  def createThemeAlias(callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeAliasResponse, Unit]): Request[CreateThemeAliasResponse, AWSError] = js.native
  /**
    * Creates a theme alias for a theme.
    */
  def createThemeAlias(params: CreateThemeAliasRequest): Request[CreateThemeAliasResponse, AWSError] = js.native
  def createThemeAlias(
    params: CreateThemeAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateThemeAliasResponse, Unit]
  ): Request[CreateThemeAliasResponse, AWSError] = js.native
  
  /**
    * Deletes all Amazon QuickSight customizations in this AWS Region for the specified AWS account and QuickSight namespace.
    */
  def deleteAccountCustomization(): Request[DeleteAccountCustomizationResponse, AWSError] = js.native
  def deleteAccountCustomization(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountCustomizationResponse, Unit]): Request[DeleteAccountCustomizationResponse, AWSError] = js.native
  /**
    * Deletes all Amazon QuickSight customizations in this AWS Region for the specified AWS account and QuickSight namespace.
    */
  def deleteAccountCustomization(params: DeleteAccountCustomizationRequest): Request[DeleteAccountCustomizationResponse, AWSError] = js.native
  def deleteAccountCustomization(
    params: DeleteAccountCustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountCustomizationResponse, Unit]
  ): Request[DeleteAccountCustomizationResponse, AWSError] = js.native
  
  /**
    * Deletes an analysis from Amazon QuickSight. You can optionally include a recovery window during which you can restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. QuickSight attaches a DeletionTime stamp to the response that specifies the end of the recovery window. At the end of the recovery window, QuickSight deletes the analysis permanently. At any time before recovery window ends, you can use the RestoreAnalysis API operation to remove the DeletionTime stamp and cancel the deletion of the analysis. The analysis remains visible in the API until it's deleted, so you can describe it but you can't make a template from it. An analysis that's scheduled for deletion isn't accessible in the QuickSight console. To access it in the console, restore it. Deleting an analysis doesn't delete the dashboards that you publish from it.
    */
  def deleteAnalysis(): Request[DeleteAnalysisResponse, AWSError] = js.native
  def deleteAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnalysisResponse, Unit]): Request[DeleteAnalysisResponse, AWSError] = js.native
  /**
    * Deletes an analysis from Amazon QuickSight. You can optionally include a recovery window during which you can restore the analysis. If you don't specify a recovery window value, the operation defaults to 30 days. QuickSight attaches a DeletionTime stamp to the response that specifies the end of the recovery window. At the end of the recovery window, QuickSight deletes the analysis permanently. At any time before recovery window ends, you can use the RestoreAnalysis API operation to remove the DeletionTime stamp and cancel the deletion of the analysis. The analysis remains visible in the API until it's deleted, so you can describe it but you can't make a template from it. An analysis that's scheduled for deletion isn't accessible in the QuickSight console. To access it in the console, restore it. Deleting an analysis doesn't delete the dashboards that you publish from it.
    */
  def deleteAnalysis(params: DeleteAnalysisRequest): Request[DeleteAnalysisResponse, AWSError] = js.native
  def deleteAnalysis(
    params: DeleteAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAnalysisResponse, Unit]
  ): Request[DeleteAnalysisResponse, AWSError] = js.native
  
  /**
    * Deletes a dashboard.
    */
  def deleteDashboard(): Request[DeleteDashboardResponse, AWSError] = js.native
  def deleteDashboard(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDashboardResponse, Unit]): Request[DeleteDashboardResponse, AWSError] = js.native
  /**
    * Deletes a dashboard.
    */
  def deleteDashboard(params: DeleteDashboardRequest): Request[DeleteDashboardResponse, AWSError] = js.native
  def deleteDashboard(
    params: DeleteDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDashboardResponse, Unit]
  ): Request[DeleteDashboardResponse, AWSError] = js.native
  
  /**
    * Deletes a dataset.
    */
  def deleteDataSet(): Request[DeleteDataSetResponse, AWSError] = js.native
  def deleteDataSet(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSetResponse, Unit]): Request[DeleteDataSetResponse, AWSError] = js.native
  /**
    * Deletes a dataset.
    */
  def deleteDataSet(params: DeleteDataSetRequest): Request[DeleteDataSetResponse, AWSError] = js.native
  def deleteDataSet(
    params: DeleteDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSetResponse, Unit]
  ): Request[DeleteDataSetResponse, AWSError] = js.native
  
  /**
    * Deletes the data source permanently. This operation breaks all the datasets that reference the deleted data source.
    */
  def deleteDataSource(): Request[DeleteDataSourceResponse, AWSError] = js.native
  def deleteDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceResponse, Unit]): Request[DeleteDataSourceResponse, AWSError] = js.native
  /**
    * Deletes the data source permanently. This operation breaks all the datasets that reference the deleted data source.
    */
  def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse, AWSError] = js.native
  def deleteDataSource(
    params: DeleteDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDataSourceResponse, Unit]
  ): Request[DeleteDataSourceResponse, AWSError] = js.native
  
  /**
    * Removes a user group from Amazon QuickSight. 
    */
  def deleteGroup(): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]): Request[DeleteGroupResponse, AWSError] = js.native
  /**
    * Removes a user group from Amazon QuickSight. 
    */
  def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse, AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupResponse, Unit]
  ): Request[DeleteGroupResponse, AWSError] = js.native
  
  /**
    * Removes a user from a group so that the user is no longer a member of the group.
    */
  def deleteGroupMembership(): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  /**
    * Removes a user from a group so that the user is no longer a member of the group.
    */
  def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  def deleteGroupMembership(
    params: DeleteGroupMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGroupMembershipResponse, Unit]
  ): Request[DeleteGroupMembershipResponse, AWSError] = js.native
  
  /**
    * Deletes an existing IAM policy assignment.
    */
  def deleteIAMPolicyAssignment(): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  def deleteIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ DeleteIAMPolicyAssignmentResponse, Unit]): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Deletes an existing IAM policy assignment.
    */
  def deleteIAMPolicyAssignment(params: DeleteIAMPolicyAssignmentRequest): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  def deleteIAMPolicyAssignment(
    params: DeleteIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteIAMPolicyAssignmentResponse, Unit]
  ): Request[DeleteIAMPolicyAssignmentResponse, AWSError] = js.native
  
  /**
    * Deletes a namespace and the users and groups that are associated with the namespace. This is an asynchronous process. Assets including dashboards, analyses, datasets and data sources are not deleted. To delete these assets, you use the API operations for the relevant asset. 
    */
  def deleteNamespace(): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]): Request[DeleteNamespaceResponse, AWSError] = js.native
  /**
    * Deletes a namespace and the users and groups that are associated with the namespace. This is an asynchronous process. Assets including dashboards, analyses, datasets and data sources are not deleted. To delete these assets, you use the API operations for the relevant asset. 
    */
  def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse, AWSError] = js.native
  def deleteNamespace(
    params: DeleteNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNamespaceResponse, Unit]
  ): Request[DeleteNamespaceResponse, AWSError] = js.native
  
  /**
    * Deletes a template.
    */
  def deleteTemplate(): Request[DeleteTemplateResponse, AWSError] = js.native
  def deleteTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateResponse, Unit]): Request[DeleteTemplateResponse, AWSError] = js.native
  /**
    * Deletes a template.
    */
  def deleteTemplate(params: DeleteTemplateRequest): Request[DeleteTemplateResponse, AWSError] = js.native
  def deleteTemplate(
    params: DeleteTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateResponse, Unit]
  ): Request[DeleteTemplateResponse, AWSError] = js.native
  
  /**
    * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the version of the template that the alias points to.
    */
  def deleteTemplateAlias(): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  def deleteTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateAliasResponse, Unit]): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  /**
    * Deletes the item that the specified template alias points to. If you provide a specific alias, you delete the version of the template that the alias points to.
    */
  def deleteTemplateAlias(params: DeleteTemplateAliasRequest): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  def deleteTemplateAlias(
    params: DeleteTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteTemplateAliasResponse, Unit]
  ): Request[DeleteTemplateAliasResponse, AWSError] = js.native
  
  /**
    * Deletes a theme.
    */
  def deleteTheme(): Request[DeleteThemeResponse, AWSError] = js.native
  def deleteTheme(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThemeResponse, Unit]): Request[DeleteThemeResponse, AWSError] = js.native
  /**
    * Deletes a theme.
    */
  def deleteTheme(params: DeleteThemeRequest): Request[DeleteThemeResponse, AWSError] = js.native
  def deleteTheme(
    params: DeleteThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThemeResponse, Unit]
  ): Request[DeleteThemeResponse, AWSError] = js.native
  
  /**
    * Deletes the version of the theme that the specified theme alias points to. If you provide a specific alias, you delete the version of the theme that the alias points to.
    */
  def deleteThemeAlias(): Request[DeleteThemeAliasResponse, AWSError] = js.native
  def deleteThemeAlias(callback: js.Function2[/* err */ AWSError, /* data */ DeleteThemeAliasResponse, Unit]): Request[DeleteThemeAliasResponse, AWSError] = js.native
  /**
    * Deletes the version of the theme that the specified theme alias points to. If you provide a specific alias, you delete the version of the theme that the alias points to.
    */
  def deleteThemeAlias(params: DeleteThemeAliasRequest): Request[DeleteThemeAliasResponse, AWSError] = js.native
  def deleteThemeAlias(
    params: DeleteThemeAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteThemeAliasResponse, Unit]
  ): Request[DeleteThemeAliasResponse, AWSError] = js.native
  
  /**
    * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call. 
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes the Amazon QuickSight user that is associated with the identity of the AWS Identity and Access Management (IAM) user or role that's making the call. The IAM user isn't deleted as a result of this call. 
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  
  /**
    * Deletes a user identified by its principal ID. 
    */
  def deleteUserByPrincipalId(): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  def deleteUserByPrincipalId(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserByPrincipalIdResponse, Unit]): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  /**
    * Deletes a user identified by its principal ID. 
    */
  def deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  def deleteUserByPrincipalId(
    params: DeleteUserByPrincipalIdRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserByPrincipalIdResponse, Unit]
  ): Request[DeleteUserByPrincipalIdResponse, AWSError] = js.native
  
  /**
    * Describes the customizations associated with the provided AWS account and Amazon QuickSight namespace in an AWS Region. The QuickSight console evaluates which customizations to apply by running this API operation with the Resolved flag included.  To determine what customizations display when you run this command, it can help to visualize the relationship of the entities involved.     AWS Account - The AWS account exists at the top of the hierarchy. It has the potential to use all of the AWS Regions and AWS Services. When you subscribe to QuickSight, you choose one AWS Region to use as your home Region. That's where your free SPICE capacity is located. You can use QuickSight in any supported AWS Region.     AWS Region - In each AWS Region where you sign in to QuickSight at least once, QuickSight acts as a separate instance of the same service. If you have a user directory, it resides in us-east-1, which is the US East (N. Virginia). Generally speaking, these users have access to QuickSight in any AWS Region, unless they are constrained to a namespace.  To run the command in a different AWS Region, you change your Region settings. If you're using the AWS CLI, you can use one of the following options:   Use command line options.    Use named profiles.    Run aws configure to change your default AWS Region. Use Enter to key the same settings for your keys. For more information, see Configuring the AWS CLI.      Namespace - A QuickSight namespace is a partition that contains users and assets (data sources, datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also be part of the same namespace. People who share a namespace are completely isolated from users and assets in other namespaces, even if they are in the same AWS account and AWS Region.    Applied customizations - Within an AWS Region, a set of QuickSight customizations can apply to an AWS account or to a namespace. Settings that you apply to a namespace override settings that you apply to an AWS account. All settings are isolated to a single AWS Region. To apply them in other AWS Regions, run the CreateAccountCustomization command in each AWS Region where you want to apply the same customizations.   
    */
  def describeAccountCustomization(): Request[DescribeAccountCustomizationResponse, AWSError] = js.native
  def describeAccountCustomization(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountCustomizationResponse, Unit]): Request[DescribeAccountCustomizationResponse, AWSError] = js.native
  /**
    * Describes the customizations associated with the provided AWS account and Amazon QuickSight namespace in an AWS Region. The QuickSight console evaluates which customizations to apply by running this API operation with the Resolved flag included.  To determine what customizations display when you run this command, it can help to visualize the relationship of the entities involved.     AWS Account - The AWS account exists at the top of the hierarchy. It has the potential to use all of the AWS Regions and AWS Services. When you subscribe to QuickSight, you choose one AWS Region to use as your home Region. That's where your free SPICE capacity is located. You can use QuickSight in any supported AWS Region.     AWS Region - In each AWS Region where you sign in to QuickSight at least once, QuickSight acts as a separate instance of the same service. If you have a user directory, it resides in us-east-1, which is the US East (N. Virginia). Generally speaking, these users have access to QuickSight in any AWS Region, unless they are constrained to a namespace.  To run the command in a different AWS Region, you change your Region settings. If you're using the AWS CLI, you can use one of the following options:   Use command line options.    Use named profiles.    Run aws configure to change your default AWS Region. Use Enter to key the same settings for your keys. For more information, see Configuring the AWS CLI.      Namespace - A QuickSight namespace is a partition that contains users and assets (data sources, datasets, dashboards, and so on). To access assets that are in a specific namespace, users and groups must also be part of the same namespace. People who share a namespace are completely isolated from users and assets in other namespaces, even if they are in the same AWS account and AWS Region.    Applied customizations - Within an AWS Region, a set of QuickSight customizations can apply to an AWS account or to a namespace. Settings that you apply to a namespace override settings that you apply to an AWS account. All settings are isolated to a single AWS Region. To apply them in other AWS Regions, run the CreateAccountCustomization command in each AWS Region where you want to apply the same customizations.   
    */
  def describeAccountCustomization(params: DescribeAccountCustomizationRequest): Request[DescribeAccountCustomizationResponse, AWSError] = js.native
  def describeAccountCustomization(
    params: DescribeAccountCustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountCustomizationResponse, Unit]
  ): Request[DescribeAccountCustomizationResponse, AWSError] = js.native
  
  /**
    * Describes the settings that were used when your QuickSight subscription was first created in this AWS account.
    */
  def describeAccountSettings(): Request[DescribeAccountSettingsResponse, AWSError] = js.native
  def describeAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountSettingsResponse, Unit]): Request[DescribeAccountSettingsResponse, AWSError] = js.native
  /**
    * Describes the settings that were used when your QuickSight subscription was first created in this AWS account.
    */
  def describeAccountSettings(params: DescribeAccountSettingsRequest): Request[DescribeAccountSettingsResponse, AWSError] = js.native
  def describeAccountSettings(
    params: DescribeAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAccountSettingsResponse, Unit]
  ): Request[DescribeAccountSettingsResponse, AWSError] = js.native
  
  /**
    * Provides a summary of the metadata for an analysis.
    */
  def describeAnalysis(): Request[DescribeAnalysisResponse, AWSError] = js.native
  def describeAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisResponse, Unit]): Request[DescribeAnalysisResponse, AWSError] = js.native
  /**
    * Provides a summary of the metadata for an analysis.
    */
  def describeAnalysis(params: DescribeAnalysisRequest): Request[DescribeAnalysisResponse, AWSError] = js.native
  def describeAnalysis(
    params: DescribeAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisResponse, Unit]
  ): Request[DescribeAnalysisResponse, AWSError] = js.native
  
  /**
    * Provides the read and write permissions for an analysis.
    */
  def describeAnalysisPermissions(): Request[DescribeAnalysisPermissionsResponse, AWSError] = js.native
  def describeAnalysisPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisPermissionsResponse, Unit]): Request[DescribeAnalysisPermissionsResponse, AWSError] = js.native
  /**
    * Provides the read and write permissions for an analysis.
    */
  def describeAnalysisPermissions(params: DescribeAnalysisPermissionsRequest): Request[DescribeAnalysisPermissionsResponse, AWSError] = js.native
  def describeAnalysisPermissions(
    params: DescribeAnalysisPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAnalysisPermissionsResponse, Unit]
  ): Request[DescribeAnalysisPermissionsResponse, AWSError] = js.native
  
  /**
    * Provides a summary for a dashboard.
    */
  def describeDashboard(): Request[DescribeDashboardResponse, AWSError] = js.native
  def describeDashboard(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardResponse, Unit]): Request[DescribeDashboardResponse, AWSError] = js.native
  /**
    * Provides a summary for a dashboard.
    */
  def describeDashboard(params: DescribeDashboardRequest): Request[DescribeDashboardResponse, AWSError] = js.native
  def describeDashboard(
    params: DescribeDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardResponse, Unit]
  ): Request[DescribeDashboardResponse, AWSError] = js.native
  
  /**
    * Describes read and write permissions for a dashboard.
    */
  def describeDashboardPermissions(): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  def describeDashboardPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardPermissionsResponse, Unit]): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  /**
    * Describes read and write permissions for a dashboard.
    */
  def describeDashboardPermissions(params: DescribeDashboardPermissionsRequest): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  def describeDashboardPermissions(
    params: DescribeDashboardPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDashboardPermissionsResponse, Unit]
  ): Request[DescribeDashboardPermissionsResponse, AWSError] = js.native
  
  /**
    * Describes a dataset. 
    */
  def describeDataSet(): Request[DescribeDataSetResponse, AWSError] = js.native
  def describeDataSet(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetResponse, Unit]): Request[DescribeDataSetResponse, AWSError] = js.native
  /**
    * Describes a dataset. 
    */
  def describeDataSet(params: DescribeDataSetRequest): Request[DescribeDataSetResponse, AWSError] = js.native
  def describeDataSet(
    params: DescribeDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetResponse, Unit]
  ): Request[DescribeDataSetResponse, AWSError] = js.native
  
  /**
    * Describes the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def describeDataSetPermissions(): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  def describeDataSetPermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetPermissionsResponse, Unit]): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  /**
    * Describes the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def describeDataSetPermissions(params: DescribeDataSetPermissionsRequest): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  def describeDataSetPermissions(
    params: DescribeDataSetPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSetPermissionsResponse, Unit]
  ): Request[DescribeDataSetPermissionsResponse, AWSError] = js.native
  
  /**
    * Describes a data source.
    */
  def describeDataSource(): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]): Request[DescribeDataSourceResponse, AWSError] = js.native
  /**
    * Describes a data source.
    */
  def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse, AWSError] = js.native
  def describeDataSource(
    params: DescribeDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourceResponse, Unit]
  ): Request[DescribeDataSourceResponse, AWSError] = js.native
  
  /**
    * Describes the resource permissions for a data source.
    */
  def describeDataSourcePermissions(): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  def describeDataSourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcePermissionsResponse, Unit]): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  /**
    * Describes the resource permissions for a data source.
    */
  def describeDataSourcePermissions(params: DescribeDataSourcePermissionsRequest): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  def describeDataSourcePermissions(
    params: DescribeDataSourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDataSourcePermissionsResponse, Unit]
  ): Request[DescribeDataSourcePermissionsResponse, AWSError] = js.native
  
  /**
    * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN). 
    */
  def describeGroup(): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]): Request[DescribeGroupResponse, AWSError] = js.native
  /**
    * Returns an Amazon QuickSight group's description and Amazon Resource Name (ARN). 
    */
  def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse, AWSError] = js.native
  def describeGroup(
    params: DescribeGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeGroupResponse, Unit]
  ): Request[DescribeGroupResponse, AWSError] = js.native
  
  /**
    * Describes an existing IAM policy assignment, as specified by the assignment name.
    */
  def describeIAMPolicyAssignment(): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  def describeIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIAMPolicyAssignmentResponse, Unit]): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Describes an existing IAM policy assignment, as specified by the assignment name.
    */
  def describeIAMPolicyAssignment(params: DescribeIAMPolicyAssignmentRequest): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  def describeIAMPolicyAssignment(
    params: DescribeIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIAMPolicyAssignmentResponse, Unit]
  ): Request[DescribeIAMPolicyAssignmentResponse, AWSError] = js.native
  
  /**
    * Describes a SPICE ingestion.
    */
  def describeIngestion(): Request[DescribeIngestionResponse, AWSError] = js.native
  def describeIngestion(callback: js.Function2[/* err */ AWSError, /* data */ DescribeIngestionResponse, Unit]): Request[DescribeIngestionResponse, AWSError] = js.native
  /**
    * Describes a SPICE ingestion.
    */
  def describeIngestion(params: DescribeIngestionRequest): Request[DescribeIngestionResponse, AWSError] = js.native
  def describeIngestion(
    params: DescribeIngestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeIngestionResponse, Unit]
  ): Request[DescribeIngestionResponse, AWSError] = js.native
  
  /**
    * Describes the current namespace.
    */
  def describeNamespace(): Request[DescribeNamespaceResponse, AWSError] = js.native
  def describeNamespace(callback: js.Function2[/* err */ AWSError, /* data */ DescribeNamespaceResponse, Unit]): Request[DescribeNamespaceResponse, AWSError] = js.native
  /**
    * Describes the current namespace.
    */
  def describeNamespace(params: DescribeNamespaceRequest): Request[DescribeNamespaceResponse, AWSError] = js.native
  def describeNamespace(
    params: DescribeNamespaceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeNamespaceResponse, Unit]
  ): Request[DescribeNamespaceResponse, AWSError] = js.native
  
  /**
    * Describes a template's metadata.
    */
  def describeTemplate(): Request[DescribeTemplateResponse, AWSError] = js.native
  def describeTemplate(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateResponse, Unit]): Request[DescribeTemplateResponse, AWSError] = js.native
  /**
    * Describes a template's metadata.
    */
  def describeTemplate(params: DescribeTemplateRequest): Request[DescribeTemplateResponse, AWSError] = js.native
  def describeTemplate(
    params: DescribeTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateResponse, Unit]
  ): Request[DescribeTemplateResponse, AWSError] = js.native
  
  /**
    * Describes the template alias for a template.
    */
  def describeTemplateAlias(): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  def describeTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateAliasResponse, Unit]): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  /**
    * Describes the template alias for a template.
    */
  def describeTemplateAlias(params: DescribeTemplateAliasRequest): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  def describeTemplateAlias(
    params: DescribeTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplateAliasResponse, Unit]
  ): Request[DescribeTemplateAliasResponse, AWSError] = js.native
  
  /**
    * Describes read and write permissions on a template.
    */
  def describeTemplatePermissions(): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  def describeTemplatePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplatePermissionsResponse, Unit]): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  /**
    * Describes read and write permissions on a template.
    */
  def describeTemplatePermissions(params: DescribeTemplatePermissionsRequest): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  def describeTemplatePermissions(
    params: DescribeTemplatePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTemplatePermissionsResponse, Unit]
  ): Request[DescribeTemplatePermissionsResponse, AWSError] = js.native
  
  /**
    * Describes a theme.
    */
  def describeTheme(): Request[DescribeThemeResponse, AWSError] = js.native
  def describeTheme(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemeResponse, Unit]): Request[DescribeThemeResponse, AWSError] = js.native
  /**
    * Describes a theme.
    */
  def describeTheme(params: DescribeThemeRequest): Request[DescribeThemeResponse, AWSError] = js.native
  def describeTheme(
    params: DescribeThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemeResponse, Unit]
  ): Request[DescribeThemeResponse, AWSError] = js.native
  
  /**
    * Describes the alias for a theme.
    */
  def describeThemeAlias(): Request[DescribeThemeAliasResponse, AWSError] = js.native
  def describeThemeAlias(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemeAliasResponse, Unit]): Request[DescribeThemeAliasResponse, AWSError] = js.native
  /**
    * Describes the alias for a theme.
    */
  def describeThemeAlias(params: DescribeThemeAliasRequest): Request[DescribeThemeAliasResponse, AWSError] = js.native
  def describeThemeAlias(
    params: DescribeThemeAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemeAliasResponse, Unit]
  ): Request[DescribeThemeAliasResponse, AWSError] = js.native
  
  /**
    * Describes the read and write permissions for a theme.
    */
  def describeThemePermissions(): Request[DescribeThemePermissionsResponse, AWSError] = js.native
  def describeThemePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemePermissionsResponse, Unit]): Request[DescribeThemePermissionsResponse, AWSError] = js.native
  /**
    * Describes the read and write permissions for a theme.
    */
  def describeThemePermissions(params: DescribeThemePermissionsRequest): Request[DescribeThemePermissionsResponse, AWSError] = js.native
  def describeThemePermissions(
    params: DescribeThemePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeThemePermissionsResponse, Unit]
  ): Request[DescribeThemePermissionsResponse, AWSError] = js.native
  
  /**
    * Returns information about a user, given the user name. 
    */
  def describeUser(): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]): Request[DescribeUserResponse, AWSError] = js.native
  /**
    * Returns information about a user, given the user name. 
    */
  def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse, AWSError] = js.native
  def describeUser(
    params: DescribeUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserResponse, Unit]
  ): Request[DescribeUserResponse, AWSError] = js.native
  
  /**
    * Generates a session URL and authorization code that you can use to embed an Amazon QuickSight read-only dashboard in your web server code. Before you use this command, make sure that you have configured the dashboards and permissions.  Currently, you can use GetDashboardEmbedURL only from the server, not from the user's browser. The following rules apply to the combination of URL and authorization code:   They must be used together.   They can be used one time only.   They are valid for 5 minutes after you run this command.   The resulting user session is valid for 10 hours.   For more information, see Embedding Amazon QuickSight in the Amazon QuickSight User Guide .
    */
  def getDashboardEmbedUrl(): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  def getDashboardEmbedUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardEmbedUrlResponse, Unit]): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  /**
    * Generates a session URL and authorization code that you can use to embed an Amazon QuickSight read-only dashboard in your web server code. Before you use this command, make sure that you have configured the dashboards and permissions.  Currently, you can use GetDashboardEmbedURL only from the server, not from the user's browser. The following rules apply to the combination of URL and authorization code:   They must be used together.   They can be used one time only.   They are valid for 5 minutes after you run this command.   The resulting user session is valid for 10 hours.   For more information, see Embedding Amazon QuickSight in the Amazon QuickSight User Guide .
    */
  def getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  def getDashboardEmbedUrl(
    params: GetDashboardEmbedUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDashboardEmbedUrlResponse, Unit]
  ): Request[GetDashboardEmbedUrlResponse, AWSError] = js.native
  
  /**
    * Generates a session URL and authorization code that you can use to embed the Amazon QuickSight console in your web server code. Use GetSessionEmbedUrl where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and dashboards. The users who access an embedded QuickSight console need belong to the author or admin security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile to the user with the  UpdateUser  API operation. Use  RegisterUser  API operation to add a new user with a custom permission profile attached. For more information, see the following sections in the Amazon QuickSight User Guide:    Embedding the Amazon QuickSight Console     Customizing Access to the Amazon QuickSight Console   
    */
  def getSessionEmbedUrl(): Request[GetSessionEmbedUrlResponse, AWSError] = js.native
  def getSessionEmbedUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetSessionEmbedUrlResponse, Unit]): Request[GetSessionEmbedUrlResponse, AWSError] = js.native
  /**
    * Generates a session URL and authorization code that you can use to embed the Amazon QuickSight console in your web server code. Use GetSessionEmbedUrl where you want to provide an authoring portal that allows users to create data sources, datasets, analyses, and dashboards. The users who access an embedded QuickSight console need belong to the author or admin security cohort. If you want to restrict permissions to some of these features, add a custom permissions profile to the user with the  UpdateUser  API operation. Use  RegisterUser  API operation to add a new user with a custom permission profile attached. For more information, see the following sections in the Amazon QuickSight User Guide:    Embedding the Amazon QuickSight Console     Customizing Access to the Amazon QuickSight Console   
    */
  def getSessionEmbedUrl(params: GetSessionEmbedUrlRequest): Request[GetSessionEmbedUrlResponse, AWSError] = js.native
  def getSessionEmbedUrl(
    params: GetSessionEmbedUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSessionEmbedUrlResponse, Unit]
  ): Request[GetSessionEmbedUrlResponse, AWSError] = js.native
  
  /**
    * Lists Amazon QuickSight analyses that exist in the specified AWS account.
    */
  def listAnalyses(): Request[ListAnalysesResponse, AWSError] = js.native
  def listAnalyses(callback: js.Function2[/* err */ AWSError, /* data */ ListAnalysesResponse, Unit]): Request[ListAnalysesResponse, AWSError] = js.native
  /**
    * Lists Amazon QuickSight analyses that exist in the specified AWS account.
    */
  def listAnalyses(params: ListAnalysesRequest): Request[ListAnalysesResponse, AWSError] = js.native
  def listAnalyses(
    params: ListAnalysesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAnalysesResponse, Unit]
  ): Request[ListAnalysesResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of the dashboards in the QuickSight subscription.
    */
  def listDashboardVersions(): Request[ListDashboardVersionsResponse, AWSError] = js.native
  def listDashboardVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardVersionsResponse, Unit]): Request[ListDashboardVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of the dashboards in the QuickSight subscription.
    */
  def listDashboardVersions(params: ListDashboardVersionsRequest): Request[ListDashboardVersionsResponse, AWSError] = js.native
  def listDashboardVersions(
    params: ListDashboardVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardVersionsResponse, Unit]
  ): Request[ListDashboardVersionsResponse, AWSError] = js.native
  
  /**
    * Lists dashboards in an AWS account.
    */
  def listDashboards(): Request[ListDashboardsResponse, AWSError] = js.native
  def listDashboards(callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardsResponse, Unit]): Request[ListDashboardsResponse, AWSError] = js.native
  /**
    * Lists dashboards in an AWS account.
    */
  def listDashboards(params: ListDashboardsRequest): Request[ListDashboardsResponse, AWSError] = js.native
  def listDashboards(
    params: ListDashboardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDashboardsResponse, Unit]
  ): Request[ListDashboardsResponse, AWSError] = js.native
  
  /**
    * Lists all of the datasets belonging to the current AWS account in an AWS Region. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/ *.
    */
  def listDataSets(): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]): Request[ListDataSetsResponse, AWSError] = js.native
  /**
    * Lists all of the datasets belonging to the current AWS account in an AWS Region. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/ *.
    */
  def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(
    params: ListDataSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]
  ): Request[ListDataSetsResponse, AWSError] = js.native
  
  /**
    * Lists data sources in current AWS Region that belong to this AWS account.
    */
  def listDataSources(): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]): Request[ListDataSourcesResponse, AWSError] = js.native
  /**
    * Lists data sources in current AWS Region that belong to this AWS account.
    */
  def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse, AWSError] = js.native
  def listDataSources(
    params: ListDataSourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSourcesResponse, Unit]
  ): Request[ListDataSourcesResponse, AWSError] = js.native
  
  /**
    * Lists member users in a group.
    */
  def listGroupMemberships(): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]): Request[ListGroupMembershipsResponse, AWSError] = js.native
  /**
    * Lists member users in a group.
    */
  def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse, AWSError] = js.native
  def listGroupMemberships(
    params: ListGroupMembershipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupMembershipsResponse, Unit]
  ): Request[ListGroupMembershipsResponse, AWSError] = js.native
  
  /**
    * Lists all user groups in Amazon QuickSight. 
    */
  def listGroups(): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]): Request[ListGroupsResponse, AWSError] = js.native
  /**
    * Lists all user groups in Amazon QuickSight. 
    */
  def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse, AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGroupsResponse, Unit]
  ): Request[ListGroupsResponse, AWSError] = js.native
  
  /**
    * Lists IAM policy assignments in the current Amazon QuickSight account.
    */
  def listIAMPolicyAssignments(): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  def listIAMPolicyAssignments(callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsResponse, Unit]): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  /**
    * Lists IAM policy assignments in the current Amazon QuickSight account.
    */
  def listIAMPolicyAssignments(params: ListIAMPolicyAssignmentsRequest): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  def listIAMPolicyAssignments(
    params: ListIAMPolicyAssignmentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsResponse, AWSError] = js.native
  
  /**
    * Lists all the IAM policy assignments, including the Amazon Resource Names (ARNs) for the IAM policies assigned to the specified user and group or groups that the user belongs to.
    */
  def listIAMPolicyAssignmentsForUser(): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  def listIAMPolicyAssignmentsForUser(
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsForUserResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  /**
    * Lists all the IAM policy assignments, including the Amazon Resource Names (ARNs) for the IAM policies assigned to the specified user and group or groups that the user belongs to.
    */
  def listIAMPolicyAssignmentsForUser(params: ListIAMPolicyAssignmentsForUserRequest): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  def listIAMPolicyAssignmentsForUser(
    params: ListIAMPolicyAssignmentsForUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIAMPolicyAssignmentsForUserResponse, Unit]
  ): Request[ListIAMPolicyAssignmentsForUserResponse, AWSError] = js.native
  
  /**
    * Lists the history of SPICE ingestions for a dataset.
    */
  def listIngestions(): Request[ListIngestionsResponse, AWSError] = js.native
  def listIngestions(callback: js.Function2[/* err */ AWSError, /* data */ ListIngestionsResponse, Unit]): Request[ListIngestionsResponse, AWSError] = js.native
  /**
    * Lists the history of SPICE ingestions for a dataset.
    */
  def listIngestions(params: ListIngestionsRequest): Request[ListIngestionsResponse, AWSError] = js.native
  def listIngestions(
    params: ListIngestionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListIngestionsResponse, Unit]
  ): Request[ListIngestionsResponse, AWSError] = js.native
  
  /**
    * Lists the namespaces for the specified AWS account.
    */
  def listNamespaces(): Request[ListNamespacesResponse, AWSError] = js.native
  def listNamespaces(callback: js.Function2[/* err */ AWSError, /* data */ ListNamespacesResponse, Unit]): Request[ListNamespacesResponse, AWSError] = js.native
  /**
    * Lists the namespaces for the specified AWS account.
    */
  def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse, AWSError] = js.native
  def listNamespaces(
    params: ListNamespacesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNamespacesResponse, Unit]
  ): Request[ListNamespacesResponse, AWSError] = js.native
  
  /**
    * Lists the tags assigned to a resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags assigned to a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Lists all the aliases of a template.
    */
  def listTemplateAliases(): Request[ListTemplateAliasesResponse, AWSError] = js.native
  def listTemplateAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateAliasesResponse, Unit]): Request[ListTemplateAliasesResponse, AWSError] = js.native
  /**
    * Lists all the aliases of a template.
    */
  def listTemplateAliases(params: ListTemplateAliasesRequest): Request[ListTemplateAliasesResponse, AWSError] = js.native
  def listTemplateAliases(
    params: ListTemplateAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateAliasesResponse, Unit]
  ): Request[ListTemplateAliasesResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of the templates in the current Amazon QuickSight account.
    */
  def listTemplateVersions(): Request[ListTemplateVersionsResponse, AWSError] = js.native
  def listTemplateVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateVersionsResponse, Unit]): Request[ListTemplateVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of the templates in the current Amazon QuickSight account.
    */
  def listTemplateVersions(params: ListTemplateVersionsRequest): Request[ListTemplateVersionsResponse, AWSError] = js.native
  def listTemplateVersions(
    params: ListTemplateVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplateVersionsResponse, Unit]
  ): Request[ListTemplateVersionsResponse, AWSError] = js.native
  
  /**
    * Lists all the templates in the current Amazon QuickSight account.
    */
  def listTemplates(): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]): Request[ListTemplatesResponse, AWSError] = js.native
  /**
    * Lists all the templates in the current Amazon QuickSight account.
    */
  def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse, AWSError] = js.native
  def listTemplates(
    params: ListTemplatesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTemplatesResponse, Unit]
  ): Request[ListTemplatesResponse, AWSError] = js.native
  
  /**
    * Lists all the aliases of a theme.
    */
  def listThemeAliases(): Request[ListThemeAliasesResponse, AWSError] = js.native
  def listThemeAliases(callback: js.Function2[/* err */ AWSError, /* data */ ListThemeAliasesResponse, Unit]): Request[ListThemeAliasesResponse, AWSError] = js.native
  /**
    * Lists all the aliases of a theme.
    */
  def listThemeAliases(params: ListThemeAliasesRequest): Request[ListThemeAliasesResponse, AWSError] = js.native
  def listThemeAliases(
    params: ListThemeAliasesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThemeAliasesResponse, Unit]
  ): Request[ListThemeAliasesResponse, AWSError] = js.native
  
  /**
    * Lists all the versions of the themes in the current AWS account.
    */
  def listThemeVersions(): Request[ListThemeVersionsResponse, AWSError] = js.native
  def listThemeVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListThemeVersionsResponse, Unit]): Request[ListThemeVersionsResponse, AWSError] = js.native
  /**
    * Lists all the versions of the themes in the current AWS account.
    */
  def listThemeVersions(params: ListThemeVersionsRequest): Request[ListThemeVersionsResponse, AWSError] = js.native
  def listThemeVersions(
    params: ListThemeVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThemeVersionsResponse, Unit]
  ): Request[ListThemeVersionsResponse, AWSError] = js.native
  
  /**
    * Lists all the themes in the current AWS account.
    */
  def listThemes(): Request[ListThemesResponse, AWSError] = js.native
  def listThemes(callback: js.Function2[/* err */ AWSError, /* data */ ListThemesResponse, Unit]): Request[ListThemesResponse, AWSError] = js.native
  /**
    * Lists all the themes in the current AWS account.
    */
  def listThemes(params: ListThemesRequest): Request[ListThemesResponse, AWSError] = js.native
  def listThemes(
    params: ListThemesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListThemesResponse, Unit]
  ): Request[ListThemesResponse, AWSError] = js.native
  
  /**
    * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
    */
  def listUserGroups(): Request[ListUserGroupsResponse, AWSError] = js.native
  def listUserGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListUserGroupsResponse, Unit]): Request[ListUserGroupsResponse, AWSError] = js.native
  /**
    * Lists the Amazon QuickSight groups that an Amazon QuickSight user is a member of.
    */
  def listUserGroups(params: ListUserGroupsRequest): Request[ListUserGroupsResponse, AWSError] = js.native
  def listUserGroups(
    params: ListUserGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserGroupsResponse, Unit]
  ): Request[ListUserGroupsResponse, AWSError] = js.native
  
  /**
    * Returns a list of all of the Amazon QuickSight users belonging to this account. 
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Returns a list of all of the Amazon QuickSight users belonging to this account. 
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  
  /**
    * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request. 
    */
  def registerUser(): Request[RegisterUserResponse, AWSError] = js.native
  def registerUser(callback: js.Function2[/* err */ AWSError, /* data */ RegisterUserResponse, Unit]): Request[RegisterUserResponse, AWSError] = js.native
  /**
    * Creates an Amazon QuickSight user, whose identity is associated with the AWS Identity and Access Management (IAM) identity or role specified in the request. 
    */
  def registerUser(params: RegisterUserRequest): Request[RegisterUserResponse, AWSError] = js.native
  def registerUser(
    params: RegisterUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterUserResponse, Unit]
  ): Request[RegisterUserResponse, AWSError] = js.native
  
  /**
    * Restores an analysis.
    */
  def restoreAnalysis(): Request[RestoreAnalysisResponse, AWSError] = js.native
  def restoreAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ RestoreAnalysisResponse, Unit]): Request[RestoreAnalysisResponse, AWSError] = js.native
  /**
    * Restores an analysis.
    */
  def restoreAnalysis(params: RestoreAnalysisRequest): Request[RestoreAnalysisResponse, AWSError] = js.native
  def restoreAnalysis(
    params: RestoreAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestoreAnalysisResponse, Unit]
  ): Request[RestoreAnalysisResponse, AWSError] = js.native
  
  /**
    * Searches for analyses that belong to the user specified in the filter.
    */
  def searchAnalyses(): Request[SearchAnalysesResponse, AWSError] = js.native
  def searchAnalyses(callback: js.Function2[/* err */ AWSError, /* data */ SearchAnalysesResponse, Unit]): Request[SearchAnalysesResponse, AWSError] = js.native
  /**
    * Searches for analyses that belong to the user specified in the filter.
    */
  def searchAnalyses(params: SearchAnalysesRequest): Request[SearchAnalysesResponse, AWSError] = js.native
  def searchAnalyses(
    params: SearchAnalysesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchAnalysesResponse, Unit]
  ): Request[SearchAnalysesResponse, AWSError] = js.native
  
  /**
    * Searches for dashboards that belong to a user. 
    */
  def searchDashboards(): Request[SearchDashboardsResponse, AWSError] = js.native
  def searchDashboards(callback: js.Function2[/* err */ AWSError, /* data */ SearchDashboardsResponse, Unit]): Request[SearchDashboardsResponse, AWSError] = js.native
  /**
    * Searches for dashboards that belong to a user. 
    */
  def searchDashboards(params: SearchDashboardsRequest): Request[SearchDashboardsResponse, AWSError] = js.native
  def searchDashboards(
    params: SearchDashboardsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchDashboardsResponse, Unit]
  ): Request[SearchDashboardsResponse, AWSError] = js.native
  
  /**
    * Assigns one or more tags (key-value pairs) to the specified QuickSight resource.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. You can use the TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. QuickSight supports tagging on data set, data source, dashboard, and template.  Tagging for QuickSight works in a similar way to tagging for other AWS services, except for the following:   You can't use tags to track AWS costs for QuickSight. This restriction is because QuickSight costs are based on users and SPICE capacity, which aren't taggable resources.   QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.  
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns one or more tags (key-value pairs) to the specified QuickSight resource.  Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only resources with certain tag values. You can use the TagResource operation with a resource that already has tags. If you specify a new tag key for the resource, this tag is appended to the list of tags associated with the resource. If you specify a tag key that is already associated with the resource, the new tag value that you specify replaces the previous value for that tag. You can associate as many as 50 tags with a resource. QuickSight supports tagging on data set, data source, dashboard, and template.  Tagging for QuickSight works in a similar way to tagging for other AWS services, except for the following:   You can't use tags to track AWS costs for QuickSight. This restriction is because QuickSight costs are based on users and SPICE capacity, which aren't taggable resources.   QuickSight doesn't currently support the Tag Editor for AWS Resource Groups.  
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag or tags from a resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes a tag or tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates Amazon QuickSight customizations the current AWS Region. Currently, the only customization you can use is a theme. You can use customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace instead. Customizations that apply to a namespace override customizations that apply to an AWS account. To find out which customizations apply, use the DescribeAccountCustomization API operation. 
    */
  def updateAccountCustomization(): Request[UpdateAccountCustomizationResponse, AWSError] = js.native
  def updateAccountCustomization(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountCustomizationResponse, Unit]): Request[UpdateAccountCustomizationResponse, AWSError] = js.native
  /**
    * Updates Amazon QuickSight customizations the current AWS Region. Currently, the only customization you can use is a theme. You can use customizations for your AWS account or, if you specify a namespace, for a QuickSight namespace instead. Customizations that apply to a namespace override customizations that apply to an AWS account. To find out which customizations apply, use the DescribeAccountCustomization API operation. 
    */
  def updateAccountCustomization(params: UpdateAccountCustomizationRequest): Request[UpdateAccountCustomizationResponse, AWSError] = js.native
  def updateAccountCustomization(
    params: UpdateAccountCustomizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountCustomizationResponse, Unit]
  ): Request[UpdateAccountCustomizationResponse, AWSError] = js.native
  
  /**
    * Updates the Amazon QuickSight settings in your AWS account.
    */
  def updateAccountSettings(): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  def updateAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsResponse, Unit]): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  /**
    * Updates the Amazon QuickSight settings in your AWS account.
    */
  def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  def updateAccountSettings(
    params: UpdateAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsResponse, Unit]
  ): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  
  /**
    * Updates an analysis in Amazon QuickSight
    */
  def updateAnalysis(): Request[UpdateAnalysisResponse, AWSError] = js.native
  def updateAnalysis(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnalysisResponse, Unit]): Request[UpdateAnalysisResponse, AWSError] = js.native
  /**
    * Updates an analysis in Amazon QuickSight
    */
  def updateAnalysis(params: UpdateAnalysisRequest): Request[UpdateAnalysisResponse, AWSError] = js.native
  def updateAnalysis(
    params: UpdateAnalysisRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnalysisResponse, Unit]
  ): Request[UpdateAnalysisResponse, AWSError] = js.native
  
  /**
    * Updates the read and write permissions for an analysis.
    */
  def updateAnalysisPermissions(): Request[UpdateAnalysisPermissionsResponse, AWSError] = js.native
  def updateAnalysisPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnalysisPermissionsResponse, Unit]): Request[UpdateAnalysisPermissionsResponse, AWSError] = js.native
  /**
    * Updates the read and write permissions for an analysis.
    */
  def updateAnalysisPermissions(params: UpdateAnalysisPermissionsRequest): Request[UpdateAnalysisPermissionsResponse, AWSError] = js.native
  def updateAnalysisPermissions(
    params: UpdateAnalysisPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAnalysisPermissionsResponse, Unit]
  ): Request[UpdateAnalysisPermissionsResponse, AWSError] = js.native
  
  /**
    * Updates a dashboard in an AWS account.
    */
  def updateDashboard(): Request[UpdateDashboardResponse, AWSError] = js.native
  def updateDashboard(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardResponse, Unit]): Request[UpdateDashboardResponse, AWSError] = js.native
  /**
    * Updates a dashboard in an AWS account.
    */
  def updateDashboard(params: UpdateDashboardRequest): Request[UpdateDashboardResponse, AWSError] = js.native
  def updateDashboard(
    params: UpdateDashboardRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardResponse, Unit]
  ): Request[UpdateDashboardResponse, AWSError] = js.native
  
  /**
    * Updates read and write permissions on a dashboard.
    */
  def updateDashboardPermissions(): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  def updateDashboardPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPermissionsResponse, Unit]): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  /**
    * Updates read and write permissions on a dashboard.
    */
  def updateDashboardPermissions(params: UpdateDashboardPermissionsRequest): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  def updateDashboardPermissions(
    params: UpdateDashboardPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPermissionsResponse, Unit]
  ): Request[UpdateDashboardPermissionsResponse, AWSError] = js.native
  
  /**
    * Updates the published version of a dashboard.
    */
  def updateDashboardPublishedVersion(): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  def updateDashboardPublishedVersion(
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPublishedVersionResponse, Unit]
  ): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  /**
    * Updates the published version of a dashboard.
    */
  def updateDashboardPublishedVersion(params: UpdateDashboardPublishedVersionRequest): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  def updateDashboardPublishedVersion(
    params: UpdateDashboardPublishedVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDashboardPublishedVersionResponse, Unit]
  ): Request[UpdateDashboardPublishedVersionResponse, AWSError] = js.native
  
  /**
    * Updates a dataset.
    */
  def updateDataSet(): Request[UpdateDataSetResponse, AWSError] = js.native
  def updateDataSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetResponse, Unit]): Request[UpdateDataSetResponse, AWSError] = js.native
  /**
    * Updates a dataset.
    */
  def updateDataSet(params: UpdateDataSetRequest): Request[UpdateDataSetResponse, AWSError] = js.native
  def updateDataSet(
    params: UpdateDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetResponse, Unit]
  ): Request[UpdateDataSetResponse, AWSError] = js.native
  
  /**
    * Updates the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def updateDataSetPermissions(): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  def updateDataSetPermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetPermissionsResponse, Unit]): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  /**
    * Updates the permissions on a dataset. The permissions resource is arn:aws:quicksight:region:aws-account-id:dataset/data-set-id.
    */
  def updateDataSetPermissions(params: UpdateDataSetPermissionsRequest): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  def updateDataSetPermissions(
    params: UpdateDataSetPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetPermissionsResponse, Unit]
  ): Request[UpdateDataSetPermissionsResponse, AWSError] = js.native
  
  /**
    * Updates a data source.
    */
  def updateDataSource(): Request[UpdateDataSourceResponse, AWSError] = js.native
  def updateDataSource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceResponse, Unit]): Request[UpdateDataSourceResponse, AWSError] = js.native
  /**
    * Updates a data source.
    */
  def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse, AWSError] = js.native
  def updateDataSource(
    params: UpdateDataSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourceResponse, Unit]
  ): Request[UpdateDataSourceResponse, AWSError] = js.native
  
  /**
    * Updates the permissions to a data source.
    */
  def updateDataSourcePermissions(): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  def updateDataSourcePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourcePermissionsResponse, Unit]): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  /**
    * Updates the permissions to a data source.
    */
  def updateDataSourcePermissions(params: UpdateDataSourcePermissionsRequest): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  def updateDataSourcePermissions(
    params: UpdateDataSourcePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSourcePermissionsResponse, Unit]
  ): Request[UpdateDataSourcePermissionsResponse, AWSError] = js.native
  
  /**
    * Changes a group description. 
    */
  def updateGroup(): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]): Request[UpdateGroupResponse, AWSError] = js.native
  /**
    * Changes a group description. 
    */
  def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse, AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGroupResponse, Unit]
  ): Request[UpdateGroupResponse, AWSError] = js.native
  
  /**
    * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that are specified in the request. This overwrites all of the users included in Identities. 
    */
  def updateIAMPolicyAssignment(): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  def updateIAMPolicyAssignment(callback: js.Function2[/* err */ AWSError, /* data */ UpdateIAMPolicyAssignmentResponse, Unit]): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  /**
    * Updates an existing IAM policy assignment. This operation updates only the optional parameter or parameters that are specified in the request. This overwrites all of the users included in Identities. 
    */
  def updateIAMPolicyAssignment(params: UpdateIAMPolicyAssignmentRequest): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  def updateIAMPolicyAssignment(
    params: UpdateIAMPolicyAssignmentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateIAMPolicyAssignmentResponse, Unit]
  ): Request[UpdateIAMPolicyAssignmentResponse, AWSError] = js.native
  
  /**
    * Updates a template from an existing Amazon QuickSight analysis or another template.
    */
  def updateTemplate(): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]): Request[UpdateTemplateResponse, AWSError] = js.native
  /**
    * Updates a template from an existing Amazon QuickSight analysis or another template.
    */
  def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse, AWSError] = js.native
  def updateTemplate(
    params: UpdateTemplateRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateResponse, Unit]
  ): Request[UpdateTemplateResponse, AWSError] = js.native
  
  /**
    * Updates the template alias of a template.
    */
  def updateTemplateAlias(): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  def updateTemplateAlias(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateAliasResponse, Unit]): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  /**
    * Updates the template alias of a template.
    */
  def updateTemplateAlias(params: UpdateTemplateAliasRequest): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  def updateTemplateAlias(
    params: UpdateTemplateAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplateAliasResponse, Unit]
  ): Request[UpdateTemplateAliasResponse, AWSError] = js.native
  
  /**
    * Updates the resource permissions for a template.
    */
  def updateTemplatePermissions(): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  def updateTemplatePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplatePermissionsResponse, Unit]): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  /**
    * Updates the resource permissions for a template.
    */
  def updateTemplatePermissions(params: UpdateTemplatePermissionsRequest): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  def updateTemplatePermissions(
    params: UpdateTemplatePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTemplatePermissionsResponse, Unit]
  ): Request[UpdateTemplatePermissionsResponse, AWSError] = js.native
  
  /**
    * Updates a theme.
    */
  def updateTheme(): Request[UpdateThemeResponse, AWSError] = js.native
  def updateTheme(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeResponse, Unit]): Request[UpdateThemeResponse, AWSError] = js.native
  /**
    * Updates a theme.
    */
  def updateTheme(params: UpdateThemeRequest): Request[UpdateThemeResponse, AWSError] = js.native
  def updateTheme(
    params: UpdateThemeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeResponse, Unit]
  ): Request[UpdateThemeResponse, AWSError] = js.native
  
  /**
    * Updates an alias of a theme.
    */
  def updateThemeAlias(): Request[UpdateThemeAliasResponse, AWSError] = js.native
  def updateThemeAlias(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeAliasResponse, Unit]): Request[UpdateThemeAliasResponse, AWSError] = js.native
  /**
    * Updates an alias of a theme.
    */
  def updateThemeAlias(params: UpdateThemeAliasRequest): Request[UpdateThemeAliasResponse, AWSError] = js.native
  def updateThemeAlias(
    params: UpdateThemeAliasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemeAliasResponse, Unit]
  ): Request[UpdateThemeAliasResponse, AWSError] = js.native
  
  /**
    * Updates the resource permissions for a theme. Permissions apply to the action to grant or revoke permissions on, for example "quicksight:DescribeTheme". Theme permissions apply in groupings. Valid groupings include the following for the three levels of permissions, which are user, owner, or no permissions:    User    "quicksight:DescribeTheme"     "quicksight:DescribeThemeAlias"     "quicksight:ListThemeAliases"     "quicksight:ListThemeVersions"      Owner    "quicksight:DescribeTheme"     "quicksight:DescribeThemeAlias"     "quicksight:ListThemeAliases"     "quicksight:ListThemeVersions"     "quicksight:DeleteTheme"     "quicksight:UpdateTheme"     "quicksight:CreateThemeAlias"     "quicksight:DeleteThemeAlias"     "quicksight:UpdateThemeAlias"     "quicksight:UpdateThemePermissions"     "quicksight:DescribeThemePermissions"      To specify no permissions, omit the permissions list.  
    */
  def updateThemePermissions(): Request[UpdateThemePermissionsResponse, AWSError] = js.native
  def updateThemePermissions(callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemePermissionsResponse, Unit]): Request[UpdateThemePermissionsResponse, AWSError] = js.native
  /**
    * Updates the resource permissions for a theme. Permissions apply to the action to grant or revoke permissions on, for example "quicksight:DescribeTheme". Theme permissions apply in groupings. Valid groupings include the following for the three levels of permissions, which are user, owner, or no permissions:    User    "quicksight:DescribeTheme"     "quicksight:DescribeThemeAlias"     "quicksight:ListThemeAliases"     "quicksight:ListThemeVersions"      Owner    "quicksight:DescribeTheme"     "quicksight:DescribeThemeAlias"     "quicksight:ListThemeAliases"     "quicksight:ListThemeVersions"     "quicksight:DeleteTheme"     "quicksight:UpdateTheme"     "quicksight:CreateThemeAlias"     "quicksight:DeleteThemeAlias"     "quicksight:UpdateThemeAlias"     "quicksight:UpdateThemePermissions"     "quicksight:DescribeThemePermissions"      To specify no permissions, omit the permissions list.  
    */
  def updateThemePermissions(params: UpdateThemePermissionsRequest): Request[UpdateThemePermissionsResponse, AWSError] = js.native
  def updateThemePermissions(
    params: UpdateThemePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateThemePermissionsResponse, Unit]
  ): Request[UpdateThemePermissionsResponse, AWSError] = js.native
  
  /**
    * Updates an Amazon QuickSight user.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Updates an Amazon QuickSight user.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
}
