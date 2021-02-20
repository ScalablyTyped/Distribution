package typings.cytoscape.mod

import typings.cytoscape.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeSingularLayout extends StObject {
  
  /**
    * Returns the node width and height.
    * Meant for use in layout positioning to do overlap detection.
    * @param options The layout options object.
    */
  def layoutDimensions(options: LayoutDimensionOptions): X = js.native
}
object NodeSingularLayout {
  
  @scala.inline
  def apply(layoutDimensions: LayoutDimensionOptions => X): NodeSingularLayout = {
    val __obj = js.Dynamic.literal(layoutDimensions = js.Any.fromFunction1(layoutDimensions))
    __obj.asInstanceOf[NodeSingularLayout]
  }
  
  @scala.inline
  implicit class NodeSingularLayoutMutableBuilder[Self <: NodeSingularLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutDimensions(value: LayoutDimensionOptions => X): Self = StObject.set(x, "layoutDimensions", js.Any.fromFunction1(value))
  }
}
