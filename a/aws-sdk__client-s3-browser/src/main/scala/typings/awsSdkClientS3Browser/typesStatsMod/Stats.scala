package typings.awsSdkClientS3Browser.typesStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  /**
    * <p>Total number of uncompressed object bytes processed.</p>
    */
  var BytesProcessed: js.UndefOr[Double] = js.undefined
  /**
    * <p>Total number of bytes of records payload data returned.</p>
    */
  var BytesReturned: js.UndefOr[Double] = js.undefined
  /**
    * <p>Total number of object bytes scanned.</p>
    */
  var BytesScanned: js.UndefOr[Double] = js.undefined
}

object Stats {
  @scala.inline
  def apply(
    BytesProcessed: Int | Double = null,
    BytesReturned: Int | Double = null,
    BytesScanned: Int | Double = null
  ): Stats = {
    val __obj = js.Dynamic.literal()
    if (BytesProcessed != null) __obj.updateDynamic("BytesProcessed")(BytesProcessed.asInstanceOf[js.Any])
    if (BytesReturned != null) __obj.updateDynamic("BytesReturned")(BytesReturned.asInstanceOf[js.Any])
    if (BytesScanned != null) __obj.updateDynamic("BytesScanned")(BytesScanned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

