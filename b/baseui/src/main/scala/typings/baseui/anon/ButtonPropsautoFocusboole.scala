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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/button.ButtonProps & {  autoFocus :boolean | undefined} */
@js.native
trait ButtonPropsautoFocusboole extends StObject {
  
  @JSName("$as")
  var $as: js.UndefOr[StyletronBase] = js.native
  
  @JSName("$style")
  var $style: js.UndefOr[StyleProp[ButtonProps]] = js.native
  
  var autoFocus: js.UndefOr[Boolean] = js.native
  
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
object ButtonPropsautoFocusboole {
  
  @scala.inline
  def apply(): ButtonPropsautoFocusboole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonPropsautoFocusboole]
  }
  
  @scala.inline
  implicit class ButtonPropsautoFocusbooleMutableBuilder[Self <: ButtonPropsautoFocusboole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$as(value: StyletronBase): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
    
    @scala.inline
    def set$style(value: StyleProp[ButtonProps]): Self = StObject.set(x, "$style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$styleFunction1(value: ButtonProps => StyleObject): Self = StObject.set(x, "$style", js.Any.fromFunction1(value))
    
    @scala.inline
    def set$styleUndefined: Self = StObject.set(x, "$style", js.undefined)
    
    @scala.inline
    def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
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
