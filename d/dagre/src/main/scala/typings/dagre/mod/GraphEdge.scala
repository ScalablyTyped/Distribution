package typings.dagre.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dagre.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEdge
  extends /* key */ StringDictionary[js.Any] {
  var points: js.Array[AnonX]
}

object GraphEdge {
  @scala.inline
  def apply(points: js.Array[AnonX], StringDictionary: /* key */ StringDictionary[js.Any] = null): GraphEdge = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GraphEdge]
  }
}

