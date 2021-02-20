package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Css {
  
  type Colour = java.lang.String
  
  type Dictionary = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /** https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight */
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.cytoscape.cytoscapeStrings.normal
    - typings.cytoscape.cytoscapeStrings.bold
    - typings.cytoscape.cytoscapeStrings.lighter
    - typings.cytoscape.cytoscapeStrings.bolder
  */
  type FontWeight = typings.cytoscape.mod.Css._FontWeight | scala.Double
  
  /**
    * In addition to specifying the value of a property outright, the developer may also use a mapper to dynamically specify the property value.
    * - data()
    * - mapData()
    * - function( ele ){ ... }
    * https://js.cytoscape.org/#style/mappers
    */
  type MapperFunction[Element, Type] = js.Function1[/* ele */ Element, Type]
  
  type PropertyValue[SingularType /* <: typings.cytoscape.mod.NodeSingular | typings.cytoscape.mod.EdgeSingular | typings.cytoscape.mod.Css.Core */, Type] = Type | (typings.cytoscape.mod.Css.MapperFunction[SingularType, Type])
  
  type PropertyValueCore[Type] = typings.cytoscape.mod.Css.PropertyValue[typings.cytoscape.mod.Css.Core, Type]
  
  type PropertyValueEdge[Type] = typings.cytoscape.mod.Css.PropertyValue[typings.cytoscape.mod.EdgeSingular, Type]
  
  type PropertyValueNode[Type] = typings.cytoscape.mod.Css.PropertyValue[typings.cytoscape.mod.NodeSingular, Type]
  
  /**
    * A space-separated list of numbers ranging on [-1, 1],
    * representing alternating x and y values (i.e. x1 y1 x2 y2, x3 y3 ...).
    * This represents the points in the polygon for the node’s shape.
    * The bounding box of the node is given by (-1, -1), (1, -1), (1, 1), (-1, 1).
    */
  type ShapePolygonPoints = java.lang.String
}
