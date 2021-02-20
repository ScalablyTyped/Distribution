package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "EllipsoidGeodesic")
@js.native
class EllipsoidGeodesic () extends StObject {
  def this(start: Cartographic) = this()
  def this(start: js.UndefOr[scala.Nothing], end: Cartographic) = this()
  def this(start: Cartographic, end: Cartographic) = this()
  def this(start: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], ellipsoid: Ellipsoid) = this()
  def this(start: js.UndefOr[scala.Nothing], end: Cartographic, ellipsoid: Ellipsoid) = this()
  def this(start: Cartographic, end: js.UndefOr[scala.Nothing], ellipsoid: Ellipsoid) = this()
  def this(start: Cartographic, end: Cartographic, ellipsoid: Ellipsoid) = this()
  
  var end: Cartographic = js.native
  
  var endHeading: Double = js.native
  
  def interpolateUsingFraction(fraction: Double): Cartographic = js.native
  
  def interpolateUsingSurfaceDistance(distance: Double): Cartographic = js.native
  
  def setEndPoints(start: Cartographic, end: Cartographic): Unit = js.native
  
  var start: Cartographic = js.native
  
  var startHeading: Double = js.native
  
  var surfaceDistance: Double = js.native
}
