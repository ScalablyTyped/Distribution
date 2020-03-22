package typings.codemirror

import typings.codemirror.mod.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChanged extends js.Object {
  var changed: js.UndefOr[AnonFromTo] = js.undefined
  var doc: Doc
  var name: String
}

object AnonChanged {
  @scala.inline
  def apply(doc: Doc, name: String, changed: AnonFromTo = null): AnonChanged = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (changed != null) __obj.updateDynamic("changed")(changed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChanged]
  }
}

