package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapedLayoutOptions
  extends StObject
     with BaseLayoutOptions
     with AnimatedLayoutOptions {
  
  // prevents node overlap, may overflow boundingBox if not enough space
  var avoidOverlap: js.UndefOr[Boolean] = js.undefined
  
  // constrain layout bounds
  var boundingBox: js.UndefOr[BoundingBox12 | BoundingBoxWH] = js.undefined
  
  // whether to fit to viewport
  var fit: js.UndefOr[Boolean] = js.undefined
  
  // Excludes the label when calculating node bounding boxes for the layout algorithm
  var nodeDimensionsIncludeLabels: js.UndefOr[Boolean] = js.undefined
  
  // padding used on fit
  var padding: js.UndefOr[Double] = js.undefined
  
  // a sorting function to order the nodes
  var sort: js.UndefOr[SortingFunction] = js.undefined
  
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  var spacingFactor: js.UndefOr[Double] = js.undefined
}
object ShapedLayoutOptions {
  
  inline def apply(name: String): ShapedLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapedLayoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapedLayoutOptions] (val x: Self) extends AnyVal {
    
    inline def setAvoidOverlap(value: Boolean): Self = StObject.set(x, "avoidOverlap", value.asInstanceOf[js.Any])
    
    inline def setAvoidOverlapUndefined: Self = StObject.set(x, "avoidOverlap", js.undefined)
    
    inline def setBoundingBox(value: BoundingBox12 | BoundingBoxWH): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setNodeDimensionsIncludeLabels(value: Boolean): Self = StObject.set(x, "nodeDimensionsIncludeLabels", value.asInstanceOf[js.Any])
    
    inline def setNodeDimensionsIncludeLabelsUndefined: Self = StObject.set(x, "nodeDimensionsIncludeLabels", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSort(value: (/* a */ SortableNode, /* b */ SortableNode) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSpacingFactor(value: Double): Self = StObject.set(x, "spacingFactor", value.asInstanceOf[js.Any])
    
    inline def setSpacingFactorUndefined: Self = StObject.set(x, "spacingFactor", js.undefined)
  }
}
