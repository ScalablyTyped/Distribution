package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object shieldMod {
  
  type AttackId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NETWORK
    - typings.awsSdk.awsSdkStrings.APPLICATION
    - java.lang.String
  */
  type AttackLayer = typings.awsSdk.shieldMod._AttackLayer | java.lang.String
  
  type AttackProperties = js.Array[typings.awsSdk.shieldMod.AttackProperty]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.DESTINATION_URL
    - typings.awsSdk.awsSdkStrings.REFERRER
    - typings.awsSdk.awsSdkStrings.SOURCE_ASN
    - typings.awsSdk.awsSdkStrings.SOURCE_COUNTRY
    - typings.awsSdk.awsSdkStrings.SOURCE_IP_ADDRESS
    - typings.awsSdk.awsSdkStrings.SOURCE_USER_AGENT
    - typings.awsSdk.awsSdkStrings.WORDPRESS_PINGBACK_REFLECTOR
    - typings.awsSdk.awsSdkStrings.WORDPRESS_PINGBACK_SOURCE
    - java.lang.String
  */
  type AttackPropertyIdentifier = typings.awsSdk.shieldMod._AttackPropertyIdentifier | java.lang.String
  
  type AttackStatisticsDataList = js.Array[typings.awsSdk.shieldMod.AttackStatisticsDataItem]
  
  type AttackSummaries = js.Array[typings.awsSdk.shieldMod.AttackSummary]
  
  type AttackTimestamp = typings.std.Date
  
  type AttackVectorDescriptionList = js.Array[typings.awsSdk.shieldMod.AttackVectorDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AutoRenew = typings.awsSdk.shieldMod._AutoRenew | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.shieldMod.ClientApiVersions
  
  type ContactNotes = java.lang.String
  
  type Double = scala.Double
  
  type DurationInSeconds = scala.Double
  
  type EmailAddress = java.lang.String
  
  type EmergencyContactList = js.Array[typings.awsSdk.shieldMod.EmergencyContact]
  
  type HealthCheckArn = java.lang.String
  
  type HealthCheckId = java.lang.String
  
  type HealthCheckIds = js.Array[typings.awsSdk.shieldMod.HealthCheckId]
  
  type Integer = scala.Double
  
  type Limits = js.Array[typings.awsSdk.shieldMod.Limit]
  
  type LogBucket = java.lang.String
  
  type LogBucketList = js.Array[typings.awsSdk.shieldMod.LogBucket]
  
  type Long = scala.Double
  
  type MaxResults = scala.Double
  
  type MitigationList = js.Array[typings.awsSdk.shieldMod.Mitigation]
  
  type PhoneNumber = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - typings.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type ProactiveEngagementStatus = typings.awsSdk.shieldMod._ProactiveEngagementStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLOUDFRONT_DISTRIBUTION
    - typings.awsSdk.awsSdkStrings.ROUTE_53_HOSTED_ZONE
    - typings.awsSdk.awsSdkStrings.ELASTIC_IP_ALLOCATION
    - typings.awsSdk.awsSdkStrings.CLASSIC_LOAD_BALANCER
    - typings.awsSdk.awsSdkStrings.APPLICATION_LOAD_BALANCER
    - typings.awsSdk.awsSdkStrings.GLOBAL_ACCELERATOR
    - java.lang.String
  */
  type ProtectedResourceType = typings.awsSdk.shieldMod._ProtectedResourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SUM
    - typings.awsSdk.awsSdkStrings.MEAN
    - typings.awsSdk.awsSdkStrings.MAX
    - java.lang.String
  */
  type ProtectionGroupAggregation = typings.awsSdk.shieldMod._ProtectionGroupAggregation | java.lang.String
  
  type ProtectionGroupId = java.lang.String
  
  type ProtectionGroupMembers = js.Array[typings.awsSdk.shieldMod.ResourceArn]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.ARBITRARY
    - typings.awsSdk.awsSdkStrings.BY_RESOURCE_TYPE
    - java.lang.String
  */
  type ProtectionGroupPattern = typings.awsSdk.shieldMod._ProtectionGroupPattern | java.lang.String
  
  type ProtectionGroups = js.Array[typings.awsSdk.shieldMod.ProtectionGroup]
  
  type ProtectionId = java.lang.String
  
  type ProtectionName = java.lang.String
  
  type Protections = js.Array[typings.awsSdk.shieldMod.Protection]
  
  type ResourceArn = java.lang.String
  
  type ResourceArnFilterList = js.Array[typings.awsSdk.shieldMod.ResourceArn]
  
  type ResourceArnList = js.Array[typings.awsSdk.shieldMod.ResourceArn]
  
  type RoleArn = java.lang.String
  
  type String = java.lang.String
  
  type SubResourceSummaryList = js.Array[typings.awsSdk.shieldMod.SubResourceSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IP
    - typings.awsSdk.awsSdkStrings.URL
    - java.lang.String
  */
  type SubResourceType = typings.awsSdk.shieldMod._SubResourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - java.lang.String
  */
  type SubscriptionState = typings.awsSdk.shieldMod._SubscriptionState | java.lang.String
  
  type SummarizedAttackVectorList = js.Array[typings.awsSdk.shieldMod.SummarizedAttackVector]
  
  type SummarizedCounterList = js.Array[typings.awsSdk.shieldMod.SummarizedCounter]
  
  type Timestamp = typings.std.Date
  
  type Token = java.lang.String
  
  type TopContributors = js.Array[typings.awsSdk.shieldMod.Contributor]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BITS
    - typings.awsSdk.awsSdkStrings.BYTES
    - typings.awsSdk.awsSdkStrings.PACKETS
    - typings.awsSdk.awsSdkStrings.REQUESTS
    - java.lang.String
  */
  type Unit = typings.awsSdk.shieldMod._Unit | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-06-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.shieldMod._apiVersion | java.lang.String
}
