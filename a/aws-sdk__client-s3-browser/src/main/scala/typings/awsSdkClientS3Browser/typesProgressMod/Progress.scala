package typings.awsSdkClientS3Browser.typesProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  /**
    * <p>Current number of uncompressed object bytes processed.</p>
    */
  var BytesProcessed: js.UndefOr[Double] = js.undefined
  /**
    * <p>Current number of bytes of records payload data returned.</p>
    */
  var BytesReturned: js.UndefOr[Double] = js.undefined
  /**
    * <p>Current number of object bytes scanned.</p>
    */
  var BytesScanned: js.UndefOr[Double] = js.undefined
}

object Progress {
  @scala.inline
  def apply(
    BytesProcessed: js.UndefOr[Double] = js.undefined,
    BytesReturned: js.UndefOr[Double] = js.undefined,
    BytesScanned: js.UndefOr[Double] = js.undefined
  ): Progress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BytesProcessed)) __obj.updateDynamic("BytesProcessed")(BytesProcessed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BytesReturned)) __obj.updateDynamic("BytesReturned")(BytesReturned.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BytesScanned)) __obj.updateDynamic("BytesScanned")(BytesScanned.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

