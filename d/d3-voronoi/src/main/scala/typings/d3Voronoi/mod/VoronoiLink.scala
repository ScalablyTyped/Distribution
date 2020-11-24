package typings.d3Voronoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiLink[T] extends js.Object {
  
  /**
    * The source node, an element in data.
    */
  var source: T = js.native
  
  /**
    * The target node, an element in data.
    */
  var target: T = js.native
}
object VoronoiLink {
  
  @scala.inline
  def apply[T](source: T, target: T): VoronoiLink[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiLink[T]]
  }
  
  @scala.inline
  implicit class VoronoiLinkOps[Self <: VoronoiLink[_], T] (val x: Self with VoronoiLink[T]) extends AnyVal {
    
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
    def setSource(value: T): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: T): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
