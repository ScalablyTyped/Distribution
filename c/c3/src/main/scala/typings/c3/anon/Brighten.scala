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
  
  @scala.inline
  def apply(): Brighten = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Brighten]
  }
  
  @scala.inline
  implicit class BrightenMutableBuilder[Self <: Brighten] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrighten(value: Boolean): Self = StObject.set(x, "brighten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrightenUndefined: Self = StObject.set(x, "brighten", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
