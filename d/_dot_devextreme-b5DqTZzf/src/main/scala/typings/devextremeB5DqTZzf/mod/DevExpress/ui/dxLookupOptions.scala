package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.nextButton
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.scrollBottom
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxLookup.PageLoadingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxLookup.PullRefreshEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxLookup.ScrollEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxLookup.ValueChangedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPopover.Properties
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxLookupOptions
  extends StObject
     with dxDropDownListOptions[dxLookup] {
  
  /**
    * The text displayed on the Apply button.
    */
  var applyButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * The text displayed on the Cancel button.
    */
  var cancelButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the UI component cleans the search box when the popup window is displayed.
    */
  var cleanSearchOnOpening: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text displayed on the Clear button.
    */
  var clearButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to vertically align the drop-down menu so that the selected item is in its center. Applies only in Material Design themes.
    */
  var dropDownCentered: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the drop-down field.
    */
  @JSName("dropDownOptions")
  var dropDownOptions_dxLookupOptions: js.UndefOr[Properties] = js.undefined
  
  /**
    * Specifies a custom template for the input field.
    */
  var fieldTemplate: js.UndefOr[
    template | (js.Function2[
      /* selectedItem */ Any, 
      /* fieldElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * A Boolean value specifying whether or not to display the lookup in full-screen mode.
    * @deprecated Use the dropDownOptions option instead.
    */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text displayed on the button used to load the next page from the data source.
    */
  var nextButtonText: js.UndefOr[String] = js.undefined
  
  /**
    * A function that is executed before the next page is loaded.
    */
  var onPageLoading: js.UndefOr[js.Function1[/* e */ PageLoadingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when the &apos;pull to refresh&apos; gesture is performed on the drop-down item list. Supported on mobile devices only.
    */
  var onPullRefresh: js.UndefOr[js.Function1[/* e */ PullRefreshEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed on each scroll gesture performed on the drop-down item list.
    */
  var onScroll: js.UndefOr[js.Function1[/* e */ ScrollEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after the UI component&apos;s value is changed.
    */
  @JSName("onValueChanged")
  var onValueChanged_dxLookupOptions: js.UndefOr[js.Function1[/* e */ ValueChangedEvent, Unit]] = js.undefined
  
  /**
    * Specifies whether the next page is loaded when a user scrolls the UI component to the bottom or when the &apos;next&apos; button is clicked.
    */
  var pageLoadMode: js.UndefOr[nextButton | scrollBottom] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel, which is displayed when the UI component is scrolled to the bottom.
    */
  var pageLoadingText: js.UndefOr[String] = js.undefined
  
  /**
    * A Boolean value specifying whether or not the UI component supports the &apos;pull down to refresh&apos; gesture.
    */
  var pullRefreshEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the text displayed in the pullDown panel when the UI component is pulled below the refresh threshold.
    */
  var pulledDownText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text shown in the pullDown panel while the list is being pulled down to the refresh threshold.
    */
  var pullingDownText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the text displayed in the pullDown panel while the UI component is being refreshed.
    */
  var refreshingText: js.UndefOr[String] = js.undefined
  
  /**
    * The text that is provided as a hint in the lookup&apos;s search bar.
    */
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to display the Cancel button in the lookup window.
    */
  var showCancelButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether or not the UI component uses native scrolling.
    */
  var useNativeScrolling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show lookup contents in the Popover UI component.
    */
  var usePopover: js.UndefOr[Boolean] = js.undefined
}
object dxLookupOptions {
  
  inline def apply(): dxLookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLookupOptions]
  }
  
  extension [Self <: dxLookupOptions](x: Self) {
    
    inline def setApplyButtonText(value: String): Self = StObject.set(x, "applyButtonText", value.asInstanceOf[js.Any])
    
    inline def setApplyButtonTextUndefined: Self = StObject.set(x, "applyButtonText", js.undefined)
    
    inline def setCancelButtonText(value: String): Self = StObject.set(x, "cancelButtonText", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonTextUndefined: Self = StObject.set(x, "cancelButtonText", js.undefined)
    
    inline def setCleanSearchOnOpening(value: Boolean): Self = StObject.set(x, "cleanSearchOnOpening", value.asInstanceOf[js.Any])
    
    inline def setCleanSearchOnOpeningUndefined: Self = StObject.set(x, "cleanSearchOnOpening", js.undefined)
    
    inline def setClearButtonText(value: String): Self = StObject.set(x, "clearButtonText", value.asInstanceOf[js.Any])
    
    inline def setClearButtonTextUndefined: Self = StObject.set(x, "clearButtonText", js.undefined)
    
    inline def setDropDownCentered(value: Boolean): Self = StObject.set(x, "dropDownCentered", value.asInstanceOf[js.Any])
    
    inline def setDropDownCenteredUndefined: Self = StObject.set(x, "dropDownCentered", js.undefined)
    
    inline def setDropDownOptions(value: Properties): Self = StObject.set(x, "dropDownOptions", value.asInstanceOf[js.Any])
    
    inline def setDropDownOptionsUndefined: Self = StObject.set(x, "dropDownOptions", js.undefined)
    
    inline def setFieldTemplate(
      value: template | (js.Function2[
          /* selectedItem */ Any, 
          /* fieldElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "fieldTemplate", value.asInstanceOf[js.Any])
    
    inline def setFieldTemplateFunction2(
      value: (/* selectedItem */ Any, /* fieldElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "fieldTemplate", js.Any.fromFunction2(value))
    
    inline def setFieldTemplateUndefined: Self = StObject.set(x, "fieldTemplate", js.undefined)
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    inline def setNextButtonText(value: String): Self = StObject.set(x, "nextButtonText", value.asInstanceOf[js.Any])
    
    inline def setNextButtonTextUndefined: Self = StObject.set(x, "nextButtonText", js.undefined)
    
    inline def setOnPageLoading(value: /* e */ PageLoadingEvent => Unit): Self = StObject.set(x, "onPageLoading", js.Any.fromFunction1(value))
    
    inline def setOnPageLoadingUndefined: Self = StObject.set(x, "onPageLoading", js.undefined)
    
    inline def setOnPullRefresh(value: /* e */ PullRefreshEvent => Unit): Self = StObject.set(x, "onPullRefresh", js.Any.fromFunction1(value))
    
    inline def setOnPullRefreshUndefined: Self = StObject.set(x, "onPullRefresh", js.undefined)
    
    inline def setOnScroll(value: /* e */ ScrollEvent => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
    
    inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ ValueChangedEvent => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setPageLoadMode(value: nextButton | scrollBottom): Self = StObject.set(x, "pageLoadMode", value.asInstanceOf[js.Any])
    
    inline def setPageLoadModeUndefined: Self = StObject.set(x, "pageLoadMode", js.undefined)
    
    inline def setPageLoadingText(value: String): Self = StObject.set(x, "pageLoadingText", value.asInstanceOf[js.Any])
    
    inline def setPageLoadingTextUndefined: Self = StObject.set(x, "pageLoadingText", js.undefined)
    
    inline def setPullRefreshEnabled(value: Boolean): Self = StObject.set(x, "pullRefreshEnabled", value.asInstanceOf[js.Any])
    
    inline def setPullRefreshEnabledUndefined: Self = StObject.set(x, "pullRefreshEnabled", js.undefined)
    
    inline def setPulledDownText(value: String): Self = StObject.set(x, "pulledDownText", value.asInstanceOf[js.Any])
    
    inline def setPulledDownTextUndefined: Self = StObject.set(x, "pulledDownText", js.undefined)
    
    inline def setPullingDownText(value: String): Self = StObject.set(x, "pullingDownText", value.asInstanceOf[js.Any])
    
    inline def setPullingDownTextUndefined: Self = StObject.set(x, "pullingDownText", js.undefined)
    
    inline def setRefreshingText(value: String): Self = StObject.set(x, "refreshingText", value.asInstanceOf[js.Any])
    
    inline def setRefreshingTextUndefined: Self = StObject.set(x, "refreshingText", js.undefined)
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    inline def setShowCancelButton(value: Boolean): Self = StObject.set(x, "showCancelButton", value.asInstanceOf[js.Any])
    
    inline def setShowCancelButtonUndefined: Self = StObject.set(x, "showCancelButton", js.undefined)
    
    inline def setUseNativeScrolling(value: Boolean): Self = StObject.set(x, "useNativeScrolling", value.asInstanceOf[js.Any])
    
    inline def setUseNativeScrollingUndefined: Self = StObject.set(x, "useNativeScrolling", js.undefined)
    
    inline def setUsePopover(value: Boolean): Self = StObject.set(x, "usePopover", value.asInstanceOf[js.Any])
    
    inline def setUsePopoverUndefined: Self = StObject.set(x, "usePopover", js.undefined)
  }
}
