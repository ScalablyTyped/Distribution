package typings.cytoscape.mod.Css

import org.scalablytyped.runtime.StringDictionary
import typings.cytoscape.mod.EdgeSingular
import typings.cytoscape.mod.NodeSingular
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Colour = String

type Dictionary = StringDictionary[Any]

/** https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight */
/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typings.cytoscape.cytoscapeStrings.normal
  - typings.cytoscape.cytoscapeStrings.bold
  - typings.cytoscape.cytoscapeStrings.lighter
  - typings.cytoscape.cytoscapeStrings.bolder
*/
type FontWeight = _FontWeight | Double

/**
  * In addition to specifying the value of a property outright, the developer may also use a mapper to dynamically specify the property value.
  * - data()
  * - mapData()
  * - function( ele ){ ... }
  * https://js.cytoscape.org/#style/mappers
  */
type MapperFunction[Element, Type] = js.Function1[/* ele */ Element, Type]

type PropertyValue[SingularType /* <: NodeSingular | EdgeSingular | Core */, Type] = Type | (MapperFunction[SingularType, Type])

type PropertyValueCore[Type] = PropertyValue[Core, Type]

type PropertyValueEdge[Type] = PropertyValue[EdgeSingular, Type]

type PropertyValueNode[Type] = PropertyValue[NodeSingular, Type]

/**
  * A space-separated list of numbers ranging on [-1, 1],
  * representing alternating x and y values (i.e. x1 y1 x2 y2, x3 y3 ...).
  * This represents the points in the polygon for the node’s shape.
  * The bounding box of the node is given by (-1, -1), (1, -1), (1, 1), (-1, 1).
  */
type ShapePolygonPoints = String
