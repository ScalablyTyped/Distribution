package typings.baseui

import typings.baseui.baseuiStrings.accent
import typings.baseui.baseuiStrings.black
import typings.baseui.baseuiStrings.blue
import typings.baseui.baseuiStrings.brown
import typings.baseui.baseuiStrings.custom_
import typings.baseui.baseuiStrings.green
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.light
import typings.baseui.baseuiStrings.medium_
import typings.baseui.baseuiStrings.negative
import typings.baseui.baseuiStrings.neutral
import typings.baseui.baseuiStrings.orange
import typings.baseui.baseuiStrings.outlined
import typings.baseui.baseuiStrings.positive
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.purple
import typings.baseui.baseuiStrings.red
import typings.baseui.baseuiStrings.small_
import typings.baseui.baseuiStrings.solid
import typings.baseui.baseuiStrings.warning
import typings.baseui.baseuiStrings.white
import typings.baseui.baseuiStrings.yellow
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  @js.native
  trait KIND extends StObject {
    
    var accent: typings.baseui.baseuiStrings.accent = js.native
    
    var black: typings.baseui.baseuiStrings.black = js.native
    
    var blue: typings.baseui.baseuiStrings.blue = js.native
    
    var brown: typings.baseui.baseuiStrings.brown = js.native
    
    var custom: custom_ = js.native
    
    var green: typings.baseui.baseuiStrings.green = js.native
    
    var negative: typings.baseui.baseuiStrings.negative = js.native
    
    var neutral: typings.baseui.baseuiStrings.neutral = js.native
    
    var orange: typings.baseui.baseuiStrings.orange = js.native
    
    var positive: typings.baseui.baseuiStrings.positive = js.native
    
    var primary: typings.baseui.baseuiStrings.primary = js.native
    
    var purple: typings.baseui.baseuiStrings.purple = js.native
    
    var red: typings.baseui.baseuiStrings.red = js.native
    
    var warning: typings.baseui.baseuiStrings.warning = js.native
    
    var white: typings.baseui.baseuiStrings.white = js.native
    
    var yellow: typings.baseui.baseuiStrings.yellow = js.native
  }
  object KIND {
    
    @JSImport("baseui/tag", "KIND")
    @js.native
    val ^ : KIND = js.native
    
    @scala.inline
    implicit class KINDMutableBuilder[Self <: KIND] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccent(value: accent): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlack(value: black): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlue(value: blue): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrown(value: brown): Self = StObject.set(x, "brown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom(value: custom_): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGreen(value: green): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegative(value: negative): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeutral(value: neutral): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrange(value: orange): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositive(value: positive): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: primary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPurple(value: purple): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRed(value: red): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: warning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhite(value: white): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYellow(value: yellow): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SIZE extends StObject {
    
    var large: large_ = js.native
    
    var medium: medium_ = js.native
    
    var small: small_ = js.native
  }
  object SIZE {
    
    @JSImport("baseui/tag", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedium(value: medium_): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmall(value: small_): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/tag", "StyledAction")
  @js.native
  val StyledAction: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tag", "StyledActionIcon")
  @js.native
  val StyledActionIcon: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tag", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tag", "StyledText")
  @js.native
  val StyledText: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/tag", "Tag")
  @js.native
  class Tag protected ()
    extends Component[TagProps, js.Object, js.Any] {
    def this(props: TagProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TagProps, context: js.Any) = this()
    
    def handleActionKeyDown(event: KeyboardEvent): Unit = js.native
    
    def handleKeyDown(event: KeyboardEvent): Unit = js.native
  }
  
  @js.native
  trait VARIANT extends StObject {
    
    var light: typings.baseui.baseuiStrings.light = js.native
    
    var outlined: typings.baseui.baseuiStrings.outlined = js.native
    
    var solid: typings.baseui.baseuiStrings.solid = js.native
  }
  object VARIANT {
    
    @JSImport("baseui/tag", "VARIANT")
    @js.native
    val ^ : VARIANT = js.native
    
    @scala.inline
    implicit class VARIANTMutableBuilder[Self <: VARIANT] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLight(value: light): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlined(value: outlined): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolid(value: solid): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TagOverrides extends StObject {
    
    var Action: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var ActionIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Text: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object TagOverrides {
    
    @scala.inline
    def apply(): TagOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagOverrides]
    }
    
    @scala.inline
    implicit class TagOverridesMutableBuilder[Self <: TagOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ActionIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionIconUndefined: Self = StObject.set(x, "ActionIcon", js.undefined)
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setText(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    }
  }
  
  @js.native
  trait TagProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var closeable: js.UndefOr[Boolean] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var isFocused: js.UndefOr[Boolean] = js.native
    
    var isHovered: js.UndefOr[Boolean] = js.native
    
    var kind: js.UndefOr[
        orange | custom_ | brown | purple | yellow | red | accent | white | primary | blue | neutral | positive | black | green | warning | negative
      ] = js.native
    
    var onActionClick: js.UndefOr[js.Function2[/* e */ Event, /* children */ js.UndefOr[ReactNode], _]] = js.native
    
    var onActionKeyDown: js.UndefOr[js.Function2[/* e */ Event, /* children */ js.UndefOr[ReactNode], _]] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ Event, _]] = js.native
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ Event, _]] = js.native
    
    var overrides: js.UndefOr[TagOverrides] = js.native
    
    var size: js.UndefOr[small_ | medium_ | large_] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var variant: js.UndefOr[solid | light | outlined] = js.native
  }
  object TagProps {
    
    @scala.inline
    def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    @scala.inline
    implicit class TagPropsMutableBuilder[Self <: TagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      @scala.inline
      def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHoveredUndefined: Self = StObject.set(x, "isHovered", js.undefined)
      
      @scala.inline
      def setKind(
        value: orange | custom_ | brown | purple | yellow | red | accent | white | primary | blue | neutral | positive | black | green | warning | negative
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setOnActionClick(value: (/* e */ Event, /* children */ js.UndefOr[ReactNode]) => _): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      @scala.inline
      def setOnActionKeyDown(value: (/* e */ Event, /* children */ js.UndefOr[ReactNode]) => _): Self = StObject.set(x, "onActionKeyDown", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActionKeyDownUndefined: Self = StObject.set(x, "onActionKeyDown", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ Event => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: /* event */ Event => _): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOverrides(value: TagOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSize(value: small_ | medium_ | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVariant(value: solid | light | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
