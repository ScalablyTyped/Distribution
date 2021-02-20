package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.preset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait PresetLayoutOptions
  extends BaseLayoutOptions
     with AnimatedLayoutOptions {
  
  // whether to fit to viewport
  var fit: js.UndefOr[Boolean] = js.native
  
  @JSName("name")
  var name_PresetLayoutOptions: preset = js.native
  
  // padding on fit
  var padding: js.UndefOr[Double] = js.native
  
  // the pan level to set (prob want fit = false if set)
  var pan: js.UndefOr[Double] = js.native
  
  // map of (node id) => (position obj); or function(node){ return somPos; }
  var positions: js.UndefOr[NodePositionMap | NodePositionFunction] = js.native
  
  // the zoom level to set (prob want fit = false if set)
  var zoom: js.UndefOr[Double] = js.native
}
object PresetLayoutOptions {
  
  @scala.inline
  def apply(name: preset): PresetLayoutOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetLayoutOptions]
  }
  
  @scala.inline
  implicit class PresetLayoutOptionsMutableBuilder[Self <: PresetLayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFit(value: Boolean): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    @scala.inline
    def setName(value: preset): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPan(value: Double): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
    
    @scala.inline
    def setPositions(value: NodePositionMap | NodePositionFunction): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsFunction1(value: /* nodeid */ String => Position): Self = StObject.set(x, "positions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPositionsUndefined: Self = StObject.set(x, "positions", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
