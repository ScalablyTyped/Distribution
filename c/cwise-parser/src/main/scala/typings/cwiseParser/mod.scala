package typings.cwiseParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T](func: js.Function2[/* a */ Double, /* repeated */ T, js.Any]): CompiledRoutine = ^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any]).asInstanceOf[CompiledRoutine]
  
  @JSImport("cwise-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CompiledArgument extends StObject {
    
    var count: Double
    
    var lvalue: Boolean
    
    var name: String
    
    var rvalue: Boolean
  }
  object CompiledArgument {
    
    inline def apply(count: Double, lvalue: Boolean, name: String, rvalue: Boolean): CompiledArgument = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lvalue = lvalue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rvalue = rvalue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompiledArgument]
    }
    
    extension [Self <: CompiledArgument](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setLvalue(value: Boolean): Self = StObject.set(x, "lvalue", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRvalue(value: Boolean): Self = StObject.set(x, "rvalue", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompiledRoutine extends StObject {
    
    var args: js.Array[CompiledArgument]
    
    var body: String
    
    var localVars: js.Array[String]
    
    var thisVars: js.Array[String]
  }
  object CompiledRoutine {
    
    inline def apply(
      args: js.Array[CompiledArgument],
      body: String,
      localVars: js.Array[String],
      thisVars: js.Array[String]
    ): CompiledRoutine = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], localVars = localVars.asInstanceOf[js.Any], thisVars = thisVars.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompiledRoutine]
    }
    
    extension [Self <: CompiledRoutine](x: Self) {
      
      inline def setArgs(value: js.Array[CompiledArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: CompiledArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setLocalVars(value: js.Array[String]): Self = StObject.set(x, "localVars", value.asInstanceOf[js.Any])
      
      inline def setLocalVarsVarargs(value: String*): Self = StObject.set(x, "localVars", js.Array(value :_*))
      
      inline def setThisVars(value: js.Array[String]): Self = StObject.set(x, "thisVars", value.asInstanceOf[js.Any])
      
      inline def setThisVarsVarargs(value: String*): Self = StObject.set(x, "thisVars", js.Array(value :_*))
    }
  }
}
