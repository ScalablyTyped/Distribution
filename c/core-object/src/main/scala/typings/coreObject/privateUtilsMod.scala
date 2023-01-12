package typings.coreObject

import org.scalablytyped.runtime.Instantiable1
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object privateUtilsMod {
  
  trait CallOrApply[This, Args, Return] extends StObject {
    
    @JSName("apply")
    def apply(
      thisArg: This,
      args: /* import warning: importer.ImportType#apply Failed type conversion: Args extends undefined ? std.Array<any> : Args | std.IArguments */ js.Any
    ): Return
    
    // TODO support this properly with `...args: Args` once we can restrict to 3.0+ on DT
    var call: /* import warning: importer.ImportType#apply Failed type conversion: Args extends undefined ? (thisArg : This): Return : Args extends [infer A] ? (thisArg : This, a : A): Return : Args extends [infer A, infer B] ? (thisArg : This, a : A, b : B): Return : Args extends [infer A, infer B, infer C] ? (thisArg : This, a : A, b : B, c : C): Return : Args extends [infer A, infer B, infer C, infer D] ? (thisArg : This, a : A, b : B, c : C, d : D): Return : (thisArg : This, args : ...any): Return */ js.Any
  }
  object CallOrApply {
    
    inline def apply[This, Args, Return](
      apply: (This, /* import warning: importer.ImportType#apply Failed type conversion: Args extends undefined ? std.Array<any> : Args | std.IArguments */ js.Any) => Return,
      call: /* import warning: importer.ImportType#apply Failed type conversion: Args extends undefined ? (thisArg : This): Return : Args extends [infer A] ? (thisArg : This, a : A): Return : Args extends [infer A, infer B] ? (thisArg : This, a : A, b : B): Return : Args extends [infer A, infer B, infer C] ? (thisArg : This, a : A, b : B, c : C): Return : Args extends [infer A, infer B, infer C, infer D] ? (thisArg : This, a : A, b : B, c : C, d : D): Return : (thisArg : This, args : ...any): Return */ js.Any
    ): CallOrApply[This, Args, Return] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallOrApply[This, Args, Return]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallOrApply[?, ?, ?], This, Args, Return] (val x: Self & (CallOrApply[This, Args, Return])) extends AnyVal {
      
      inline def setApply(
        value: (This, /* import warning: importer.ImportType#apply Failed type conversion: Args extends undefined ? std.Array<any> : Args | std.IArguments */ js.Any) => Return
      ): Self = StObject.set(x, "apply", js.Any.fromFunction2(value))
      
      inline def setCall(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Args extends undefined ? (thisArg : This): Return : Args extends [infer A] ? (thisArg : This, a : A): Return : Args extends [infer A, infer B] ? (thisArg : This, a : A, b : B): Return : Args extends [infer A, infer B, infer C] ? (thisArg : This, a : A, b : B, c : C): Return : Args extends [infer A, infer B, infer C, infer D] ? (thisArg : This, a : A, b : B, c : C, d : D): Return : (thisArg : This, args : ...any): Return */ js.Any
      ): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    }
  }
  
  type Constructor[Instance] = Instantiable1[/* args (repeated) */ Any, Instance]
  
  type MethodNames[T] = Values[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never} */ js.Any
  ]
  
  type Mix[T, U] = U & (Pick[T, Exclude[/* keyof T */ String, /* keyof U */ String]])
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in core-object.core-object/-private/utils.MethodNames<T> ]: T[K] extends (): infer Return? core-object.core-object/-private/utils.CallOrApply<T, undefined, Return> : T[K] extends (a : infer A): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [A], Return> : T[K] extends (a : infer A, b : infer B): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [A, B], Return> : T[K] extends (a : infer A, b : infer B, c : infer C): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [A, B, C], Return> : T[K] extends (a : infer A, b : infer B, c : infer C, d : infer D): infer Return? core-object.core-object/-private/utils.CallOrApply<T, [A, B, C, D], Return> : T[K] extends (args : ...any): infer Return? core-object.core-object/-private/utils.CallOrApply<T, std.Array<any>, Return> : never}
    }}}
    */
  @js.native
  trait Super[T] extends StObject
  
  type Values[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
