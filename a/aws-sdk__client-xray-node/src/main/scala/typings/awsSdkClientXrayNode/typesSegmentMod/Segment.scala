package typings.awsSdkClientXrayNode.typesSegmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Segment extends js.Object {
  /**
    * <p>The segment document.</p>
    */
  var Document: js.UndefOr[String] = js.undefined
  /**
    * <p>The segment's ID.</p>
    */
  var Id: js.UndefOr[String] = js.undefined
}

object Segment {
  @scala.inline
  def apply(Document: String = null, Id: String = null): Segment = {
    val __obj = js.Dynamic.literal()
    if (Document != null) __obj.updateDynamic("Document")(Document.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Segment]
  }
}

