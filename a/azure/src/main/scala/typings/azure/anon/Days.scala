package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Days extends StObject {
  
  var Days: Double
  
  var Enabled: Boolean
}
object Days {
  
  @scala.inline
  def apply(Days: Double, Enabled: Boolean): Days = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Days]
  }
  
  @scala.inline
  implicit class DaysMutableBuilder[Self <: Days] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDays(value: Double): Self = StObject.set(x, "Days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
  }
}
