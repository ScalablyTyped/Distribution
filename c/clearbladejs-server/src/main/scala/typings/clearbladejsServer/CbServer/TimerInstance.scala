package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimerInstance extends StObject {
  
  def Delete(callback: CbCallback): Unit = js.native
  
  def Update(options: js.Object, callback: CbCallback): Unit = js.native
  
  var name: String = js.native
  
  var systemKey: String = js.native
}
object TimerInstance {
  
  @scala.inline
  def apply(
    Delete: CbCallback => Unit,
    Update: (js.Object, CbCallback) => Unit,
    name: String,
    systemKey: String
  ): TimerInstance = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction1(Delete), Update = js.Any.fromFunction2(Update), name = name.asInstanceOf[js.Any], systemKey = systemKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerInstance]
  }
  
  @scala.inline
  implicit class TimerInstanceMutableBuilder[Self <: TimerInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: CbCallback => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSystemKey(value: String): Self = StObject.set(x, "systemKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: (js.Object, CbCallback) => Unit): Self = StObject.set(x, "Update", js.Any.fromFunction2(value))
  }
}
