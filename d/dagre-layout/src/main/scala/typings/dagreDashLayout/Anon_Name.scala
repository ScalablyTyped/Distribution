package typings.dagreDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var v: String
  var w: String
}

object Anon_Name {
  @scala.inline
  def apply(v: String, w: String, name: String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(v = v, w = w)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}

