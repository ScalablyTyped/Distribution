package typings.dagre.dagreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* key */ StringDictionary[js.Any] {
  var height: Double
  var width: Double
  var x: Double
  var y: Double
}

object Node {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    x: Double,
    y: Double,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): Node = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Node]
  }
}

