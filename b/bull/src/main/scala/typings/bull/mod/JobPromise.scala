package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPromise extends StObject {
  
  /**
    * Abort this job
    */
  def cancel(): Unit
}
object JobPromise {
  
  inline def apply(cancel: () => Unit): JobPromise = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[JobPromise]
  }
  
  extension [Self <: JobPromise](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
