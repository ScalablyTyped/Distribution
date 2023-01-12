package typings.baseui

import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.circle
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.pill
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.reset
import typings.baseui.baseuiStrings.round_
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.square
import typings.baseui.baseuiStrings.submit
import typings.baseui.baseuiStrings.tertiary
import typings.baseui.helpersOverridesMod.Override
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonTypesMod {
  
  trait ButtonOverrides extends StObject {
    
    var BaseButton: js.UndefOr[Override[Any]] = js.undefined
    
    var EndEnhancer: js.UndefOr[Override[Any]] = js.undefined
    
    var LoadingSpinner: js.UndefOr[Override[Any]] = js.undefined
    
    var LoadingSpinnerContainer: js.UndefOr[Override[Any]] = js.undefined
    
    var Root: js.UndefOr[Override[Any]] = js.undefined
    
    var StartEnhancer: js.UndefOr[Override[Any]] = js.undefined
  }
  object ButtonOverrides {
    
    inline def apply(): ButtonOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonOverrides] (val x: Self) extends AnyVal {
      
      inline def setBaseButton(value: Override[Any]): Self = StObject.set(x, "BaseButton", value.asInstanceOf[js.Any])
      
      inline def setBaseButtonUndefined: Self = StObject.set(x, "BaseButton", js.undefined)
      
      inline def setEndEnhancer(value: Override[Any]): Self = StObject.set(x, "EndEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "EndEnhancer", js.undefined)
      
      inline def setLoadingSpinner(value: Override[Any]): Self = StObject.set(x, "LoadingSpinner", value.asInstanceOf[js.Any])
      
      inline def setLoadingSpinnerContainer(value: Override[Any]): Self = StObject.set(x, "LoadingSpinnerContainer", value.asInstanceOf[js.Any])
      
      inline def setLoadingSpinnerContainerUndefined: Self = StObject.set(x, "LoadingSpinnerContainer", js.undefined)
      
      inline def setLoadingSpinnerUndefined: Self = StObject.set(x, "LoadingSpinner", js.undefined)
      
      inline def setRoot(value: Override[Any]): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setStartEnhancer(value: Override[Any]): Self = StObject.set(x, "StartEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "StartEnhancer", js.undefined)
    }
  }
  
  trait ButtonProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var colors: js.UndefOr[CustomColors] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** A helper rendered at the end of the button. */
    var endEnhancer: js.UndefOr[ReactNode | ComponentType[Any]] = js.undefined
    
    /** Show loading button style and spinner. */
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    /** Indicates that the button is selected */
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    /** Defines the kind (purpose) of a button */
    var kind: js.UndefOr[primary | secondary | tertiary] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* a */ SyntheticEvent[HTMLButtonElement, Event], Any]] = js.undefined
    
    var overrides: js.UndefOr[ButtonOverrides] = js.undefined
    
    /** Defines the shape of the button */
    var shape: js.UndefOr[default_ | pill | round_ | circle | square] = js.undefined
    
    /** Defines the size of the button */
    var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
    
    /** A helper rendered at the start of the button. */
    var startEnhancer: js.UndefOr[ReactNode | ComponentType[Any]] = js.undefined
    
    var `type`: js.UndefOr[submit | reset | button] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColors(value: CustomColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEndEnhancer(value: ReactNode | ComponentType[Any]): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKind(value: primary | secondary | tertiary): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setOnClick(value: /* a */ SyntheticEvent[HTMLButtonElement, Event] => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverrides(value: ButtonOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setShape(value: default_ | pill | round_ | circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: mini | default_ | compact | large_): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartEnhancer(value: ReactNode | ComponentType[Any]): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CustomColors extends StObject {
    
    var backgroundColor: String
    
    var color: String
  }
  object CustomColors {
    
    inline def apply(backgroundColor: String, color: String): CustomColors = {
      val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomColors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomColors] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  trait SharedStyleProps extends StObject {
    
    @JSName("$colors")
    var $colors: js.UndefOr[CustomColors] = js.undefined
    
    @JSName("$disabled")
    var $disabled: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isFocusVisible")
    var $isFocusVisible: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isLoading")
    var $isLoading: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$isSelected")
    var $isSelected: js.UndefOr[Boolean] = js.undefined
    
    @JSName("$kind")
    var $kind: js.UndefOr[primary | secondary | tertiary] = js.undefined
    
    @JSName("$shape")
    var $shape: js.UndefOr[default_ | pill | round_ | circle | square] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
  }
  object SharedStyleProps {
    
    inline def apply(): SharedStyleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedStyleProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedStyleProps] (val x: Self) extends AnyVal {
      
      inline def set$colors(value: CustomColors): Self = StObject.set(x, "$colors", value.asInstanceOf[js.Any])
      
      inline def set$colorsUndefined: Self = StObject.set(x, "$colors", js.undefined)
      
      inline def set$disabled(value: Boolean): Self = StObject.set(x, "$disabled", value.asInstanceOf[js.Any])
      
      inline def set$disabledUndefined: Self = StObject.set(x, "$disabled", js.undefined)
      
      inline def set$isFocusVisible(value: Boolean): Self = StObject.set(x, "$isFocusVisible", value.asInstanceOf[js.Any])
      
      inline def set$isFocusVisibleUndefined: Self = StObject.set(x, "$isFocusVisible", js.undefined)
      
      inline def set$isLoading(value: Boolean): Self = StObject.set(x, "$isLoading", value.asInstanceOf[js.Any])
      
      inline def set$isLoadingUndefined: Self = StObject.set(x, "$isLoading", js.undefined)
      
      inline def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
      
      inline def set$isSelectedUndefined: Self = StObject.set(x, "$isSelected", js.undefined)
      
      inline def set$kind(value: primary | secondary | tertiary): Self = StObject.set(x, "$kind", value.asInstanceOf[js.Any])
      
      inline def set$kindUndefined: Self = StObject.set(x, "$kind", js.undefined)
      
      inline def set$shape(value: default_ | pill | round_ | circle | square): Self = StObject.set(x, "$shape", value.asInstanceOf[js.Any])
      
      inline def set$shapeUndefined: Self = StObject.set(x, "$shape", js.undefined)
      
      inline def set$size(value: mini | default_ | compact | large_): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
}
