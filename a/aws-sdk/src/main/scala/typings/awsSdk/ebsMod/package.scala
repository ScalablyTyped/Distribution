package typings.awsSdk.ebsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlockData = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.ebsMod.Blob | java.lang.String | typings.node.streamMod.Readable

type BlockIndex = scala.Double

type BlockSize = scala.Double

type BlockToken = java.lang.String

type Blocks = js.Array[typings.awsSdk.ebsMod.Block]

type Boolean = scala.Boolean

type ChangedBlocks = js.Array[typings.awsSdk.ebsMod.ChangedBlock]

type ChangedBlocksCount = scala.Double

type Checksum = java.lang.String

type ChecksumAggregationMethod = typings.awsSdk.awsSdkStrings.LINEAR | java.lang.String

type ChecksumAlgorithm = typings.awsSdk.awsSdkStrings.SHA256 | java.lang.String

type DataLength = scala.Double

type Description = java.lang.String

type IdempotencyToken = java.lang.String

type KmsKeyArn = java.lang.String

type MaxResults = scala.Double

type OwnerId = java.lang.String

type PageToken = java.lang.String

type Progress = scala.Double

type SnapshotId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.completed__
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.error__
  - java.lang.String
*/
type Status = typings.awsSdk.ebsMod._Status | java.lang.String

type TagKey = java.lang.String

type TagValue = java.lang.String

type Tags = js.Array[typings.awsSdk.ebsMod.Tag]

type TimeStamp = typings.std.Date

type Timeout = scala.Double

type VolumeSize = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-11-02`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.ebsMod._apiVersion | java.lang.String
