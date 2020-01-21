package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediapackagevodMod {
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.SCTE35_ENHANCED
    - typings.awsSdk.awsSdkStrings.PASSTHROUGH
    - java.lang.String
  */
  type AdMarkers = typings.awsSdk.mediapackagevodMod._AdMarkers | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.mediapackagevodMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AES_128
    - typings.awsSdk.awsSdkStrings.SAMPLE_AES
    - java.lang.String
  */
  type EncryptionMethod = typings.awsSdk.mediapackagevodMod._EncryptionMethod | java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.HBBTV_1_5
    - java.lang.String
  */
  type Profile = typings.awsSdk.mediapackagevodMod._Profile | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ORIGINAL
    - typings.awsSdk.awsSdkStrings.VIDEO_BITRATE_ASCENDING
    - typings.awsSdk.awsSdkStrings.VIDEO_BITRATE_DESCENDING
    - java.lang.String
  */
  type StreamOrder = typings.awsSdk.mediapackagevodMod._StreamOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-07`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.mediapackagevodMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type integer = scala.Double
  type listOfAssetShallow = js.Array[typings.awsSdk.mediapackagevodMod.AssetShallow]
  type listOfDashManifest = js.Array[typings.awsSdk.mediapackagevodMod.DashManifest]
  type listOfEgressEndpoint = js.Array[typings.awsSdk.mediapackagevodMod.EgressEndpoint]
  type listOfHlsManifest = js.Array[typings.awsSdk.mediapackagevodMod.HlsManifest]
  type listOfMssManifest = js.Array[typings.awsSdk.mediapackagevodMod.MssManifest]
  type listOfPackagingConfiguration = js.Array[typings.awsSdk.mediapackagevodMod.PackagingConfiguration]
  type listOfPackagingGroup = js.Array[typings.awsSdk.mediapackagevodMod.PackagingGroup]
  type listOfString = js.Array[typings.awsSdk.mediapackagevodMod.string]
  type string = java.lang.String
}
