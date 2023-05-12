package typings.azureCoreHttpCompat.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPolicyOptionsLike extends StObject {
  
  def log(logLevel: HttpPipelineLogLevel, message: String): Unit
  
  def shouldLog(logLevel: HttpPipelineLogLevel): Boolean
}
object RequestPolicyOptionsLike {
  
  inline def apply(log: (HttpPipelineLogLevel, String) => Unit, shouldLog: HttpPipelineLogLevel => Boolean): RequestPolicyOptionsLike = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction2(log), shouldLog = js.Any.fromFunction1(shouldLog))
    __obj.asInstanceOf[RequestPolicyOptionsLike]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPolicyOptionsLike] (val x: Self) extends AnyVal {
    
    inline def setLog(value: (HttpPipelineLogLevel, String) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    
    inline def setShouldLog(value: HttpPipelineLogLevel => Boolean): Self = StObject.set(x, "shouldLog", js.Any.fromFunction1(value))
  }
}
