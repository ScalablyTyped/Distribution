package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`0`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`1`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`2`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`3`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`4`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`5`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`6`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.century
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.decade
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.month
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.year
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxCalendar.CellTemplateData
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxCalendar.DisabledDate
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxCalendarOptions
  extends StObject
     with EditorOptions[dxCalendar] {
  
  /**
    * Specifies a custom template for calendar cells.
    */
  var cellTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ CellTemplateData, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Specifies the date-time value serialization format. Use it only if you do not specify the value at design time.
    */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies dates that users cannot select.
    */
  var disabledDates: js.UndefOr[js.Array[js.Date] | (js.Function1[/* data */ DisabledDate, Boolean])] = js.undefined
  
  /**
    * Specifies the first day of a week.
    */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  
  /**
    * The latest date the UI component allows to select.
    */
  var max: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the maximum zoom level of the calendar.
    */
  var maxZoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
  
  /**
    * The earliest date the UI component allows to select.
    */
  var min: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the minimum zoom level of the calendar.
    */
  var minZoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
  
  /**
    * The value to be assigned to the `name` attribute of the underlying HTML element.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether or not the UI component displays a button that selects the current date.
    */
  var showTodayButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object or a value specifying the date and time currently selected in the calendar.
    */
  @JSName("value")
  var value_dxCalendarOptions: js.UndefOr[js.Date | Double | String] = js.undefined
  
  /**
    * Specifies the current calendar zoom level.
    */
  var zoomLevel: js.UndefOr[century | decade | month | year] = js.undefined
}
object dxCalendarOptions {
  
  inline def apply(): dxCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCalendarOptions]
  }
  
  extension [Self <: dxCalendarOptions](x: Self) {
    
    inline def setCellTemplate(
      value: template | (js.Function3[
          /* itemData */ CellTemplateData, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
    
    inline def setCellTemplateFunction3(
      value: (/* itemData */ CellTemplateData, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "cellTemplate", js.Any.fromFunction3(value))
    
    inline def setCellTemplateUndefined: Self = StObject.set(x, "cellTemplate", js.undefined)
    
    inline def setDateSerializationFormat(value: String): Self = StObject.set(x, "dateSerializationFormat", value.asInstanceOf[js.Any])
    
    inline def setDateSerializationFormatUndefined: Self = StObject.set(x, "dateSerializationFormat", js.undefined)
    
    inline def setDisabledDates(value: js.Array[js.Date] | (js.Function1[/* data */ DisabledDate, Boolean])): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
    
    inline def setDisabledDatesFunction1(value: /* data */ DisabledDate => Boolean): Self = StObject.set(x, "disabledDates", js.Any.fromFunction1(value))
    
    inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
    
    inline def setDisabledDatesVarargs(value: js.Date*): Self = StObject.set(x, "disabledDates", js.Array(value*))
    
    inline def setFirstDayOfWeek(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setFirstDayOfWeekUndefined: Self = StObject.set(x, "firstDayOfWeek", js.undefined)
    
    inline def setMax(value: js.Date | Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMaxZoomLevel(value: century | decade | month | year): Self = StObject.set(x, "maxZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomLevelUndefined: Self = StObject.set(x, "maxZoomLevel", js.undefined)
    
    inline def setMin(value: js.Date | Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinZoomLevel(value: century | decade | month | year): Self = StObject.set(x, "minZoomLevel", value.asInstanceOf[js.Any])
    
    inline def setMinZoomLevelUndefined: Self = StObject.set(x, "minZoomLevel", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
    
    inline def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
    
    inline def setValue(value: js.Date | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setZoomLevel(value: century | decade | month | year): Self = StObject.set(x, "zoomLevel", value.asInstanceOf[js.Any])
    
    inline def setZoomLevelUndefined: Self = StObject.set(x, "zoomLevel", js.undefined)
  }
}
