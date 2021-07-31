package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type Arn = java.lang.String

type AttrKey = java.lang.String

type AttrValue = java.lang.String

type Attributes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicediscoveryMod.AttrValue]

type Code = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - java.lang.String
*/
type CustomHealthStatus = typings.awsSdk.servicediscoveryMod._CustomHealthStatus | java.lang.String

type DiscoverMaxResults = scala.Double

type DnsRecordList = js.Array[typings.awsSdk.servicediscoveryMod.DnsRecord]

type FailureThreshold = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EQ
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
type FilterCondition = typings.awsSdk.servicediscoveryMod._FilterCondition | java.lang.String

type FilterValue = java.lang.String

type FilterValues = js.Array[typings.awsSdk.servicediscoveryMod.FilterValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HTTP
  - typings.awsSdk.awsSdkStrings.HTTPS
  - typings.awsSdk.awsSdkStrings.TCP
  - java.lang.String
*/
type HealthCheckType = typings.awsSdk.servicediscoveryMod._HealthCheckType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - typings.awsSdk.awsSdkStrings.UNKNOWN
  - java.lang.String
*/
type HealthStatus = typings.awsSdk.servicediscoveryMod._HealthStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HEALTHY
  - typings.awsSdk.awsSdkStrings.UNHEALTHY
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type HealthStatusFilter = typings.awsSdk.servicediscoveryMod._HealthStatusFilter | java.lang.String

type HttpInstanceSummaryList = js.Array[typings.awsSdk.servicediscoveryMod.HttpInstanceSummary]

type InstanceHealthStatusMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicediscoveryMod.HealthStatus]

type InstanceIdList = js.Array[typings.awsSdk.servicediscoveryMod.ResourceId]

type InstanceSummaryList = js.Array[typings.awsSdk.servicediscoveryMod.InstanceSummary]

type MaxResults = scala.Double

type Message = java.lang.String

type NamespaceFilterName = typings.awsSdk.awsSdkStrings.TYPE | java.lang.String

type NamespaceFilters = js.Array[typings.awsSdk.servicediscoveryMod.NamespaceFilter]

type NamespaceName = java.lang.String

type NamespaceSummariesList = js.Array[typings.awsSdk.servicediscoveryMod.NamespaceSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DNS_PUBLIC
  - typings.awsSdk.awsSdkStrings.DNS_PRIVATE
  - typings.awsSdk.awsSdkStrings.HTTP
  - java.lang.String
*/
type NamespaceType = typings.awsSdk.servicediscoveryMod._NamespaceType | java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAMESPACE_ID
  - typings.awsSdk.awsSdkStrings.SERVICE_ID
  - typings.awsSdk.awsSdkStrings.STATUS
  - typings.awsSdk.awsSdkStrings.TYPE
  - typings.awsSdk.awsSdkStrings.UPDATE_DATE
  - java.lang.String
*/
type OperationFilterName = typings.awsSdk.servicediscoveryMod._OperationFilterName | java.lang.String

type OperationFilters = js.Array[typings.awsSdk.servicediscoveryMod.OperationFilter]

type OperationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAIL
  - java.lang.String
*/
type OperationStatus = typings.awsSdk.servicediscoveryMod._OperationStatus | java.lang.String

type OperationSummaryList = js.Array[typings.awsSdk.servicediscoveryMod.OperationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAMESPACE
  - typings.awsSdk.awsSdkStrings.SERVICE
  - typings.awsSdk.awsSdkStrings.INSTANCE
  - java.lang.String
*/
type OperationTargetType = typings.awsSdk.servicediscoveryMod._OperationTargetType | java.lang.String

type OperationTargetsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicediscoveryMod.ResourceId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_NAMESPACE
  - typings.awsSdk.awsSdkStrings.DELETE_NAMESPACE
  - typings.awsSdk.awsSdkStrings.UPDATE_SERVICE
  - typings.awsSdk.awsSdkStrings.REGISTER_INSTANCE
  - typings.awsSdk.awsSdkStrings.DEREGISTER_INSTANCE
  - java.lang.String
*/
type OperationType = typings.awsSdk.servicediscoveryMod._OperationType | java.lang.String

type RecordTTL = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SRV
  - typings.awsSdk.awsSdkStrings.A
  - typings.awsSdk.awsSdkStrings.AAAA
  - typings.awsSdk.awsSdkStrings.CNAME
  - java.lang.String
*/
type RecordType = typings.awsSdk.servicediscoveryMod._RecordType | java.lang.String

type ResourceCount = scala.Double

type ResourceDescription = java.lang.String

type ResourceId = java.lang.String

type ResourcePath = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MULTIVALUE
  - typings.awsSdk.awsSdkStrings.WEIGHTED
  - java.lang.String
*/
type RoutingPolicy = typings.awsSdk.servicediscoveryMod._RoutingPolicy | java.lang.String

type ServiceFilterName = typings.awsSdk.awsSdkStrings.NAMESPACE_ID | java.lang.String

type ServiceFilters = js.Array[typings.awsSdk.servicediscoveryMod.ServiceFilter]

type ServiceName = java.lang.String

type ServiceSummariesList = js.Array[typings.awsSdk.servicediscoveryMod.ServiceSummary]

type TagKey = java.lang.String

type TagKeyList = js.Array[typings.awsSdk.servicediscoveryMod.TagKey]

type TagList = js.Array[typings.awsSdk.servicediscoveryMod.Tag]

type TagValue = java.lang.String

type Timestamp = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-03-14`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.servicediscoveryMod._apiVersion | java.lang.String
