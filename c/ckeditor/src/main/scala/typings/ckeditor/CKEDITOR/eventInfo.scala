package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait eventInfo extends js.Object {
  var data: js.Any = js.native
  var editor: typings.ckeditor.CKEDITOR.editor = js.native
  var listenerData: js.Any = js.native
  var name: String = js.native
  var sender: StringDictionary[js.Any] = js.native
  def cancel(): Unit = js.native
  def removeListener(): Unit = js.native
  def stop(): Unit = js.native
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
  @scala.inline
  implicit class eventInfoOps[Self <: eventInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditor(value: editor): Self = this.set("editor", value.asInstanceOf[js.Any])
    @scala.inline
    def setListenerData(value: js.Any): Self = this.set("listenerData", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveListener(value: () => Unit): Self = this.set("removeListener", js.Any.fromFunction0(value))
    @scala.inline
    def setSender(value: StringDictionary[js.Any]): Self = this.set("sender", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
  }
  
}

