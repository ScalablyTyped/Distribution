package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline extends IPrimitive {
  
  /**
    * Returns whether the polyline is generalizable based on zoom level or not.
    * @returns whether the polyline is generalizable based on zoom level or not.
    */
  def getGeneralizable(): Boolean = js.native
  
  /**
    * Gets the locations that make up the polyline.
    * @returns An array that defines the path of the polyline.
    */
  def getLocations(): js.Array[Location] = js.native
  
  /**
    * Gets the color of the border stroke of the polyline. Will be string or Color object depending on the the what method was used in the polyline options.
    * @returns The stroke color of the polyline.
    */
  def getStrokeColor(): String | Color = js.native
  
  /**
    * Gets the stroke dash array of the polyline, in format of either array or string, whichever user provides.
    * @returns The stroke dash array of the polyline.
    */
  def getStrokeDashArray(): js.Array[Double] | String = js.native
  
  /**
    * Gets the thickness of the border stroke of the polyline.
    * @returns The thickness of the border stroke of the polyline as a number.
    */
  def getStrokeThickness(): Double = js.native
  
  /**
    * Sets locations of the polyline.
    * @param locations A Location[] that defines path of the polyline
    */
  def setLocations(locations: js.Array[Location]): Unit = js.native
  
  /**
    * Sets the properties for the polyline.
    * @param options The IPolylineOptions object containing the options to customize the polyline.
    */
  def setOptions(options: IPolylineOptions): Unit = js.native
}
object Polyline {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PolylineOps[Self <: Polyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetGeneralizable(value: () => Boolean): Self = this.set("getGeneralizable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLocations(value: () => js.Array[Location]): Self = this.set("getLocations", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrokeColor(value: () => String | Color): Self = this.set("getStrokeColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrokeDashArray(value: () => js.Array[Double] | String): Self = this.set("getStrokeDashArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStrokeThickness(value: () => Double): Self = this.set("getStrokeThickness", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetLocations(value: js.Array[Location] => Unit): Self = this.set("setLocations", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetOptions(value: IPolylineOptions => Unit): Self = this.set("setOptions", js.Any.fromFunction1(value))
  }
}
