package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dlmMod {
  
  type AvailabilityZone = java.lang.String
  
  type AvailabilityZoneList = js.Array[typings.awsSdk.dlmMod.AvailabilityZone]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.dlmMod.ClientApiVersions
  
  type CmkArn = java.lang.String
  
  type CopyTags = scala.Boolean
  
  type CopyTagsNullable = scala.Boolean
  
  type Count = scala.Double
  
  type CronExpression = java.lang.String
  
  type CrossRegionCopyRules = js.Array[typings.awsSdk.dlmMod.CrossRegionCopyRule]
  
  type Encrypted = scala.Boolean
  
  type ExcludeBootVolume = scala.Boolean
  
  type ExecutionRoleArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type GettablePolicyStateValues = typings.awsSdk.dlmMod._GettablePolicyStateValues | java.lang.String
  
  type Interval = scala.Double
  
  type IntervalUnitValues = typings.awsSdk.awsSdkStrings.HOURS | java.lang.String
  
  type LifecyclePolicySummaryList = js.Array[typings.awsSdk.dlmMod.LifecyclePolicySummary]
  
  type NoReboot = scala.Boolean
  
  type PolicyArn = java.lang.String
  
  type PolicyDescription = java.lang.String
  
  type PolicyId = java.lang.String
  
  type PolicyIdList = js.Array[typings.awsSdk.dlmMod.PolicyId]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EBS_SNAPSHOT_MANAGEMENT
    - typings.awsSdk.awsSdkStrings.IMAGE_MANAGEMENT
    - java.lang.String
  */
  type PolicyTypeValues = typings.awsSdk.dlmMod._PolicyTypeValues | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.VOLUME
    - typings.awsSdk.awsSdkStrings.INSTANCE
    - java.lang.String
  */
  type ResourceTypeValues = typings.awsSdk.dlmMod._ResourceTypeValues | java.lang.String
  
  type ResourceTypeValuesList = js.Array[typings.awsSdk.dlmMod.ResourceTypeValues]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DAYS
    - typings.awsSdk.awsSdkStrings.WEEKS
    - typings.awsSdk.awsSdkStrings.MONTHS
    - typings.awsSdk.awsSdkStrings.YEARS
    - java.lang.String
  */
  type RetentionIntervalUnitValues = typings.awsSdk.dlmMod._RetentionIntervalUnitValues | java.lang.String
  
  type ScheduleList = js.Array[typings.awsSdk.dlmMod.Schedule]
  
  type ScheduleName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type SettablePolicyStateValues = typings.awsSdk.dlmMod._SettablePolicyStateValues | java.lang.String
  
  type StatusMessage = java.lang.String
  
  type String = java.lang.String
  
  type TagFilter = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.dlmMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dlmMod.TagValue]
  
  type TagValue = java.lang.String
  
  type TagsToAddFilterList = js.Array[typings.awsSdk.dlmMod.TagFilter]
  
  type TagsToAddList = js.Array[typings.awsSdk.dlmMod.Tag]
  
  type TargetRegion = java.lang.String
  
  type TargetTagList = js.Array[typings.awsSdk.dlmMod.Tag]
  
  type TargetTagsFilterList = js.Array[typings.awsSdk.dlmMod.TagFilter]
  
  type Time = java.lang.String
  
  type TimesList = js.Array[typings.awsSdk.dlmMod.Time]
  
  type Timestamp = typings.std.Date
  
  type VariableTagsList = js.Array[typings.awsSdk.dlmMod.Tag]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-01-12`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.dlmMod._apiVersion | java.lang.String
}
