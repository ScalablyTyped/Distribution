package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPolylineOptions extends IPrimitiveOptions {
  
  /** Indicates if drawn shape should be generalized based on the zoom level to improve rendering performance. Default true **/
  var generalizable: js.UndefOr[Boolean] = js.native
  
  /** CSS string or Color object as the poly's color. */
  var strokeColor: js.UndefOr[String | Color] = js.native
  
  /** An array of numbers separated by spaces, or a string separated by spaces/commas specifying the repetitive stroke pattern. */
  var strokeDashArray: js.UndefOr[js.Array[Double] | String] = js.native
  
  /** The thickness of the poly stroke. */
  var strokeThickness: js.UndefOr[Double] = js.native
}
object IPolylineOptions {
  
  @scala.inline
  def apply(): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolylineOptions]
  }
  
  @scala.inline
  implicit class IPolylineOptionsMutableBuilder[Self <: IPolylineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeneralizable(value: Boolean): Self = StObject.set(x, "generalizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneralizableUndefined: Self = StObject.set(x, "generalizable", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String | Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeDashArray(value: js.Array[Double] | String): Self = StObject.set(x, "strokeDashArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashArrayUndefined: Self = StObject.set(x, "strokeDashArray", js.undefined)
    
    @scala.inline
    def setStrokeDashArrayVarargs(value: Double*): Self = StObject.set(x, "strokeDashArray", js.Array(value :_*))
    
    @scala.inline
    def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
  }
}
