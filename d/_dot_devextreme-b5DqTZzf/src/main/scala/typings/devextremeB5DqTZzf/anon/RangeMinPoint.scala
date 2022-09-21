package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeMinPoint extends StObject {
  
  /**
    * Specifies the URL of the image to be used as a maximum point marker.
    */
  var rangeMaxPoint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the URL of the image to be used as a maximum point marker.
    */
  var rangeMinPoint: js.UndefOr[String] = js.undefined
}
object RangeMinPoint {
  
  inline def apply(): RangeMinPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangeMinPoint]
  }
  
  extension [Self <: RangeMinPoint](x: Self) {
    
    inline def setRangeMaxPoint(value: String): Self = StObject.set(x, "rangeMaxPoint", value.asInstanceOf[js.Any])
    
    inline def setRangeMaxPointUndefined: Self = StObject.set(x, "rangeMaxPoint", js.undefined)
    
    inline def setRangeMinPoint(value: String): Self = StObject.set(x, "rangeMinPoint", value.asInstanceOf[js.Any])
    
    inline def setRangeMinPointUndefined: Self = StObject.set(x, "rangeMinPoint", js.undefined)
  }
}
