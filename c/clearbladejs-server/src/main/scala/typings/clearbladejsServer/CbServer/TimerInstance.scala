package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerInstance extends StObject {
  
  def Delete(callback: CbCallback): Unit
  
  def Update(options: js.Object, callback: CbCallback): Unit
  
  var name: String
  
  var systemKey: String
}
object TimerInstance {
  
  inline def apply(
    Delete: CbCallback => Unit,
    Update: (js.Object, CbCallback) => Unit,
    name: String,
    systemKey: String
  ): TimerInstance = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction1(Delete), Update = js.Any.fromFunction2(Update), name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerInstance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimerInstance] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: CbCallback => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction2(value))
  }
}
