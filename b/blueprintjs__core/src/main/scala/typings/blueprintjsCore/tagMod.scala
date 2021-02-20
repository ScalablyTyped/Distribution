package typings.blueprintjsCore

import typings.blueprintjsCore.commonMod.AbstractPureComponent2
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/tag/tag", "Tag")
  @js.native
  class Tag protected ()
    extends AbstractPureComponent2[ITagProps, js.Object, js.Object] {
    def this(props: ITagProps) = this()
    def this(props: ITagProps, context: js.Any) = this()
    
    var onRemoveClick: js.Any = js.native
  }
  /* static members */
  object Tag {
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag/tag", "Tag")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/tag/tag", "Tag.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
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
    implicit class ITagPropsMutableBuilder[Self <: ITagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHtmlTitle(value: String): Self = StObject.set(x, "htmlTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlTitleUndefined: Self = StObject.set(x, "htmlTitle", js.undefined)
      
      @scala.inline
      def setIcon(value: IconName | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnRemove(value: (/* e */ MouseEvent[HTMLButtonElement, NativeMouseEvent], ITagProps) => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setRightIcon(value: IconName | MaybeElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconNull: Self = StObject.set(x, "rightIcon", null)
      
      @scala.inline
      def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    }
  }
}
