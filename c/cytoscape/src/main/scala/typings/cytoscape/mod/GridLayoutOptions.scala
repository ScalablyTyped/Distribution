package typings.cytoscape.mod

import typings.cytoscape.anon.Col
import typings.cytoscape.cytoscapeStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/grid
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ @js.native
trait GridLayoutOptions extends ShapedLayoutOptions {
  
  // extra spacing around nodes when avoidOverlap: true
  var avoidOverlapPadding: js.UndefOr[Double] = js.native
  
  // force num of columns in the grid
  var cols: js.UndefOr[Double] = js.native
  
  // uses all available space on false, uses minimal space on true
  var condense: Boolean = js.native
  
  @JSName("name")
  var name_GridLayoutOptions: grid = js.native
  
  // returns { row, col } for element
  def position(node: NodeSingular): Col = js.native
  
  // force num of rows in the grid
  var rows: js.UndefOr[Double] = js.native
}
object GridLayoutOptions {
  
  @scala.inline
  def apply(
    condense: Boolean,
    fit: Boolean,
    name: grid,
    nodeDimensionsIncludeLabels: Boolean,
    position: NodeSingular => Col
  ): GridLayoutOptions = {
    val __obj = js.Dynamic.literal(condense = condense.asInstanceOf[js.Any], fit = fit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeDimensionsIncludeLabels = nodeDimensionsIncludeLabels.asInstanceOf[js.Any], position = js.Any.fromFunction1(position))
    __obj.asInstanceOf[GridLayoutOptions]
  }
  
  @scala.inline
  implicit class GridLayoutOptionsOps[Self <: GridLayoutOptions] (val x: Self) extends AnyVal {
    
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
    def setCondense(value: Boolean): Self = this.set("condense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: grid): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: NodeSingular => Col): Self = this.set("position", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAvoidOverlapPadding(value: Double): Self = this.set("avoidOverlapPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvoidOverlapPadding: Self = this.set("avoidOverlapPadding", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
  }
}
