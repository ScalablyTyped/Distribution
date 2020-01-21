package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iot1clickprojectsMod {
  type AttributeDefaultValue = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.iot1clickprojectsMod.ClientApiVersions
  type DefaultPlacementAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iot1clickprojectsMod.AttributeDefaultValue]
  type Description = java.lang.String
  type DeviceCallbackKey = java.lang.String
  type DeviceCallbackOverrideMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iot1clickprojectsMod.DeviceCallbackValue]
  type DeviceCallbackValue = java.lang.String
  type DeviceId = java.lang.String
  type DeviceMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iot1clickprojectsMod.DeviceId]
  type DeviceTemplateMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iot1clickprojectsMod.DeviceTemplate]
  type DeviceTemplateName = java.lang.String
  type DeviceType = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type PlacementAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iot1clickprojectsMod.AttributeValue]
  type PlacementName = java.lang.String
  type PlacementSummaryList = js.Array[typings.awsSdk.iot1clickprojectsMod.PlacementSummary]
  type ProjectArn = java.lang.String
  type ProjectName = java.lang.String
  type ProjectSummaryList = js.Array[typings.awsSdk.iot1clickprojectsMod.ProjectSummary]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.iot1clickprojectsMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iot1clickprojectsMod.TagValue]
  type TagValue = java.lang.String
  type Time = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-05-14`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.iot1clickprojectsMod._apiVersion | java.lang.String
}
