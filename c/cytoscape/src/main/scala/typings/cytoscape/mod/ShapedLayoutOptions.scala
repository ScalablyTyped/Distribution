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
  var fit: Boolean
  
  // Excludes the label when calculating node bounding boxes for the layout algorithm
  var nodeDimensionsIncludeLabels: Boolean
  
  // padding used on fit
  var padding: js.UndefOr[Double] = js.undefined
  
  // a sorting function to order the nodes
  var sort: js.UndefOr[SortingFunction] = js.undefined
  
  // Applies a multiplicative factor (>0) to expand or compress the overall area that the nodes take up
  var spacingFactor: js.UndefOr[Double] = js.undefined
}
object ShapedLayoutOptions {
  
  inline def apply(fit: Boolean, name: String, nodeDimensionsIncludeLabels: Boolean): ShapedLayoutOptions = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapedLayoutOptions]
  }
  
  extension [Self <: ShapedLayoutOptions](x: Self) {
    
    inline def setAvoidOverlap(value: Boolean): Self = StObject.set(x, "avoidOverlap", value.asInstanceOf[js.Any])
    
    inline def setAvoidOverlapUndefined: Self = StObject.set(x, "avoidOverlap", js.undefined)
    
    inline def setBoundingBox(value: BoundingBox12 | BoundingBoxWH): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setNodeDimensionsIncludeLabels(value: Boolean): Self = StObject.set(x, "nodeDimensionsIncludeLabels", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSort(value: (/* a */ SortableNode, /* b */ SortableNode) => Double): Self = StObject.set(x, "sort", js.Any.fromFunction2(value))
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSpacingFactor(value: Double): Self = StObject.set(x, "spacingFactor", value.asInstanceOf[js.Any])
    
    inline def setSpacingFactorUndefined: Self = StObject.set(x, "spacingFactor", js.undefined)
  }
}
