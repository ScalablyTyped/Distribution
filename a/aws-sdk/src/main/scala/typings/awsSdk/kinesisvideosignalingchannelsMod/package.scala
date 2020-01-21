package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kinesisvideosignalingchannelsMod {
  type Answer = java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kinesisvideosignalingchannelsMod.ClientApiVersions
  type ClientId = java.lang.String
  type IceServerList = js.Array[typings.awsSdk.kinesisvideosignalingchannelsMod.IceServer]
  type MessagePayload = java.lang.String
  type Password = java.lang.String
  type ResourceARN = java.lang.String
  type Service = typings.awsSdk.awsSdkStrings.TURN | java.lang.String
  type Ttl = scala.Double
  type Uri = java.lang.String
  type Uris = js.Array[typings.awsSdk.kinesisvideosignalingchannelsMod.Uri]
  type Username = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-12-04`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kinesisvideosignalingchannelsMod._apiVersion | java.lang.String
}
