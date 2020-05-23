package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  /**
    * The total number of uncompressed object bytes processed.
    */
  var BytesProcessed: js.UndefOr[typings.awsSdk.s3Mod.BytesProcessed] = js.native
  /**
    * The total number of bytes of records payload data returned.
    */
  var BytesReturned: js.UndefOr[typings.awsSdk.s3Mod.BytesReturned] = js.native
  /**
    * The total number of object bytes scanned.
    */
  var BytesScanned: js.UndefOr[typings.awsSdk.s3Mod.BytesScanned] = js.native
}

object Stats {
  @scala.inline
  def apply(
    BytesProcessed: js.UndefOr[BytesProcessed] = js.undefined,
    BytesReturned: js.UndefOr[BytesReturned] = js.undefined,
    BytesScanned: js.UndefOr[BytesScanned] = js.undefined
  ): Stats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesProcessed)) __obj.updateDynamic("BytesProcessed")(BytesProcessed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BytesReturned)) __obj.updateDynamic("BytesReturned")(BytesReturned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BytesScanned)) __obj.updateDynamic("BytesScanned")(BytesScanned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

