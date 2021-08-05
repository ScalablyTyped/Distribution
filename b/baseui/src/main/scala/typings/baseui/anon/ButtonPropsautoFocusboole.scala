package typings.baseui.anon

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
import typings.baseui.buttonMod.ButtonOverrides
import typings.baseui.buttonMod.ButtonProps
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.styletronReact.mod.StyleProp
import typings.styletronReact.mod.StyletronBase
import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/button.ButtonProps & {  autoFocus :boolean | undefined} */
trait ButtonPropsautoFocusboole extends StObject {
  
  @JSName("$as")
  var $as: js.UndefOr[StyletronBase] = js.undefined
  
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[ButtonProps]] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var endEnhancer: js.UndefOr[ReactNode] = js.undefined
  
  var href: js.UndefOr[String] = js.undefined
  
  var isLoading: js.UndefOr[Boolean] = js.undefined
  
  var isSelected: js.UndefOr[Boolean] = js.undefined
  
  var kind: js.UndefOr[primary | secondary | tertiary | minimal] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function1[/* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent], js.Any]
  ] = js.undefined
  
  var overrides: js.UndefOr[ButtonOverrides] = js.undefined
  
  var shape: js.UndefOr[pill | default_ | square | round | circle] = js.undefined
  
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.undefined
  
  var startEnhancer: js.UndefOr[ReactNode] = js.undefined
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[submit | reset | button] = js.undefined
}
object ButtonPropsautoFocusboole {
  
  inline def apply(): ButtonPropsautoFocusboole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonPropsautoFocusboole]
  }
  
  extension [Self <: ButtonPropsautoFocusboole](x: Self) {
    
    inline def set$as(value: StyletronBase): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
    
    inline def set$style(value: StyleProp[ButtonProps]): Self = StObject.set(x, "$style", value.asInstanceOf[js.Any])
    
    inline def set$styleFunction1(value: ButtonProps => StyleObject): Self = StObject.set(x, "$style", js.Any.fromFunction1(value))
    
    inline def set$styleUndefined: Self = StObject.set(x, "$style", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEndEnhancer(value: ReactNode): Self = StObject.set(x, "endEnhancer", value.asInstanceOf[js.Any])
    
    inline def setEndEnhancerUndefined: Self = StObject.set(x, "endEnhancer", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
    
    inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    
    inline def setKind(value: primary | secondary | tertiary | minimal): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setOnClick(value: /* event */ MouseEvent[HTMLButtonElement, NativeMouseEvent] => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOverrides(value: ButtonOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setShape(value: pill | default_ | square | round | circle): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSize(value: compact | default_ | large_ | mini): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStartEnhancer(value: ReactNode): Self = StObject.set(x, "startEnhancer", value.asInstanceOf[js.Any])
    
    inline def setStartEnhancerUndefined: Self = StObject.set(x, "startEnhancer", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
