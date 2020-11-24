package typings.d3Delaunay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Delaunay {
  
  /**
    * A rectangular area [x, y, width, height].
    */
  type Bounds = js.Array[scala.Double]
  
  /**
    * A function to extract a x- or y-coordinate from the specified point.
    */
  type GetCoordinate[P, PS] = js.Function3[/* point */ P, /* i */ scala.Double, /* points */ PS, scala.Double]
  
  /**
    * A point represented as an array tuple [x, y].
    */
  type Point = js.Array[scala.Double]
  
  /**
    * A closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]].
    */
  type Polygon = js.Array[typings.d3Delaunay.mod.Delaunay.Point]
  
  /**
    * A closed polygon [[x0, y0], [x1, y1], [x2, y2], [x0, y0]] representing a triangle.
    */
  type Triangle = js.Array[typings.d3Delaunay.mod.Delaunay.Point]
}
