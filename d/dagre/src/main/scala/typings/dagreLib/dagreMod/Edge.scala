package typings
package dagreLib.dagreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var v: java.lang.String
  var w: java.lang.String
}

object Edge {
  @scala.inline
  def apply(v: java.lang.String, w: java.lang.String, name: java.lang.String = null): Edge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("v")(v)
    __obj.updateDynamic("w")(w)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Edge]
  }
}

