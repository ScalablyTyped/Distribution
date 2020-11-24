package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object servicecatalogMod {
  
  type AcceptLanguage = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Account_
    - typings.awsSdk.awsSdkStrings.Role_
    - typings.awsSdk.awsSdkStrings.User_
    - java.lang.String
  */
  type AccessLevelFilterKey = typings.awsSdk.servicecatalogMod._AccessLevelFilterKey | java.lang.String
  
  type AccessLevelFilterValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.UNDER_CHANGE
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AccessStatus = typings.awsSdk.servicecatalogMod._AccessStatus | java.lang.String
  
  type AccountId = java.lang.String
  
  type AccountIds = js.Array[typings.awsSdk.servicecatalogMod.AccountId]
  
  type AddTags = js.Array[typings.awsSdk.servicecatalogMod.Tag]
  
  type AllowedValue = java.lang.String
  
  type AllowedValues = js.Array[typings.awsSdk.servicecatalogMod.AllowedValue]
  
  type ApproximateCount = scala.Double
  
  type AttributeValue = java.lang.String
  
  type BudgetName = java.lang.String
  
  type Budgets = js.Array[typings.awsSdk.servicecatalogMod.BudgetDetail]
  
  type CausingEntity = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ADD
    - typings.awsSdk.awsSdkStrings.MODIFY
    - typings.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type ChangeAction = typings.awsSdk.servicecatalogMod._ChangeAction | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.servicecatalogMod.ClientApiVersions
  
  type CloudWatchDashboardName = java.lang.String
  
  type CloudWatchDashboards = js.Array[typings.awsSdk.servicecatalogMod.CloudWatchDashboard]
  
  type ConstraintDescription = java.lang.String
  
  type ConstraintDetails = js.Array[typings.awsSdk.servicecatalogMod.ConstraintDetail]
  
  type ConstraintParameters = java.lang.String
  
  type ConstraintSummaries = js.Array[typings.awsSdk.servicecatalogMod.ConstraintSummary]
  
  type ConstraintType = java.lang.String
  
  type CopyOption = typings.awsSdk.awsSdkStrings.CopyTags | java.lang.String
  
  type CopyOptions = js.Array[typings.awsSdk.servicecatalogMod.CopyOption]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CopyProductStatus = typings.awsSdk.servicecatalogMod._CopyProductStatus | java.lang.String
  
  type CreatedTime = typings.std.Date
  
  type CreationTime = typings.std.Date
  
  type DefaultValue = java.lang.String
  
  type Description = java.lang.String
  
  type DisableTemplateValidation = scala.Boolean
  
  type Error = java.lang.String
  
  type ErrorCode = java.lang.String
  
  type ErrorDescription = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STATIC
    - typings.awsSdk.awsSdkStrings.DYNAMIC
    - java.lang.String
  */
  type EvaluationType = typings.awsSdk.servicecatalogMod._EvaluationType | java.lang.String
  
  type ExecutionParameterKey = java.lang.String
  
  type ExecutionParameterMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicecatalogMod.ExecutionParameterValueList]
  
  type ExecutionParameterType = java.lang.String
  
  type ExecutionParameterValue = java.lang.String
  
  type ExecutionParameterValueList = js.Array[typings.awsSdk.servicecatalogMod.ExecutionParameterValue]
  
  type ExecutionParameters = js.Array[typings.awsSdk.servicecatalogMod.ExecutionParameter]
  
  type FailedServiceActionAssociations = js.Array[typings.awsSdk.servicecatalogMod.FailedServiceActionAssociation]
  
  type HasDefaultPath = scala.Boolean
  
  type Id = java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type IgnoreErrors = scala.Boolean
  
  type InstructionType = java.lang.String
  
  type InstructionValue = java.lang.String
  
  type LastRequestId = java.lang.String
  
  type LaunchPathSummaries = js.Array[typings.awsSdk.servicecatalogMod.LaunchPathSummary]
  
  type LaunchPaths = js.Array[typings.awsSdk.servicecatalogMod.LaunchPath]
  
  type LogicalResourceId = java.lang.String
  
  type Message = java.lang.String
  
  type Namespaces = js.Array[typings.awsSdk.servicecatalogMod.AccountId]
  
  type NoEcho = scala.Boolean
  
  type NotificationArn = java.lang.String
  
  type NotificationArns = js.Array[typings.awsSdk.servicecatalogMod.NotificationArn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ORGANIZATION
    - typings.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - typings.awsSdk.awsSdkStrings.ACCOUNT
    - java.lang.String
  */
  type OrganizationNodeType = typings.awsSdk.servicecatalogMod._OrganizationNodeType | java.lang.String
  
  type OrganizationNodeValue = java.lang.String
  
  type OrganizationNodes = js.Array[typings.awsSdk.servicecatalogMod.OrganizationNode]
  
  type OutputDescription = java.lang.String
  
  type OutputKey = java.lang.String
  
  type OutputKeys = js.Array[typings.awsSdk.servicecatalogMod.OutputKey]
  
  type OutputValue = java.lang.String
  
  type PageSize = scala.Double
  
  type PageSizeMax100 = scala.Double
  
  type PageToken = java.lang.String
  
  type ParameterKey = java.lang.String
  
  type ParameterType = java.lang.String
  
  type ParameterValue = java.lang.String
  
  type PhysicalId = java.lang.String
  
  type PhysicalResourceId = java.lang.String
  
  type PlanResourceType = java.lang.String
  
  type PortfolioDescription = java.lang.String
  
  type PortfolioDetails = js.Array[typings.awsSdk.servicecatalogMod.PortfolioDetail]
  
  type PortfolioDisplayName = java.lang.String
  
  type PortfolioName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IMPORTED
    - typings.awsSdk.awsSdkStrings.AWS_SERVICECATALOG
    - typings.awsSdk.awsSdkStrings.AWS_ORGANIZATIONS
    - java.lang.String
  */
  type PortfolioShareType = typings.awsSdk.servicecatalogMod._PortfolioShareType | java.lang.String
  
  type PrincipalARN = java.lang.String
  
  type PrincipalType = typings.awsSdk.awsSdkStrings.IAM | java.lang.String
  
  type Principals = js.Array[typings.awsSdk.servicecatalogMod.Principal]
  
  type ProductArn = java.lang.String
  
  type ProductSource = typings.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLOUD_FORMATION_TEMPLATE
    - typings.awsSdk.awsSdkStrings.MARKETPLACE
    - java.lang.String
  */
  type ProductType = typings.awsSdk.servicecatalogMod._ProductType | java.lang.String
  
  type ProductViewAggregationType = java.lang.String
  
  type ProductViewAggregationValues = js.Array[typings.awsSdk.servicecatalogMod.ProductViewAggregationValue]
  
  type ProductViewAggregations = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicecatalogMod.ProductViewAggregationValues]
  
  type ProductViewDetails = js.Array[typings.awsSdk.servicecatalogMod.ProductViewDetail]
  
  type ProductViewDistributor = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FullTextSearch
    - typings.awsSdk.awsSdkStrings.Owner_
    - typings.awsSdk.awsSdkStrings.ProductType
    - typings.awsSdk.awsSdkStrings.SourceProductId
    - java.lang.String
  */
  type ProductViewFilterBy = typings.awsSdk.servicecatalogMod._ProductViewFilterBy | java.lang.String
  
  type ProductViewFilterValue = java.lang.String
  
  type ProductViewFilterValues = js.Array[typings.awsSdk.servicecatalogMod.ProductViewFilterValue]
  
  type ProductViewFilters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicecatalogMod.ProductViewFilterValues]
  
  type ProductViewName = java.lang.String
  
  type ProductViewOwner = java.lang.String
  
  type ProductViewShortDescription = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Title_
    - typings.awsSdk.awsSdkStrings.VersionCount
    - typings.awsSdk.awsSdkStrings.CreationDate
    - java.lang.String
  */
  type ProductViewSortBy = typings.awsSdk.servicecatalogMod._ProductViewSortBy | java.lang.String
  
  type ProductViewSummaries = js.Array[typings.awsSdk.servicecatalogMod.ProductViewSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OWNER
    - typings.awsSdk.awsSdkStrings.LAUNCH_ROLE
    - java.lang.String
  */
  type PropertyKey = typings.awsSdk.servicecatalogMod._PropertyKey | java.lang.String
  
  type PropertyName = java.lang.String
  
  type PropertyValue = java.lang.String
  
  type ProviderName = java.lang.String
  
  type ProvisionedProductAttributes = js.Array[typings.awsSdk.servicecatalogMod.ProvisionedProductAttribute]
  
  type ProvisionedProductDetails = js.Array[typings.awsSdk.servicecatalogMod.ProvisionedProductDetail]
  
  type ProvisionedProductFilters = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicecatalogMod.ProvisionedProductViewFilterValues]
  
  type ProvisionedProductId = java.lang.String
  
  type ProvisionedProductName = java.lang.String
  
  type ProvisionedProductNameOrArn = java.lang.String
  
  type ProvisionedProductPlanName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATE_SUCCESS
    - typings.awsSdk.awsSdkStrings.CREATE_FAILED
    - typings.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.EXECUTE_SUCCESS
    - typings.awsSdk.awsSdkStrings.EXECUTE_FAILED
    - java.lang.String
  */
  type ProvisionedProductPlanStatus = typings.awsSdk.servicecatalogMod._ProvisionedProductPlanStatus | java.lang.String
  
  type ProvisionedProductPlanType = typings.awsSdk.awsSdkStrings.CLOUDFORMATION | java.lang.String
  
  type ProvisionedProductPlans = js.Array[typings.awsSdk.servicecatalogMod.ProvisionedProductPlanSummary]
  
  type ProvisionedProductProperties = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicecatalogMod.PropertyValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.UNDER_CHANGE
    - typings.awsSdk.awsSdkStrings.TAINTED
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.PLAN_IN_PROGRESS
    - java.lang.String
  */
  type ProvisionedProductStatus = typings.awsSdk.servicecatalogMod._ProvisionedProductStatus | java.lang.String
  
  type ProvisionedProductStatusMessage = java.lang.String
  
  type ProvisionedProductType = java.lang.String
  
  type ProvisionedProductViewFilterBy = typings.awsSdk.awsSdkStrings.SearchQuery | java.lang.String
  
  type ProvisionedProductViewFilterValue = java.lang.String
  
  type ProvisionedProductViewFilterValues = js.Array[typings.awsSdk.servicecatalogMod.ProvisionedProductViewFilterValue]
  
  type ProvisioningArtifactActive = scala.Boolean
  
  type ProvisioningArtifactCreatedTime = typings.std.Date
  
  type ProvisioningArtifactDescription = java.lang.String
  
  type ProvisioningArtifactDetails = js.Array[typings.awsSdk.servicecatalogMod.ProvisioningArtifactDetail]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DEFAULT
    - typings.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type ProvisioningArtifactGuidance = typings.awsSdk.servicecatalogMod._ProvisioningArtifactGuidance | java.lang.String
  
  type ProvisioningArtifactInfo = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicecatalogMod.ProvisioningArtifactInfoValue]
  
  type ProvisioningArtifactInfoKey = java.lang.String
  
  type ProvisioningArtifactInfoValue = java.lang.String
  
  type ProvisioningArtifactName = java.lang.String
  
  type ProvisioningArtifactOutputKey = java.lang.String
  
  type ProvisioningArtifactOutputs = js.Array[typings.awsSdk.servicecatalogMod.ProvisioningArtifactOutput]
  
  type ProvisioningArtifactParameters = js.Array[typings.awsSdk.servicecatalogMod.ProvisioningArtifactParameter]
  
  type ProvisioningArtifactPropertyName = typings.awsSdk.awsSdkStrings.Id_ | java.lang.String
  
  type ProvisioningArtifactPropertyValue = java.lang.String
  
  type ProvisioningArtifactSummaries = js.Array[typings.awsSdk.servicecatalogMod.ProvisioningArtifactSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLOUD_FORMATION_TEMPLATE
    - typings.awsSdk.awsSdkStrings.MARKETPLACE_AMI
    - typings.awsSdk.awsSdkStrings.MARKETPLACE_CAR
    - java.lang.String
  */
  type ProvisioningArtifactType = typings.awsSdk.servicecatalogMod._ProvisioningArtifactType | java.lang.String
  
  type ProvisioningArtifactViews = js.Array[typings.awsSdk.servicecatalogMod.ProvisioningArtifactView]
  
  type ProvisioningArtifacts = js.Array[typings.awsSdk.servicecatalogMod.ProvisioningArtifact]
  
  type ProvisioningParameters = js.Array[typings.awsSdk.servicecatalogMod.ProvisioningParameter]
  
  type RecordDetails = js.Array[typings.awsSdk.servicecatalogMod.RecordDetail]
  
  type RecordErrors = js.Array[typings.awsSdk.servicecatalogMod.RecordError]
  
  type RecordOutputs = js.Array[typings.awsSdk.servicecatalogMod.RecordOutput]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS_IN_ERROR
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RecordStatus = typings.awsSdk.servicecatalogMod._RecordStatus | java.lang.String
  
  type RecordTagKey = java.lang.String
  
  type RecordTagValue = java.lang.String
  
  type RecordTags = js.Array[typings.awsSdk.servicecatalogMod.RecordTag]
  
  type RecordType = java.lang.String
  
  type Region = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRUE
    - typings.awsSdk.awsSdkStrings.FALSE
    - typings.awsSdk.awsSdkStrings.CONDITIONAL
    - java.lang.String
  */
  type Replacement = typings.awsSdk.servicecatalogMod._Replacement | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEVER
    - typings.awsSdk.awsSdkStrings.CONDITIONALLY
    - typings.awsSdk.awsSdkStrings.ALWAYS
    - java.lang.String
  */
  type RequiresRecreation = typings.awsSdk.servicecatalogMod._RequiresRecreation | java.lang.String
  
  type ResourceARN = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PROPERTIES
    - typings.awsSdk.awsSdkStrings.METADATA
    - typings.awsSdk.awsSdkStrings.CREATIONPOLICY
    - typings.awsSdk.awsSdkStrings.UPDATEPOLICY
    - typings.awsSdk.awsSdkStrings.DELETIONPOLICY
    - typings.awsSdk.awsSdkStrings.TAGS
    - java.lang.String
  */
  type ResourceAttribute = typings.awsSdk.servicecatalogMod._ResourceAttribute | java.lang.String
  
  type ResourceChangeDetails = js.Array[typings.awsSdk.servicecatalogMod.ResourceChangeDetail]
  
  type ResourceChanges = js.Array[typings.awsSdk.servicecatalogMod.ResourceChange]
  
  type ResourceDetailARN = java.lang.String
  
  type ResourceDetailCreatedTime = typings.std.Date
  
  type ResourceDetailDescription = java.lang.String
  
  type ResourceDetailId = java.lang.String
  
  type ResourceDetailName = java.lang.String
  
  type ResourceDetails = js.Array[typings.awsSdk.servicecatalogMod.ResourceDetail]
  
  type ResourceId = java.lang.String
  
  type ResourceType = java.lang.String
  
  type RetainPhysicalResources = scala.Boolean
  
  type RoleArn = java.lang.String
  
  type Scope = js.Array[typings.awsSdk.servicecatalogMod.ResourceAttribute]
  
  type SearchFilterKey = java.lang.String
  
  type SearchFilterValue = java.lang.String
  
  type SearchProvisionedProductsPageSize = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DUPLICATE_RESOURCE
    - typings.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - typings.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
    - typings.awsSdk.awsSdkStrings.THROTTLING
    - java.lang.String
  */
  type ServiceActionAssociationErrorCode = typings.awsSdk.servicecatalogMod._ServiceActionAssociationErrorCode | java.lang.String
  
  type ServiceActionAssociationErrorMessage = java.lang.String
  
  type ServiceActionAssociations = js.Array[typings.awsSdk.servicecatalogMod.ServiceActionAssociation]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Name_
    - typings.awsSdk.awsSdkStrings.Version_
    - typings.awsSdk.awsSdkStrings.AssumeRole
    - typings.awsSdk.awsSdkStrings.Parameters
    - java.lang.String
  */
  type ServiceActionDefinitionKey = typings.awsSdk.servicecatalogMod._ServiceActionDefinitionKey | java.lang.String
  
  type ServiceActionDefinitionMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicecatalogMod.ServiceActionDefinitionValue]
  
  type ServiceActionDefinitionType = typings.awsSdk.awsSdkStrings.SSM_AUTOMATION | java.lang.String
  
  type ServiceActionDefinitionValue = java.lang.String
  
  type ServiceActionDescription = java.lang.String
  
  type ServiceActionName = java.lang.String
  
  type ServiceActionSummaries = js.Array[typings.awsSdk.servicecatalogMod.ServiceActionSummary]
  
  type ShareErrors = js.Array[typings.awsSdk.servicecatalogMod.ShareError]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_STARTED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ShareStatus = typings.awsSdk.servicecatalogMod._ShareStatus | java.lang.String
  
  type SortField = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASCENDING
    - typings.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typings.awsSdk.servicecatalogMod._SortOrder | java.lang.String
  
  type SourceProvisioningArtifactProperties = js.Array[typings.awsSdk.servicecatalogMod.SourceProvisioningArtifactPropertiesMap]
  
  type SourceProvisioningArtifactPropertiesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicecatalogMod.ProvisioningArtifactPropertyValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CURRENT
    - typings.awsSdk.awsSdkStrings.OUTDATED
    - typings.awsSdk.awsSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = typings.awsSdk.servicecatalogMod._StackInstanceStatus | java.lang.String
  
  type StackInstances = js.Array[typings.awsSdk.servicecatalogMod.StackInstance]
  
  type StackSetAccounts = js.Array[typings.awsSdk.servicecatalogMod.AccountId]
  
  type StackSetFailureToleranceCount = scala.Double
  
  type StackSetFailureTolerancePercentage = scala.Double
  
  type StackSetMaxConcurrencyCount = scala.Double
  
  type StackSetMaxConcurrencyPercentage = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATE
    - typings.awsSdk.awsSdkStrings.UPDATE
    - typings.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type StackSetOperationType = typings.awsSdk.servicecatalogMod._StackSetOperationType | java.lang.String
  
  type StackSetRegions = js.Array[typings.awsSdk.servicecatalogMod.Region]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type Status = typings.awsSdk.servicecatalogMod._Status | java.lang.String
  
  type StatusDetail = java.lang.String
  
  type StatusMessage = java.lang.String
  
  type SuccessfulShares = js.Array[typings.awsSdk.servicecatalogMod.AccountId]
  
  type SupportDescription = java.lang.String
  
  type SupportEmail = java.lang.String
  
  type SupportUrl = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeys = js.Array[typings.awsSdk.servicecatalogMod.TagKey]
  
  type TagOptionActive = scala.Boolean
  
  type TagOptionDetails = js.Array[typings.awsSdk.servicecatalogMod.TagOptionDetail]
  
  type TagOptionId = java.lang.String
  
  type TagOptionKey = java.lang.String
  
  type TagOptionSummaries = js.Array[typings.awsSdk.servicecatalogMod.TagOptionSummary]
  
  type TagOptionValue = java.lang.String
  
  type TagOptionValues = js.Array[typings.awsSdk.servicecatalogMod.TagOptionValue]
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.servicecatalogMod.Tag]
  
  type TotalResultsCount = scala.Double
  
  type UpdateProvisioningParameters = js.Array[typings.awsSdk.servicecatalogMod.UpdateProvisioningParameter]
  
  type UpdatedTime = typings.std.Date
  
  type UsageInstructions = js.Array[typings.awsSdk.servicecatalogMod.UsageInstruction]
  
  type UsePreviousValue = scala.Boolean
  
  type UserArn = java.lang.String
  
  type UserArnSession = java.lang.String
  
  type Verbose = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-12-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.servicecatalogMod._apiVersion | java.lang.String
}
