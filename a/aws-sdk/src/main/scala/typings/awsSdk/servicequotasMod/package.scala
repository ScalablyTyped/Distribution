package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AwsRegion = java.lang.String

type CustomerServiceEngagementId = java.lang.String

type DateTime = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DEPENDENCY_ACCESS_DENIED_ERROR
  - typings.awsSdk.awsSdkStrings.DEPENDENCY_THROTTLING_ERROR
  - typings.awsSdk.awsSdkStrings.DEPENDENCY_SERVICE_ERROR
  - typings.awsSdk.awsSdkStrings.SERVICE_QUOTA_NOT_AVAILABLE_ERROR
  - java.lang.String
*/
type ErrorCode = typings.awsSdk.servicequotasMod._ErrorCode | java.lang.String

type ErrorMessage = java.lang.String

type GlobalQuota = scala.Boolean

type MaxResults = scala.Double

type MetricDimensionName = java.lang.String

type MetricDimensionValue = java.lang.String

type MetricDimensionsMapDefinition = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.servicequotasMod.MetricDimensionValue]

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MICROSECOND
  - typings.awsSdk.awsSdkStrings.MILLISECOND
  - typings.awsSdk.awsSdkStrings.SECOND
  - typings.awsSdk.awsSdkStrings.MINUTE
  - typings.awsSdk.awsSdkStrings.HOUR
  - typings.awsSdk.awsSdkStrings.DAY
  - typings.awsSdk.awsSdkStrings.WEEK
  - java.lang.String
*/
type PeriodUnit = typings.awsSdk.servicequotasMod._PeriodUnit | java.lang.String

type PeriodValue = scala.Double

type QuotaAdjustable = scala.Boolean

type QuotaArn = java.lang.String

type QuotaCode = java.lang.String

type QuotaMetricName = java.lang.String

type QuotaMetricNamespace = java.lang.String

type QuotaName = java.lang.String

type QuotaUnit = java.lang.String

type QuotaValue = scala.Double

type RequestId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.CASE_OPENED
  - typings.awsSdk.awsSdkStrings.APPROVED
  - typings.awsSdk.awsSdkStrings.DENIED
  - typings.awsSdk.awsSdkStrings.CASE_CLOSED
  - java.lang.String
*/
type RequestStatus = typings.awsSdk.servicequotasMod._RequestStatus | java.lang.String

type RequestedServiceQuotaChangeHistoryListDefinition = js.Array[typings.awsSdk.servicequotasMod.RequestedServiceQuotaChange]

type Requester = java.lang.String

type ServiceCode = java.lang.String

type ServiceInfoListDefinition = js.Array[typings.awsSdk.servicequotasMod.ServiceInfo]

type ServiceName = java.lang.String

type ServiceQuotaIncreaseRequestInTemplateList = js.Array[typings.awsSdk.servicequotasMod.ServiceQuotaIncreaseRequestInTemplate]

type ServiceQuotaListDefinition = js.Array[typings.awsSdk.servicequotasMod.ServiceQuota]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASSOCIATED
  - typings.awsSdk.awsSdkStrings.DISASSOCIATED
  - java.lang.String
*/
type ServiceQuotaTemplateAssociationStatus = typings.awsSdk.servicequotasMod._ServiceQuotaTemplateAssociationStatus | java.lang.String

type Statistic = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-06-24`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.servicequotasMod._apiVersion | java.lang.String
