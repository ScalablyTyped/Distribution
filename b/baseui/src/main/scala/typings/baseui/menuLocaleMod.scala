package typings.baseui

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuLocaleMod extends Shortcut {
  
  @JSImport("baseui/menu/locale", JSImport.Default)
  @js.native
  val default: MenuLocale = js.native
  
  trait MenuLocale extends StObject {
    
    var noResultsMsg: String
    
    var parentMenuItemAriaLabel: String
  }
  object MenuLocale {
    
    inline def apply(noResultsMsg: String, parentMenuItemAriaLabel: String): MenuLocale = {
      val __obj = js.Dynamic.literal(noResultsMsg = noResultsMsg.asInstanceOf[js.Any], parentMenuItemAriaLabel = parentMenuItemAriaLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuLocale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuLocale] (val x: Self) extends AnyVal {
      
      inline def setNoResultsMsg(value: String): Self = StObject.set(x, "noResultsMsg", value.asInstanceOf[js.Any])
      
      inline def setParentMenuItemAriaLabel(value: String): Self = StObject.set(x, "parentMenuItemAriaLabel", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = MenuLocale
  
  /* This means you don't have to write `default`, but can instead just say `menuLocaleMod.foo` */
  override def _to: MenuLocale = default
}
