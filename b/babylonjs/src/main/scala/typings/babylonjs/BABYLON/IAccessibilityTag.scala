package typings.babylonjs.BABYLON

import typings.babylonjs.anon.keyinAcceptedARIAany
import typings.babylonjs.anon.keyinkeyofHTMLElementEven
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessibilityTag extends StObject {
  
  var aria: js.UndefOr[keyinAcceptedARIAany] = js.undefined
  
  /**
    * A string as alt text of the node, describing what the node is/does, for accessibility purpose.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Customize the event of the accessible object.
    * This will be applied on the generated HTML twin node.
    */
  var eventHandler: js.UndefOr[keyinkeyofHTMLElementEven] = js.undefined
  
  /**
    * ARIA roles and attributes to customize accessibility support.
    * If you use BabylonJS's accessibility html twin renderer, and want to override the default behavior (not suggested), this can be your way.
    * Learn more about ARIA: https://developer.mozilla.org/en-US/docs/Web/Accessibility/ARIA
    */
  var role: js.UndefOr[AcceptedRole] = js.undefined
}
object IAccessibilityTag {
  
  inline def apply(): IAccessibilityTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccessibilityTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccessibilityTag] (val x: Self) extends AnyVal {
    
    inline def setAria(value: keyinAcceptedARIAany): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
    
    inline def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventHandler(value: keyinkeyofHTMLElementEven): Self = StObject.set(x, "eventHandler", value.asInstanceOf[js.Any])
    
    inline def setEventHandlerUndefined: Self = StObject.set(x, "eventHandler", js.undefined)
    
    inline def setRole(value: AcceptedRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
