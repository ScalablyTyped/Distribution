package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllowedHeaders = js.Array[Header]

type AllowedMethods = js.Array[MethodName]

type AllowedOrigins = js.Array[Origin]

type ContainerARN = String

type ContainerAccessLoggingEnabled = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ContainerLevelMetrics = _ContainerLevelMetrics | String

type ContainerList = js.Array[Container]

type ContainerListLimit = Double

type ContainerName = String

type ContainerPolicy = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ContainerStatus = _ContainerStatus | String

type CorsPolicy = js.Array[CorsRule]

type Endpoint = String

type ExposeHeaders = js.Array[Header]

type Header = String

type LifecyclePolicy = String

type MaxAgeSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUT
  - typings.awsSdk.awsSdkStrings.GET
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.HEAD
  - java.lang.String
*/
type MethodName = _MethodName | String

type MetricPolicyRules = js.Array[MetricPolicyRule]

type ObjectGroup = String

type ObjectGroupName = String

type Origin = String

type PaginationToken = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TimeStamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-09-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
