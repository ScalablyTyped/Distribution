package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Segment extends js.Object {
  /**
    * The segment document.
    */
  var Document: js.UndefOr[SegmentDocument] = js.native
  /**
    * The segment's ID.
    */
  var Id: js.UndefOr[SegmentId] = js.native
}

object Segment {
  @scala.inline
  def apply(): Segment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segment]
  }
  @scala.inline
  implicit class SegmentOps[Self <: Segment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocument(value: SegmentDocument): Self = this.set("Document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("Document", js.undefined)
    @scala.inline
    def setId(value: SegmentId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

