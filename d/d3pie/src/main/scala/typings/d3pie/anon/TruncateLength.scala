package typings.d3pie.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TruncateLength extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var truncateLength: js.UndefOr[Double] = js.undefined
}
object TruncateLength {
  
  inline def apply(): TruncateLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TruncateLength] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTruncateLength(value: Double): Self = StObject.set(x, "truncateLength", value.asInstanceOf[js.Any])
    
    inline def setTruncateLengthUndefined: Self = StObject.set(x, "truncateLength", js.undefined)
  }
}
