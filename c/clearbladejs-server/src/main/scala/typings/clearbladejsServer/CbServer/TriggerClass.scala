package typings.clearbladejsServer.CbServer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerClass extends StObject {
  
  def Create(name: String, options: TriggerCreateOptions, callback: CbCallback): Unit
  
  def Fetch(name: String, callback: CbCallback): Unit
}
object TriggerClass {
  
  inline def apply(Create: (String, TriggerCreateOptions, CbCallback) => Unit, Fetch: (String, CbCallback) => Unit): TriggerClass = {
    val __obj = js.Dynamic.literal(Create = js.Any.fromFunction3(Create), Fetch = js.Any.fromFunction2(Fetch))
    __obj.asInstanceOf[TriggerClass]
  }
  
  extension [Self <: TriggerClass](x: Self) {
    
    inline def setCreate(value: (String, TriggerCreateOptions, CbCallback) => Unit): Self = StObject.set(x, "Create", js.Any.fromFunction3(value))
    
    inline def setFetch(value: (String, CbCallback) => Unit): Self = StObject.set(x, "Fetch", js.Any.fromFunction2(value))
  }
}
