package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSegmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Segment extends js.Object {
  /**
    * <p>The segment document.</p>
    */
  var Document: js.UndefOr[String] = js.undefined
  /**
    * <p>The segment's ID.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
}

object _Segment {
  @scala.inline
  def apply(Document: String = null, Id: String = null): _Segment = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    __obj.asInstanceOf[_Segment]
  }
}

