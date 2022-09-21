package typings.cesium

import typings.cesium.mod.Cartographic
import typings.cesium.mod.Ellipsoid
import typings.cesium.mod.EllipsoidRhumbLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsoidRhumbLineMod {
  
  @JSImport("cesium/Source/Core/EllipsoidRhumbLine", JSImport.Default)
  @js.native
  open class default () extends EllipsoidRhumbLine {
    def this(start: Cartographic) = this()
    def this(start: Unit, end: Cartographic) = this()
    def this(start: Cartographic, end: Cartographic) = this()
    def this(start: Unit, end: Unit, ellipsoid: Ellipsoid) = this()
    def this(start: Unit, end: Cartographic, ellipsoid: Ellipsoid) = this()
    def this(start: Cartographic, end: Unit, ellipsoid: Ellipsoid) = this()
    def this(start: Cartographic, end: Cartographic, ellipsoid: Ellipsoid) = this()
  }
  /* static members */
  object default {
    
    @JSImport("cesium/Source/Core/EllipsoidRhumbLine", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a rhumb line using an initial position with a heading and distance.
      * @param start - The initial planetodetic point on the path.
      * @param heading - The heading in radians.
      * @param distance - The rhumb line distance between the start and end point.
      * @param [ellipsoid = Ellipsoid.WGS84] - The ellipsoid on which the rhumb line lies.
      * @param [result] - The object in which to store the result.
      * @returns The EllipsoidRhumbLine object.
      */
    inline def fromStartHeadingDistance(start: Cartographic, heading: Double, distance: Double): EllipsoidRhumbLine = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStartHeadingDistance")(start.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[EllipsoidRhumbLine]
    inline def fromStartHeadingDistance(
      start: Cartographic,
      heading: Double,
      distance: Double,
      ellipsoid: Unit,
      result: EllipsoidRhumbLine
    ): EllipsoidRhumbLine = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStartHeadingDistance")(start.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidRhumbLine]
    inline def fromStartHeadingDistance(start: Cartographic, heading: Double, distance: Double, ellipsoid: Ellipsoid): EllipsoidRhumbLine = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStartHeadingDistance")(start.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[EllipsoidRhumbLine]
    inline def fromStartHeadingDistance(
      start: Cartographic,
      heading: Double,
      distance: Double,
      ellipsoid: Ellipsoid,
      result: EllipsoidRhumbLine
    ): EllipsoidRhumbLine = (^.asInstanceOf[js.Dynamic].applyDynamic("fromStartHeadingDistance")(start.asInstanceOf[js.Any], heading.asInstanceOf[js.Any], distance.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[EllipsoidRhumbLine]
  }
}
