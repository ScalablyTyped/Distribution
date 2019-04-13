package typings
package codemirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Changed extends js.Object {
  var changed: js.UndefOr[Anon_FromToNumber] = js.undefined
  var doc: codemirrorLib.codemirrorMod.Doc
  var name: java.lang.String
}

object Anon_Changed {
  @scala.inline
  def apply(doc: codemirrorLib.codemirrorMod.Doc, name: java.lang.String, changed: Anon_FromToNumber = null): Anon_Changed = {
    val __obj = js.Dynamic.literal(doc = doc, name = name)
    if (changed != null) __obj.updateDynamic("changed")(changed)
    __obj.asInstanceOf[Anon_Changed]
  }
}

