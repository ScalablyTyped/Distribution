package typings.awsSdk.ebsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSnapshotBlocksResponse extends js.Object {
  /**
    * The size of the block.
    */
  var BlockSize: js.UndefOr[typings.awsSdk.ebsMod.BlockSize] = js.native
  /**
    * An array of objects containing information about the blocks.
    */
  var Blocks: js.UndefOr[typings.awsSdk.ebsMod.Blocks] = js.native
  /**
    * The time when the BlockToken expires.
    */
  var ExpiryTime: js.UndefOr[TimeStamp] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PageToken] = js.native
  /**
    * The size of the volume in GB.
    */
  var VolumeSize: js.UndefOr[typings.awsSdk.ebsMod.VolumeSize] = js.native
}

object ListSnapshotBlocksResponse {
  @scala.inline
  def apply(
    BlockSize: Int | Double = null,
    Blocks: Blocks = null,
    ExpiryTime: TimeStamp = null,
    NextToken: PageToken = null,
    VolumeSize: Int | Double = null
  ): ListSnapshotBlocksResponse = {
    val __obj = js.Dynamic.literal()
    if (BlockSize != null) __obj.updateDynamic("BlockSize")(BlockSize.asInstanceOf[js.Any])
    if (Blocks != null) __obj.updateDynamic("Blocks")(Blocks.asInstanceOf[js.Any])
    if (ExpiryTime != null) __obj.updateDynamic("ExpiryTime")(ExpiryTime.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (VolumeSize != null) __obj.updateDynamic("VolumeSize")(VolumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSnapshotBlocksResponse]
  }
}

