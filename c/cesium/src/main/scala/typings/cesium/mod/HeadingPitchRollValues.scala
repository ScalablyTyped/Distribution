package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadingPitchRollValues extends StObject {
  
  var heading: js.UndefOr[Double] = js.undefined
  
  var pitch: js.UndefOr[Double] = js.undefined
  
  var roll: js.UndefOr[Double] = js.undefined
}
object HeadingPitchRollValues {
  
  inline def apply(): HeadingPitchRollValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeadingPitchRollValues]
  }
  
  extension [Self <: HeadingPitchRollValues](x: Self) {
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    
    inline def setPitchUndefined: Self = StObject.set(x, "pitch", js.undefined)
    
    inline def setRoll(value: Double): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setRollUndefined: Self = StObject.set(x, "roll", js.undefined)
  }
}
