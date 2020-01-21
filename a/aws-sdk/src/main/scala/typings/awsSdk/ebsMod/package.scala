package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ebsMod {
  type BlockData = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.ebsMod.Blob | java.lang.String | typings.node.streamMod.Readable
  type BlockIndex = scala.Double
  type BlockSize = scala.Double
  type BlockToken = java.lang.String
  type Blocks = js.Array[typings.awsSdk.ebsMod.Block]
  type ChangedBlocks = js.Array[typings.awsSdk.ebsMod.ChangedBlock]
  type Checksum = java.lang.String
  type ChecksumAlgorithm = typings.awsSdk.awsSdkStrings.SHA256 | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ebsMod.ClientApiVersions
  type DataLength = scala.Double
  type MaxResults = scala.Double
  type PageToken = java.lang.String
  type SnapshotId = java.lang.String
  type TimeStamp = typings.std.Date
  type VolumeSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2019-11-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ebsMod._apiVersion | java.lang.String
}
