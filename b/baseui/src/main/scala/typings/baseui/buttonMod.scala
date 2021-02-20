package typings.baseui

import typings.baseui.baseuiStrings.button
import typings.baseui.baseuiStrings.circle
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.baseuiStrings.minimal
import typings.baseui.baseuiStrings.pill
import typings.baseui.baseuiStrings.primary
import typings.baseui.baseuiStrings.reset
import typings.baseui.baseuiStrings.round
import typings.baseui.baseuiStrings.secondary
import typings.baseui.baseuiStrings.square
import typings.baseui.baseuiStrings.submit
import typings.baseui.baseuiStrings.tertiary
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PropsWithoutRef
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLButtonElement
import typings.styletronReact.mod.StyletronComponent
import typings.styletronReact.mod.StyletronComponentInjectedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("baseui/button", "Button")
  @js.native
  val Button: ForwardRefExoticComponent[PropsWithoutRef[ButtonProps] with RefAttributes[HTMLButtonElement]] = js.native
  
  @js.native
  trait KIND extends StObject {
    
    var minimal: typings.baseui.baseuiStrings.minimal = js.native
    
    var primary: typings.baseui.baseuiStrings.primary = js.native
    
    var secondary: typings.baseui.baseuiStrings.secondary = js.native
    
    var tertiary: typings.baseui.baseuiStrings.tertiary = js.native
  }
  object KIND {
    
    @JSImport("baseui/button", "KIND")
    @js.native
    val ^ : KIND = js.native
    
    @scala.inline
    implicit class KINDMutableBuilder[Self <: KIND] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMinimal(value: minimal): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimary(value: primary): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondary(value: secondary): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTertiary(value: tertiary): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SHAPE extends StObject {
    
    var default: default_ = js.native
    
    var circle: typings.baseui.baseuiStrings.circle = js.native
    
    var pill: typings.baseui.baseuiStrings.pill = js.native
    
    var round: typings.baseui.baseuiStrings.round = js.native
    
    var square: typings.baseui.baseuiStrings.square = js.native
  }
  object SHAPE {
    
    @JSImport("baseui/button", "SHAPE")
    @js.native
    val ^ : SHAPE = js.native
    
    @scala.inline
    implicit class SHAPEMutableBuilder[Self <: SHAPE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: circle): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPill(value: pill): Self = StObject.set(x, "pill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRound(value: round): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSquare(value: square): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SIZE extends StObject {
    
    var default: default_ = js.native
    
    var compact: typings.baseui.baseuiStrings.compact = js.native
    
    var large: large_ = js.native
    
    var mini: typings.baseui.baseuiStrings.mini = js.native
  }
  object SIZE {
    
    @JSImport("baseui/button", "SIZE")
    @js.native
    val ^ : SIZE = js.native
    
    @scala.inline
    implicit class SIZEMutableBuilder[Self <: SIZE] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompact(value: compact): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefault(value: default_): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLarge(value: large_): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMini(value: mini): Self = StObject.set(x, "mini", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("baseui/button", "StyledBaseButton")
  @js.native
  val StyledBaseButton: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/button", "StyledEndEnhancer")
  @js.native
  val StyledEndEnhancer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/button", "StyledLoadingSpinner")
  @js.native
  val StyledLoadingSpinner: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/button", "StyledLoadingSpinnerContainer")
  @js.native
  val StyledLoadingSpinnerContainer: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/button", "StyledStartEnhancer")
  @js.native
  val StyledStartEnhancer: StyletronComponent[js.Any] = js.native
  
  @js.native
  trait ButtonOverrides extends StObject {
    
    var BaseButton: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var EndEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var LoadingSpinner: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var LoadingSpinnerContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var StartEnhancer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object ButtonOverrides {
    
    @scala.inline
    def apply(): ButtonOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonOverrides]
    }
    
    @scala.inline
    implicit class ButtonOverridesMutableBuilder[Self <: ButtonOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseButton(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "BaseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseButtonUndefined: Self = StObject.set(x, "BaseButton", js.undefined)
      
      @scala.inline
      def setEndEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "EndEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerUndefined: Self = StObject.set(x, "EndEnhancer", js.undefined)
      
      @scala.inline
      def setLoadingSpinner(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "LoadingSpinner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingSpinnerContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "LoadingSpinnerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingSpinnerContainerUndefined: Self = StObject.set(x, "LoadingSpinnerContainer", js.undefined)
      
      @scala.inline
      def setLoadingSpinnerUndefined: Self = StObject.set(x, "LoadingSpinner", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setStartEnhancer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "StartEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerUndefined: Self = StObject.set(x, "StartEnhancer", js.undefined)
    }
  }
  
  @js.native
  trait ButtonProps extends StyletronComponentInjectedProps[ButtonProps] {
    
    var children: js.UndefOr[ReactNode] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var endEnhancer: js.UndefOr[ReactNode] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var isLoading: js.UndefOr[Boolean] = js.native
    
    var isSelected: js.UndefOr[Boolean] = js.native
    
    var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], _]] = js.native
    
    var overrides: js.UndefOr[ButtonOverrides] = js.native
    
    var shape: js.UndefOr[pill | default_ | square | round | circle] = js.native
    
    var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
    
    var startEnhancer: js.UndefOr[ReactNode] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[submit | reset | button] = js.native
  }
  object ButtonProps {
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEndEnhancer(value: ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setKind(value: primary | secondary | tertiary | minimal): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverrides(value: ButtonOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setShape(value: pill | default_ | square | round | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: compact | default_ | large_ | mini): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStartEnhancer(value: ReactNode): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
