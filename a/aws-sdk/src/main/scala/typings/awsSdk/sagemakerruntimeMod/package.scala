package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sagemakerruntimeMod {
  type BodyBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.sagemakerruntimeMod.Blob | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.sagemakerruntimeMod.ClientApiVersions
  type CustomAttributesHeader = java.lang.String
  type EndpointName = java.lang.String
  type Header = java.lang.String
  type TargetModelHeader = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-05-13`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.sagemakerruntimeMod._apiVersion | java.lang.String
}
