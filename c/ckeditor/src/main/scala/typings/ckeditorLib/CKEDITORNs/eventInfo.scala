package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait eventInfo extends js.Object {
  var data: js.Any
  var editor: editor
  var listenerData: js.Any
  var name: java.lang.String
  var sender: org.scalablytyped.runtime.StringDictionary[js.Any]
  def cancel(): scala.Unit
  def removeListener(): scala.Unit
  def stop(): scala.Unit
}

object eventInfo {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit],
    data: js.Any,
    editor: editor,
    listenerData: js.Any,
    name: java.lang.String,
    removeListener: js.Function0[scala.Unit],
    sender: org.scalablytyped.runtime.StringDictionary[js.Any],
    stop: js.Function0[scala.Unit]
  ): eventInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("editor")(editor)
    __obj.updateDynamic("listenerData")(listenerData)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[eventInfo]
  }
}

