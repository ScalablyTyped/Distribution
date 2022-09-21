package typings.bootstrapDatepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def datepicker(): JQuery = js.native
  def datepicker(methodName: String): Any = js.native
  def datepicker(methodName: String, params: Any): Any = js.native
  def datepicker(options: DatepickerOptions): JQuery = js.native
  
  def off(events: DatepickerEvents): JQuery = js.native
  def off(events: DatepickerEvents, handler: js.Function1[/* eventObject */ DatepickerEventObject, Any]): JQuery = js.native
  def off(events: DatepickerEvents, selector: String): JQuery = js.native
  def off(
    events: DatepickerEvents,
    selector: String,
    handler: js.Function1[/* eventObject */ DatepickerEventObject, Any]
  ): JQuery = js.native
  def off(
    events: DatepickerEvents,
    selector: Unit,
    handler: js.Function1[/* eventObject */ DatepickerEventObject, Any]
  ): JQuery = js.native
  
  def on(events: DatepickerEvents, handler: js.Function1[/* eventObject */ DatepickerEventObject, Any]): JQuery = js.native
  def on(events: DatepickerEvents, selector: String, data: Any): JQuery = js.native
  def on(
    events: DatepickerEvents,
    selector: String,
    data: Any,
    handler: js.Function1[/* eventObject */ DatepickerEventObject, Any]
  ): JQuery = js.native
  def on(
    events: DatepickerEvents,
    selector: String,
    handler: js.Function1[/* eventObject */ DatepickerEventObject, Any]
  ): JQuery = js.native
}
