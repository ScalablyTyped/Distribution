package typings.ckeditorCkeditor5Engine

import typings.ckeditorCkeditor5Engine.mod.model.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocument extends js.Object {
  var document: Document | Null
  var padWithNoOps: Boolean
  var useRelations: Boolean
}

object AnonDocument {
  @scala.inline
  def apply(padWithNoOps: Boolean, useRelations: Boolean, document: Document = null): AnonDocument = {
    val __obj = js.Dynamic.literal(padWithNoOps = padWithNoOps.asInstanceOf[js.Any], useRelations = useRelations.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocument]
  }
}

