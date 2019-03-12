package typings
package ckeditorLib.CKEDITORNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait eventInfo extends js.Object {
  var data: js.Any
  var editor: ckeditorLib.CKEDITORNs.editor
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
    cancel: () => scala.Unit,
    data: js.Any,
    editor: editor,
    listenerData: js.Any,
    name: java.lang.String,
    removeListener: () => scala.Unit,
    sender: org.scalablytyped.runtime.StringDictionary[js.Any],
    stop: () => scala.Unit
  ): eventInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), data = data, editor = editor, listenerData = listenerData, name = name, removeListener = js.Any.fromFunction0(removeListener), sender = sender, stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[eventInfo]
  }
}

