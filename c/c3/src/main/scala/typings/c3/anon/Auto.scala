package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auto extends StObject {
  
  /**
    * Indicate if the chart should automatically get resized when the window gets resized.
    */
  var auto: js.UndefOr[Boolean] = js.undefined
}
object Auto {
  
  inline def apply(): Auto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auto]
  }
  
  extension [Self <: Auto](x: Self) {
    
    inline def setAuto(value: Boolean): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setAutoUndefined: Self = StObject.set(x, "auto", js.undefined)
  }
}
