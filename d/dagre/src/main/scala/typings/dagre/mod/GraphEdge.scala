package typings.dagre.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dagre.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphEdge
  extends /* key */ StringDictionary[js.Any] {
  
  var points: js.Array[X] = js.native
}
object GraphEdge {
  
  @scala.inline
  def apply(points: js.Array[X]): GraphEdge = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphEdge]
  }
  
  @scala.inline
  implicit class GraphEdgeOps[Self <: GraphEdge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPointsVarargs(value: X*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[X]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
}
