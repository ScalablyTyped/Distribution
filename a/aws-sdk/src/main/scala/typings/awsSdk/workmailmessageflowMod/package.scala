package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object workmailmessageflowMod {
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.workmailmessageflowMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-05-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.workmailmessageflowMod._apiVersion | java.lang.String
  type messageContentBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.workmailmessageflowMod.Blob | java.lang.String | typings.node.streamMod.Readable
  type messageIdType = java.lang.String
}
