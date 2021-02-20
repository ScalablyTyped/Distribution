package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait eventInfo extends StObject {
  
  def cancel(): Unit = js.native
  
  var data: js.Any = js.native
  
  var editor: typings.ckeditor.CKEDITOR.editor = js.native
  
  var listenerData: js.Any = js.native
  
  var name: String = js.native
  
  def removeListener(): Unit = js.native
  
  var sender: StringDictionary[js.Any] = js.native
  
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
  implicit class eventInfoMutableBuilder[Self <: eventInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerData(value: js.Any): Self = StObject.set(x, "listenerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveListener(value: () => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSender(value: StringDictionary[js.Any]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
