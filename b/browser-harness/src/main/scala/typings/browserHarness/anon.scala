package typings.browserHarness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.UndefOr[Any] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object Args {
    
    inline def apply(`type`: String): Args = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: Any): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Condition extends StObject {
    
    var condition: js.Function
    
    var exec: js.UndefOr[js.Function] = js.undefined
    
    var timeoutMS: js.UndefOr[Double] = js.undefined
  }
  object Condition {
    
    inline def apply(condition: js.Function): Condition = {
      val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
      __obj.asInstanceOf[Condition]
    }
    
    extension [Self <: Condition](x: Self) {
      
      inline def setCondition(value: js.Function): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
      
      inline def setExec(value: js.Function): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
      
      inline def setTimeoutMS(value: Double): Self = StObject.set(x, "timeoutMS", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMSUndefined: Self = StObject.set(x, "timeoutMS", js.undefined)
    }
  }
  
  trait Func extends StObject {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var func: js.Function
  }
  object Func {
    
    inline def apply(func: js.Function): Func = {
      val __obj = js.Dynamic.literal(func = func.asInstanceOf[js.Any])
      __obj.asInstanceOf[Func]
    }
    
    extension [Self <: Func](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setFunc(value: js.Function): Self = StObject.set(x, "func", value.asInstanceOf[js.Any])
    }
  }
}
