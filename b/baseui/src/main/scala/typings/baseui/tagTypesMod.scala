package typings.baseui

import typings.baseui.baseuiStrings.custom_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.medium_
import typings.baseui.baseuiStrings.small_
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagTypesMod {
  
  /* Inlined keyof std.Readonly<{ readonly custom :'custom',  readonly neutral :'neutral',  readonly primary :'primary',  readonly accent :'accent',  readonly positive :'positive',  readonly warning :'warning',  readonly negative :'negative',  readonly black :'black',  readonly blue :'blue',  readonly green :'green',  readonly red :'red',  readonly yellow :'yellow',  readonly orange :'orange',  readonly purple :'purple',  readonly brown :'brown'}> */
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.orange
    - typings.baseui.baseuiStrings.custom_
    - typings.baseui.baseuiStrings.brown
    - typings.baseui.baseuiStrings.purple
    - typings.baseui.baseuiStrings.yellow
    - typings.baseui.baseuiStrings.red
    - typings.baseui.baseuiStrings.accent
    - typings.baseui.baseuiStrings.primary
    - typings.baseui.baseuiStrings.blue
    - typings.baseui.baseuiStrings.neutral
    - typings.baseui.baseuiStrings.positive
    - typings.baseui.baseuiStrings.black
    - typings.baseui.baseuiStrings.green
    - typings.baseui.baseuiStrings.warning
    - typings.baseui.baseuiStrings.negative
  */
  trait TagKind extends StObject
  /* Inlined std.Readonly<{ readonly custom :'custom',  readonly neutral :'neutral',  readonly primary :'primary',  readonly accent :'accent',  readonly positive :'positive',  readonly warning :'warning',  readonly negative :'negative',  readonly black :'black',  readonly blue :'blue',  readonly green :'green',  readonly red :'red',  readonly yellow :'yellow',  readonly orange :'orange',  readonly purple :'purple',  readonly brown :'brown'}> */
  object TagKind {
    
    @JSImport("baseui/tag/types", "TagKind.accent")
    @js.native
    val accent: typings.baseui.baseuiStrings.accent = js.native
    
    @JSImport("baseui/tag/types", "TagKind.black")
    @js.native
    val black: typings.baseui.baseuiStrings.black = js.native
    
    @JSImport("baseui/tag/types", "TagKind.blue")
    @js.native
    val blue: typings.baseui.baseuiStrings.blue = js.native
    
    @JSImport("baseui/tag/types", "TagKind.brown")
    @js.native
    val brown: typings.baseui.baseuiStrings.brown = js.native
    
    @JSImport("baseui/tag/types", "TagKind.custom")
    @js.native
    val custom: custom_ = js.native
    
    @JSImport("baseui/tag/types", "TagKind.green")
    @js.native
    val green: typings.baseui.baseuiStrings.green = js.native
    
    @JSImport("baseui/tag/types", "TagKind.negative")
    @js.native
    val negative: typings.baseui.baseuiStrings.negative = js.native
    
    @JSImport("baseui/tag/types", "TagKind.neutral")
    @js.native
    val neutral: typings.baseui.baseuiStrings.neutral = js.native
    
    @JSImport("baseui/tag/types", "TagKind.orange")
    @js.native
    val orange: typings.baseui.baseuiStrings.orange = js.native
    
    @JSImport("baseui/tag/types", "TagKind.positive")
    @js.native
    val positive: typings.baseui.baseuiStrings.positive = js.native
    
    @JSImport("baseui/tag/types", "TagKind.primary")
    @js.native
    val primary: typings.baseui.baseuiStrings.primary = js.native
    
    @JSImport("baseui/tag/types", "TagKind.purple")
    @js.native
    val purple: typings.baseui.baseuiStrings.purple = js.native
    
    @JSImport("baseui/tag/types", "TagKind.red")
    @js.native
    val red: typings.baseui.baseuiStrings.red = js.native
    
    @JSImport("baseui/tag/types", "TagKind.warning")
    @js.native
    val warning: typings.baseui.baseuiStrings.warning = js.native
    
    @JSImport("baseui/tag/types", "TagKind.yellow")
    @js.native
    val yellow: typings.baseui.baseuiStrings.yellow = js.native
  }
  
  /* Inlined keyof std.Readonly<{ readonly small :'small',  readonly medium :'medium',  readonly large :'large'}> */
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.small_
    - typings.baseui.baseuiStrings.medium_
    - typings.baseui.baseuiStrings.large_
  */
  trait TagSize extends StObject
  /* Inlined std.Readonly<{ readonly small :'small',  readonly medium :'medium',  readonly large :'large'}> */
  object TagSize {
    
    @JSImport("baseui/tag/types", "TagSize.large")
    @js.native
    val large: large_ = js.native
    
    @JSImport("baseui/tag/types", "TagSize.medium")
    @js.native
    val medium: medium_ = js.native
    
    @JSImport("baseui/tag/types", "TagSize.small")
    @js.native
    val small: small_ = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.baseui.baseuiStrings.solid
    - typings.baseui.baseuiStrings.light
    - typings.baseui.baseuiStrings.outlined
  */
  trait TagVariant extends StObject
  /* Inlined std.Readonly<std.Readonly<{ readonly solid :'solid',  readonly light :'light',  readonly outlined :'outlined'}>> */
  object TagVariant {
    
    @JSImport("baseui/tag/types", "TagVariant.light")
    @js.native
    val light: typings.baseui.baseuiStrings.light = js.native
    
    @JSImport("baseui/tag/types", "TagVariant.outlined")
    @js.native
    val outlined: typings.baseui.baseuiStrings.outlined = js.native
    
    @JSImport("baseui/tag/types", "TagVariant.solid")
    @js.native
    val solid: typings.baseui.baseuiStrings.solid = js.native
  }
  
  trait SharedPropsArg extends StObject {
    
    @JSName("$clickable")
    var $clickable: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$closeable")
    var $closeable: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$color")
    var $color: js.UndefOr[String] = js.undefined
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isActive")
    var $isActive: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isFocused")
    var $isFocused: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isHovered")
    var $isHovered: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$kind")
    var $kind: js.UndefOr[String] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[String] = js.undefined
    
    @JSName("$variant")
    var $variant: js.UndefOr[String] = js.undefined
  }
  object SharedPropsArg {
    
    inline def apply(): SharedPropsArg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedPropsArg]
    }
    
    extension [Self <: SharedPropsArg](x: Self) {
      
      inline def set$clickable(value: Boolean): Self = StObject.set(x, "$clickable", value.asInstanceOf[js.Any])
      
      inline def set$clickableUndefined: Self = StObject.set(x, "$clickable", js.undefined)
      
      inline def set$closeable(value: Boolean): Self = StObject.set(x, "$closeable", value.asInstanceOf[js.Any])
      
      inline def set$closeableUndefined: Self = StObject.set(x, "$closeable", js.undefined)
      
      inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
      
      inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$isActive(value: Boolean): Self = StObject.set(x, "$isActive", value.asInstanceOf[js.Any])
      
      inline def set$isActiveUndefined: Self = StObject.set(x, "$isActive", js.undefined)
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
      
      inline def set$isFocused(value: Boolean): Self = StObject.set(x, "$isFocused", value.asInstanceOf[js.Any])
      
      inline def set$isFocusedUndefined: Self = StObject.set(x, "$isFocused", js.undefined)
      
      inline def set$isHovered(value: Boolean): Self = StObject.set(x, "$isHovered", value.asInstanceOf[js.Any])
      
      inline def set$isHoveredUndefined: Self = StObject.set(x, "$isHovered", js.undefined)
      
      inline def set$kind(value: String): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
      
      inline def set$kindUndefined: Self = StObject.set(x, "$kind", js.undefined)
      
      inline def set$size(value: String): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
      
      inline def set$variant(value: String): Self = StObject.set(x, "$variant", value.asInstanceOf[js.Any])
      
      inline def set$variantUndefined: Self = StObject.set(x, "$variant", js.undefined)
    }
  }
  
  trait TagOverrides extends StObject {
    
    var Action: js.UndefOr[Override[Any]] = js.undefined
    
    var ActionIcon: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var StartEnhancerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Text: js.UndefOr[Override[Any]] = js.undefined
  }
  object TagOverrides {
    
    inline def apply(): TagOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagOverrides]
    }
    
    extension [Self <: TagOverrides](x: Self) {
      
      inline def setAction(value: Override[Any]): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionIcon(value: Override[Any]): Self = StObject.set(x, "ActionIcon", value.asInstanceOf[js.Any])
      
      inline def setActionIconUndefined: Self = StObject.set(x, "ActionIcon", js.undefined)
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStartEnhancerContainer(value: Override[Any]): Self = StObject.set(x, "StartEnhancerContainer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerContainerUndefined: Self = StObject.set(x, "StartEnhancerContainer", js.undefined)
      
      inline def setText(value: Override[Any]): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    }
  }
  
  trait TagProps extends StObject {
    
    /** Component or String value for label of tag. Default is empty string. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Include or exclude the "x" button and click action. */
    var closeable: js.UndefOr[Boolean] = js.undefined
    
    /** The color theme to be applied to a Tag. Default is `KIND.primary`. */
    var color: js.UndefOr[String] = js.undefined
    
    /** Disable control from being changed. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Deprecated. Will be removed in the next major version. */
    var isFocused: js.UndefOr[Boolean] = js.undefined
    
    /** Deprecated. Will be removed in the next major version. */
    var isHovered: js.UndefOr[Boolean] = js.undefined
    
    /** Defines tags look by purpose. Set it to one of KIND[key] values. Defaults to KIND.primary */
    var kind: js.UndefOr[TagKind] = js.undefined
    
    /** onClick handler for the action button element. */
    var onActionClick: js.UndefOr[js.Function2[/* e */ Event, /* children */ js.UndefOr[ReactNode], Any]] = js.undefined
    
    /** keydown handler for the action button element. */
    var onActionKeyDown: js.UndefOr[js.Function2[/* e */ Event, /* children */ js.UndefOr[ReactNode], Any]] = js.undefined
    
    /** onClick handler for the tag. Passing an onClick handler also makes the tag clickable. */
    var onClick: js.UndefOr[Null | (js.Function1[/* event */ Event, Any])] = js.undefined
    
    /** onkeydown handler for the tag. */
    var onKeyDown: js.UndefOr[Null | (js.Function1[/* event */ Event, Any])] = js.undefined
    
    var overrides: js.UndefOr[TagOverrides] = js.undefined
    
    /** Determines the size of the Tag. */
    var size: js.UndefOr[TagSize] = js.undefined
    
    var startEnhancer: js.UndefOr[ComponentType[js.Object]] = js.undefined
    
    /** Text to display in native OS tooltip on long hover. */
    var title: js.UndefOr[String] = js.undefined
    
    /** Defines tags look. Set it to one of VARIANT[key] values. Defaults to VARIANT.light */
    var variant: js.UndefOr[TagVariant] = js.undefined
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
      
      inline def setKind(value: TagKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setOnActionClick(value: (/* e */ Event, /* children */ js.UndefOr[ReactNode]) => Any): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      inline def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
      
      inline def setOnActionKeyDown(value: (/* e */ Event, /* children */ js.UndefOr[ReactNode]) => Any): Self = StObject.set(x, "onActionKeyDown", js.Any.fromFunction2(value))
      
      inline def setOnActionKeyDownUndefined: Self = StObject.set(x, "onActionKeyDown", js.undefined)
      
      inline def setOnClick(value: /* event */ Event => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickNull: Self = StObject.set(x, "onClick", null)
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnKeyDown(value: /* event */ Event => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownNull: Self = StObject.set(x, "onKeyDown", null)
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOverrides(value: TagOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setSize(value: TagSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: ComponentType[js.Object]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVariant(value: TagVariant): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
