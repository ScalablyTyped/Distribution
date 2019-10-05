package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CKEDITOR.on")
@js.native
object on extends js.Object {
  def apply(eventName: String, listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit]): Unit = js.native
  def apply(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any]
  ): Unit = js.native
  def apply(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: StringDictionary[js.Any]
  ): Unit = js.native
  def apply(
    eventName: String,
    listenerFunction: js.Function1[/* eventInfo */ eventInfo, Unit],
    scopeObj: StringDictionary[js.Any],
    listenerData: StringDictionary[js.Any],
    priority: Double
  ): Unit = js.native
}

