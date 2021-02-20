package typings.bristol

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bristol", JSImport.Namespace)
  @js.native
  val ^ : Bristol = js.native
  
  @js.native
  trait Bristol extends StObject {
    
    def addTarget(target: js.Any): js.Any = js.native
    def addTarget(target: js.Any, opts: js.Any): js.Any = js.native
    
    def debug(message: String, data: LogData): js.Any = js.native
    
    def error(message: String, data: LogData): js.Any = js.native
    
    def info(message: String, data: LogData): js.Any = js.native
    
    def warn(message: String, data: LogData): js.Any = js.native
    
    def withFormatter(formatter: String): js.Any = js.native
    
    def withLowestSeverity(severity: String): js.Any = js.native
  }
  
  @js.native
  trait LogData extends StObject {
    
    var code: js.UndefOr[Double] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var error: js.UndefOr[LogError] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  object LogData {
    
    @scala.inline
    def apply(): LogData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogData]
    }
    
    @scala.inline
    implicit class LogDataMutableBuilder[Self <: LogData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setError(value: LogError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  @js.native
  trait LogError extends StObject {
    
    var message: js.UndefOr[String] = js.native
    
    var reason: js.UndefOr[js.Any] = js.native
    
    var stack: js.UndefOr[js.Any] = js.native
  }
  object LogError {
    
    @scala.inline
    def apply(): LogError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogError]
    }
    
    @scala.inline
    implicit class LogErrorMutableBuilder[Self <: LogError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setReason(value: js.Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setStack(value: js.Any): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type _To = Bristol
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Bristol = ^
}
