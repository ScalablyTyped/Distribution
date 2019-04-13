package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChangedDoc extends js.Object {
  var changed: Anon_FromTo | scala.Null
  var doc: codemirrorLib.codemirrorMod.Doc
  var name: java.lang.String
}

object Anon_ChangedDoc {
  @scala.inline
  def apply(doc: codemirrorLib.codemirrorMod.Doc, name: java.lang.String, changed: Anon_FromTo = null): Anon_ChangedDoc = {
    val __obj = js.Dynamic.literal(doc = doc, name = name)
    if (changed != null) __obj.updateDynamic("changed")(changed)
    __obj.asInstanceOf[Anon_ChangedDoc]
  }
}

