package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codeguruprofilerMod {
  type AgentProfile = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.codeguruprofilerMod.Blob | java.lang.String
  type AggregatedProfile = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.codeguruprofilerMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.P1D
    - typings.awsSdk.awsSdkStrings.PT1H
    - typings.awsSdk.awsSdkStrings.PT5M
    - java.lang.String
  */
  type AggregationPeriod = typings.awsSdk.codeguruprofilerMod._AggregationPeriod | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codeguruprofilerMod.ClientApiVersions
  type ClientToken = java.lang.String
  type FleetInstanceId = java.lang.String
  type Integer = scala.Double
  type MaxDepth = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TimestampAscending
    - typings.awsSdk.awsSdkStrings.TimestampDescending
    - java.lang.String
  */
  type OrderBy = typings.awsSdk.codeguruprofilerMod._OrderBy | java.lang.String
  type PaginationToken = java.lang.String
  type Period = java.lang.String
  type ProfileTimes = js.Array[typings.awsSdk.codeguruprofilerMod.ProfileTime]
  type ProfilingGroupArn = java.lang.String
  type ProfilingGroupDescriptions = js.Array[typings.awsSdk.codeguruprofilerMod.ProfilingGroupDescription]
  type ProfilingGroupName = java.lang.String
  type ProfilingGroupNames = js.Array[typings.awsSdk.codeguruprofilerMod.ProfilingGroupName]
  type String = java.lang.String
  type Timestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-07-18`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codeguruprofilerMod._apiVersion | java.lang.String
}
