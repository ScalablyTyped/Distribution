package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Simon1994PlanetaryPositions {
  
  @JSGlobal("Cesium.Simon1994PlanetaryPositions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeMoonPositionInEarthInertialFrame(): typings.cesium.mod.Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMoonPositionInEarthInertialFrame")().asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def computeMoonPositionInEarthInertialFrame(julianDate: Unit, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMoonPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def computeMoonPositionInEarthInertialFrame(julianDate: typings.cesium.mod.JulianDate): typings.cesium.mod.Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMoonPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def computeMoonPositionInEarthInertialFrame(julianDate: typings.cesium.mod.JulianDate, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMoonPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  inline def computeSunPositionInEarthInertialFrame(): typings.cesium.mod.Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSunPositionInEarthInertialFrame")().asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def computeSunPositionInEarthInertialFrame(julianDate: Unit, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSunPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def computeSunPositionInEarthInertialFrame(julianDate: typings.cesium.mod.JulianDate): typings.cesium.mod.Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSunPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def computeSunPositionInEarthInertialFrame(julianDate: typings.cesium.mod.JulianDate, result: typings.cesium.mod.Cartesian3): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSunPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
}
