package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentProperties extends StObject {
  
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[CssStyles] = js.undefined
  
  /**
    * Corresponds to the aria-hidden accessibility attribute for this component
    */
  var ariaHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Corresponds to the aria-label accessibility attribute for this component
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to the role accessibility attribute for this component
    */
  var ariaRole: js.UndefOr[String] = js.undefined
  
  /**
    * Corresponds to the aria-selected accessibility attribute for this component
    */
  var ariaSelected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Corresponds to the display CSS property for the element
    */
  var display: js.UndefOr[DisplayType] = js.undefined
  
  /**
    * Whether the component is enabled in the DOM
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * The position CSS property. Empty by default.
    * This is particularly useful if laying out components inside a FlexContainer and
    * the size of the component is meant to be a fixed size. In this case the position must be
    * set to 'absolute', with the parent FlexContainer having 'relative' position.
    * Without this the component will fail to correctly size itself
    */
  var position: js.UndefOr[PositionType] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object ComponentProperties {
  
  inline def apply(): ComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentProperties] (val x: Self) extends AnyVal {
    
    inline def setAriaHidden(value: Boolean): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
    
    inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    inline def setAriaRole(value: String): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
    
    inline def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
    
    inline def setAriaSelected(value: Boolean): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
    
    inline def setAriaSelectedUndefined: Self = StObject.set(x, "ariaSelected", js.undefined)
    
    inline def setCSSStyles(value: CssStyles): Self = StObject.set(x, "CSSStyles", value.asInstanceOf[js.Any])
    
    inline def setCSSStylesUndefined: Self = StObject.set(x, "CSSStyles", js.undefined)
    
    inline def setDisplay(value: DisplayType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
