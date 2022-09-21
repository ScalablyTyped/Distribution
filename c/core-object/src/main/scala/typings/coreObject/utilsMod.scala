package typings.coreObject

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.std.Exclude
import typings.std.IArguments
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  trait CallOrApply[This, Args, Return] extends StObject {
    
    @JSName("apply")
    def apply(thisArg: This, args: Args | IArguments | js.Array[Any]): Return
    
    // TODO support this properly with `...args: Args` once we can restrict to 3.0+ on DT
    var call: (js.Function2[/* thisArg */ This, /* repeated */ Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ Any, /* b */ Any, /* c */ Any, /* d */ Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ Any, /* b */ Any, /* c */ Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ Any, /* b */ Any, Return]) | (js.Function1[/* thisArg */ This, Return])
  }
  object CallOrApply {
    
    inline def apply[This, Args, Return](
      apply: (This, Args | IArguments | js.Array[Any]) => Return,
      call: (js.Function2[/* thisArg */ This, /* repeated */ Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ Any, /* b */ Any, /* c */ Any, /* d */ Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ Any, /* b */ Any, /* c */ Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ Any, /* b */ Any, Return]) | (js.Function1[/* thisArg */ This, Return])
    ): CallOrApply[This, Args, Return] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallOrApply[This, Args, Return]]
    }
    
    extension [Self <: CallOrApply[?, ?, ?], This, Args, Return](x: Self & (CallOrApply[This, Args, Return])) {
      
      inline def setApply(value: (This, Args | IArguments | js.Array[Any]) => Return): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
      
      inline def setCall(
        value: (js.Function2[/* thisArg */ This, /* repeated */ Any, Return]) | (js.Function5[/* thisArg */ This, /* a */ Any, /* b */ Any, /* c */ Any, /* d */ Any, Return]) | (js.Function4[/* thisArg */ This, /* a */ Any, /* b */ Any, /* c */ Any, Return]) | (js.Function3[/* thisArg */ This, /* a */ Any, /* b */ Any, Return]) | (js.Function1[/* thisArg */ This, Return])
      ): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setCallFunction1(value: /* thisArg */ This => Return): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      inline def setCallFunction2(value: (/* thisArg */ This, /* repeated */ Any) => Return): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
      
      inline def setCallFunction3(value: (/* thisArg */ This, /* a */ Any, /* b */ Any) => Return): Self = StObject.set(x, "call", js.Any.fromFunction3(value))
      
      inline def setCallFunction4(value: (/* thisArg */ This, /* a */ Any, /* b */ Any, /* c */ Any) => Return): Self = StObject.set(x, "call", js.Any.fromFunction4(value))
      
      inline def setCallFunction5(value: (/* thisArg */ This, /* a */ Any, /* b */ Any, /* c */ Any, /* d */ Any) => Return): Self = StObject.set(x, "call", js.Any.fromFunction5(value))
    }
  }
  
  type Constructor[Instance] = Instantiable1[/* args (repeated) */ Any, Instance]
  
  type MethodNames[T] = Values[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}
    */ typings.coreObject.coreObjectStrings.MethodNames & TopLevel[T]
  ]
  
  type Mix[T, U] = U & (Pick[T, Exclude[/* keyof T */ String, /* keyof U */ String]])
  
  type Super[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in core-object.core-object/-private/utils.MethodNames<T> ]: T[K] extends (): infer Return? core-object.core-object/-private/utils.CallOrApply<T, undefined, any> : T[K] extends (a : infer A): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any], any> : T[K] extends (a : infer A, b : infer B): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any], any> : T[K] extends (a : infer A, b : infer B, c : infer C, d : infer D): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [any, any, any, any], any> : T[K] extends (args : ...any): infer Return? core-object.core-object/-private/utils.CallOrApply<T, std.Array<any>, any> : never}
    */ typings.coreObject.coreObjectStrings.Super & TopLevel[Any]
  
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
