package typings.baseui

import typings.baseui.anon.Desktop
import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appNavBarMod {
  
  @JSImport("baseui/app-nav-bar", "AppNavBar")
  @js.native
  class AppNavBar protected ()
    extends Component[AppNavBarPropsT, js.Object, js.Any] {
    def this(props: AppNavBarPropsT) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AppNavBarPropsT, context: js.Any) = this()
  }
  
  @js.native
  trait POSITION extends StObject {
    
    var horizontal: typings.baseui.baseuiStrings.horizontal = js.native
    
    var vertical: typings.baseui.baseuiStrings.vertical = js.native
  }
  object POSITION {
    
    @JSImport("baseui/app-nav-bar", "POSITION")
    @js.native
    val ^ : POSITION = js.native
    
    @scala.inline
    implicit class POSITIONMutableBuilder[Self <: POSITION] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: horizontal): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: vertical): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/app-nav-bar", "setItemActive")
  @js.native
  def setItemActive(items: js.Array[NavItemT], item: NavItemT): js.Array[NavItemT] = js.native
  @JSImport("baseui/app-nav-bar", "setItemActive")
  @js.native
  def setItemActive(
    items: js.Array[NavItemT],
    item: NavItemT,
    getUniqueueIdentifier: js.Function1[/* currentItem */ NavItemT, String | Double]
  ): js.Array[NavItemT] = js.native
  
  /* Inlined baseui.baseui/app-nav-bar.UserMenuPropsT & {  isMainItemActive :(item : baseui.baseui/app-nav-bar.NavItemT): boolean | undefined,   mainItems :std.Array<baseui.baseui/app-nav-bar.NavItemT> | undefined,   mapItemToNode :(item : baseui.baseui/app-nav-bar.NavItemT): react.react.ReactNode | undefined,   onMainItemSelect :(item : baseui.baseui/app-nav-bar.NavItemT): / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed * / any | undefined,   title :react.react.ReactNode | undefined} */
  @js.native
  trait AppNavBarPropsT extends StObject {
    
    var isMainItemActive: js.UndefOr[js.Function1[/* item */ NavItemT, Boolean]] = js.native
    
    var mainItems: js.UndefOr[js.Array[NavItemT]] = js.native
    
    var mapItemToNode: js.UndefOr[js.Function1[/* item */ NavItemT, ReactNode]] = js.native
    
    var onMainItemSelect: js.UndefOr[
        js.Function1[
          /* item */ NavItemT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
        ]
      ] = js.native
    
    var onUserItemSelect: js.UndefOr[
        js.Function1[
          /* item */ NavItemT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
        ]
      ] = js.native
    
    var title: js.UndefOr[ReactNode] = js.native
    
    var userImgUrl: js.UndefOr[String] = js.native
    
    var userItems: js.UndefOr[js.Array[NavItemT]] = js.native
    
    var username: js.UndefOr[String] = js.native
    
    var usernameSubtitle: js.UndefOr[ReactNode] = js.native
  }
  object AppNavBarPropsT {
    
    @scala.inline
    def apply(): AppNavBarPropsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppNavBarPropsT]
    }
    
    @scala.inline
    implicit class AppNavBarPropsTMutableBuilder[Self <: AppNavBarPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMainItemActive(value: /* item */ NavItemT => Boolean): Self = StObject.set(x, "isMainItemActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsMainItemActiveUndefined: Self = StObject.set(x, "isMainItemActive", js.undefined)
      
      @scala.inline
      def setMainItems(value: js.Array[NavItemT]): Self = StObject.set(x, "mainItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainItemsUndefined: Self = StObject.set(x, "mainItems", js.undefined)
      
      @scala.inline
      def setMainItemsVarargs(value: NavItemT*): Self = StObject.set(x, "mainItems", js.Array(value :_*))
      
      @scala.inline
      def setMapItemToNode(value: /* item */ NavItemT => ReactNode): Self = StObject.set(x, "mapItemToNode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMapItemToNodeUndefined: Self = StObject.set(x, "mapItemToNode", js.undefined)
      
      @scala.inline
      def setOnMainItemSelect(
        value: /* item */ NavItemT => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
      ): Self = StObject.set(x, "onMainItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMainItemSelectUndefined: Self = StObject.set(x, "onMainItemSelect", js.undefined)
      
      @scala.inline
      def setOnUserItemSelect(
        value: /* item */ NavItemT => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
      ): Self = StObject.set(x, "onUserItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUserItemSelectUndefined: Self = StObject.set(x, "onUserItemSelect", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUserImgUrl(value: String): Self = StObject.set(x, "userImgUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserImgUrlUndefined: Self = StObject.set(x, "userImgUrl", js.undefined)
      
      @scala.inline
      def setUserItems(value: js.Array[NavItemT]): Self = StObject.set(x, "userItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserItemsUndefined: Self = StObject.set(x, "userItems", js.undefined)
      
      @scala.inline
      def setUserItemsVarargs(value: NavItemT*): Self = StObject.set(x, "userItems", js.Array(value :_*))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameSubtitle(value: ReactNode): Self = StObject.set(x, "usernameSubtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameSubtitleUndefined: Self = StObject.set(x, "usernameSubtitle", js.undefined)
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  @js.native
  trait NavItemT extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[js.Array[NavItemT]] = js.native
    
    var icon: js.UndefOr[ComponentType[_]] = js.native
    
    var info: js.UndefOr[js.Any] = js.native
    
    var label: String = js.native
    
    var navExitIcon: js.UndefOr[ComponentType[_]] = js.native
    
    var navPosition: js.UndefOr[Desktop] = js.native
  }
  object NavItemT {
    
    @scala.inline
    def apply(label: String): NavItemT = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavItemT]
    }
    
    @scala.inline
    implicit class NavItemTMutableBuilder[Self <: NavItemT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[NavItemT]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: NavItemT*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setIcon(value: ComponentType[_]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavExitIcon(value: ComponentType[_]): Self = StObject.set(x, "navExitIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavExitIconUndefined: Self = StObject.set(x, "navExitIcon", js.undefined)
      
      @scala.inline
      def setNavPosition(value: Desktop): Self = StObject.set(x, "navPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavPositionUndefined: Self = StObject.set(x, "navPosition", js.undefined)
    }
  }
  
  @js.native
  trait UserMenuPropsT extends StObject {
    
    var onUserItemSelect: js.UndefOr[
        js.Function1[
          /* item */ NavItemT, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
        ]
      ] = js.native
    
    var userImgUrl: js.UndefOr[String] = js.native
    
    var userItems: js.UndefOr[js.Array[NavItemT]] = js.native
    
    var username: js.UndefOr[String] = js.native
    
    var usernameSubtitle: js.UndefOr[ReactNode] = js.native
  }
  object UserMenuPropsT {
    
    @scala.inline
    def apply(): UserMenuPropsT = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserMenuPropsT]
    }
    
    @scala.inline
    implicit class UserMenuPropsTMutableBuilder[Self <: UserMenuPropsT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnUserItemSelect(
        value: /* item */ NavItemT => /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify mixed */ _
      ): Self = StObject.set(x, "onUserItemSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUserItemSelectUndefined: Self = StObject.set(x, "onUserItemSelect", js.undefined)
      
      @scala.inline
      def setUserImgUrl(value: String): Self = StObject.set(x, "userImgUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserImgUrlUndefined: Self = StObject.set(x, "userImgUrl", js.undefined)
      
      @scala.inline
      def setUserItems(value: js.Array[NavItemT]): Self = StObject.set(x, "userItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserItemsUndefined: Self = StObject.set(x, "userItems", js.undefined)
      
      @scala.inline
      def setUserItemsVarargs(value: NavItemT*): Self = StObject.set(x, "userItems", js.Array(value :_*))
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameSubtitle(value: ReactNode): Self = StObject.set(x, "usernameSubtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameSubtitleUndefined: Self = StObject.set(x, "usernameSubtitle", js.undefined)
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}
