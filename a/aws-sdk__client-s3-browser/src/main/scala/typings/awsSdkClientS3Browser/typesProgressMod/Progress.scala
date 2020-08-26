package typings.awsSdkClientS3Browser.typesProgressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  /**
    * <p>Current number of uncompressed object bytes processed.</p>
    */
  var BytesProcessed: js.UndefOr[Double] = js.native
  /**
    * <p>Current number of bytes of records payload data returned.</p>
    */
  var BytesReturned: js.UndefOr[Double] = js.native
  /**
    * <p>Current number of object bytes scanned.</p>
    */
  var BytesScanned: js.UndefOr[Double] = js.native
}

object Progress {
  @scala.inline
  def apply(): Progress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Progress]
  }
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBytesProcessed(value: Double): Self = this.set("BytesProcessed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesProcessed: Self = this.set("BytesProcessed", js.undefined)
    @scala.inline
    def setBytesReturned(value: Double): Self = this.set("BytesReturned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesReturned: Self = this.set("BytesReturned", js.undefined)
    @scala.inline
    def setBytesScanned(value: Double): Self = this.set("BytesScanned", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBytesScanned: Self = this.set("BytesScanned", js.undefined)
  }
  
}

