package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.Delay
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.bottom
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.left
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.right
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.top
import typings.devextremeB5DqTZzf.mod.DevExpress.PositionConfig
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPopoverOptions[TComponent]
  extends StObject
     with dxPopupOptions[TComponent] {
  
  /**
    * Configures UI component visibility animations. This object contains two fields: show and hide.
    */
  @JSName("animation")
  var animation_dxPopoverOptions: js.UndefOr[dxPopoverAnimation] = js.undefined
  
  /**
    * Specifies properties of popover hiding. Ignored if the shading property is set to true.
    */
  var hideEvent: js.UndefOr[Delay | String] = js.undefined
  
  /**
    * An object defining UI component positioning properties.
    */
  @JSName("position")
  var position_dxPopoverOptions: js.UndefOr[bottom | left | right | top | PositionConfig] = js.undefined
  
  /**
    * Specifies properties for displaying the UI component.
    */
  var showEvent: js.UndefOr[Delay | String] = js.undefined
  
  /**
    * Specifies the element against which to position the widget.
    */
  var target: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
}
object dxPopoverOptions {
  
  inline def apply[TComponent](): dxPopoverOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPopoverOptions[TComponent]]
  }
  
  extension [Self <: dxPopoverOptions[?], TComponent](x: Self & dxPopoverOptions[TComponent]) {
    
    inline def setAnimation(value: dxPopoverAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setHideEvent(value: Delay | String): Self = StObject.set(x, "hideEvent", value.asInstanceOf[js.Any])
    
    inline def setHideEventUndefined: Self = StObject.set(x, "hideEvent", js.undefined)
    
    inline def setPosition(value: bottom | left | right | top | PositionConfig): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowEvent(value: Delay | String): Self = StObject.set(x, "showEvent", value.asInstanceOf[js.Any])
    
    inline def setShowEventUndefined: Self = StObject.set(x, "showEvent", js.undefined)
    
    inline def setTarget(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
