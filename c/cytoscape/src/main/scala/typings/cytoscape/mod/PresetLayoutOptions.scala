package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.preset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait PresetLayoutOptions
  extends StObject
     with BaseLayoutOptions
     with AnimatedLayoutOptions {
  
  // whether to fit to viewport
  var fit: js.UndefOr[Boolean] = js.undefined
  
  @JSName("name")
  var name_PresetLayoutOptions: preset
  
  // padding on fit
  var padding: js.UndefOr[Double] = js.undefined
  
  // the pan level to set (prob want fit = false if set)
  var pan: js.UndefOr[Double] = js.undefined
  
  // map of (node id) => (position obj); or function(node){ return somPos; }
  var positions: js.UndefOr[NodePositionMap | NodePositionFunction] = js.undefined
  
  // the zoom level to set (prob want fit = false if set)
  var zoom: js.UndefOr[Double] = js.undefined
}
object PresetLayoutOptions {
  
  inline def apply(): PresetLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "preset")
    __obj.asInstanceOf[PresetLayoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PresetLayoutOptions] (val x: Self) extends AnyVal {
    
    inline def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setName(value: preset): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    inline def setPositions(value: NodePositionMap | NodePositionFunction): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsFunction1(value: /* nodeid */ String => Position): Self = StObject.set(x, "positions", js.Any.fromFunction1(value))
    
    inline def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
