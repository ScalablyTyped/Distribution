package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toggled extends StObject {
  
  var toggled: js.UndefOr[Boolean] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
}
object Toggled {
  
  @scala.inline
  def apply(): Toggled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Toggled]
  }
  
  @scala.inline
  implicit class ToggledMutableBuilder[Self <: Toggled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToggled(value: Boolean): Self = StObject.set(x, "toggled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggledUndefined: Self = StObject.set(x, "toggled", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
