package typings.cwiseParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cwise-parser", JSImport.Namespace)
  @js.native
  def apply[T](func: js.Function2[/* a */ Double, /* repeated */ T, _]): CompiledRoutine = js.native
  
  @js.native
  trait CompiledArgument extends StObject {
    
    var count: Double = js.native
    
    var lvalue: Boolean = js.native
    
    var name: String = js.native
    
    var rvalue: Boolean = js.native
  }
  object CompiledArgument {
    
    @scala.inline
    def apply(count: Double, lvalue: Boolean, name: String, rvalue: Boolean): CompiledArgument = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lvalue = lvalue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rvalue = rvalue.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompiledArgument]
    }
    
    @scala.inline
    implicit class CompiledArgumentMutableBuilder[Self <: CompiledArgument] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLvalue(value: Boolean): Self = StObject.set(x, "lvalue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRvalue(value: Boolean): Self = StObject.set(x, "rvalue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CompiledRoutine extends StObject {
    
    var args: js.Array[CompiledArgument] = js.native
    
    var body: String = js.native
    
    var localVars: js.Array[String] = js.native
    
    var thisVars: js.Array[String] = js.native
  }
  object CompiledRoutine {
    
    @scala.inline
    def apply(
      args: js.Array[CompiledArgument],
      body: String,
      localVars: js.Array[String],
      thisVars: js.Array[String]
    ): CompiledRoutine = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], localVars = localVars.asInstanceOf[js.Any], thisVars = thisVars.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompiledRoutine]
    }
    
    @scala.inline
    implicit class CompiledRoutineMutableBuilder[Self <: CompiledRoutine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[CompiledArgument]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: CompiledArgument*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalVars(value: js.Array[String]): Self = StObject.set(x, "localVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalVarsVarargs(value: String*): Self = StObject.set(x, "localVars", js.Array(value :_*))
      
      @scala.inline
      def setThisVars(value: js.Array[String]): Self = StObject.set(x, "thisVars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThisVarsVarargs(value: String*): Self = StObject.set(x, "thisVars", js.Array(value :_*))
    }
  }
}
