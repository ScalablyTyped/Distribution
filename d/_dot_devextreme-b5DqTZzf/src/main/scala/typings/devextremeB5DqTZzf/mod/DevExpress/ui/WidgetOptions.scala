package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.DOMComponentOptions
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WidgetOptions[TComponent]
  extends StObject
     with DOMComponentOptions[TComponent] {
  
  /**
    * Specifies the shortcut key that sets focus on the UI component.
    */
  var accessKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the UI component changes its state as a result of user interaction.
    */
  var activeStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the UI component responds to user interaction.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the UI component can be focused using keyboard navigation.
    */
  var focusStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies text for a hint that appears when a user pauses on the UI component.
    */
  var hint: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the UI component changes its state when a user pauses on it.
    */
  var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that is executed when the UI component&apos;s content is ready and each time the content is changed.
    */
  var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * Specifies the number of the element when the Tab key is used for navigating.
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether the UI component is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WidgetOptions {
  
  inline def apply[TComponent](): WidgetOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WidgetOptions[TComponent]]
  }
  
  extension [Self <: WidgetOptions[?], TComponent](x: Self & WidgetOptions[TComponent]) {
    
    inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
    
    inline def setActiveStateEnabled(value: Boolean): Self = StObject.set(x, "activeStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setActiveStateEnabledUndefined: Self = StObject.set(x, "activeStateEnabled", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFocusStateEnabled(value: Boolean): Self = StObject.set(x, "focusStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setFocusStateEnabledUndefined: Self = StObject.set(x, "focusStateEnabled", js.undefined)
    
    inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
    
    inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
    
    inline def setHoverStateEnabled(value: Boolean): Self = StObject.set(x, "hoverStateEnabled", value.asInstanceOf[js.Any])
    
    inline def setHoverStateEnabledUndefined: Self = StObject.set(x, "hoverStateEnabled", js.undefined)
    
    inline def setOnContentReady(value: /* e */ EventInfo[TComponent] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
    
    inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
