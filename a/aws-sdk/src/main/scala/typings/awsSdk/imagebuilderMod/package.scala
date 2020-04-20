package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imagebuilderMod {
  type AccountList = js.Array[typings.awsSdk.imagebuilderMod.NonEmptyString]
  type AmiList = js.Array[typings.awsSdk.imagebuilderMod.Ami]
  type AmiNameString = java.lang.String
  type Arn = java.lang.String
  type ArnList = js.Array[typings.awsSdk.imagebuilderMod.Arn]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.imagebuilderMod.ClientApiVersions
  type ClientToken = java.lang.String
  type ComponentBuildVersionArn = java.lang.String
  type ComponentConfigurationList = js.Array[typings.awsSdk.imagebuilderMod.ComponentConfiguration]
  type ComponentData = java.lang.String
  type ComponentFormat = typings.awsSdk.awsSdkStrings.SHELL | java.lang.String
  type ComponentSummaryList = js.Array[typings.awsSdk.imagebuilderMod.ComponentSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BUILD
    - typings.awsSdk.awsSdkStrings.TEST
    - java.lang.String
  */
  type ComponentType = typings.awsSdk.imagebuilderMod._ComponentType | java.lang.String
  type ComponentVersionArn = java.lang.String
  type ComponentVersionArnOrBuildVersionArn = java.lang.String
  type ComponentVersionList = js.Array[typings.awsSdk.imagebuilderMod.ComponentVersion]
  type DateTime = java.lang.String
  type DistributionConfigurationArn = java.lang.String
  type DistributionConfigurationSummaryList = js.Array[typings.awsSdk.imagebuilderMod.DistributionConfigurationSummary]
  type DistributionList = js.Array[typings.awsSdk.imagebuilderMod.Distribution]
  type DistributionTimeoutMinutes = scala.Double
  type EbsIopsInteger = scala.Double
  type EbsVolumeSizeInteger = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.standard__
    - typings.awsSdk.awsSdkStrings.io1
    - typings.awsSdk.awsSdkStrings.gp2
    - typings.awsSdk.awsSdkStrings.sc1
    - typings.awsSdk.awsSdkStrings.st1
    - java.lang.String
  */
  type EbsVolumeType = typings.awsSdk.imagebuilderMod._EbsVolumeType | java.lang.String
  type EmptyString = java.lang.String
  type FilterList = js.Array[typings.awsSdk.imagebuilderMod.Filter]
  type FilterName = java.lang.String
  type FilterValue = java.lang.String
  type FilterValues = js.Array[typings.awsSdk.imagebuilderMod.FilterValue]
  type ImageBuildVersionArn = java.lang.String
  type ImageBuilderArn = java.lang.String
  type ImagePipelineArn = java.lang.String
  type ImagePipelineList = js.Array[typings.awsSdk.imagebuilderMod.ImagePipeline]
  type ImageRecipeArn = java.lang.String
  type ImageRecipeSummaryList = js.Array[typings.awsSdk.imagebuilderMod.ImageRecipeSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.BUILDING
    - typings.awsSdk.awsSdkStrings.TESTING
    - typings.awsSdk.awsSdkStrings.DISTRIBUTING
    - typings.awsSdk.awsSdkStrings.INTEGRATING
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.CANCELLED
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.DEPRECATED
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ImageStatus = typings.awsSdk.imagebuilderMod._ImageStatus | java.lang.String
  type ImageSummaryList = js.Array[typings.awsSdk.imagebuilderMod.ImageSummary]
  type ImageTestsTimeoutMinutes = scala.Double
  type ImageVersionArn = java.lang.String
  type ImageVersionList = js.Array[typings.awsSdk.imagebuilderMod.ImageVersion]
  type InfrastructureConfigurationArn = java.lang.String
  type InfrastructureConfigurationSummaryList = js.Array[typings.awsSdk.imagebuilderMod.InfrastructureConfigurationSummary]
  type InlineComponentData = java.lang.String
  type InstanceBlockDeviceMappings = js.Array[typings.awsSdk.imagebuilderMod.InstanceBlockDeviceMapping]
  type InstanceType = java.lang.String
  type InstanceTypeList = js.Array[typings.awsSdk.imagebuilderMod.InstanceType]
  type NonEmptyString = java.lang.String
  type NullableBoolean = scala.Boolean
  type OsVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Self_
    - typings.awsSdk.awsSdkStrings.Shared_
    - typings.awsSdk.awsSdkStrings.Amazon_
    - java.lang.String
  */
  type Ownership = typings.awsSdk.imagebuilderMod._Ownership | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EXPRESSION_MATCH_ONLY
    - typings.awsSdk.awsSdkStrings.EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
    - java.lang.String
  */
  type PipelineExecutionStartCondition = typings.awsSdk.imagebuilderMod._PipelineExecutionStartCondition | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.ENABLED
    - java.lang.String
  */
  type PipelineStatus = typings.awsSdk.imagebuilderMod._PipelineStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Windows_
    - typings.awsSdk.awsSdkStrings.Linux_
    - java.lang.String
  */
  type Platform = typings.awsSdk.imagebuilderMod._Platform | java.lang.String
  type ResourceName = java.lang.String
  type ResourcePolicyDocument = java.lang.String
  type RestrictedInteger = scala.Double
  type SecurityGroupIds = js.Array[typings.awsSdk.imagebuilderMod.NonEmptyString]
  type SnsTopicArn = java.lang.String
  type StringList = js.Array[typings.awsSdk.imagebuilderMod.NonEmptyString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.imagebuilderMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.imagebuilderMod.TagValue]
  type TagValue = java.lang.String
  type Uri = java.lang.String
  type VersionNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-12-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.imagebuilderMod._apiVersion | java.lang.String
}
