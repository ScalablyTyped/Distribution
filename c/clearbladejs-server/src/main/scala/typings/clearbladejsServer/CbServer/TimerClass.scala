package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerClass extends StObject {
  
  def Create(name: String, options: TimerCreateOptions, callback: CbCallback): Unit
  
  def Fetch(name: String, callback: CbCallback): Unit
}
object TimerClass {
  
  @scala.inline
  def apply(Create: (String, TimerCreateOptions, CbCallback) => Unit, Fetch: (String, CbCallback) => Unit): TimerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3(Create), Fetch = js.Any.fromFunction2(Fetch))
    __obj.asInstanceOf[TimerClass]
  }
  
  @scala.inline
  implicit class TimerClassMutableBuilder[Self <: TimerClass] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: (String, TimerCreateOptions, CbCallback) => Unit): Self = StObject.set(x, "Create", js.Any.fromFunction3(value))
    
    @scala.inline
    def setFetch(value: (String, CbCallback) => Unit): Self = StObject.set(x, "Fetch", js.Any.fromFunction2(value))
  }
}
