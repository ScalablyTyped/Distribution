package typings.cytoscape.mod

import typings.cytoscape.cytoscapeStrings.preset
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
  implicit class PresetLayoutOptionsOps[Self <: PresetLayoutOptions] (val x: Self) extends AnyVal {
    
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
    def setName(value: preset): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFit(value: Boolean): Self = this.set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFit: Self = this.set("fit", js.undefined)
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPan(value: Double): Self = this.set("pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    
    @scala.inline
    def setPositionsFunction1(value: /* nodeid */ String => Position): Self = this.set("positions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPositions(value: NodePositionMap | NodePositionFunction): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositions: Self = this.set("positions", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
}
