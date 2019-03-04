package typings
package dagreDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var v: java.lang.String
  var w: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(v: java.lang.String, w: java.lang.String, name: java.lang.String = null): Anon_Name = {
    val __obj = js.Dynamic.literal(v = v, w = w)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}

