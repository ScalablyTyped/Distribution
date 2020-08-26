package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object guarddutyMod {
  type AccountDetails = js.Array[typings.awsSdk.guarddutyMod.AccountDetail]
  type AccountId = java.lang.String
  type AccountIds = js.Array[typings.awsSdk.guarddutyMod.AccountId]
  type AdminAccounts = js.Array[typings.awsSdk.guarddutyMod.AdminAccount]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLE_IN_PROGRESS
    - java.lang.String
  */
  type AdminStatus = typings.awsSdk.guarddutyMod._AdminStatus | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.guarddutyMod.ClientApiVersions
  type ClientToken = java.lang.String
  type CountBySeverity = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.guarddutyMod.Integer]
  type Criterion = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.guarddutyMod.Condition]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FLOW_LOGS
    - typings.awsSdk.awsSdkStrings.CLOUD_TRAIL
    - typings.awsSdk.awsSdkStrings.DNS_LOGS
    - typings.awsSdk.awsSdkStrings.S3_LOGS
    - java.lang.String
  */
  type DataSource = typings.awsSdk.guarddutyMod._DataSource | java.lang.String
  type DataSourceList = js.Array[typings.awsSdk.guarddutyMod.DataSource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DataSourceStatus = typings.awsSdk.guarddutyMod._DataSourceStatus | java.lang.String
  type DestinationType = typings.awsSdk.awsSdkStrings.S3 | java.lang.String
  type Destinations = js.Array[typings.awsSdk.guarddutyMod.Destination]
  type DetectorId = java.lang.String
  type DetectorIds = js.Array[typings.awsSdk.guarddutyMod.DetectorId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type DetectorStatus = typings.awsSdk.guarddutyMod._DetectorStatus | java.lang.String
  type Double = scala.Double
  type Email = java.lang.String
  type Eq = js.Array[typings.awsSdk.guarddutyMod.String]
  type Equals = js.Array[typings.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.USEFUL
    - typings.awsSdk.awsSdkStrings.NOT_USEFUL
    - java.lang.String
  */
  type Feedback = typings.awsSdk.guarddutyMod._Feedback | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOOP
    - typings.awsSdk.awsSdkStrings.ARCHIVE
    - java.lang.String
  */
  type FilterAction = typings.awsSdk.guarddutyMod._FilterAction | java.lang.String
  type FilterDescription = java.lang.String
  type FilterName = java.lang.String
  type FilterNames = js.Array[typings.awsSdk.guarddutyMod.FilterName]
  type FilterRank = scala.Double
  type FindingId = java.lang.String
  type FindingIds = js.Array[typings.awsSdk.guarddutyMod.FindingId]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FIFTEEN_MINUTES
    - typings.awsSdk.awsSdkStrings.ONE_HOUR
    - typings.awsSdk.awsSdkStrings.SIX_HOURS
    - java.lang.String
  */
  type FindingPublishingFrequency = typings.awsSdk.guarddutyMod._FindingPublishingFrequency | java.lang.String
  type FindingStatisticType = typings.awsSdk.awsSdkStrings.COUNT_BY_SEVERITY | java.lang.String
  type FindingStatisticTypes = js.Array[typings.awsSdk.guarddutyMod.FindingStatisticType]
  type FindingType = java.lang.String
  type FindingTypes = js.Array[typings.awsSdk.guarddutyMod.FindingType]
  type Findings = js.Array[typings.awsSdk.guarddutyMod.Finding]
  type GuardDutyArn = java.lang.String
  type Integer = scala.Double
  type Invitations = js.Array[typings.awsSdk.guarddutyMod.Invitation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TXT
    - typings.awsSdk.awsSdkStrings.STIX
    - typings.awsSdk.awsSdkStrings.OTX_CSV
    - typings.awsSdk.awsSdkStrings.ALIEN_VAULT
    - typings.awsSdk.awsSdkStrings.PROOF_POINT
    - typings.awsSdk.awsSdkStrings.FIRE_EYE
    - java.lang.String
  */
  type IpSetFormat = typings.awsSdk.guarddutyMod._IpSetFormat | java.lang.String
  type IpSetIds = js.Array[typings.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.ACTIVATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DEACTIVATING
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.DELETE_PENDING
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type IpSetStatus = typings.awsSdk.guarddutyMod._IpSetStatus | java.lang.String
  type Ipv6Addresses = js.Array[typings.awsSdk.guarddutyMod.String]
  type Location = java.lang.String
  type Long = scala.Double
  type MaxResults = scala.Double
  type MemberDataSourceConfigurations = js.Array[typings.awsSdk.guarddutyMod.MemberDataSourceConfiguration]
  type Members = js.Array[typings.awsSdk.guarddutyMod.Member]
  type Name = java.lang.String
  type Neq = js.Array[typings.awsSdk.guarddutyMod.String]
  type NetworkInterfaces = js.Array[typings.awsSdk.guarddutyMod.NetworkInterface]
  type NotEquals = js.Array[typings.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASC
    - typings.awsSdk.awsSdkStrings.DESC
    - java.lang.String
  */
  type OrderBy = typings.awsSdk.guarddutyMod._OrderBy | java.lang.String
  type PortProbeDetails = js.Array[typings.awsSdk.guarddutyMod.PortProbeDetail]
  type PrivateIpAddresses = js.Array[typings.awsSdk.guarddutyMod.PrivateIpAddressDetails]
  type ProductCodes = js.Array[typings.awsSdk.guarddutyMod.ProductCode]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING_VERIFICATION
    - typings.awsSdk.awsSdkStrings.PUBLISHING
    - typings.awsSdk.awsSdkStrings.UNABLE_TO_PUBLISH_FIX_DESTINATION_PROPERTY
    - typings.awsSdk.awsSdkStrings.STOPPED
    - java.lang.String
  */
  type PublishingStatus = typings.awsSdk.guarddutyMod._PublishingStatus | java.lang.String
  type ResourceList = js.Array[typings.awsSdk.guarddutyMod.String]
  type S3BucketDetails = js.Array[typings.awsSdk.guarddutyMod.S3BucketDetail]
  type SecurityGroups = js.Array[typings.awsSdk.guarddutyMod.SecurityGroup]
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.guarddutyMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.guarddutyMod.TagValue]
  type TagValue = java.lang.String
  type Tags = js.Array[typings.awsSdk.guarddutyMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TXT
    - typings.awsSdk.awsSdkStrings.STIX
    - typings.awsSdk.awsSdkStrings.OTX_CSV
    - typings.awsSdk.awsSdkStrings.ALIEN_VAULT
    - typings.awsSdk.awsSdkStrings.PROOF_POINT
    - typings.awsSdk.awsSdkStrings.FIRE_EYE
    - java.lang.String
  */
  type ThreatIntelSetFormat = typings.awsSdk.guarddutyMod._ThreatIntelSetFormat | java.lang.String
  type ThreatIntelSetIds = js.Array[typings.awsSdk.guarddutyMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.ACTIVATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DEACTIVATING
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.DELETE_PENDING
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ThreatIntelSetStatus = typings.awsSdk.guarddutyMod._ThreatIntelSetStatus | java.lang.String
  type ThreatIntelligenceDetails = js.Array[typings.awsSdk.guarddutyMod.ThreatIntelligenceDetail]
  type ThreatNames = js.Array[typings.awsSdk.guarddutyMod.String]
  type Timestamp = typings.std.Date
  type UnprocessedAccounts = js.Array[typings.awsSdk.guarddutyMod.UnprocessedAccount]
  type UsageAccountResultList = js.Array[typings.awsSdk.guarddutyMod.UsageAccountResult]
  type UsageDataSourceResultList = js.Array[typings.awsSdk.guarddutyMod.UsageDataSourceResult]
  type UsageResourceResultList = js.Array[typings.awsSdk.guarddutyMod.UsageResourceResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUM_BY_ACCOUNT
    - typings.awsSdk.awsSdkStrings.SUM_BY_DATA_SOURCE
    - typings.awsSdk.awsSdkStrings.SUM_BY_RESOURCE
    - typings.awsSdk.awsSdkStrings.TOP_RESOURCES
    - java.lang.String
  */
  type UsageStatisticType = typings.awsSdk.guarddutyMod._UsageStatisticType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-11-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.guarddutyMod._apiVersion | java.lang.String
}
