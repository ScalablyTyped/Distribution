package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object migrationhubconfigMod {
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.migrationhubconfigMod.ClientApiVersions
  type ControlId = java.lang.String
  type DescribeHomeRegionControlsMaxResults = scala.Double
  type DryRun = scala.Boolean
  type HomeRegion = java.lang.String
  type HomeRegionControls = js.Array[typings.awsSdk.migrationhubconfigMod.HomeRegionControl]
  type RequestedTime = typings.std.Date
  type TargetId = java.lang.String
  type TargetType = typings.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  type Token = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-06-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.migrationhubconfigMod._apiVersion | java.lang.String
}
