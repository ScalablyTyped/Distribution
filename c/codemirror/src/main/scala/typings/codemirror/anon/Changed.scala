package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changed extends js.Object {
  var changed: js.UndefOr[FromTo] = js.undefined
  var doc: typings.codemirror.mod.Doc
  var name: String
}

object Changed {
  @scala.inline
  def apply(doc: typings.codemirror.mod.Doc, name: String, changed: FromTo = null): Changed = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (changed != null) __obj.updateDynamic("changed")(changed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
}

