package typings.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Doc extends js.Object {
  var changed: To | Null
  var doc: typings.codemirror.mod.Doc
  var name: String
}

object Doc {
  @scala.inline
  def apply(doc: typings.codemirror.mod.Doc, name: String, changed: To = null): Doc = {
    val __obj = js.Dynamic.literal(doc = doc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], changed = changed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc]
  }
}

