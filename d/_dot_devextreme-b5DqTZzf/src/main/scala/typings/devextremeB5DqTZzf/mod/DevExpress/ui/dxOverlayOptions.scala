package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.events.Cancelable
import typings.devextremeB5DqTZzf.mod.DevExpress.events.DxEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.events.EventInfo
import typings.std.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxOverlayOptions[TComponent]
  extends StObject
     with WidgetOptions[TComponent] {
  
  /**
    * Configures UI component visibility animations. This object contains two fields: show and hide.
    */
  var animation: js.UndefOr[dxOverlayAnimation] = js.undefined
  
  /**
    * Specifies whether to close the UI component if a user clicks outside it.
    */
  var closeOnOutsideClick: js.UndefOr[
    Boolean | (js.Function1[/* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent], Boolean])
  ] = js.undefined
  
  /**
    * Specifies a custom template for the UI component content.
    */
  var contentTemplate: js.UndefOr[
    template | (js.Function1[/* contentElement */ DxElement_[HTMLElement], String | UserDefinedElement[Element]])
  ] = js.undefined
  
  /**
    * Copies your custom CSS classes from the root element to the wrapper element.
    * @deprecated Use the wrapperAttr property instead.
    */
  var copyRootClassesToWrapper: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to render the UI component&apos;s content when it is displayed. If false, the content is rendered immediately.
    */
  var deferRendering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies an element with boundaries within which users can drag and resize the widget. Ignored if the dragOutsideBoundary property is set to true.
    */
  var dragAndResizeArea: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
  
  /**
    * Specifies whether or not an end-user can drag the UI component.
    */
  var dragEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows users to drag the widget within the browser window or beyond the window&apos;s borders.
    */
  var dragOutsideBoundary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the global attributes to be attached to the UI component&apos;s container element.
    * @deprecated Use the wrapperAttr option instead.
    */
  @JSName("elementAttr")
  var elementAttr_dxOverlayOptions: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies whether to hide the widget when users scroll one of its parent elements.
    */
  var hideOnParentScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the maximum height the UI component can reach while resizing.
    */
  var maxHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  /**
    * Specifies the maximum width the UI component can reach while resizing.
    */
  var maxWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  /**
    * Specifies the minimum height the UI component can reach while resizing.
    */
  var minHeight: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  /**
    * Specifies the minimum width the UI component can reach while resizing.
    */
  var minWidth: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
  
  /**
    * A function that is executed after the UI component is hidden.
    */
  var onHidden: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed before the UI component is hidden.
    */
  var onHiding: js.UndefOr[js.Function1[/* e */ Cancelable & EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed before the UI component is displayed.
    */
  var onShowing: js.UndefOr[js.Function1[/* e */ Cancelable & EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * A function that is executed after the UI component is displayed.
    */
  var onShown: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent], Unit]] = js.undefined
  
  /**
    * Positions the UI component.
    */
  var position: js.UndefOr[Any] = js.undefined
  
  /**
    * Specifies whether to shade the background when the UI component is active.
    */
  var shading: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the shading color. Applies only if shading is enabled.
    */
  var shadingColor: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the global attributes for the UI component&apos;s wrapper element.
    */
  var wrapperAttr: js.UndefOr[Any] = js.undefined
}
object dxOverlayOptions {
  
  inline def apply[TComponent](): dxOverlayOptions[TComponent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxOverlayOptions[TComponent]]
  }
  
  extension [Self <: dxOverlayOptions[?], TComponent](x: Self & dxOverlayOptions[TComponent]) {
    
    inline def setAnimation(value: dxOverlayAnimation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setCloseOnOutsideClick(
      value: Boolean | (js.Function1[/* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent], Boolean])
    ): Self = StObject.set(x, "closeOnOutsideClick", value.asInstanceOf[js.Any])
    
    inline def setCloseOnOutsideClickFunction1(value: /* event */ DxEvent[MouseEvent | PointerEvent | TouchEvent] => Boolean): Self = StObject.set(x, "closeOnOutsideClick", js.Any.fromFunction1(value))
    
    inline def setCloseOnOutsideClickUndefined: Self = StObject.set(x, "closeOnOutsideClick", js.undefined)
    
    inline def setContentTemplate(
      value: template | (js.Function1[/* contentElement */ DxElement_[HTMLElement], String | UserDefinedElement[Element]])
    ): Self = StObject.set(x, "contentTemplate", value.asInstanceOf[js.Any])
    
    inline def setContentTemplateFunction1(value: /* contentElement */ DxElement_[HTMLElement] => String | UserDefinedElement[Element]): Self = StObject.set(x, "contentTemplate", js.Any.fromFunction1(value))
    
    inline def setContentTemplateUndefined: Self = StObject.set(x, "contentTemplate", js.undefined)
    
    inline def setCopyRootClassesToWrapper(value: Boolean): Self = StObject.set(x, "copyRootClassesToWrapper", value.asInstanceOf[js.Any])
    
    inline def setCopyRootClassesToWrapperUndefined: Self = StObject.set(x, "copyRootClassesToWrapper", js.undefined)
    
    inline def setDeferRendering(value: Boolean): Self = StObject.set(x, "deferRendering", value.asInstanceOf[js.Any])
    
    inline def setDeferRenderingUndefined: Self = StObject.set(x, "deferRendering", js.undefined)
    
    inline def setDragAndResizeArea(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "dragAndResizeArea", value.asInstanceOf[js.Any])
    
    inline def setDragAndResizeAreaUndefined: Self = StObject.set(x, "dragAndResizeArea", js.undefined)
    
    inline def setDragEnabled(value: Boolean): Self = StObject.set(x, "dragEnabled", value.asInstanceOf[js.Any])
    
    inline def setDragEnabledUndefined: Self = StObject.set(x, "dragEnabled", js.undefined)
    
    inline def setDragOutsideBoundary(value: Boolean): Self = StObject.set(x, "dragOutsideBoundary", value.asInstanceOf[js.Any])
    
    inline def setDragOutsideBoundaryUndefined: Self = StObject.set(x, "dragOutsideBoundary", js.undefined)
    
    inline def setElementAttr(value: Any): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
    
    inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
    
    inline def setHideOnParentScroll(value: Boolean): Self = StObject.set(x, "hideOnParentScroll", value.asInstanceOf[js.Any])
    
    inline def setHideOnParentScrollUndefined: Self = StObject.set(x, "hideOnParentScroll", js.undefined)
    
    inline def setMaxHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightFunction0(value: () => Double | String): Self = StObject.set(x, "maxHeight", js.Any.fromFunction0(value))
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthFunction0(value: () => Double | String): Self = StObject.set(x, "maxWidth", js.Any.fromFunction0(value))
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightFunction0(value: () => Double | String): Self = StObject.set(x, "minHeight", js.Any.fromFunction0(value))
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthFunction0(value: () => Double | String): Self = StObject.set(x, "minWidth", js.Any.fromFunction0(value))
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setOnHidden(value: /* e */ EventInfo[TComponent] => Unit): Self = StObject.set(x, "onHidden", js.Any.fromFunction1(value))
    
    inline def setOnHiddenUndefined: Self = StObject.set(x, "onHidden", js.undefined)
    
    inline def setOnHiding(value: /* e */ Cancelable & EventInfo[TComponent] => Unit): Self = StObject.set(x, "onHiding", js.Any.fromFunction1(value))
    
    inline def setOnHidingUndefined: Self = StObject.set(x, "onHiding", js.undefined)
    
    inline def setOnShowing(value: /* e */ Cancelable & EventInfo[TComponent] => Unit): Self = StObject.set(x, "onShowing", js.Any.fromFunction1(value))
    
    inline def setOnShowingUndefined: Self = StObject.set(x, "onShowing", js.undefined)
    
    inline def setOnShown(value: /* e */ EventInfo[TComponent] => Unit): Self = StObject.set(x, "onShown", js.Any.fromFunction1(value))
    
    inline def setOnShownUndefined: Self = StObject.set(x, "onShown", js.undefined)
    
    inline def setPosition(value: Any): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShading(value: Boolean): Self = StObject.set(x, "shading", value.asInstanceOf[js.Any])
    
    inline def setShadingColor(value: String): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
    
    inline def setShadingUndefined: Self = StObject.set(x, "shading", js.undefined)
    
    inline def setWrapperAttr(value: Any): Self = StObject.set(x, "wrapperAttr", value.asInstanceOf[js.Any])
    
    inline def setWrapperAttrUndefined: Self = StObject.set(x, "wrapperAttr", js.undefined)
  }
}
