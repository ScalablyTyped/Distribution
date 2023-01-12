package typings.bristol

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bristol", JSImport.Namespace)
  @js.native
  val ^ : Bristol = js.native
  
  @js.native
  trait Bristol extends StObject {
    
    def addTarget(target: Any): Any = js.native
    def addTarget(target: Any, opts: Any): Any = js.native
    
    def debug(message: String, data: LogData): Any = js.native
    
    def error(message: String, data: LogData): Any = js.native
    
    def info(message: String, data: LogData): Any = js.native
    
    def warn(message: String, data: LogData): Any = js.native
    
    def withFormatter(formatter: String): Any = js.native
    
    def withLowestSeverity(severity: String): Any = js.native
  }
  
  trait LogData extends StObject {
    
    var code: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var error: js.UndefOr[LogError] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
  }
  object LogData {
    
    inline def apply(): LogData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogData] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: LogError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  trait LogError extends StObject {
    
    var message: js.UndefOr[String] = js.undefined
    
    var reason: js.UndefOr[Any] = js.undefined
    
    var stack: js.UndefOr[Any] = js.undefined
  }
  object LogError {
    
    inline def apply(): LogError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogError] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setStack(value: Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type _To = Bristol
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bristol = ^
}
