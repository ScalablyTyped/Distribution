package typings.crocks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalTypesMod {
  
  type BinaryFunction = CurriedBinaryFunctionI | CurriedBinaryFunctionII
  
  type CurriedBinaryFunctionI = js.Function2[/* arg1 */ Any, /* arg2 */ Any, Any]
  
  type CurriedBinaryFunctionII = js.Function1[/* arg1 */ Any, js.Function1[/* arg2 */ Any, Any]]
  
  type CurriedTernaryFunctionI = js.Function2[/* arg1 */ Any, /* arg2 */ Any, js.Function1[/* arg3 */ Any, Any]]
  
  type CurriedTernaryFunctionII = js.Function2[/* arg1 */ Any, /* arg2 */ Any, js.Function1[/* arg3 */ Any, Any]]
  
  type CurriedTernaryFunctionIII = js.Function1[/* arg1 */ Any, js.Function1[/* arg2 */ Any, js.Function1[/* arg3 */ Any, Any]]]
  
  @js.native
  trait NodeCallback[T] extends StObject {
    
    def apply(err: js.Error, args: T*): Any = js.native
    def apply(err: Null, args: T*): Any = js.native
  }
  
  type NullaryFunction = js.Function0[Any]
  
  type PredicateFunction[A] = js.Function1[/* a */ A, Boolean]
  
  type TernaryFunction = CurriedTernaryFunctionI | CurriedTernaryFunctionII | CurriedTernaryFunctionIII
  
  type UnaryFunction = js.Function1[/* arg */ Any, Any]
  
  @js.native
  trait VariadicFunction extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
}
