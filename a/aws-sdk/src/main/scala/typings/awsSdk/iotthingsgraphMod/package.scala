package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iotthingsgraphMod {
  
  type Arn = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.iotthingsgraphMod.ClientApiVersions
  
  type DefinitionLanguage = typings.awsSdk.awsSdkStrings.GRAPHQL | java.lang.String
  
  type DefinitionText = java.lang.String
  
  type DependencyRevisions = js.Array[typings.awsSdk.iotthingsgraphMod.DependencyRevision]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.GREENGRASS
    - typings.awsSdk.awsSdkStrings.CLOUD
    - java.lang.String
  */
  type DeploymentTarget = typings.awsSdk.iotthingsgraphMod._DeploymentTarget | java.lang.String
  
  type DeprecateExistingEntities = scala.Boolean
  
  type Enabled = scala.Boolean
  
  type EntityDescriptions = js.Array[typings.awsSdk.iotthingsgraphMod.EntityDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NAME
    - typings.awsSdk.awsSdkStrings.NAMESPACE
    - typings.awsSdk.awsSdkStrings.SEMANTIC_TYPE_PATH
    - typings.awsSdk.awsSdkStrings.REFERENCED_ENTITY_ID
    - java.lang.String
  */
  type EntityFilterName = typings.awsSdk.iotthingsgraphMod._EntityFilterName | java.lang.String
  
  type EntityFilterValue = java.lang.String
  
  type EntityFilterValues = js.Array[typings.awsSdk.iotthingsgraphMod.EntityFilterValue]
  
  type EntityFilters = js.Array[typings.awsSdk.iotthingsgraphMod.EntityFilter]
  
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
  type EntityType = typings.awsSdk.iotthingsgraphMod._EntityType | java.lang.String
  
  type EntityTypes = js.Array[typings.awsSdk.iotthingsgraphMod.EntityType]
  
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
  type FlowExecutionEventType = typings.awsSdk.iotthingsgraphMod._FlowExecutionEventType | java.lang.String
  
  type FlowExecutionId = java.lang.String
  
  type FlowExecutionMessageId = java.lang.String
  
  type FlowExecutionMessagePayload = java.lang.String
  
  type FlowExecutionMessages = js.Array[typings.awsSdk.iotthingsgraphMod.FlowExecutionMessage]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.ABORTED
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type FlowExecutionStatus = typings.awsSdk.iotthingsgraphMod._FlowExecutionStatus | java.lang.String
  
  type FlowExecutionSummaries = js.Array[typings.awsSdk.iotthingsgraphMod.FlowExecutionSummary]
  
  type FlowTemplateFilterName = typings.awsSdk.awsSdkStrings.DEVICE_MODEL_ID | java.lang.String
  
  type FlowTemplateFilterValue = java.lang.String
  
  type FlowTemplateFilterValues = js.Array[typings.awsSdk.iotthingsgraphMod.FlowTemplateFilterValue]
  
  type FlowTemplateFilters = js.Array[typings.awsSdk.iotthingsgraphMod.FlowTemplateFilter]
  
  type FlowTemplateSummaries = js.Array[typings.awsSdk.iotthingsgraphMod.FlowTemplateSummary]
  
  type GreengrassDeploymentId = java.lang.String
  
  type GreengrassGroupId = java.lang.String
  
  type GreengrassGroupVersionId = java.lang.String
  
  type GroupName = java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type NamespaceDeletionStatus = typings.awsSdk.iotthingsgraphMod._NamespaceDeletionStatus | java.lang.String
  
  type NamespaceDeletionStatusErrorCodes = typings.awsSdk.awsSdkStrings.VALIDATION_FAILED | java.lang.String
  
  type NamespaceName = java.lang.String
  
  type NextToken = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type RoleArn = java.lang.String
  
  type S3BucketName = java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.iotthingsgraphMod.String]
  
  type SyncWithPublicNamespace = scala.Boolean
  
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
  type SystemInstanceDeploymentStatus = typings.awsSdk.iotthingsgraphMod._SystemInstanceDeploymentStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SYSTEM_TEMPLATE_ID
    - typings.awsSdk.awsSdkStrings.STATUS
    - typings.awsSdk.awsSdkStrings.GREENGRASS_GROUP_NAME
    - java.lang.String
  */
  type SystemInstanceFilterName = typings.awsSdk.iotthingsgraphMod._SystemInstanceFilterName | java.lang.String
  
  type SystemInstanceFilterValue = java.lang.String
  
  type SystemInstanceFilterValues = js.Array[typings.awsSdk.iotthingsgraphMod.SystemInstanceFilterValue]
  
  type SystemInstanceFilters = js.Array[typings.awsSdk.iotthingsgraphMod.SystemInstanceFilter]
  
  type SystemInstanceSummaries = js.Array[typings.awsSdk.iotthingsgraphMod.SystemInstanceSummary]
  
  type SystemTemplateFilterName = typings.awsSdk.awsSdkStrings.FLOW_TEMPLATE_ID | java.lang.String
  
  type SystemTemplateFilterValue = java.lang.String
  
  type SystemTemplateFilterValues = js.Array[typings.awsSdk.iotthingsgraphMod.SystemTemplateFilterValue]
  
  type SystemTemplateFilters = js.Array[typings.awsSdk.iotthingsgraphMod.SystemTemplateFilter]
  
  type SystemTemplateSummaries = js.Array[typings.awsSdk.iotthingsgraphMod.SystemTemplateSummary]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.iotthingsgraphMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.iotthingsgraphMod.Tag]
  
  type TagValue = java.lang.String
  
  type ThingArn = java.lang.String
  
  type ThingName = java.lang.String
  
  type Things = js.Array[typings.awsSdk.iotthingsgraphMod.Thing]
  
  type Timestamp = typings.std.Date
  
  type UploadId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type UploadStatus = typings.awsSdk.iotthingsgraphMod._UploadStatus | java.lang.String
  
  type Urn = java.lang.String
  
  type Urns = js.Array[typings.awsSdk.iotthingsgraphMod.Urn]
  
  type Version = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-09-06`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.iotthingsgraphMod._apiVersion | java.lang.String
}
