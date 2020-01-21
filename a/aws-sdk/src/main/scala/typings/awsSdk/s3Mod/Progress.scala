package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  /**
    * The current number of uncompressed object bytes processed.
    */
  var BytesProcessed: js.UndefOr[typings.awsSdk.s3Mod.BytesProcessed] = js.native
  /**
    * The current number of bytes of records payload data returned.
    */
  var BytesReturned: js.UndefOr[typings.awsSdk.s3Mod.BytesReturned] = js.native
  /**
    * The current number of object bytes scanned.
    */
  var BytesScanned: js.UndefOr[typings.awsSdk.s3Mod.BytesScanned] = js.native
}

object Progress {
  @scala.inline
  def apply(
    BytesProcessed: Int | Double = null,
    BytesReturned: Int | Double = null,
    BytesScanned: Int | Double = null
  ): Progress = {
    val __obj = js.Dynamic.literal()
    if (BytesProcessed != null) __obj.updateDynamic("BytesProcessed")(BytesProcessed.asInstanceOf[js.Any])
    if (BytesReturned != null) __obj.updateDynamic("BytesReturned")(BytesReturned.asInstanceOf[js.Any])
    if (BytesScanned != null) __obj.updateDynamic("BytesScanned")(BytesScanned.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
}

