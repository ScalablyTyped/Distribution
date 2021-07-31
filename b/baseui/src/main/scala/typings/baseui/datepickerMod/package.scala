package typings.baseui.datepickerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def DISPLAY_FORMAT: typings.baseui.baseuiStrings.L = typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("DISPLAY_FORMAT").asInstanceOf[typings.baseui.baseuiStrings.L]

@scala.inline
def ISO_FORMAT: typings.baseui.baseuiStrings.`YYYY-MM-DD` = typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("ISO_FORMAT").asInstanceOf[typings.baseui.baseuiStrings.`YYYY-MM-DD`]

@scala.inline
def ISO_MONTH_FORMAT: typings.baseui.baseuiStrings.`YYYY-MM` = typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("ISO_MONTH_FORMAT").asInstanceOf[typings.baseui.baseuiStrings.`YYYY-MM`]

@scala.inline
def StatefulCalendar: typings.react.mod.FC[typings.baseui.anon.StatefulDatepickerPropsCa] = typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("StatefulCalendar").asInstanceOf[typings.react.mod.FC[typings.baseui.anon.StatefulDatepickerPropsCa]]

@scala.inline
def StatefulDatePicker_ : typings.react.mod.FC[typings.baseui.anon.StatefulDatepickerPropsDa] = typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("StatefulDatePicker").asInstanceOf[typings.react.mod.FC[typings.baseui.anon.StatefulDatepickerPropsDa]]

@scala.inline
def StatefulDatepicker: typings.react.mod.FC[typings.baseui.anon.StatefulDatepickerPropsDa] = typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("StatefulDatepicker").asInstanceOf[typings.react.mod.FC[typings.baseui.anon.StatefulDatepickerPropsDa]]

@scala.inline
def WEEKDAYS: js.Tuple7[
typings.baseui.baseuiNumbers.`0`, 
typings.baseui.baseuiNumbers.`1`, 
typings.baseui.baseuiNumbers.`2`, 
typings.baseui.baseuiNumbers.`3`, 
typings.baseui.baseuiNumbers.`4`, 
typings.baseui.baseuiNumbers.`5`, 
typings.baseui.baseuiNumbers.`6`] = typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].selectDynamic("WEEKDAYS").asInstanceOf[js.Tuple7[
typings.baseui.baseuiNumbers.`0`, 
typings.baseui.baseuiNumbers.`1`, 
typings.baseui.baseuiNumbers.`2`, 
typings.baseui.baseuiNumbers.`3`, 
typings.baseui.baseuiNumbers.`4`, 
typings.baseui.baseuiNumbers.`5`, 
typings.baseui.baseuiNumbers.`6`]]

@scala.inline
def formatDate(date: js.Array[typings.std.Date], formatString: java.lang.String): java.lang.String | js.Array[java.lang.String] = (typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String]]
@scala.inline
def formatDate(date: typings.std.Date, formatString: java.lang.String): java.lang.String | js.Array[java.lang.String] = (typings.baseui.datepickerMod.^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(date.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | js.Array[java.lang.String]]

type StateReducer = js.Function3[
/* stateType */ typings.baseui.baseuiStrings.mouseLeave | typings.baseui.baseuiStrings.moveRight | typings.baseui.baseuiStrings.moveDown | typings.baseui.baseuiStrings.moveUp | typings.baseui.baseuiStrings.mouseOver | typings.baseui.baseuiStrings.change_ | typings.baseui.baseuiStrings.moveLeft, 
/* nextState */ typings.baseui.datepickerMod.ContainerState, 
/* currentState */ typings.baseui.datepickerMod.ContainerState, 
typings.baseui.datepickerMod.ContainerState]

type StatefulDatepickerProps[T] = T & typings.baseui.datepickerMod.StatefulContainerProps[T] & typings.baseui.anon.Children[T]

type onChange = js.Function1[/* args */ typings.baseui.anon.Date, js.Any]
