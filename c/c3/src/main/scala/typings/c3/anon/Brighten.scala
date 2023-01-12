package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brighten extends StObject {
  
  var brighten: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicate if the chart should have interactions.
    * If `false` is set, all of interactions (showing/hiding tooltip, selection, mouse events, etc) will be disabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object Brighten {
  
  inline def apply(): Brighten = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brighten]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Brighten] (val x: Self) extends AnyVal {
    
    inline def setBrighten(value: Boolean): Self = StObject.set(x, "brighten", value.asInstanceOf[js.Any])
    
    inline def setBrightenUndefined: Self = StObject.set(x, "brighten", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
