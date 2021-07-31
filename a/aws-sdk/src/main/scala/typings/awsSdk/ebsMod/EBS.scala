package typings.awsSdk.ebsMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EBS extends Service {
  
  /**
    * Seals and completes the snapshot after all of the required blocks of data have been written to it. Completing the snapshot changes the status to completed. You cannot write new blocks to a snapshot after it has been completed.
    */
  def completeSnapshot(): Request[CompleteSnapshotResponse, AWSError] = js.native
  def completeSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ CompleteSnapshotResponse, Unit]): Request[CompleteSnapshotResponse, AWSError] = js.native
  /**
    * Seals and completes the snapshot after all of the required blocks of data have been written to it. Completing the snapshot changes the status to completed. You cannot write new blocks to a snapshot after it has been completed.
    */
  def completeSnapshot(params: CompleteSnapshotRequest): Request[CompleteSnapshotResponse, AWSError] = js.native
  def completeSnapshot(
    params: CompleteSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CompleteSnapshotResponse, Unit]
  ): Request[CompleteSnapshotResponse, AWSError] = js.native
  
  @JSName("config")
  var config_EBS: ConfigBase & ClientConfiguration = js.native
  
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
    * Returns information about the blocks that are different between two Amazon Elastic Block Store snapshots of the same volume/snapshot lineage.
    */
  def listChangedBlocks(): Request[ListChangedBlocksResponse, AWSError] = js.native
  def listChangedBlocks(callback: js.Function2[/* err */ AWSError, /* data */ ListChangedBlocksResponse, Unit]): Request[ListChangedBlocksResponse, AWSError] = js.native
  /**
    * Returns information about the blocks that are different between two Amazon Elastic Block Store snapshots of the same volume/snapshot lineage.
    */
  def listChangedBlocks(params: ListChangedBlocksRequest): Request[ListChangedBlocksResponse, AWSError] = js.native
  def listChangedBlocks(
    params: ListChangedBlocksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListChangedBlocksResponse, Unit]
  ): Request[ListChangedBlocksResponse, AWSError] = js.native
  
  /**
    * Returns information about the blocks in an Amazon Elastic Block Store snapshot.
    */
  def listSnapshotBlocks(): Request[ListSnapshotBlocksResponse, AWSError] = js.native
  def listSnapshotBlocks(callback: js.Function2[/* err */ AWSError, /* data */ ListSnapshotBlocksResponse, Unit]): Request[ListSnapshotBlocksResponse, AWSError] = js.native
  /**
    * Returns information about the blocks in an Amazon Elastic Block Store snapshot.
    */
  def listSnapshotBlocks(params: ListSnapshotBlocksRequest): Request[ListSnapshotBlocksResponse, AWSError] = js.native
  def listSnapshotBlocks(
    params: ListSnapshotBlocksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSnapshotBlocksResponse, Unit]
  ): Request[ListSnapshotBlocksResponse, AWSError] = js.native
  
  /**
    * Writes a block of data to a snapshot. If the specified block contains data, the existing data is overwritten. The target snapshot must be in the pending state. Data written to a snapshot must be aligned with 512-byte sectors.
    */
  def putSnapshotBlock(): Request[PutSnapshotBlockResponse, AWSError] = js.native
  def putSnapshotBlock(callback: js.Function2[/* err */ AWSError, /* data */ PutSnapshotBlockResponse, Unit]): Request[PutSnapshotBlockResponse, AWSError] = js.native
  /**
    * Writes a block of data to a snapshot. If the specified block contains data, the existing data is overwritten. The target snapshot must be in the pending state. Data written to a snapshot must be aligned with 512-byte sectors.
    */
  def putSnapshotBlock(params: PutSnapshotBlockRequest): Request[PutSnapshotBlockResponse, AWSError] = js.native
  def putSnapshotBlock(
    params: PutSnapshotBlockRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSnapshotBlockResponse, Unit]
  ): Request[PutSnapshotBlockResponse, AWSError] = js.native
  
  /**
    * Creates a new Amazon EBS snapshot. The new snapshot enters the pending state after the request completes.  After creating the snapshot, use  PutSnapshotBlock to write blocks of data to the snapshot.
    */
  def startSnapshot(): Request[StartSnapshotResponse, AWSError] = js.native
  def startSnapshot(callback: js.Function2[/* err */ AWSError, /* data */ StartSnapshotResponse, Unit]): Request[StartSnapshotResponse, AWSError] = js.native
  /**
    * Creates a new Amazon EBS snapshot. The new snapshot enters the pending state after the request completes.  After creating the snapshot, use  PutSnapshotBlock to write blocks of data to the snapshot.
    */
  def startSnapshot(params: StartSnapshotRequest): Request[StartSnapshotResponse, AWSError] = js.native
  def startSnapshot(
    params: StartSnapshotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSnapshotResponse, Unit]
  ): Request[StartSnapshotResponse, AWSError] = js.native
}
