package typings.cytoscape.mod

import typings.cytoscape.anon.Col
import typings.cytoscape.cytoscapeStrings.grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#layouts/grid
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.cytoscape.mod.LayoutOptions because Already inherited */ trait GridLayoutOptions
  extends StObject
     with ShapedLayoutOptions {
  
  // extra spacing around nodes when avoidOverlap: true
  var avoidOverlapPadding: js.UndefOr[Double] = js.undefined
  
  // force num of columns in the grid
  var cols: js.UndefOr[Double] = js.undefined
  
  // uses all available space on false, uses minimal space on true
  var condense: js.UndefOr[Boolean] = js.undefined
  
  @JSName("name")
  var name_GridLayoutOptions: grid
  
  // returns { row, col } for element
  var position: js.UndefOr[js.Function1[/* node */ NodeSingular, Col]] = js.undefined
  
  // force num of rows in the grid
  var rows: js.UndefOr[Double] = js.undefined
}
object GridLayoutOptions {
  
  inline def apply(): GridLayoutOptions = {
    val __obj = js.Dynamic.literal(name = "grid")
    __obj.asInstanceOf[GridLayoutOptions]
  }
  
  extension [Self <: GridLayoutOptions](x: Self) {
    
    inline def setAvoidOverlapPadding(value: Double): Self = StObject.set(x, "avoidOverlapPadding", value.asInstanceOf[js.Any])
    
    inline def setAvoidOverlapPaddingUndefined: Self = StObject.set(x, "avoidOverlapPadding", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setCondense(value: Boolean): Self = StObject.set(x, "condense", value.asInstanceOf[js.Any])
    
    inline def setCondenseUndefined: Self = StObject.set(x, "condense", js.undefined)
    
    inline def setName(value: grid): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: /* node */ NodeSingular => Col): Self = StObject.set(x, "position", js.Any.fromFunction1(value))
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
