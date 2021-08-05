package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolylineOptions
  extends StObject
     with IPrimitiveOptions {
  
  /** Indicates if drawn shape should be generalized based on the zoom level to improve rendering performance. Default true **/
  var generalizable: js.UndefOr[Boolean] = js.undefined
  
  /** CSS string or Color object as the poly's color. */
  var strokeColor: js.UndefOr[String | Color] = js.undefined
  
  /** An array of numbers separated by spaces, or a string separated by spaces/commas specifying the repetitive stroke pattern. */
  var strokeDashArray: js.UndefOr[js.Array[Double] | String] = js.undefined
  
  /** The thickness of the poly stroke. */
  var strokeThickness: js.UndefOr[Double] = js.undefined
}
object IPolylineOptions {
  
  inline def apply(): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolylineOptions]
  }
  
  extension [Self <: IPolylineOptions](x: Self) {
    
    inline def setGeneralizable(value: Boolean): Self = StObject.set(x, "generalizable", value.asInstanceOf[js.Any])
    
    inline def setGeneralizableUndefined: Self = StObject.set(x, "generalizable", js.undefined)
    
    inline def setStrokeColor(value: String | Color): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setStrokeDashArray(value: js.Array[Double] | String): Self = StObject.set(x, "strokeDashArray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashArrayUndefined: Self = StObject.set(x, "strokeDashArray", js.undefined)
    
    inline def setStrokeDashArrayVarargs(value: Double*): Self = StObject.set(x, "strokeDashArray", js.Array(value :_*))
    
    inline def setStrokeThickness(value: Double): Self = StObject.set(x, "strokeThickness", value.asInstanceOf[js.Any])
    
    inline def setStrokeThicknessUndefined: Self = StObject.set(x, "strokeThickness", js.undefined)
  }
}
