package typings.chillout

import typings.chillout.mod.ChilloutIterator
import typings.chillout.mod.DefaultCallbackReturn
import typings.chillout.mod.ForEachArgs
import typings.chillout.mod.ForOfArgs
import typings.chillout.mod.RepeatArgs
import typings.chillout.mod.UntilArgs
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object chillout {
    
    @JSGlobal("chillout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chillout.StopIteration")
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
      
      @JSGlobal("chillout.iterator")
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
    
    @JSGlobal("chillout.version")
    @js.native
    val version: String = js.native
    
    inline def waitUntil[TContext](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type UntilArgs<TContext> is not an array type */ args: UntilArgs[TContext, DefaultCallbackReturn]
    ): js.Promise[js.UndefOr[Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntil")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Null]]]
  }
}
