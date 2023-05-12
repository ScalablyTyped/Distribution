package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "PolygonHierarchy")
@js.native
open class PolygonHierarchy () extends StObject {
  def this(positions: js.Array[Cartesian3]) = this()
  def this(positions: js.Array[Cartesian3], holes: js.Array[PolygonHierarchy]) = this()
  def this(positions: Unit, holes: js.Array[PolygonHierarchy]) = this()
  
  /**
    * An array of polygon hierarchies defining holes in the polygon.
    */
  var holes: js.Array[PolygonHierarchy] = js.native
  
  /**
    * A linear ring defining the outer boundary of the polygon or hole.
    */
  var positions: js.Array[Cartesian3] = js.native
}
