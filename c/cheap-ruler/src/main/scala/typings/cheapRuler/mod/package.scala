package typings.cheapRuler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BBox = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  type Line = js.Array[typings.cheapRuler.mod.Point]
  
  type Point = js.Tuple2[scala.Double, scala.Double]
  
  type Points = js.Array[typings.cheapRuler.mod.Point]
  
  type Polygon = js.Array[js.Array[typings.cheapRuler.mod.Point]]
}
