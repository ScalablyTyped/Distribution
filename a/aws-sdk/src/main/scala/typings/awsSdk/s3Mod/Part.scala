package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Part extends js.Object {
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.native
  /**
    * Date and time at which the part was uploaded.
    */
  var LastModified: js.UndefOr[typings.awsSdk.s3Mod.LastModified] = js.native
  /**
    * Part number identifying the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[typings.awsSdk.s3Mod.PartNumber] = js.native
  /**
    * Size in bytes of the uploaded part data.
    */
  var Size: js.UndefOr[typings.awsSdk.s3Mod.Size] = js.native
}

object Part {
  @scala.inline
  def apply(): Part = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Part]
  }
  @scala.inline
  implicit class PartOps[Self <: Part] (val x: Self) extends AnyVal {
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
    def setETag(value: ETag): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteETag: Self = this.set("ETag", js.undefined)
    @scala.inline
    def setLastModified(value: LastModified): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("LastModified", js.undefined)
    @scala.inline
    def setPartNumber(value: PartNumber): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartNumber: Self = this.set("PartNumber", js.undefined)
    @scala.inline
    def setSize(value: Size): Self = this.set("Size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("Size", js.undefined)
  }
  
}

