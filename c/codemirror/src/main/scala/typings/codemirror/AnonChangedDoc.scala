package typings.codemirror

import typings.codemirror.mod.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChangedDoc extends js.Object {
  var changed: AnonFromTo | Null
  var doc: Doc
  var name: String
}

object AnonChangedDoc {
  @scala.inline
  def apply(doc: Doc, name: String, changed: AnonFromTo = null): AnonChangedDoc = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (changed != null) __obj.updateDynamic("changed")(changed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChangedDoc]
  }
}

