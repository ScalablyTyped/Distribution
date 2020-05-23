package typings.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Document extends js.Object {
  var document: typings.ckeditorCkeditor5Engine.mod.model.Document | Null
  var padWithNoOps: Boolean
  var useRelations: Boolean
}

object Document {
  @scala.inline
  def apply(
    padWithNoOps: Boolean,
    useRelations: Boolean,
    document: typings.ckeditorCkeditor5Engine.mod.model.Document = null
  ): Document = {
    val __obj = js.Dynamic.literal(padWithNoOps = padWithNoOps.asInstanceOf[js.Any], useRelations = useRelations.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any])
    __obj.asInstanceOf[Document]
  }
}

