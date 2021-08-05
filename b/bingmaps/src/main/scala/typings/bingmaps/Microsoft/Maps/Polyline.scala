package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polyline
  extends StObject
     with IPrimitive {
  
  /**
    * Returns whether the polyline is generalizable based on zoom level or not.
    * @returns whether the polyline is generalizable based on zoom level or not.
    */
  def getGeneralizable(): Boolean
  
  /**
    * Gets the locations that make up the polyline.
    * @returns An array that defines the path of the polyline.
    */
  def getLocations(): js.Array[Location]
  
  /**
    * Gets the color of the border stroke of the polyline. Will be string or Color object depending on the the what method was used in the polyline options.
    * @returns The stroke color of the polyline.
    */
  def getStrokeColor(): String | Color
  
  /**
    * Gets the stroke dash array of the polyline, in format of either array or string, whichever user provides.
    * @returns The stroke dash array of the polyline.
    */
  def getStrokeDashArray(): js.Array[Double] | String
  
  /**
    * Gets the thickness of the border stroke of the polyline.
    * @returns The thickness of the border stroke of the polyline as a number.
    */
  def getStrokeThickness(): Double
  
  /**
    * Sets locations of the polyline.
    * @param locations A Location[] that defines path of the polyline
    */
  def setLocations(locations: js.Array[Location]): Unit
  
  /**
    * Sets the properties for the polyline.
    * @param options The IPolylineOptions object containing the options to customize the polyline.
    */
  def setOptions(options: IPolylineOptions): Unit
}
object Polyline {
  
  inline def apply(
    getCursor: () => String,
    getGeneralizable: () => Boolean,
    getLocations: () => js.Array[Location],
    getStrokeColor: () => String | Color,
    getStrokeDashArray: () => js.Array[Double] | String,
    getStrokeThickness: () => Double,
    getVisible: () => Boolean,
    setLocations: js.Array[Location] => Unit,
    setOptions: IPolylineOptions => Unit
  ): Polyline = {
    val __obj = js.Dynamic.literal(getCursor = js.Any.fromFunction0(getCursor), getGeneralizable = js.Any.fromFunction0(getGeneralizable), getLocations = js.Any.fromFunction0(getLocations), getStrokeColor = js.Any.fromFunction0(getStrokeColor), getStrokeDashArray = js.Any.fromFunction0(getStrokeDashArray), getStrokeThickness = js.Any.fromFunction0(getStrokeThickness), getVisible = js.Any.fromFunction0(getVisible), setLocations = js.Any.fromFunction1(setLocations), setOptions = js.Any.fromFunction1(setOptions))
    __obj.asInstanceOf[Polyline]
  }
  
  extension [Self <: Polyline](x: Self) {
    
    inline def setGetGeneralizable(value: () => Boolean): Self = StObject.set(x, "getGeneralizable", js.Any.fromFunction0(value))
    
    inline def setGetLocations(value: () => js.Array[Location]): Self = StObject.set(x, "getLocations", js.Any.fromFunction0(value))
    
    inline def setGetStrokeColor(value: () => String | Color): Self = StObject.set(x, "getStrokeColor", js.Any.fromFunction0(value))
    
    inline def setGetStrokeDashArray(value: () => js.Array[Double] | String): Self = StObject.set(x, "getStrokeDashArray", js.Any.fromFunction0(value))
    
    inline def setGetStrokeThickness(value: () => Double): Self = StObject.set(x, "getStrokeThickness", js.Any.fromFunction0(value))
    
    inline def setSetLocations(value: js.Array[Location] => Unit): Self = StObject.set(x, "setLocations", js.Any.fromFunction1(value))
    
    inline def setSetOptions(value: IPolylineOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
  }
}
