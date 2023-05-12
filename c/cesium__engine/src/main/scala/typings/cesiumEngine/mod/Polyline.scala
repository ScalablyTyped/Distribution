package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Polyline")
@js.native
open class Polyline () extends StObject {
  
  /**
    * Gets or sets the condition specifying at what distance from the camera that this polyline will be displayed.
    */
  var distanceDisplayCondition: DistanceDisplayCondition = js.native
  
  /**
    * Gets or sets the user-defined value returned when the polyline is picked.
    */
  var id: Any = js.native
  
  /**
    * Gets or sets whether a line segment will be added between the first and last polyline positions.
    */
  var loop: Boolean = js.native
  
  /**
    * Gets or sets the surface appearance of the polyline.  This can be one of several built-in {@link Material} objects or a custom material, scripted with
    * {@link https://github.com/CesiumGS/cesium/wiki/Fabric|Fabric}.
    */
  var material: Material = js.native
  
  /**
    * Gets or sets the positions of the polyline.
    * @example
    * polyline.positions = Cesium.Cartesian3.fromDegreesArray([
    *     0.0, 0.0,
    *     10.0, 0.0,
    *     0.0, 20.0
    * ]);
    */
  var positions: js.Array[Cartesian3] = js.native
  
  /**
    * Determines if this polyline will be shown.  Use this to hide or show a polyline, instead
    * of removing it and re-adding it to the collection.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets the width of the polyline.
    */
  var width: Double = js.native
}
