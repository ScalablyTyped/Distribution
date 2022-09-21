package typings.awsSdk.ebsMod

import typings.awsSdk.awsSdkStrings.LINEAR
import typings.awsSdk.awsSdkStrings.SHA256
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlockData = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type BlockIndex = Double

type BlockSize = Double

type BlockToken = String

type Blocks = js.Array[Block]

type Boolean = scala.Boolean

type ChangedBlocks = js.Array[ChangedBlock]

type ChangedBlocksCount = Double

type Checksum = String

type ChecksumAggregationMethod = LINEAR | String

type ChecksumAlgorithm = SHA256 | String

type DataLength = Double

type Description = String

type IdempotencyToken = String

type KmsKeyArn = String

type MaxResults = Double

type OwnerId = String

type PageToken = String

type Progress = Double

type SnapshotId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.completed__
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.error__
  - java.lang.String
*/
type Status = _Status | String

type TagKey = String

type TagValue = String

type Tags = js.Array[Tag]

type TimeStamp = js.Date

type Timeout = Double

type VolumeSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-11-02`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
