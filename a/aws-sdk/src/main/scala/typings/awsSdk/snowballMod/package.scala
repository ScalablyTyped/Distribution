package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snowballMod {
  type AddressId = java.lang.String
  type AddressList = js.Array[typings.awsSdk.snowballMod.Address]
  type AmiId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.snowballMod.ClientApiVersions
  type ClusterId = java.lang.String
  type ClusterListEntryList = js.Array[typings.awsSdk.snowballMod.ClusterListEntry]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AwaitingQuorum
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InUse
    - typings.awsSdk.awsSdkStrings.Complete_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type ClusterState = typings.awsSdk.snowballMod._ClusterState | java.lang.String
  type CompatibleImageList = js.Array[typings.awsSdk.snowballMod.CompatibleImage]
  type Ec2AmiResourceList = js.Array[typings.awsSdk.snowballMod.Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[typings.awsSdk.snowballMod.EventTriggerDefinition]
  type GSTIN = java.lang.String
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobListEntryList = js.Array[typings.awsSdk.snowballMod.JobListEntry]
  type JobMetadataList = js.Array[typings.awsSdk.snowballMod.JobMetadata]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.New_
    - typings.awsSdk.awsSdkStrings.PreparingAppliance
    - typings.awsSdk.awsSdkStrings.PreparingShipment
    - typings.awsSdk.awsSdkStrings.InTransitToCustomer
    - typings.awsSdk.awsSdkStrings.WithCustomer
    - typings.awsSdk.awsSdkStrings.InTransitToAWS
    - typings.awsSdk.awsSdkStrings.WithAWSSortingFacility
    - typings.awsSdk.awsSdkStrings.WithAWS
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Complete_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - typings.awsSdk.awsSdkStrings.Listing
    - typings.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type JobState = typings.awsSdk.snowballMod._JobState | java.lang.String
  type JobStateList = js.Array[typings.awsSdk.snowballMod.JobState]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IMPORT
    - typings.awsSdk.awsSdkStrings.EXPORT
    - typings.awsSdk.awsSdkStrings.LOCAL_USE
    - java.lang.String
  */
  type JobType = typings.awsSdk.snowballMod._JobType | java.lang.String
  type KmsKeyARN = java.lang.String
  type LambdaResourceList = js.Array[typings.awsSdk.snowballMod.LambdaResource]
  type ListLimit = scala.Double
  type Long = scala.Double
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type S3ResourceList = js.Array[typings.awsSdk.snowballMod.S3Resource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SECOND_DAY
    - typings.awsSdk.awsSdkStrings.NEXT_DAY
    - typings.awsSdk.awsSdkStrings.EXPRESS
    - typings.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type ShippingOption = typings.awsSdk.snowballMod._ShippingOption | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.T50
    - typings.awsSdk.awsSdkStrings.T80
    - typings.awsSdk.awsSdkStrings.T100
    - typings.awsSdk.awsSdkStrings.T42
    - typings.awsSdk.awsSdkStrings.NoPreference
    - java.lang.String
  */
  type SnowballCapacity = typings.awsSdk.snowballMod._SnowballCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STANDARD
    - typings.awsSdk.awsSdkStrings.EDGE
    - typings.awsSdk.awsSdkStrings.EDGE_C
    - typings.awsSdk.awsSdkStrings.EDGE_CG
    - java.lang.String
  */
  type SnowballType = typings.awsSdk.snowballMod._SnowballType | java.lang.String
  type SnsTopicARN = java.lang.String
  type String = java.lang.String
  type Timestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-06-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.snowballMod._apiVersion | java.lang.String
}
