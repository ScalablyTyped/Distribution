package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerOptions extends StObject {
  
  var draggingCursor: js.UndefOr[String] = js.native
  
  var enableClicking: js.UndefOr[Boolean] = js.native
  
  var enableDragging: js.UndefOr[Boolean] = js.native
  
  var enableMassClear: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[Icon] = js.native
  
  var offset: js.UndefOr[Size] = js.native
  
  var raiseOnDrag: js.UndefOr[Boolean] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var shadow: js.UndefOr[Icon] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object MarkerOptions {
  
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  
  @scala.inline
  implicit class MarkerOptionsMutableBuilder[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraggingCursor(value: String): Self = StObject.set(x, "draggingCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggingCursorUndefined: Self = StObject.set(x, "draggingCursor", js.undefined)
    
    @scala.inline
    def setEnableClicking(value: Boolean): Self = StObject.set(x, "enableClicking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableClickingUndefined: Self = StObject.set(x, "enableClicking", js.undefined)
    
    @scala.inline
    def setEnableDragging(value: Boolean): Self = StObject.set(x, "enableDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDraggingUndefined: Self = StObject.set(x, "enableDragging", js.undefined)
    
    @scala.inline
    def setEnableMassClear(value: Boolean): Self = StObject.set(x, "enableMassClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMassClearUndefined: Self = StObject.set(x, "enableMassClear", js.undefined)
    
    @scala.inline
    def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setRaiseOnDrag(value: Boolean): Self = StObject.set(x, "raiseOnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaiseOnDragUndefined: Self = StObject.set(x, "raiseOnDrag", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setShadow(value: Icon): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
