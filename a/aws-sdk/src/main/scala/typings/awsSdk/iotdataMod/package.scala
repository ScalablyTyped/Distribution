package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iotdataMod {
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.iotdataMod.ClientApiVersions
  type JsonDocument = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.iotdataMod.Blob | java.lang.String
  type NamedShadowList = js.Array[typings.awsSdk.iotdataMod.ShadowName]
  type NextToken = java.lang.String
  type PageSize = scala.Double
  type Payload = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.iotdataMod.Blob | java.lang.String
  type Qos = scala.Double
  type ShadowName = java.lang.String
  type ThingName = java.lang.String
  type Timestamp = scala.Double
  type Topic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-05-28`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.iotdataMod._apiVersion | java.lang.String
}
