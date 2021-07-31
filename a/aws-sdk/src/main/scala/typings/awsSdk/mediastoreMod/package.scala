package typings.awsSdk.mediastoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AllowedHeaders = js.Array[typings.awsSdk.mediastoreMod.Header]

type AllowedMethods = js.Array[typings.awsSdk.mediastoreMod.MethodName]

type AllowedOrigins = js.Array[typings.awsSdk.mediastoreMod.Origin]

type ContainerARN = java.lang.String

type ContainerAccessLoggingEnabled = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type ContainerLevelMetrics = typings.awsSdk.mediastoreMod._ContainerLevelMetrics | java.lang.String

type ContainerList = js.Array[typings.awsSdk.mediastoreMod.Container]

type ContainerListLimit = scala.Double

type ContainerName = java.lang.String

type ContainerPolicy = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ContainerStatus = typings.awsSdk.mediastoreMod._ContainerStatus | java.lang.String

type CorsPolicy = js.Array[typings.awsSdk.mediastoreMod.CorsRule]

type Endpoint = java.lang.String

type ExposeHeaders = js.Array[typings.awsSdk.mediastoreMod.Header]

type Header = java.lang.String

type LifecyclePolicy = java.lang.String

type MaxAgeSeconds = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUT
  - typings.awsSdk.awsSdkStrings.GET
  - typings.awsSdk.awsSdkStrings.DELETE
  - typings.awsSdk.awsSdkStrings.HEAD
  - java.lang.String
*/
type MethodName = typings.awsSdk.mediastoreMod._MethodName | java.lang.String

type MetricPolicyRules = js.Array[typings.awsSdk.mediastoreMod.MetricPolicyRule]

type ObjectGroup = java.lang.String

type ObjectGroupName = java.lang.String

type Origin = java.lang.String

type PaginationToken = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[typings.awsSdk.mediastoreMod.TagKey]

type TagList = js.Array[typings.awsSdk.mediastoreMod.Tag]

type TagValue = java.lang.String

type TimeStamp = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-09-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.mediastoreMod._apiVersion | java.lang.String
