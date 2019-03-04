package typings
package dagreLib.dagreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEdge
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var points: js.Array[dagreLib.Anon_X]
}

object GraphEdge {
  @scala.inline
  def apply(
    points: js.Array[dagreLib.Anon_X],
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GraphEdge = {
    val __obj = js.Dynamic.literal(points = points)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GraphEdge]
  }
}

