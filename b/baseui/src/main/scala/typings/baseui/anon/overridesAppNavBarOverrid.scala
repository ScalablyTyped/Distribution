package typings.baseui.anon

import typings.baseui.appNavBarTypesMod.AppNavBarOverrides
import typings.baseui.appNavBarTypesMod.NavItem
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  overrides :baseui.baseui/app-nav-bar/types.AppNavBarOverrides} & baseui.baseui/app-nav-bar/types.UserMenuProps */
trait overridesAppNavBarOverrid extends StObject {
  
  var onUserItemSelect: js.UndefOr[js.Function1[/* a */ NavItem, Any]] = js.undefined
  
  var overrides: AppNavBarOverrides
  
  var userImgUrl: js.UndefOr[String] = js.undefined
  
  var userItems: js.UndefOr[js.Array[NavItem]] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
  
  var usernameSubtitle: js.UndefOr[ReactNode] = js.undefined
}
object overridesAppNavBarOverrid {
  
  inline def apply(overrides: AppNavBarOverrides): overridesAppNavBarOverrid = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[overridesAppNavBarOverrid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: overridesAppNavBarOverrid] (val x: Self) extends AnyVal {
    
    inline def setOnUserItemSelect(value: /* a */ NavItem => Any): Self = StObject.set(x, "onUserItemSelect", js.Any.fromFunction1(value))
    
    inline def setOnUserItemSelectUndefined: Self = StObject.set(x, "onUserItemSelect", js.undefined)
    
    inline def setOverrides(value: AppNavBarOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setUserImgUrl(value: String): Self = StObject.set(x, "userImgUrl", value.asInstanceOf[js.Any])
    
    inline def setUserImgUrlUndefined: Self = StObject.set(x, "userImgUrl", js.undefined)
    
    inline def setUserItems(value: js.Array[NavItem]): Self = StObject.set(x, "userItems", value.asInstanceOf[js.Any])
    
    inline def setUserItemsUndefined: Self = StObject.set(x, "userItems", js.undefined)
    
    inline def setUserItemsVarargs(value: NavItem*): Self = StObject.set(x, "userItems", js.Array(value*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameSubtitle(value: ReactNode): Self = StObject.set(x, "usernameSubtitle", value.asInstanceOf[js.Any])
    
    inline def setUsernameSubtitleUndefined: Self = StObject.set(x, "usernameSubtitle", js.undefined)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
