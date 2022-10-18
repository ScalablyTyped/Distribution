package typings.cesium

import typings.cesium.mod.Cartesian3
import typings.cesium.mod.JulianDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceCoreSimon1994PlanetaryPositionsMod {
  
  object default {
    
    @JSImport("cesium/Source/Core/Simon1994PlanetaryPositions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Computes the position of the Moon in the Earth-centered inertial frame
      * @param [julianDate] - The time at which to compute the Sun's position, if not provided the current system time is used.
      * @param [result] - The object onto which to store the result.
      * @returns Calculated moon position
      */
    inline def computeMoonPositionInEarthInertialFrame(): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMoonPositionInEarthInertialFrame")().asInstanceOf[Cartesian3]
    inline def computeMoonPositionInEarthInertialFrame(julianDate: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMoonPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    inline def computeMoonPositionInEarthInertialFrame(julianDate: JulianDate): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMoonPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
    inline def computeMoonPositionInEarthInertialFrame(julianDate: JulianDate, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeMoonPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    
    /**
      * Computes the position of the Sun in the Earth-centered inertial frame
      * @param [julianDate] - The time at which to compute the Sun's position, if not provided the current system time is used.
      * @param [result] - The object onto which to store the result.
      * @returns Calculated sun position
      */
    inline def computeSunPositionInEarthInertialFrame(): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSunPositionInEarthInertialFrame")().asInstanceOf[Cartesian3]
    inline def computeSunPositionInEarthInertialFrame(julianDate: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSunPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
    inline def computeSunPositionInEarthInertialFrame(julianDate: JulianDate): Cartesian3 = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSunPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any]).asInstanceOf[Cartesian3]
    inline def computeSunPositionInEarthInertialFrame(julianDate: JulianDate, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("computeSunPositionInEarthInertialFrame")(julianDate.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  }
}
