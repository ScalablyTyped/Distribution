package typings.baseui.accordionMod

import typings.baseui.anon.ExpandedBoolean
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.std.Event
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedPanelProps extends StObject {
  
  var children: ReactNode
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[Key] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* args */ ExpandedBoolean, js.Any]] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* e */ Event, js.Any]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* e */ KeyboardEvent, js.Any]] = js.undefined
  
  var overrides: js.UndefOr[PanelOverrides[SharedProps]] = js.undefined
  
  var renderAll: js.UndefOr[Boolean] = js.undefined
  
  var renderPanelContent: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object SharedPanelProps {
  
  @scala.inline
  def apply(): SharedPanelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedPanelProps]
  }
  
  @scala.inline
  implicit class SharedPanelPropsMutableBuilder[Self <: SharedPanelProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* args */ ExpandedBoolean => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* e */ Event => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* e */ KeyboardEvent => js.Any): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    @scala.inline
    def setOverrides(value: PanelOverrides[SharedProps]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setRenderAll(value: Boolean): Self = StObject.set(x, "renderAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderAllUndefined: Self = StObject.set(x, "renderAll", js.undefined)
    
    @scala.inline
    def setRenderPanelContent(value: Boolean): Self = StObject.set(x, "renderPanelContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderPanelContentUndefined: Self = StObject.set(x, "renderPanelContent", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
