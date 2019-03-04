package typings
package dagreLib.dagreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var height: scala.Double
  var width: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object Node {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    x: scala.Double,
    y: scala.Double,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Node = {
    val __obj = js.Dynamic.literal(height = height, width = width, x = x, y = y)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Node]
  }
}

