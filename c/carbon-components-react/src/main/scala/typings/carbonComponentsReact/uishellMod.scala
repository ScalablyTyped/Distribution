package typings.carbonComponentsReact

import typings.carbonComponentsReact.carbonComponentsReactStrings.element
import typings.carbonComponentsReact.contentMod.ContentProps
import typings.carbonComponentsReact.headerContainerMod.HeaderContainerProps
import typings.carbonComponentsReact.headerGlobalActionMod.HeaderGlobalActionProps
import typings.carbonComponentsReact.headerGlobalBarMod.HeaderGlobalBarProps
import typings.carbonComponentsReact.headerMenuButtonMod.HeaderMenuButtonProps
import typings.carbonComponentsReact.headerMenuItemMod.HeaderMenuItemProps
import typings.carbonComponentsReact.headerMenuMod.HeaderMenuProps
import typings.carbonComponentsReact.headerMod.HeaderProps
import typings.carbonComponentsReact.headerNameMod.HeaderNameProps
import typings.carbonComponentsReact.headerNavigationMod.default
import typings.carbonComponentsReact.headerPanelMod.HeaderPanelProps
import typings.carbonComponentsReact.headerSideNavItemsMod.HeaderSideNavItemsProps
import typings.carbonComponentsReact.sideNavDetailsMod.SideNavDetailsProps
import typings.carbonComponentsReact.sideNavFooterMod.SideNavFooterProps
import typings.carbonComponentsReact.sideNavHeaderMod.SideNavHeaderProps
import typings.carbonComponentsReact.sideNavIconMod.SideNavIconProps
import typings.carbonComponentsReact.sideNavItemMod.SideNavItemProps
import typings.carbonComponentsReact.sideNavItemsMod.SideNavItemsProps
import typings.carbonComponentsReact.sideNavLinkMod.SideNavLinkFC
import typings.carbonComponentsReact.sideNavLinkMod.SideNavLinkProps
import typings.carbonComponentsReact.sideNavLinkTextMod.SideNavLinkTextProps
import typings.carbonComponentsReact.sideNavMenuItemMod.SideNavMenuItemProps
import typings.carbonComponentsReact.sideNavMenuMod.SideNavMenuProps
import typings.carbonComponentsReact.sideNavMod.SideNavProps
import typings.carbonComponentsReact.sideNavSwitcherMod.SideNavSwitcherProps
import typings.carbonComponentsReact.skipToContentMod.SkipToContentProps
import typings.carbonComponentsReact.switcherDividerMod.SwitcherDividerProps
import typings.carbonComponentsReact.switcherItemMod.SwitcherItemProps
import typings.carbonComponentsReact.switcherMod.SwitcherProps
import typings.carbonComponentsReact.typingsSharedMod.FCProps
import typings.carbonComponentsReact.typingsSharedMod.FCReturn
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefProps
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.FC
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import typings.std.HTMLUListElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uishellMod {
  
  @JSImport("carbon-components-react/lib/components/UIShell", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def Content[E /* <: js.Object */](props: FCProps[ContentProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("Content")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/UIShell", "Header")
  @js.native
  val Header: FC[HeaderProps] = js.native
  
  @scala.inline
  def HeaderContainer[RP](props: FCProps[HeaderContainerProps[RP]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderContainer")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/UIShell", "HeaderGlobalAction")
  @js.native
  val HeaderGlobalAction: ForwardRefReturn[HTMLButtonElement, HeaderGlobalActionProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "HeaderGlobalBar")
  @js.native
  val HeaderGlobalBar: FC[HeaderGlobalBarProps] = js.native
  
  @scala.inline
  def HeaderMenu[RP](props: HeaderMenuProps[RP]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderMenu")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/UIShell", "HeaderMenuButton")
  @js.native
  val HeaderMenuButton: FC[HeaderMenuButtonProps] = js.native
  
  @scala.inline
  def HeaderMenuItem[E /* <: js.Object */, R](props: ForwardRefProps[R, HeaderMenuItemProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderMenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @scala.inline
  def HeaderName[E /* <: js.Object */](props: FCProps[HeaderNameProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderName")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/UIShell", "HeaderNavigation")
  @js.native
  class HeaderNavigation () extends default
  
  @JSImport("carbon-components-react/lib/components/UIShell", "HeaderPanel")
  @js.native
  val HeaderPanel: ForwardRefReturn[HTMLDivElement, HeaderPanelProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "HeaderSideNavItems")
  @js.native
  val HeaderSideNavItems: FC[HeaderSideNavItemsProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNav")
  @js.native
  val SideNav: ForwardRefReturn[HTMLElement, SideNavProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavDetails")
  @js.native
  val SideNavDetails: FC[SideNavDetailsProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavFooter")
  @js.native
  val SideNavFooter: FC[SideNavFooterProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavHeader")
  @js.native
  val SideNavHeader: FC[SideNavHeaderProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavIcon")
  @js.native
  val SideNavIcon: FC[SideNavIconProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavItem")
  @js.native
  val SideNavItem: FC[SideNavItemProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavItems")
  @js.native
  val SideNavItems: FC[SideNavItemsProps] = js.native
  
  @scala.inline
  def SideNavLink[E /* <: js.Object */](props: ForwardRefProps[HTMLElement, SideNavLinkProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("SideNavLink")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavLinkText")
  @js.native
  val SideNavLinkText: FC[SideNavLinkTextProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavMenu")
  @js.native
  val SideNavMenu: ForwardRefReturn[HTMLButtonElement, SideNavMenuProps] = js.native
  
  @scala.inline
  def SideNavMenuItem[E /* <: js.Object */, R](props: ForwardRefProps[R, SideNavMenuItemProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("SideNavMenuItem")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SideNavSwitcher")
  @js.native
  val SideNavSwitcher: ForwardRefReturn[HTMLSelectElement, SideNavSwitcherProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SkipToContent")
  @js.native
  val SkipToContent: FC[SkipToContentProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "Switcher")
  @js.native
  val Switcher: ForwardRefReturn[HTMLUListElement, SwitcherProps] = js.native
  
  @JSImport("carbon-components-react/lib/components/UIShell", "SwitcherDivider")
  @js.native
  val SwitcherDivider: FC[SwitcherDividerProps] = js.native
  
  @scala.inline
  def SwitcherItem[E /* <: js.Object */, R](props: ForwardRefProps[R, SwitcherItemProps[E]]): FCReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("SwitcherItem")(props.asInstanceOf[js.Any]).asInstanceOf[FCReturn]
  
  @scala.inline
  def createCustomSideNavLink_element[E /* <: js.Object */](
    element: /* import warning: importer.ImportType#apply Failed type conversion: carbon-components-react.carbon-components-react/lib/components/UIShell/SideNavLink.SideNavLinkProps<carbon-components-react.carbon-components-react/typings/shared.ReactAnchorAttr<std.HTMLAnchorElement>>['element'] */ js.Any
  ): SideNavLinkFC[Omit[E, element]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomSideNavLink")(element.asInstanceOf[js.Any]).asInstanceOf[SideNavLinkFC[Omit[E, element]]]
}
