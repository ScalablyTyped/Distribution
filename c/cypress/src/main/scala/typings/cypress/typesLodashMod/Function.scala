package typings.cypress.typesLodashMod

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Function[T]
  extends StObject
     with LoDashImplicitWrapper[T] {
  
  /**
    * @see _.ary
    */
  def ary(): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  def ary(n: Double): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): Collection[T] = js.native
  
  /**
    * @see _.chain
    */
  def chain(): FunctionChain[T] = js.native
  
  /**
    * @see _.curry
    */
  def curry(): /* import warning: importer.ImportType#apply Failed type conversion: T extends (arg1 : infer T1): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction1<T1, R>> : T extends (arg1 : infer T1, arg2 : infer T2): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction2<T1, T2, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction3<T1, T2, T3, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3, arg4 : infer T4): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction4<T1, T2, T3, T4, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3, arg4 : infer T4, arg5 : infer T5): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction5<T1, T2, T3, T4, T5, R>> : cypress.cypress/types/lodash.Function<(args : ...any): any> */ js.Any = js.native
  def curry(arity: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends (arg1 : infer T1): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction1<T1, R>> : T extends (arg1 : infer T1, arg2 : infer T2): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction2<T1, T2, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction3<T1, T2, T3, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3, arg4 : infer T4): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction4<T1, T2, T3, T4, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3, arg4 : infer T4, arg5 : infer T5): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.CurriedFunction5<T1, T2, T3, T4, T5, R>> : cypress.cypress/types/lodash.Function<(args : ...any): any> */ js.Any = js.native
  
  /**
    * @see _.curryRight
    */
  def curryRight(): /* import warning: importer.ImportType#apply Failed type conversion: T extends (arg1 : infer T1): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction1<T1, R>> : T extends (arg1 : infer T1, arg2 : infer T2): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction2<T1, T2, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction3<T1, T2, T3, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3, arg4 : infer T4): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction4<T1, T2, T3, T4, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3, arg4 : infer T4, arg5 : infer T5): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction5<T1, T2, T3, T4, T5, R>> : cypress.cypress/types/lodash.Function<(args : ...any): any> */ js.Any = js.native
  def curryRight(arity: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends (arg1 : infer T1): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction1<T1, R>> : T extends (arg1 : infer T1, arg2 : infer T2): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction2<T1, T2, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction3<T1, T2, T3, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3, arg4 : infer T4): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction4<T1, T2, T3, T4, R>> : T extends (arg1 : infer T1, arg2 : infer T2, arg3 : infer T3, arg4 : infer T4, arg5 : infer T5): infer R ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.RightCurriedFunction5<T1, T2, T3, T4, T5, R>> : cypress.cypress/types/lodash.Function<(args : ...any): any> */ js.Any = js.native
  
  /**
    * @see _.debounce
    */
  def debounce(): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.DebouncedFunc<T>> : never */ js.Any = js.native
  def debounce(wait: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.DebouncedFunc<T>> : never */ js.Any = js.native
  def debounce(wait: Double, options: DebounceSettings): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.DebouncedFunc<T>> : never */ js.Any = js.native
  def debounce(wait: Unit, options: DebounceSettings): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.DebouncedFunc<T>> : never */ js.Any = js.native
  
  /**
    * @see _.flip
    */
  def flip(): this.type = js.native
  
  /**
    * @see _.flow
    */
  def flow(func: (Many[js.Function1[/* repeated */ Any, Any]])*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2](f2: js.Function1[/* a */ ReturnType[T], R2]): Function[js.Function1[/* args */ Parameters[T], R2]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3](f2: js.Function1[/* a */ ReturnType[T], R2], f3: js.Function1[/* a */ R2, R3]): Function[js.Function1[/* args */ Parameters[T], R3]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4]
  ): Function[js.Function1[/* args */ Parameters[T], R4]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5]
  ): Function[js.Function1[/* args */ Parameters[T], R5]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5, R6](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6]
  ): Function[js.Function1[/* args */ Parameters[T], R6]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7]
  ): Function[js.Function1[/* args */ Parameters[T], R7]] = js.native
  /**
    * @see _.flow
    */
  def flow[R2, R3, R4, R5, R6, R7](
    f2: js.Function1[/* a */ ReturnType[T], R2],
    f3: js.Function1[/* a */ R2, R3],
    f4: js.Function1[/* a */ R3, R4],
    f5: js.Function1[/* a */ R4, R5],
    f6: js.Function1[/* a */ R5, R6],
    f7: js.Function1[/* a */ R6, R7],
    func: (Many[js.Function1[/* a */ Any, Any]])*
  ): Function[js.Function1[/* args */ Parameters[T], Any]] = js.native
  
  /**
    * @see _.flowRight
    */
  def flowRight(func: (Many[js.Function1[/* repeated */ Any, Any]])*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */](
    f1: js.Function1[
      /* args */ A, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1](
    f2: js.Function1[
      /* a */ R1, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1, R2](
    f3: js.Function1[
      /* a */ R2, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1, R2, R3](
    f4: js.Function1[
      /* a */ R3, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1, R2, R3, R4](
    f5: js.Function1[
      /* a */ R4, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  /**
    * @see _.flowRight
    */
  @JSName("flowRight")
  def flowRight_0[A /* <: js.Array[Any] */, R1, R2, R3, R4, R5](
    f6: js.Function1[
      /* a */ R5, 
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ js.Any
    ],
    f5: js.Function1[/* a */ R4, R5],
    f4: js.Function1[/* a */ R3, R4],
    f3: js.Function1[/* a */ R2, R3],
    f2: js.Function1[/* a */ R1, R2],
    f1: js.Function1[/* args */ A, R1]
  ): Function[js.Function1[/* args */ A, ReturnType[T]]] = js.native
  
  /**
    * @see _.iteratee
    */
  def iteratee(): Function[T] = js.native
  
  /**
    * @see _.memoize
    */
  def memoize(): Function[T & MemoizedFunction] = js.native
  def memoize(resolver: js.Function1[/* repeated */ Any, Any]): Function[T & MemoizedFunction] = js.native
  
  /**
    * @see _.negate
    */
  def negate(): Function[js.Function1[/* args */ Parameters[T], Boolean]] = js.native
  
  /**
    * @see _.once
    */
  def once(): Function[T] = js.native
  
  /**
    * @see _.over
    */
  def over[TResult](iteratees: (Many[js.Function1[/* repeated */ Any, TResult]])*): Function[js.Function1[/* repeated */ Any, js.Array[ReturnType[T] | TResult]]] = js.native
  
  /**
    * @see _.overArgs
    */
  def overArgs(transforms: (Many[js.Function1[/* repeated */ Any, Any]])*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.overEvery
    */
  def overEvery[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): Function[js.Function1[/* args */ Parameters[T] | js.Array[TArgs], Boolean]] = js.native
  
  /**
    * @see _.overSome
    */
  def overSome[TArgs](iteratees: (Many[js.Function1[/* repeated */ TArgs, Boolean]])*): Function[js.Function1[/* args */ Parameters[T] | js.Array[TArgs], Boolean]] = js.native
  
  /**
    * @see _.partial
    */
  def partial(): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends (ts : ...any): any ? T : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T1](arg1: T1): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends (t1 : T1, ts : infer TS): infer R ? (ts : TS): R : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T2](plc1: __, arg2: T2): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function2<infer T1, T2, infer R> ? cypress.cypress/types/lodash.Function1<T1, R> : T extends cypress.cypress/types/lodash.Function3<infer T1, T2, infer T3, infer R> ? cypress.cypress/types/lodash.Function2<T1, T3, R> : T extends cypress.cypress/types/lodash.Function4<infer T1, T2, infer T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function3<T1, T3, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T3](plc1: __, plc2: __, arg3: T3): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<infer T1, infer T2, T3, infer R> ? cypress.cypress/types/lodash.Function2<T1, T2, R> : T extends cypress.cypress/types/lodash.Function4<infer T1, infer T2, T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function3<T1, T2, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2](arg1: T1, arg2: T2): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends (t1 : T1, t2 : T2, ts : infer TS): infer R ? (ts : TS): R : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T3](arg1: T1, plc2: __, arg3: T3): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<T1, infer T2, T3, infer R> ? cypress.cypress/types/lodash.Function1<T2, R> : T extends cypress.cypress/types/lodash.Function4<T1, infer T2, T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function2<T2, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T4](arg1: T1, plc2: __, plc3: __, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, infer T2, infer T3, T4, infer R> ? cypress.cypress/types/lodash.Function2<T2, T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T3](plc1: __, arg2: T2, arg3: T3): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<infer T1, T2, T3, infer R> ? cypress.cypress/types/lodash.Function1<T1, R> : T extends cypress.cypress/types/lodash.Function4<infer T1, T2, T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function2<T1, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T4](plc1: __, arg2: T2, plc3: __, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, T2, infer T3, T4, infer R> ? cypress.cypress/types/lodash.Function2<T1, T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T3, T4](plc1: __, plc2: __, arg3: T3, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, infer T2, T3, T4, infer R> ? cypress.cypress/types/lodash.Function2<T1, T2, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3](arg1: T1, arg2: T2, arg3: T3): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends (t1 : T1, t2 : T2, t3 : T3, ts : infer TS): infer R ? (ts : TS): R : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T4](arg1: T1, arg2: T2, plc3: __, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, T2, infer T3, T4, infer R> ? cypress.cypress/types/lodash.Function1<T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T3, T4](arg1: T1, plc2: __, arg3: T3, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, infer T2, T3, T4, infer R> ? cypress.cypress/types/lodash.Function1<T2, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T2, T3, T4](plc1: __, arg2: T2, arg3: T3, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, T2, T3, T4, infer R> ? cypress.cypress/types/lodash.Function1<T1, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partial
    */
  def partial[T1, T2, T3, T4](arg1: T1, arg2: T2, arg3: T3, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends (t1 : T1, t2 : T2, t3 : T3, t4 : T4, ts : infer TS): infer R ? (ts : TS): R : any */ js.Any
  ] = js.native
  
  /**
    * @see _.partialRight
    */
  def partialRight(): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends (ts : ...any): any ? T : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1](arg1: T1, plc2: __, plc3: __, plc4: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, infer T2, infer T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function3<T2, T3, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2](arg2: T2): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function2<infer T1, T2, infer R> ? cypress.cypress/types/lodash.Function1<T1, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2](arg2: T2, plc3: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<infer T1, T2, infer T3, infer R> ? cypress.cypress/types/lodash.Function2<T1, T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2](arg2: T2, plc3: __, plc4: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, T2, infer T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function3<T1, T3, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2](arg1: T1, arg2: T2, plc3: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<T1, T2, infer T3, infer R> ? cypress.cypress/types/lodash.Function1<T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2](arg1: T1, arg2: T2, plc3: __, plc4: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, T2, infer T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function2<T3, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T3](arg1: T1, plc2: __, arg3: T3): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<T1, infer T2, T3, infer R> ? cypress.cypress/types/lodash.Function1<T2, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T3](arg1: T1, plc2: __, arg3: T3, plc4: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, infer T2, infer T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function2<T2, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T4](arg1: T1, plc2: __, plc3: __, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, infer T2, infer T3, T4, infer R> ? cypress.cypress/types/lodash.Function2<T2, T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T3, T4](arg3: T3, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, infer T2, T3, T4, infer R> ? cypress.cypress/types/lodash.Function2<T1, T2, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T3](arg1: T1, arg2: T2, arg3: T3, plc4: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, T2, T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function1<T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T2, T4](arg1: T1, arg2: T2, plc3: __, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, T2, infer T3, T4, infer R> ? cypress.cypress/types/lodash.Function1<T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T1, T3, T4](arg1: T1, plc2: __, arg3: T3, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<T1, infer T2, T3, T4, infer R> ? cypress.cypress/types/lodash.Function1<T2, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  def partialRight[T2, T3, T4](arg2: T2, arg3: T3, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, T2, T3, T4, infer R> ? cypress.cypress/types/lodash.Function1<T1, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1[T1](arg1: T1, plc2: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function2<T1, infer T2, infer R> ? cypress.cypress/types/lodash.Function1<T2, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T1[T1](arg1: T1, plc2: __, plc3: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<T1, infer T2, infer T3, infer R> ? cypress.cypress/types/lodash.Function2<T2, T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T2T3[T2, T3](arg2: T2, arg3: T3): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<infer T1, T2, T3, infer R> ? cypress.cypress/types/lodash.Function1<T1, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T2T3[T2, T3](arg2: T2, arg3: T3, plc4: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, T2, T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function2<T1, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T2T4[T2, T4](arg2: T2, plc3: __, arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, T2, infer T3, T4, infer R> ? cypress.cypress/types/lodash.Function2<T1, T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T3[T3](arg3: T3): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function3<infer T1, infer T2, T3, infer R> ? cypress.cypress/types/lodash.Function2<T1, T2, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T3[T3](arg3: T3, plc4: __): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, infer T2, T3, infer T4, infer R> ? cypress.cypress/types/lodash.Function3<T1, T2, T4, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_T4[T4](arg4: T4): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends cypress.cypress/types/lodash.Function4<infer T1, infer T2, infer T3, T4, infer R> ? cypress.cypress/types/lodash.Function3<T1, T2, T3, R> : any */ js.Any
  ] = js.native
  /**
    * @see _.partialRight
    */
  @JSName("partialRight")
  def partialRight_TS[TS /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param ts because its type TS is not an array type */ ts: TS
  ): Function[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : TS): infer R ? (): R : any */ js.Any
  ] = js.native
  
  /**
    * @see _.rearg
    */
  def rearg(indexes: Many[Double]*): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.rest
    */
  def rest(): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  def rest(start: Double): Function[js.Function1[/* repeated */ Any, Any]] = js.native
  
  /**
    * @see _.spread
    */
  def spread(): Function[js.Function1[/* repeated */ Any, ReturnType[T]]] = js.native
  def spread(start: Double): Function[js.Function1[/* repeated */ Any, ReturnType[T]]] = js.native
  
  /**
    * @see _.throttle
    */
  def throttle(): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.DebouncedFunc<T>> : never */ js.Any = js.native
  def throttle(wait: Double): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.DebouncedFunc<T>> : never */ js.Any = js.native
  def throttle(wait: Double, options: ThrottleSettings): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.DebouncedFunc<T>> : never */ js.Any = js.native
  def throttle(wait: Unit, options: ThrottleSettings): /* import warning: importer.ImportType#apply Failed type conversion: T extends (args : ...any): any ? cypress.cypress/types/lodash.Function<cypress.cypress/types/lodash.DebouncedFunc<T>> : never */ js.Any = js.native
  
  /**
    * @see _.unary
    */
  def unary(): Function[
    js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T>['0'] */ /* arg1 */ js.Any, 
      ReturnType[T]
    ]
  ] = js.native
}
