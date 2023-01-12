package typings.chillout

import typings.chillout.chilloutBooleans.`false`
import typings.chillout.chilloutBooleans.`true`
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chillout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("chillout", "StopIteration")
  @js.native
  val StopIteration: js.Symbol = js.native
  
  inline def forEach[TObject /* <: ArrayLike[Any] | js.Object */, TContext](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ForEachArgs<TObject, TContext> is not an array type */ args: ForEachArgs[TObject, TContext, DefaultCallbackReturn]
  ): js.Promise[js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Null]]]
  
  inline def forOf[TValue, TContext](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ForOfArgs<TValue, TContext> is not an array type */ args: ForOfArgs[TValue, TContext, DefaultCallbackReturn]
  ): js.Promise[js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("forOf")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Null]]]
  
  inline def isArrayLike(value: Any): /* is std.ArrayLike<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayLike")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayLike<unknown> */ Boolean]
  
  inline def isThenable(value: Any): /* is std.PromiseLike<unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isThenable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is std.PromiseLike<unknown> */ Boolean]
  
  inline def iterate[TReturn](iterator: ChilloutIterator[Any, TReturn]): js.Promise[js.UndefOr[TReturn]] = ^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(iterator.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[TReturn]]]
  inline def iterate[TReturn](iterator: ChilloutIterator[Any, TReturn], interval: Double): js.Promise[js.UndefOr[TReturn]] = (^.asInstanceOf[js.Dynamic].applyDynamic("iterate")(iterator.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[TReturn]]]
  
  object iterator {
    
    @JSImport("chillout", "iterator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forEach[TObject /* <: ArrayLike[Any] | js.Object */, TCallbackReturn /* <: DefaultCallbackReturn */, TContext](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ForEachArgs<TObject, TContext, TCallbackReturn> is not an array type */ args: ForEachArgs[TObject, TContext, TCallbackReturn]
    ): ChilloutIterator[TCallbackReturn, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(args.asInstanceOf[js.Any]).asInstanceOf[ChilloutIterator[TCallbackReturn, Null]]
    
    inline def forOf[TValue, TCallbackReturn /* <: DefaultCallbackReturn */, TContext](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ForOfArgs<TValue, TContext, TCallbackReturn> is not an array type */ args: ForOfArgs[TValue, TContext, TCallbackReturn]
    ): ChilloutIterator[TCallbackReturn, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("forOf")(args.asInstanceOf[js.Any]).asInstanceOf[ChilloutIterator[TCallbackReturn, Null]]
    
    inline def repeat[TCallbackReturn /* <: DefaultCallbackReturn */, TContext](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type RepeatArgs<TContext, TCallbackReturn> is not an array type */ args: RepeatArgs[TContext, TCallbackReturn]
    ): ChilloutIterator[TCallbackReturn, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(args.asInstanceOf[js.Any]).asInstanceOf[ChilloutIterator[TCallbackReturn, Null]]
    
    inline def until[TCallbackReturn /* <: DefaultCallbackReturn */, TContext](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type UntilArgs<TContext, TCallbackReturn> is not an array type */ args: UntilArgs[TContext, TCallbackReturn]
    ): ChilloutIterator[TCallbackReturn, Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("until")(args.asInstanceOf[js.Any]).asInstanceOf[ChilloutIterator[TCallbackReturn, Null]]
  }
  
  inline def nextTick(task: js.Function0[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("nextTick")(task.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def repeat[TContext](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type RepeatArgs<TContext> is not an array type */ args: RepeatArgs[TContext, DefaultCallbackReturn]
  ): js.Promise[js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("repeat")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Null]]]
  
  inline def until[TContext](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type UntilArgs<TContext> is not an array type */ args: UntilArgs[TContext, DefaultCallbackReturn]
  ): js.Promise[js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("until")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Null]]]
  
  @JSImport("chillout", "version")
  @js.native
  val version: String = js.native
  
  inline def waitUntil[TContext](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type UntilArgs<TContext> is not an array type */ args: UntilArgs[TContext, DefaultCallbackReturn]
  ): js.Promise[js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Null]]]
  
  trait ChilloutIterator[TValue, TReturn] extends StObject {
    
    def next(): js.Tuple2[`false` | `true`, js.Symbol | TReturn | TValue]
  }
  object ChilloutIterator {
    
    inline def apply[TValue, TReturn](next: () => js.Tuple2[`false` | `true`, js.Symbol | TReturn | TValue]): ChilloutIterator[TValue, TReturn] = {
      val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
      __obj.asInstanceOf[ChilloutIterator[TValue, TReturn]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChilloutIterator[?, ?], TValue, TReturn] (val x: Self & (ChilloutIterator[TValue, TReturn])) extends AnyVal {
      
      inline def setNext(value: () => js.Tuple2[`false` | `true`, js.Symbol | TReturn | TValue]): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    }
  }
  
  type DefaultCallbackReturn = js.Symbol | Unit | js.Promise[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TObject extends std.ArrayLike<unknown> ? [arr: TObject, callback: (this : TContext, value : TObject extends std.ArrayLike<infer T> ? T : never, key : number, arr : TObject): TCallbackReturn, context: TContext | undefined] : [obj: TObject, callback: (this : TContext, value : TObject[keyof TObject], key : keyof TObject, obj : TObject): TCallbackReturn, context: TContext | undefined]
    }}}
    */
  type ForEachArgs[TObject /* <: ArrayLike[Any] | js.Object */, TContext, TCallbackReturn /* <: DefaultCallbackReturn */] = js.Tuple3[
    /* arr */ TObject, 
    /* callback */ js.ThisFunction3[
      /* this */ TContext, 
      /* import warning: importer.ImportType#apply Failed type conversion: TObject extends std.ArrayLike<infer T> ? T : never */ /* value */ js.Any, 
      /* key */ Double, 
      /* arr */ TObject, 
      TCallbackReturn
    ], 
    /* context */ js.UndefOr[TContext]
  ]
  
  type ForOfArgs[TValue, TContext, TCallbackReturn /* <: DefaultCallbackReturn */] = js.Tuple3[
    /* iterable */ js.Iterable[TValue], 
    /* callback */ js.ThisFunction1[/* this */ TContext, /* value */ TValue, TCallbackReturn], 
    /* context */ js.UndefOr[TContext]
  ]
  
  type RepeatArgs[TContext, TCallbackReturn /* <: DefaultCallbackReturn */] = js.Tuple3[
    /* count */ Double | RepeatDescriptor, 
    /* callback */ js.ThisFunction1[/* this */ TContext, /* i */ Double, TCallbackReturn], 
    /* context */ js.UndefOr[TContext]
  ]
  
  trait RepeatDescriptor extends StObject {
    
    /**
      * The number when repetition should be stopped.
      */
    var done: Double
    
    /**
      * The number with which to start the repetition.
      * @default 0
      */
    var start: js.UndefOr[Double] = js.undefined
    
    /**
      * The number with which each repetition step should be increased.
      * @default 1
      */
    var step: js.UndefOr[Double] = js.undefined
  }
  object RepeatDescriptor {
    
    inline def apply(done: Double): RepeatDescriptor = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[RepeatDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RepeatDescriptor] (val x: Self) extends AnyVal {
      
      inline def setDone(value: Double): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  type UntilArgs[TContext, TCallbackReturn /* <: DefaultCallbackReturn */] = js.Tuple2[
    /* callback */ js.ThisFunction0[/* this */ TContext, TCallbackReturn], 
    /* context */ js.UndefOr[TContext]
  ]
}
