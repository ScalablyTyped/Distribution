package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Simon1994PlanetaryPositions")
@js.native
object Simon1994PlanetaryPositions extends js.Object {
  
  def computeMoonPositionInEarthInertialFrame(): Cartesian3 = js.native
  def computeMoonPositionInEarthInertialFrame(julianDate: js.UndefOr[scala.Nothing], result: Cartesian3): Cartesian3 = js.native
  def computeMoonPositionInEarthInertialFrame(julianDate: JulianDate): Cartesian3 = js.native
  def computeMoonPositionInEarthInertialFrame(julianDate: JulianDate, result: Cartesian3): Cartesian3 = js.native
  
  def computeSunPositionInEarthInertialFrame(): Cartesian3 = js.native
  def computeSunPositionInEarthInertialFrame(julianDate: js.UndefOr[scala.Nothing], result: Cartesian3): Cartesian3 = js.native
  def computeSunPositionInEarthInertialFrame(julianDate: JulianDate): Cartesian3 = js.native
  def computeSunPositionInEarthInertialFrame(julianDate: JulianDate, result: Cartesian3): Cartesian3 = js.native
}
