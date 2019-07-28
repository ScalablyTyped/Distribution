package typings.codemirror

import typings.codemirror.codemirrorMod.Doc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedDoc extends js.Object {
  var changed: Anon_FromTo | Null
  var doc: Doc
  var name: String
}

object Anon_ChangedDoc {
  @scala.inline
  def apply(doc: Doc, name: String, changed: Anon_FromTo = null): Anon_ChangedDoc = {
    val __obj = js.Dynamic.literal(doc = doc, name = name)
    if (changed != null) __obj.updateDynamic("changed")(changed)
    __obj.asInstanceOf[Anon_ChangedDoc]
  }
}

