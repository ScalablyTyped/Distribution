package typings.dagre.dagreMod

import org.scalablytyped.runtime.StringDictionary
import typings.dagre.Anon_X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphEdge
  extends /* key */ StringDictionary[js.Any] {
  var points: js.Array[Anon_X]
}

object GraphEdge {
  @scala.inline
  def apply(points: js.Array[Anon_X], StringDictionary: /* key */ StringDictionary[js.Any] = null): GraphEdge = {
    val __obj = js.Dynamic.literal(points = points)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GraphEdge]
  }
}

