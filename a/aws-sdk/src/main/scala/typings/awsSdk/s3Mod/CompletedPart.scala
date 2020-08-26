package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedPart extends js.Object {
  /**
    * Entity tag returned when the part was uploaded.
    */
  var ETag: js.UndefOr[typings.awsSdk.s3Mod.ETag] = js.native
  /**
    * Part number that identifies the part. This is a positive integer between 1 and 10,000.
    */
  var PartNumber: js.UndefOr[typings.awsSdk.s3Mod.PartNumber] = js.native
}

object CompletedPart {
  @scala.inline
  def apply(): CompletedPart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompletedPart]
  }
  @scala.inline
  implicit class CompletedPartOps[Self <: CompletedPart] (val x: Self) extends AnyVal {
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
    def setPartNumber(value: PartNumber): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartNumber: Self = this.set("PartNumber", js.undefined)
  }
  
}

