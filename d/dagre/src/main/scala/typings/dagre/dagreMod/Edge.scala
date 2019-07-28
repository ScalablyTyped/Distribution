package typings.dagre.dagreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var v: String
  var w: String
}

object Edge {
  @scala.inline
  def apply(v: String, w: String, name: String = null): Edge = {
    val __obj = js.Dynamic.literal(v = v, w = w)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Edge]
  }
}

