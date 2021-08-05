package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Days extends StObject {
  
  var Days: Double
  
  var Enabled: Boolean
}
object Days {
  
  inline def apply(Days: Double, Enabled: Boolean): Days = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Days]
  }
  
  extension [Self <: Days](x: Self) {
    
    inline def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
