package typings.cytoscape.mod

import typings.cytoscape.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSingularLayout extends StObject {
  
  /**
    * Returns the node width and height.
    * Meant for use in layout positioning to do overlap detection.
    * @param options The layout options object.
    */
  def layoutDimensions(options: LayoutDimensionOptions): X
}
object NodeSingularLayout {
  
  inline def apply(layoutDimensions: LayoutDimensionOptions => X): NodeSingularLayout = {
    val __obj = js.Dynamic.literal(layoutDimensions = js.Any.fromFunction1(layoutDimensions))
    __obj.asInstanceOf[NodeSingularLayout]
  }
  
  extension [Self <: NodeSingularLayout](x: Self) {
    
    inline def setLayoutDimensions(value: LayoutDimensionOptions => X): Self = StObject.set(x, "layoutDimensions", js.Any.fromFunction1(value))
  }
}
