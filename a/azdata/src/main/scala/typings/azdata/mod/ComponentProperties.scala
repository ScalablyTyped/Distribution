package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentProperties extends StObject {
  
  /**
    * Matches the CSS style key and its available values.
    */
  var CSSStyles: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Corresponds to the aria-label accessibility attribute for this component
    */
  var ariaLabel: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to the role accessibility attribute for this component
    */
  var ariaRole: js.UndefOr[String] = js.native
  
  /**
    * Corresponds to the aria-selected accessibility attribute for this component
    */
  var ariaSelected: js.UndefOr[Boolean] = js.native
  
  /**
    * Corresponds to the display CSS property for the element
    */
  var display: js.UndefOr[DisplayType] = js.native
  
  /**
    * Whether the component is enabled in the DOM
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * The position CSS property. Empty by default.
    * This is particularly useful if laying out components inside a FlexContainer and
    * the size of the component is meant to be a fixed size. In this case the position must be
    * set to 'absolute', with the parent FlexContainer having 'relative' position.
    * Without this the component will fail to correctly size itself
    */
  var position: js.UndefOr[PositionType] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ComponentProperties {
  
  @scala.inline
  def apply(): ComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentProperties]
  }
  
  @scala.inline
  implicit class ComponentPropertiesMutableBuilder[Self <: ComponentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
    
    @scala.inline
    def setAriaRole(value: String): Self = StObject.set(x, "ariaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaRoleUndefined: Self = StObject.set(x, "ariaRole", js.undefined)
    
    @scala.inline
    def setAriaSelected(value: Boolean): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAriaSelectedUndefined: Self = StObject.set(x, "ariaSelected", js.undefined)
    
    @scala.inline
    def setCSSStyles(value: StringDictionary[String]): Self = StObject.set(x, "CSSStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCSSStylesUndefined: Self = StObject.set(x, "CSSStyles", js.undefined)
    
    @scala.inline
    def setDisplay(value: DisplayType): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
