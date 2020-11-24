package typings.blueprintjsCore.tagMod

import typings.blueprintjsCore.propsMod.IElementRefProps
import typings.blueprintjsCore.propsMod.IIntentProps
import typings.blueprintjsCore.propsMod.MaybeElement
import typings.blueprintjsIcons.iconNameMod.IconName
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.blueprintjsCore.propsMod.IProps because var conflicts: className. Inlined  */ @js.native
trait ITagProps
  extends HTMLAttributes[HTMLSpanElement]
     with IIntentProps
     with IElementRefProps[HTMLSpanElement] {
  
  /**
    * Whether the tag should appear in an active state.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the tag should take up the full width of its container.
    * @default false
    */
  var fill: js.UndefOr[Boolean] = js.native
  
  /**
    * HTML title to be passed to the <Text> component
    */
  var htmlTitle: js.UndefOr[String] = js.native
  
  /** Name of a Blueprint UI icon (or an icon element) to render before the children. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  
  /**
    * Whether the tag should visually respond to user interactions. If set
    * to `true`, hovering over the tag will change its color and mouse cursor.
    *
    * Recommended when `onClick` is also defined.
    *
    * @default false
    */
  var interactive: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this tag should use large styles.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether this tag should use minimal styles.
    * @default false
    */
  var minimal: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether tag content should be allowed to occupy multiple lines.
    * If false, a single line of text will be truncated with an ellipsis if
    * it overflows. Note that icons will be vertically centered relative to
    * multiline text.
    * @default false
    */
  var multiline: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback invoked when the tag is clicked.
    * Recommended when `interactive` is `true`.
    */
  @JSName("onClick")
  var onClick_ITagProps: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLDivElement, NativeMouseEvent], Unit]] = js.native
  
  /**
    * Click handler for remove button.
    * The remove button will only be rendered if this prop is defined.
    */
  var onRemove: js.UndefOr[
    js.Function2[
      /* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent], 
      /* tagProps */ this.type, 
      Unit
    ]
  ] = js.native
  
  /** Name of a Blueprint UI icon (or an icon element) to render after the children. */
  var rightIcon: js.UndefOr[IconName | MaybeElement] = js.native
  
  /**
    * Whether this tag should have rounded ends.
    * @default false
    */
  var round: js.UndefOr[Boolean] = js.native
}
object ITagProps {
  
  @scala.inline
  def apply(): ITagProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITagProps]
  }
  
  @scala.inline
  implicit class ITagPropsOps[Self <: ITagProps] (val x: Self) extends AnyVal {
    
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
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setHtmlTitle(value: String): Self = this.set("htmlTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlTitle: Self = this.set("htmlTitle", js.undefined)
    
    @scala.inline
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setLarge(value: Boolean): Self = this.set("large", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLarge: Self = this.set("large", js.undefined)
    
    @scala.inline
    def setMinimal(value: Boolean): Self = this.set("minimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimal: Self = this.set("minimal", js.undefined)
    
    @scala.inline
    def setMultiline(value: Boolean): Self = this.set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiline: Self = this.set("multiline", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnRemove(value: (/* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent], ITagProps) => Unit): Self = this.set("onRemove", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
    
    @scala.inline
    def setRightIcon(value: IconName | MaybeElement): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    
    @scala.inline
    def setRightIconNull: Self = this.set("rightIcon", null)
    
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
  }
}
