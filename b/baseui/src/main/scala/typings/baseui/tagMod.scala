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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod {
  
  trait KIND extends StObject {
    
    var accent: typings.baseui.baseuiStrings.accent
    
    var black: typings.baseui.baseuiStrings.black
    
    var blue: typings.baseui.baseuiStrings.blue
    
    var brown: typings.baseui.baseuiStrings.brown
    
    var custom: custom_
    
    var green: typings.baseui.baseuiStrings.green
    
    var negative: typings.baseui.baseuiStrings.negative
    
    var neutral: typings.baseui.baseuiStrings.neutral
    
    var orange: typings.baseui.baseuiStrings.orange
    
    var positive: typings.baseui.baseuiStrings.positive
    
    var primary: typings.baseui.baseuiStrings.primary
    
    var purple: typings.baseui.baseuiStrings.purple
    
    var red: typings.baseui.baseuiStrings.red
    
    var warning: typings.baseui.baseuiStrings.warning
    
    var white: typings.baseui.baseuiStrings.white
    
    var yellow: typings.baseui.baseuiStrings.yellow
  }
  object KIND {
    
    @JSImport("baseui/tag", "KIND")
    @js.native
    val ^ : KIND = js.native
    
    extension [Self <: KIND](x: Self) {
      
      inline def setAccent(value: accent): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      inline def setBlack(value: black): Self = StObject.set(x, "black", value.asInstanceOf[js.Any])
      
      inline def setBlue(value: blue): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
      
      inline def setBrown(value: brown): Self = StObject.set(x, "brown", value.asInstanceOf[js.Any])
      
      inline def setCustom(value: custom_): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setGreen(value: green): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
      
      inline def setNegative(value: negative): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNeutral(value: neutral): Self = StObject.set(x, "neutral", value.asInstanceOf[js.Any])
      
      inline def setOrange(value: orange): Self = StObject.set(x, "orange", value.asInstanceOf[js.Any])
      
      inline def setPositive(value: positive): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPrimary(value: primary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      inline def setPurple(value: purple): Self = StObject.set(x, "purple", value.asInstanceOf[js.Any])
      
      inline def setRed(value: red): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: warning): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWhite(value: white): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
      
      inline def setYellow(value: yellow): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
    }
  }
  
  trait SIZE extends StObject {
    
    var large: large_
    
    var medium: medium_
    
    var small: small_
  }
  object SIZE {
    
    @JSImport("baseui/tag", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    extension [Self <: SIZE](x: Self) {
      
      inline def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: medium_): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: small_): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
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
  
  trait VARIANT extends StObject {
    
    var light: typings.baseui.baseuiStrings.light
    
    var outlined: typings.baseui.baseuiStrings.outlined
    
    var solid: typings.baseui.baseuiStrings.solid
  }
  object VARIANT {
    
    @JSImport("baseui/tag", "VARIANT")
    @js.native
    val ^ : VARIANT = js.native
    
    extension [Self <: VARIANT](x: Self) {
      
      inline def setLight(value: light): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setOutlined(value: outlined): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      inline def setSolid(value: solid): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagOverrides extends StObject {
    
    var Action: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var ActionIcon: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Text: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object TagOverrides {
    
    inline def apply(): TagOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagOverrides]
    }
    
    extension [Self <: TagOverrides](x: Self) {
      
      inline def setAction(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionIcon(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ActionIcon", value.asInstanceOf[js.Any])
      
      inline def setActionIconUndefined: Self = StObject.set(x, "ActionIcon", js.undefined)
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setText(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    }
  }
  
  trait TagProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var closeable: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    var isHovered: js.UndefOr[Boolean] = js.undefined
    
    var kind: js.UndefOr[
        orange | custom_ | brown | purple | yellow | red | accent | white | primary | blue | neutral | positive | black | green | warning | negative
      ] = js.undefined
    
    var onActionClick: js.UndefOr[js.Function2[/* e */ Event, /* children */ js.UndefOr[ReactNode], js.Any]] = js.undefined
    
    var onActionKeyDown: js.UndefOr[js.Function2[/* e */ Event, /* children */ js.UndefOr[ReactNode], js.Any]] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* event */ Event, js.Any]] = js.undefined
    
    var onKeyDown: js.UndefOr[js.Function1[/* event */ Event, js.Any]] = js.undefined
    
    var overrides: js.UndefOr[TagOverrides] = js.undefined
    
    var size: js.UndefOr[small_ | medium_ | large_] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[solid | light | outlined] = js.undefined
  }
  object TagProps {
    
    inline def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    extension [Self <: TagProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCloseable(value: Boolean): Self = StObject.set(x, "closeable", value.asInstanceOf[js.Any])
      
      inline def setCloseableUndefined: Self = StObject.set(x, "closeable", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsFocusedUndefined: Self = StObject.set(x, "isFocused", js.undefined)
      
      inline def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
      
      inline def setIsHoveredUndefined: Self = StObject.set(x, "isHovered", js.undefined)
      
      inline def setKind(
        value: orange | custom_ | brown | purple | yellow | red | accent | white | primary | blue | neutral | positive | black | green | warning | negative
      ): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setOnActionClick(value: (/* e */ Event, /* children */ js.UndefOr[ReactNode]) => js.Any): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      inline def setOnActionKeyDown(value: (/* e */ Event, /* children */ js.UndefOr[ReactNode]) => js.Any): Self = StObject.set(x, "onActionKeyDown", js.Any.fromFunction2(value))
      
      inline def setOnActionKeyDownUndefined: Self = StObject.set(x, "onActionKeyDown", js.undefined)
      
      inline def setOnClick(value: /* event */ Event => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ Event => js.Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOverrides(value: TagOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: small_ | medium_ | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVariant(value: solid | light | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
