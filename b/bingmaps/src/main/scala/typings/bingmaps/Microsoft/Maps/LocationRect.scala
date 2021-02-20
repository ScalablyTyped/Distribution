package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationRect extends StObject {
  
  /**
    * Scales the size of a LocationRect by multiplying the width and height properties by a percentage.
    * @param percentage A percentage value to increase the size of the LocationRect by.
    */
  def buffer(percentage: Double): Unit = js.native
  
  /** The location that defines the center of the rectangle. */
  var center: Location = js.native
  
  /**
    * Gets whether the specified Location is within the LocationRect.
    * @returns A boolean indicating if a location is within a LocationRect.
    */
  def contains(location: Location): Boolean = js.native
  
  /**
    * Determines if the LocationRect crosses the 180th meridian.
    * @returns A boolean indicating if the LocationRect crosses the international date line (-180/180 degrees longitude).
    */
  def crossesInternationalDateLine(): Boolean = js.native
  
  /**
    * Gets the longitude that defines the eastern edge of the LocationRect.
    * @returns The eastern longitude value of the LocationRect.
    */
  def getEast(): Double = js.native
  
  /**
    * Gets the latitude that defines the northern edge of the LocationRect.
    * @returns The northern latitude value of the LocationRect.
    */
  def getNorth(): Double = js.native
  
  /**
    * Gets the Location that defines the northwest corner of the LocationRect.
    * @returns The northwest corner location of the LocationRect.
    */
  def getNorthwest(): Location = js.native
  
  /**
    * Gets the latitude that defines the southern edge of the LocationRect.
    * @returns The southern latitude value of the LocationRect.
    */
  def getSouth(): Double = js.native
  
  /**
    * Gets the Location that defines the southeast corner of the LocationRect.
    * @returns The southeast corner location of the LocationRect.
    */
  def getSoutheast(): Location = js.native
  
  /**
    * Gets the latitude that defines the western edge of the LocationRect.
    * @returns The western longitude value of the LocationRect.
    */
  def getWest(): Double = js.native
  
  /** The height, in degrees, of the rectangle. */
  var height: Double = js.native
  
  /**
    * Gets whether the specified LocationRect intersects with this LocationRect.
    * @param rect A second LocationRect to test for intersection with.
    * @returns A boolean indicating if a second LocationRect interests with this LocationRect.
    */
  def intersects(rect: LocationRect): Boolean = js.native
  
  /**
    * If a LocationRect crosses the international date line, this method splits it into two LocationRect objects and returns them as an array.
    * @returns An array of LocationRects, that are split by the international date line (-180/180 degrees longitude)
    */
  def splitByInternationalDateLine(): js.Array[LocationRect] = js.native
  
  /** The width, in degrees, of the rectangle. */
  var width: Double = js.native
}
object LocationRect {
  
  @scala.inline
  def apply(
    buffer: Double => Unit,
    center: Location,
    contains: Location => Boolean,
    crossesInternationalDateLine: () => Boolean,
    getEast: () => Double,
    getNorth: () => Double,
    getNorthwest: () => Location,
    getSouth: () => Double,
    getSoutheast: () => Location,
    getWest: () => Double,
    height: Double,
    intersects: LocationRect => Boolean,
    splitByInternationalDateLine: () => js.Array[LocationRect],
    width: Double
  ): LocationRect = {
    val __obj = js.Dynamic.literal(buffer = js.Any.fromFunction1(buffer), center = center.asInstanceOf[js.Any], contains = js.Any.fromFunction1(contains), crossesInternationalDateLine = js.Any.fromFunction0(crossesInternationalDateLine), getEast = js.Any.fromFunction0(getEast), getNorth = js.Any.fromFunction0(getNorth), getNorthwest = js.Any.fromFunction0(getNorthwest), getSouth = js.Any.fromFunction0(getSouth), getSoutheast = js.Any.fromFunction0(getSoutheast), getWest = js.Any.fromFunction0(getWest), height = height.asInstanceOf[js.Any], intersects = js.Any.fromFunction1(intersects), splitByInternationalDateLine = js.Any.fromFunction0(splitByInternationalDateLine), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRect]
  }
  
  @scala.inline
  implicit class LocationRectMutableBuilder[Self <: LocationRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: Double => Unit): Self = StObject.set(x, "buffer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCenter(value: Location): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContains(value: Location => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCrossesInternationalDateLine(value: () => Boolean): Self = StObject.set(x, "crossesInternationalDateLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEast(value: () => Double): Self = StObject.set(x, "getEast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNorth(value: () => Double): Self = StObject.set(x, "getNorth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNorthwest(value: () => Location): Self = StObject.set(x, "getNorthwest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSouth(value: () => Double): Self = StObject.set(x, "getSouth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSoutheast(value: () => Location): Self = StObject.set(x, "getSoutheast", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWest(value: () => Double): Self = StObject.set(x, "getWest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersects(value: LocationRect => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSplitByInternationalDateLine(value: () => js.Array[LocationRect]): Self = StObject.set(x, "splitByInternationalDateLine", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
