package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait eventInfo extends js.Object {
  var data: js.Any
  var editor: typings.ckeditor.CKEDITOR.editor
  var listenerData: js.Any
  var name: String
  var sender: StringDictionary[js.Any]
  def cancel(): Unit
  def removeListener(): Unit
  def stop(): Unit
}

object eventInfo {
  @scala.inline
  def apply(
    cancel: () => Unit,
    data: js.Any,
    editor: editor,
    listenerData: js.Any,
    name: String,
    removeListener: () => Unit,
    sender: StringDictionary[js.Any],
    stop: () => Unit
  ): eventInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), data = data.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], listenerData = listenerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeListener = js.Any.fromFunction0(removeListener), sender = sender.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[eventInfo]
  }
}

