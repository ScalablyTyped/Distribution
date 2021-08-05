package typings.bingmaps.global.Microsoft.Maps

import typings.bingmaps.Microsoft.Maps.IPolygonOptions
import typings.bingmaps.Microsoft.Maps.IPolylineOptions
import typings.bingmaps.Microsoft.Maps.IPushpinOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Microsoft.Maps.TestDataGenerator")
@js.native
class TestDataGenerator ()
  extends StObject
     with typings.bingmaps.Microsoft.Maps.TestDataGenerator
/* static members */
object TestDataGenerator {
  
  @JSGlobal("Microsoft.Maps.TestDataGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Generates a random hex or rgba color string. 
    * @param withAlpha A boolean indicating if the color should have an alpha value or not. if set to true, a rgba value will be returned with an alpha value of 0.5.
    * @returns A css color string, hex or rgba.
    */
  inline def getColor(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getColor")().asInstanceOf[String]
  inline def getColor(withAlpha: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getColor")(withAlpha.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Generates random Location objects.
    * @param num The number of locations to generate. If set to one a single Location will be returned. If greater than one and array will be returned.
    * @param bounds The bounding box in which all the locations should fall within.
    * @returns One or more random Locations.
    */
  inline def getLocations(): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocations")().asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getLocations(num: Double): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocations")(num.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getLocations(num: Double, bounds: typings.bingmaps.Microsoft.Maps.LocationRect): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocations")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  inline def getLocations(num: Unit, bounds: typings.bingmaps.Microsoft.Maps.LocationRect): typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocations")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Location | js.Array[typings.bingmaps.Microsoft.Maps.Location]]
  
  /**
    * Generates random polygons.
    * @param num The number of polygons to generate. If set to one a single Polygon will be returned. If greater than one and array will be returned.
    * @param bounds The bounding box in which all the locations of the polygon should fall within.
    * @param size The number of locations each polygon should have. Default: random between 3 and 10.
    * @param scaleFactor A number that scales the size of the polygons based on the size of the bounding box. A value of 0.1 would generate polygons that are no larger than 10% of the width/height of the map. Default: 0.1
    * @param options The options to use for rendering the polygons. Default is random.
    * @param addHole A boolean indicating if the generated polygon should have a hole or not. Note that this will double the number of Location objects that are in the Polygon. Default: false
    * @returns One or more random polygons.
    */
  inline def getPolygons(
    num: js.UndefOr[Double],
    bounds: js.UndefOr[typings.bingmaps.Microsoft.Maps.LocationRect],
    size: js.UndefOr[Double],
    scaleFactor: js.UndefOr[Double],
    options: js.UndefOr[IPolygonOptions],
    addHole: js.UndefOr[Boolean]
  ): typings.bingmaps.Microsoft.Maps.Polygon | js.Array[typings.bingmaps.Microsoft.Maps.Polygon] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolygons")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any], addHole.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polygon | js.Array[typings.bingmaps.Microsoft.Maps.Polygon]]
  
  /**
    * Generates random polylines.
    * @param num The number of polylines to generate. If set to one a single Polyline will be returned. If greater than one and array will be returned.
    * @param bounds The bounding box in which all the locations of the polylines should fall within.
    * @param size The number of locations each polylines should have. Default: random between 3 and 10.
    * @param scaleFactor A number that scales the size of the polylines based on size of the bounding box. A value of 0.1 would generate polylines that are no larger than 10% of the width/height of the map. Default: 0.1
    * @param options The options to use for rendering the polylines. Default is random.
    * @returns One or more random Polylines.
    */
  inline def getPolylines(): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")().asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: Unit, size: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: Unit, size: Double, scaleFactor: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: Unit, size: Double, scaleFactor: Double, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: Unit, size: Double, scaleFactor: Unit, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: Unit, size: Unit, scaleFactor: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: Unit, size: Unit, scaleFactor: Double, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: Unit, size: Unit, scaleFactor: Unit, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: typings.bingmaps.Microsoft.Maps.LocationRect): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: typings.bingmaps.Microsoft.Maps.LocationRect, size: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Double,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Double,
    scaleFactor: Double
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Double,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Double,
    scaleFactor: Double,
    options: IPolylineOptions
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Double,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Double,
    scaleFactor: Unit,
    options: IPolylineOptions
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Double, bounds: typings.bingmaps.Microsoft.Maps.LocationRect, size: Unit, scaleFactor: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Double,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Unit,
    scaleFactor: Double,
    options: IPolylineOptions
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Double,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Unit,
    scaleFactor: Unit,
    options: IPolylineOptions
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: Unit, size: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: Unit, size: Double, scaleFactor: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: Unit, size: Double, scaleFactor: Double, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: Unit, size: Double, scaleFactor: Unit, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: Unit, size: Unit, scaleFactor: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: Unit, size: Unit, scaleFactor: Double, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: Unit, size: Unit, scaleFactor: Unit, options: IPolylineOptions): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: typings.bingmaps.Microsoft.Maps.LocationRect): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: typings.bingmaps.Microsoft.Maps.LocationRect, size: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: typings.bingmaps.Microsoft.Maps.LocationRect, size: Double, scaleFactor: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Unit,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Double,
    scaleFactor: Double,
    options: IPolylineOptions
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Unit,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Double,
    scaleFactor: Unit,
    options: IPolylineOptions
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(num: Unit, bounds: typings.bingmaps.Microsoft.Maps.LocationRect, size: Unit, scaleFactor: Double): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Unit,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Unit,
    scaleFactor: Double,
    options: IPolylineOptions
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  inline def getPolylines(
    num: Unit,
    bounds: typings.bingmaps.Microsoft.Maps.LocationRect,
    size: Unit,
    scaleFactor: Unit,
    options: IPolylineOptions
  ): typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPolylines")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], size.asInstanceOf[js.Any], scaleFactor.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Polyline | js.Array[typings.bingmaps.Microsoft.Maps.Polyline]]
  
  /**
    * Generates random pushpins.
    * @param num The number of pushpins to generate. If set to one a single Pushpin will be returned. If greater than one and array will be returned.
    * @param bounds The bounding box in which all the pushpins should fall within.
    * @param options The options to use for rendering the pushpins. Default is random.
    * @returns One or more random Pushpins.
    */
  inline def getPushpins(): typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPushpins")().asInstanceOf[typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]]
  inline def getPushpins(num: Double): typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPushpins")(num.asInstanceOf[js.Any]).asInstanceOf[typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]]
  inline def getPushpins(num: Double, bounds: Unit, options: IPushpinOptions): typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPushpins")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]]
  inline def getPushpins(num: Double, bounds: typings.bingmaps.Microsoft.Maps.LocationRect): typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPushpins")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]]
  inline def getPushpins(num: Double, bounds: typings.bingmaps.Microsoft.Maps.LocationRect, options: IPushpinOptions): typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPushpins")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]]
  inline def getPushpins(num: Unit, bounds: Unit, options: IPushpinOptions): typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPushpins")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]]
  inline def getPushpins(num: Unit, bounds: typings.bingmaps.Microsoft.Maps.LocationRect): typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPushpins")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]]
  inline def getPushpins(num: Unit, bounds: typings.bingmaps.Microsoft.Maps.LocationRect, options: IPushpinOptions): typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPushpins")(num.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.bingmaps.Microsoft.Maps.Pushpin | js.Array[typings.bingmaps.Microsoft.Maps.Pushpin]]
}
