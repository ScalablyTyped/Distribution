package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlineWidth extends StObject {
  
  var color: js.UndefOr[Property] = js.native
  
  var outlineColor: js.UndefOr[Property] = js.native
  
  var outlineWidth: js.UndefOr[Property] = js.native
}
object OutlineWidth {
  
  @scala.inline
  def apply(): OutlineWidth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutlineWidth]
  }
  
  @scala.inline
  implicit class OutlineWidthMutableBuilder[Self <: OutlineWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Property): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOutlineColor(value: Property): Self = StObject.set(x, "outlineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineColorUndefined: Self = StObject.set(x, "outlineColor", js.undefined)
    
    @scala.inline
    def setOutlineWidth(value: Property): Self = StObject.set(x, "outlineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineWidthUndefined: Self = StObject.set(x, "outlineWidth", js.undefined)
  }
}
