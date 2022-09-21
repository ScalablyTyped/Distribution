package typings.awsSdk.iotthingsgraphMod

import typings.awsSdk.awsSdkStrings.DEVICE_MODEL_ID
import typings.awsSdk.awsSdkStrings.FLOW_TEMPLATE_ID
import typings.awsSdk.awsSdkStrings.GRAPHQL
import typings.awsSdk.awsSdkStrings.VALIDATION_FAILED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type DefinitionLanguage = GRAPHQL | java.lang.String

type DefinitionText = java.lang.String

type DependencyRevisions = js.Array[DependencyRevision]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.GREENGRASS
  - typings.awsSdk.awsSdkStrings.CLOUD
  - java.lang.String
*/
type DeploymentTarget = _DeploymentTarget | java.lang.String

type DeprecateExistingEntities = Boolean

type Enabled = Boolean

type EntityDescriptions = js.Array[EntityDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.NAMESPACE
  - typings.awsSdk.awsSdkStrings.SEMANTIC_TYPE_PATH
  - typings.awsSdk.awsSdkStrings.REFERENCED_ENTITY_ID
  - java.lang.String
*/
type EntityFilterName = _EntityFilterName | java.lang.String

type EntityFilterValue = java.lang.String

type EntityFilterValues = js.Array[EntityFilterValue]

type EntityFilters = js.Array[EntityFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEVICE
  - typings.awsSdk.awsSdkStrings.SERVICE
  - typings.awsSdk.awsSdkStrings.DEVICE_MODEL
  - typings.awsSdk.awsSdkStrings.CAPABILITY
  - typings.awsSdk.awsSdkStrings.STATE
  - typings.awsSdk.awsSdkStrings.ACTION
  - typings.awsSdk.awsSdkStrings.EVENT
  - typings.awsSdk.awsSdkStrings.PROPERTY
  - typings.awsSdk.awsSdkStrings.MAPPING
  - typings.awsSdk.awsSdkStrings.ENUM
  - java.lang.String
*/
type EntityType = _EntityType | java.lang.String

type EntityTypes = js.Array[EntityType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EXECUTION_STARTED
  - typings.awsSdk.awsSdkStrings.EXECUTION_FAILED
  - typings.awsSdk.awsSdkStrings.EXECUTION_ABORTED
  - typings.awsSdk.awsSdkStrings.EXECUTION_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.STEP_STARTED
  - typings.awsSdk.awsSdkStrings.STEP_FAILED
  - typings.awsSdk.awsSdkStrings.STEP_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.ACTIVITY_SCHEDULED
  - typings.awsSdk.awsSdkStrings.ACTIVITY_STARTED
  - typings.awsSdk.awsSdkStrings.ACTIVITY_FAILED
  - typings.awsSdk.awsSdkStrings.ACTIVITY_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.START_FLOW_EXECUTION_TASK
  - typings.awsSdk.awsSdkStrings.SCHEDULE_NEXT_READY_STEPS_TASK
  - typings.awsSdk.awsSdkStrings.THING_ACTION_TASK
  - typings.awsSdk.awsSdkStrings.THING_ACTION_TASK_FAILED
  - typings.awsSdk.awsSdkStrings.THING_ACTION_TASK_SUCCEEDED
  - typings.awsSdk.awsSdkStrings.ACKNOWLEDGE_TASK_MESSAGE
  - java.lang.String
*/
type FlowExecutionEventType = _FlowExecutionEventType | java.lang.String

type FlowExecutionId = java.lang.String

type FlowExecutionMessageId = java.lang.String

type FlowExecutionMessagePayload = java.lang.String

type FlowExecutionMessages = js.Array[FlowExecutionMessage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.ABORTED
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type FlowExecutionStatus = _FlowExecutionStatus | java.lang.String

type FlowExecutionSummaries = js.Array[FlowExecutionSummary]

type FlowTemplateFilterName = DEVICE_MODEL_ID | java.lang.String

type FlowTemplateFilterValue = java.lang.String

type FlowTemplateFilterValues = js.Array[FlowTemplateFilterValue]

type FlowTemplateFilters = js.Array[FlowTemplateFilter]

type FlowTemplateSummaries = js.Array[FlowTemplateSummary]

type GreengrassDeploymentId = java.lang.String

type GreengrassGroupId = java.lang.String

type GreengrassGroupVersionId = java.lang.String

type GroupName = java.lang.String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type NamespaceDeletionStatus = _NamespaceDeletionStatus | java.lang.String

type NamespaceDeletionStatusErrorCodes = VALIDATION_FAILED | java.lang.String

type NamespaceName = java.lang.String

type NextToken = java.lang.String

type ResourceArn = java.lang.String

type RoleArn = java.lang.String

type S3BucketName = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type SyncWithPublicNamespace = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_DEPLOYED
  - typings.awsSdk.awsSdkStrings.BOOTSTRAP
  - typings.awsSdk.awsSdkStrings.DEPLOY_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DEPLOYED_IN_TARGET
  - typings.awsSdk.awsSdkStrings.UNDEPLOY_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.PENDING_DELETE
  - typings.awsSdk.awsSdkStrings.DELETED_IN_TARGET
  - java.lang.String
*/
type SystemInstanceDeploymentStatus = _SystemInstanceDeploymentStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SYSTEM_TEMPLATE_ID
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.GREENGRASS_GROUP_NAME
  - java.lang.String
*/
type SystemInstanceFilterName = _SystemInstanceFilterName | java.lang.String

type SystemInstanceFilterValue = java.lang.String

type SystemInstanceFilterValues = js.Array[SystemInstanceFilterValue]

type SystemInstanceFilters = js.Array[SystemInstanceFilter]

type SystemInstanceSummaries = js.Array[SystemInstanceSummary]

type SystemTemplateFilterName = FLOW_TEMPLATE_ID | java.lang.String

type SystemTemplateFilterValue = java.lang.String

type SystemTemplateFilterValues = js.Array[SystemTemplateFilterValue]

type SystemTemplateFilters = js.Array[SystemTemplateFilter]

type SystemTemplateSummaries = js.Array[SystemTemplateSummary]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type ThingArn = java.lang.String

type ThingName = java.lang.String

type Things = js.Array[Thing]

type Timestamp = js.Date

type UploadId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type UploadStatus = _UploadStatus | java.lang.String

type Urn = java.lang.String

type Urns = js.Array[Urn]

type Version = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-09-06`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
