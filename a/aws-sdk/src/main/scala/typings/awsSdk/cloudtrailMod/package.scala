package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cloudtrailMod {
  
  type Boolean = scala.Boolean
  
  type ByteBuffer = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.cloudtrailMod.Blob | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cloudtrailMod.ClientApiVersions
  
  type DataResourceValues = js.Array[typings.awsSdk.cloudtrailMod.String]
  
  type DataResources = js.Array[typings.awsSdk.cloudtrailMod.DataResource]
  
  type Date = typings.std.Date
  
  type EventCategory = typings.awsSdk.awsSdkStrings.insight | java.lang.String
  
  type EventSelectors = js.Array[typings.awsSdk.cloudtrailMod.EventSelector]
  
  type EventsList = js.Array[typings.awsSdk.cloudtrailMod.Event]
  
  type ExcludeManagementEventSources = js.Array[typings.awsSdk.cloudtrailMod.String]
  
  type InsightSelectors = js.Array[typings.awsSdk.cloudtrailMod.InsightSelector]
  
  type InsightType = typings.awsSdk.awsSdkStrings.ApiCallRateInsight | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EventId
    - typings.awsSdk.awsSdkStrings.EventName
    - typings.awsSdk.awsSdkStrings.ReadOnly
    - typings.awsSdk.awsSdkStrings.Username_
    - typings.awsSdk.awsSdkStrings.ResourceType
    - typings.awsSdk.awsSdkStrings.ResourceName
    - typings.awsSdk.awsSdkStrings.EventSource
    - typings.awsSdk.awsSdkStrings.AccessKeyId
    - java.lang.String
  */
  type LookupAttributeKey = typings.awsSdk.cloudtrailMod._LookupAttributeKey | java.lang.String
  
  type LookupAttributesList = js.Array[typings.awsSdk.cloudtrailMod.LookupAttribute]
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type PublicKeyList = js.Array[typings.awsSdk.cloudtrailMod.PublicKey]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ReadOnly
    - typings.awsSdk.awsSdkStrings.WriteOnly
    - typings.awsSdk.awsSdkStrings.All_
    - java.lang.String
  */
  type ReadWriteType = typings.awsSdk.cloudtrailMod._ReadWriteType | java.lang.String
  
  type ResourceIdList = js.Array[typings.awsSdk.cloudtrailMod.String]
  
  type ResourceList = js.Array[typings.awsSdk.cloudtrailMod.Resource]
  
  type ResourceTagList = js.Array[typings.awsSdk.cloudtrailMod.ResourceTag]
  
  type String = java.lang.String
  
  type TagsList = js.Array[typings.awsSdk.cloudtrailMod.Tag]
  
  type TrailList = js.Array[typings.awsSdk.cloudtrailMod.Trail]
  
  type TrailNameList = js.Array[typings.awsSdk.cloudtrailMod.String]
  
  type Trails = js.Array[typings.awsSdk.cloudtrailMod.TrailInfo]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2013-11-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cloudtrailMod._apiVersion | java.lang.String
}
