package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisvideomediaMod {
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kinesisvideomediaMod.ClientApiVersions
  type ContentType = java.lang.String
  type ContinuationToken = java.lang.String
  type FragmentNumberString = java.lang.String
  type Payload = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kinesisvideomediaMod.Blob | java.lang.String | typings.node.streamMod.Readable
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.FRAGMENT_NUMBER
    - typings.awsSdk.awsSdkStrings.SERVER_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.PRODUCER_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.NOW
    - typings.awsSdk.awsSdkStrings.EARLIEST
    - typings.awsSdk.awsSdkStrings.CONTINUATION_TOKEN
    - java.lang.String
  */
  type StartSelectorType = typings.awsSdk.kinesisvideomediaMod._StartSelectorType | java.lang.String
  type StreamName = java.lang.String
  type Timestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-09-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kinesisvideomediaMod._apiVersion | java.lang.String
}
