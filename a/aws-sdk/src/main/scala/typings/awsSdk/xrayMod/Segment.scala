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
  def apply(Document: SegmentDocument = null, Id: SegmentId = null): Segment = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
}

