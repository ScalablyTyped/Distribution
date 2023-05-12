package typings.blueprintjsCore

import typings.blueprintjsCore.anon.PartialIPopoverProps
import typings.blueprintjsCore.anon.PartialMenuProps
import typings.blueprintjsCore.blueprintjsCoreStrings.listitem
import typings.blueprintjsCore.blueprintjsCoreStrings.listoption
import typings.blueprintjsCore.blueprintjsCoreStrings.menuitem
import typings.blueprintjsCore.blueprintjsCoreStrings.none
import typings.blueprintjsCore.libEsmCommonMod.AbstractPureComponent2
import typings.blueprintjsCore.libEsmCommonPropsMod.ActionProps
import typings.blueprintjsCore.libEsmCommonPropsMod.IElementRefProps
import typings.blueprintjsCore.libEsmCommonPropsMod.ILinkProps
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLAnchorElement
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsMenuMenuItemMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/menu/menuItem", "MenuItem")
  @js.native
  open class MenuItem protected ()
    extends AbstractPureComponent2[MenuItemProps & AnchorHTMLAttributes[HTMLAnchorElement], js.Object, js.Object] {
    def this(props: MenuItemProps & AnchorHTMLAttributes[HTMLAnchorElement]) = this()
    def this(props: MenuItemProps & AnchorHTMLAttributes[HTMLAnchorElement], context: Any) = this()
    
    /* private */ var maybeRenderLabel: Any = js.native
    
    /* private */ var maybeRenderPopover: Any = js.native
  }
  /* static members */
  object MenuItem {
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuItem", "MenuItem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuItem", "MenuItem.defaultProps")
    @js.native
    def defaultProps: MenuItemProps = js.native
    inline def defaultProps_=(x: MenuItemProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/menu/menuItem", "MenuItem.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type IMenuItemProps = MenuItemProps
  
  trait MenuItemProps
    extends StObject
       with ActionProps[HTMLElement]
       with ILinkProps
       with IElementRefProps[HTMLLIElement] {
    
    /**
      * Whether this item should render with an active appearance. Used to indicate keyboard focus.
      */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Children of this component will be rendered in a __submenu__ that appears when hovering or
      * clicking on this menu item.
      *
      * Use `text` prop for the content of the menu item itself.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * HTML title to be passed to the <Text> component
      */
    var htmlTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Right-aligned label text content, useful for displaying hotkeys.
      *
      * This prop actually supports JSX elements, but TypeScript will throw an error because
      * `HTMLAttributes` only allows strings. Use `labelElement` to supply a JSX element in TypeScript.
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * A space-delimited list of class names to pass along to the right-aligned label wrapper element.
      */
    var labelClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Right-aligned label content, useful for displaying hotkeys.
      */
    var labelElement: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Whether the text should be allowed to wrap to multiple lines.
      * If `false`, text will be truncated with an ellipsis when it reaches `max-width`.
      *
      * @default false
      */
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Props to spread to `Popover`. Note that `content` and `minimal` cannot be
      * changed and `usePortal` defaults to `false` so all submenus will live in
      * the same container.
      */
    var popoverProps: js.UndefOr[PartialIPopoverProps] = js.undefined
    
    /**
      * Changes the ARIA `role` property structure of this MenuItem to accomodate for various
      * different `role`s of the parent Menu `ul` element.
      *
      * If `menuitem`, role structure becomes:
      *
      * `<li role="none"`
      *     `<a role="menuitem"`
      *
      * which is proper role structure for a `<ul role="menu"` parent (this is the default `role` of a `Menu`).
      *
      * If `listoption`, role structure becomes:
      *
      * `<li role="option"`
      *     `<a role=undefined`
      *
      * which is proper role structure for a `<ul role="listbox"` parent, or a `<select>` parent.
      *
      * If `listitem`, role structure becomes:
      *
      * `<li role=undefined`
      *     `<a role=undefined`
      *
      * which can be used if this item is within a basic `<ul/>` (or `role="list"`) parent.
      *
      * If `none`, role structure becomes:
      *
      * `<li role="none"`
      *     `<a role=undefined`
      *
      * which can be used if wrapping this item in a custom `<li>` parent.
      *
      * @default "menuitem"
      */
    var roleStructure: js.UndefOr[menuitem | listoption | listitem | none] = js.undefined
    
    /**
      * Whether this item is selected. This will set the `aria-selected` attribute.
      */
    var selected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether an enabled item without a submenu should automatically close its parent popover when clicked.
      *
      * @default true
      */
    var shouldDismissPopover: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Props to spread to the child `Menu` component if this item has a submenu.
      */
    var submenuProps: js.UndefOr[PartialMenuProps] = js.undefined
    
    /**
      * Name of the HTML tag that wraps the MenuItem.
      *
      * @default "a"
      */
    var tagName: js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
      ] = js.undefined
    
    /**
      * A space-delimited list of class names to pass along to the text wrapper element.
      */
    var textClassName: js.UndefOr[String] = js.undefined
    
    /** Item text, required for usability. */
    @JSName("text")
    var text_MenuItemProps: ReactNode
  }
  object MenuItemProps {
    
    inline def apply(): MenuItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      inline def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelClassName(value: String): Self = StObject.set(x, "labelClassName", value.asInstanceOf[js.Any])
      
      inline def setLabelClassNameUndefined: Self = StObject.set(x, "labelClassName", js.undefined)
      
      inline def setLabelElement(value: ReactNode): Self = StObject.set(x, "labelElement", value.asInstanceOf[js.Any])
      
      inline def setLabelElementUndefined: Self = StObject.set(x, "labelElement", js.undefined)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setPopoverProps(value: PartialIPopoverProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setRoleStructure(value: menuitem | listoption | listitem | none): Self = StObject.set(x, "roleStructure", value.asInstanceOf[js.Any])
      
      inline def setRoleStructureUndefined: Self = StObject.set(x, "roleStructure", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setShouldDismissPopover(value: Boolean): Self = StObject.set(x, "shouldDismissPopover", value.asInstanceOf[js.Any])
      
      inline def setShouldDismissPopoverUndefined: Self = StObject.set(x, "shouldDismissPopover", js.undefined)
      
      inline def setSubmenuProps(value: PartialMenuProps): Self = StObject.set(x, "submenuProps", value.asInstanceOf[js.Any])
      
      inline def setSubmenuPropsUndefined: Self = StObject.set(x, "submenuProps", js.undefined)
      
      inline def setTagName(
        value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 177, starting with typings.blueprintjsCore.blueprintjsCoreStrings.a, typings.blueprintjsCore.blueprintjsCoreStrings.abbr, typings.blueprintjsCore.blueprintjsCoreStrings.address */ Any
      ): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextClassName(value: String): Self = StObject.set(x, "textClassName", value.asInstanceOf[js.Any])
      
      inline def setTextClassNameUndefined: Self = StObject.set(x, "textClassName", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
