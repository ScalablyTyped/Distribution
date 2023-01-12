package typings.ckeditor4.CKEDITOR

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait eventInfo extends StObject {
  
  def cancel(): Unit
  
  var data: Any
  
  var editor: typings.ckeditor4.CKEDITOR.editor
  
  var listenerData: Any
  
  var name: String
  
  def removeListener(): Unit
  
  var sender: StringDictionary[Any]
  
  def stop(): Unit
}
object eventInfo {
  
  inline def apply(
    cancel: () => Unit,
    data: Any,
    editor: editor,
    listenerData: Any,
    name: String,
    removeListener: () => Unit,
    sender: StringDictionary[Any],
    stop: () => Unit
  ): eventInfo = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), data = data.asInstanceOf[js.Any], editor = editor.asInstanceOf[js.Any], listenerData = listenerData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removeListener = js.Any.fromFunction0(removeListener), sender = sender.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[eventInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: eventInfo] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditor(value: editor): Self = StObject.set(x, "editor", value.asInstanceOf[js.Any])
    
    inline def setListenerData(value: Any): Self = StObject.set(x, "listenerData", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemoveListener(value: () => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction0(value))
    
    inline def setSender(value: StringDictionary[Any]): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
