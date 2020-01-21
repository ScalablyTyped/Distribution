package typings.awsSdk.ebsMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBS extends Service {
  @JSName("config")
  var config_EBS: ConfigBase with ClientConfiguration = js.native
  /**
    * Returns the data in a block in an Amazon Elastic Block Store snapshot.
    */
  def getSnapshotBlock(): Request[GetSnapshotBlockResponse, AWSError] = js.native
  def getSnapshotBlock(callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotBlockResponse, Unit]): Request[GetSnapshotBlockResponse, AWSError] = js.native
  /**
    * Returns the data in a block in an Amazon Elastic Block Store snapshot.
    */
  def getSnapshotBlock(params: GetSnapshotBlockRequest): Request[GetSnapshotBlockResponse, AWSError] = js.native
  def getSnapshotBlock(
    params: GetSnapshotBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSnapshotBlockResponse, Unit]
  ): Request[GetSnapshotBlockResponse, AWSError] = js.native
  /**
    * Returns the block indexes and block tokens for blocks that are different between two Amazon Elastic Block Store snapshots of the same volume/snapshot lineage.
    */
  def listChangedBlocks(): Request[ListChangedBlocksResponse, AWSError] = js.native
  def listChangedBlocks(callback: js.Function2[/* err */ AWSError, /* data */ ListChangedBlocksResponse, Unit]): Request[ListChangedBlocksResponse, AWSError] = js.native
  /**
    * Returns the block indexes and block tokens for blocks that are different between two Amazon Elastic Block Store snapshots of the same volume/snapshot lineage.
    */
  def listChangedBlocks(params: ListChangedBlocksRequest): Request[ListChangedBlocksResponse, AWSError] = js.native
  def listChangedBlocks(
    params: ListChangedBlocksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChangedBlocksResponse, Unit]
  ): Request[ListChangedBlocksResponse, AWSError] = js.native
  /**
    * Returns the block indexes and block tokens for blocks in an Amazon Elastic Block Store snapshot.
    */
  def listSnapshotBlocks(): Request[ListSnapshotBlocksResponse, AWSError] = js.native
  def listSnapshotBlocks(callback: js.Function2[/* err */ AWSError, /* data */ ListSnapshotBlocksResponse, Unit]): Request[ListSnapshotBlocksResponse, AWSError] = js.native
  /**
    * Returns the block indexes and block tokens for blocks in an Amazon Elastic Block Store snapshot.
    */
  def listSnapshotBlocks(params: ListSnapshotBlocksRequest): Request[ListSnapshotBlocksResponse, AWSError] = js.native
  def listSnapshotBlocks(
    params: ListSnapshotBlocksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSnapshotBlocksResponse, Unit]
  ): Request[ListSnapshotBlocksResponse, AWSError] = js.native
}

