package typings.breeze.anon

import typings.breeze.breeze.Entity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Done extends StObject {
  
  def done(requests: js.Array[js.Object]): Unit
  
  def getRequest[T](request: T, entity: Entity, index: Double): T
}
object Done {
  
  inline def apply(done: js.Array[js.Object] => Unit, getRequest: (Any, Entity, Double) => Any): Done = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), getRequest = js.Any.fromFunction3(getRequest))
    __obj.asInstanceOf[Done]
  }
  
  extension [Self <: Done](x: Self) {
    
    inline def setDone(value: js.Array[js.Object] => Unit): Self = StObject.set(x, "done", js.Any.fromFunction1(value))
    
    inline def setGetRequest(value: (Any, Entity, Double) => Any): Self = StObject.set(x, "getRequest", js.Any.fromFunction3(value))
  }
}
