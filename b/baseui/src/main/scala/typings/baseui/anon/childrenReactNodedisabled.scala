package typings.baseui.anon

import typings.baseui.accordionTypesMod.OnChangeHandler
import typings.baseui.accordionTypesMod.PanelOverrides
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  children :react.react.ReactNode,   disabled :boolean | undefined,   aria-controls :string | undefined,   key :react.react.Key | undefined,   onChange :baseui.baseui/accordion/types.OnChangeHandler | undefined,   onClick :(e : std.Event): unknown | undefined,   onKeyDown :(e : std.KeyboardEvent): unknown | undefined,   overrides :baseui.baseui/accordion/types.PanelOverrides | undefined,   title :react.react.ReactNode | undefined,   renderPanelContent :boolean | undefined,   renderAll :boolean | undefined,   expanded :boolean | undefined} & react.react.RefAttributes<std.HTMLElement> */
trait childrenReactNodedisabled extends StObject {
  
  var `aria-controls`: js.UndefOr[String] = js.undefined
  
  var children: ReactNode
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[typings.react.mod.Key] = js.undefined
  
  var onChange: js.UndefOr[OnChangeHandler] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* e */ typings.std.Event, Any]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, Any]] = js.undefined
  
  var overrides: js.UndefOr[PanelOverrides] = js.undefined
  
  /**
    * Allows getting a ref to the component instance.
    * Once the component unmounts, React will set `ref.current` to `null` (or call the ref with `null` if you passed a callback ref).
    * @see https://react.dev/learn/referencing-values-with-refs#refs-and-the-dom
    */
  var ref: js.UndefOr[typings.react.mod.Ref[HTMLElement]] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object childrenReactNodedisabled {
  
  inline def apply(): childrenReactNodedisabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[childrenReactNodedisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: childrenReactNodedisabled] (val x: Self) extends AnyVal {
    
    inline def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
    
    inline def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setKey(value: typings.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnChange(value: /* a */ ExpandedBoolean => Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClick(value: /* e */ typings.std.Event => Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ KeyboardEvent => Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOverrides(value: PanelOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setRef(value: typings.react.mod.Ref[HTMLElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    inline def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    inline def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
    
    inline def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
