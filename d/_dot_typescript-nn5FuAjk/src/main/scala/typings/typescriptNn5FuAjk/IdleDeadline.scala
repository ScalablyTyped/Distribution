package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdleDeadline extends StObject {
  
  val didTimeout: scala.Boolean
  
  def timeRemaining(): DOMHighResTimeStamp
}
object IdleDeadline {
  
  inline def apply(didTimeout: scala.Boolean, timeRemaining: () => DOMHighResTimeStamp): IdleDeadline = {
    val __obj = js.Dynamic.literal(didTimeout = didTimeout.asInstanceOf[js.Any], timeRemaining = js.Any.fromFunction0(timeRemaining))
    __obj.asInstanceOf[IdleDeadline]
  }
  
  extension [Self <: IdleDeadline](x: Self) {
    
    inline def setDidTimeout(value: scala.Boolean): Self = StObject.set(x, "didTimeout", value.asInstanceOf[js.Any])
    
    inline def setTimeRemaining(value: () => DOMHighResTimeStamp): Self = StObject.set(x, "timeRemaining", js.Any.fromFunction0(value))
  }
}
