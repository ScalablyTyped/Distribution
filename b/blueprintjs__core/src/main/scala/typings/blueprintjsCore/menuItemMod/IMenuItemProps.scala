package typings.blueprintjsCore.menuItemMod

import typings.blueprintjsCore.anon.PartialIPopoverProps
import typings.blueprintjsCore.propsMod.IActionProps
import typings.blueprintjsCore.propsMod.ILinkProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMenuItemProps
  extends IActionProps
     with ILinkProps {
  
  /** Whether this menu item should appear with an active state. */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Children of this component will be rendered in a __submenu__ that appears when hovering or
    * clicking on this menu item.
    *
    * Use `text` prop for the content of the menu item itself.
    */
  var children: js.UndefOr[ReactNode] = js.native
  
  /**
    * HTML title to be passed to the <Text> component
    */
  var htmlTitle: js.UndefOr[String] = js.native
  
  /**
    * Right-aligned label text content, useful for displaying hotkeys.
    *
    * This prop actually supports JSX elements, but TypeScript will throw an error because
    * `HTMLAttributes` only allows strings. Use `labelElement` to supply a JSX element in TypeScript.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * A space-delimited list of class names to pass along to the right-aligned label wrapper element.
    */
  var labelClassName: js.UndefOr[String] = js.native
  
  /**
    * Right-aligned label content, useful for displaying hotkeys.
    */
  var labelElement: js.UndefOr[ReactNode] = js.native
  
  /**
    * Whether the text should be allowed to wrap to multiple lines.
    * If `false`, text will be truncated with an ellipsis when it reaches `max-width`.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.native
  
  /**
    * Props to spread to `Popover`. Note that `content` and `minimal` cannot be
    * changed and `usePortal` defaults to `false` so all submenus will live in
    * the same container.
    */
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.native
  
  /**
    * Whether an enabled item without a submenu should automatically close its parent popover when clicked.
    * @default true
    */
  var shouldDismissPopover: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the HTML tag that wraps the MenuItem.
    * @default "a"
    */
  var tagName: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any
  ] = js.native
  
  /**
    * A space-delimited list of class names to pass along to the text wrapper element.
    */
  var textClassName: js.UndefOr[String] = js.native
  
  /** Item text, required for usability. */
  @JSName("text")
  var text_IMenuItemProps: ReactNode = js.native
}
object IMenuItemProps {
  
  @scala.inline
  def apply(): IMenuItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMenuItemProps]
  }
  
  @scala.inline
  implicit class IMenuItemPropsOps[Self <: IMenuItemProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setHtmlTitle(value: String): Self = this.set("htmlTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlTitle: Self = this.set("htmlTitle", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelClassName(value: String): Self = this.set("labelClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelClassName: Self = this.set("labelClassName", js.undefined)
    
    @scala.inline
    def setLabelElement(value: ReactNode): Self = this.set("labelElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelElement: Self = this.set("labelElement", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setPopoverProps(value: PartialIPopoverProps): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    
    @scala.inline
    def setShouldDismissPopover(value: Boolean): Self = this.set("shouldDismissPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldDismissPopover: Self = this.set("shouldDismissPopover", js.undefined)
    
    @scala.inline
    def setTagName(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 176 */ js.Any): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagName: Self = this.set("tagName", js.undefined)
    
    @scala.inline
    def setText(value: ReactNode): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextClassName(value: String): Self = this.set("textClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassName: Self = this.set("textClassName", js.undefined)
  }
}
