package typings.deasync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(fn: js.Function1[/* repeated */ Any, Unit]): js.Function1[/* repeated */ Any, Any] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Any]]
  inline def apply[T1](fn: js.Function2[/* arg1 */ T1, /* callback */ CallbackWithoutResult, Unit]): js.Function1[/* arg1 */ T1, Unit] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* arg1 */ T1, Unit]]
  inline def apply[T1, T2](fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* callback */ CallbackWithoutResult, Unit]): js.Function2[/* arg1 */ T1, /* arg2 */ T2, Unit] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* arg1 */ T1, /* arg2 */ T2, Unit]]
  inline def apply[T1, T2, T3](
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* callback */ CallbackWithoutResult, Unit]
  ): js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Unit] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, Unit]]
  inline def apply[T1, T2, T3, T4](
    fn: js.Function5[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* callback */ CallbackWithoutResult, 
      Unit
    ]
  ): js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Unit] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, Unit]]
  inline def apply[T1, T2, T3, T4, T5](
    fn: js.Function6[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* callback */ CallbackWithoutResult, 
      Unit
    ]
  ): js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* arg5 */ T5, Unit] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* arg5 */ T5, Unit]]
  inline def apply[T1, T2, T3, T4, T5, T6](
    fn: js.Function7[
      /* arg1 */ T1, 
      /* arg2 */ T2, 
      /* arg3 */ T3, 
      /* arg4 */ T4, 
      /* arg5 */ T5, 
      /* arg6 */ T6, 
      /* callback */ CallbackWithoutResult, 
      Unit
    ]
  ): js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function6[
    /* arg1 */ T1, 
    /* arg2 */ T2, 
    /* arg3 */ T3, 
    /* arg4 */ T4, 
    /* arg5 */ T5, 
    /* arg6 */ T6, 
    Unit
  ]]
  
  @JSImport("deasync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * For async function with unconventional API, for instance `function asyncFunction(p1,function cb(res){})`,
    * use `loopWhile(predicateFunc)`.
    *
    * ```js
    * var done = false;
    * var data;
    * asyncFunction(p1, function cb(res) {
    *     data = res;
    *     done = true;
    * });
    * require('deasync').loopWhile(function () { return !done; });
    * // data is now populated
    * ```
    * @param pred The function that returns boolean loop condition.
    */
  inline def loopWhile(pred: PredicateFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loopWhile")(pred.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def runLoopOnce(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runLoopOnce")().asInstanceOf[Unit]
  
  /**
    * Sleep (a wrapper of setTimeout).
    *
    * ```js
    * function SyncFunction() {
    *     var ret;
    *     setTimeout(function () {
    *         ret = "hello";
    *     }, 3000);
    *     while (ret === undefined) {
    *         require('deasync').sleep(100);
    *     }
    *     // returns hello with sleep; undefined without
    *     return ret;
    * }
    * ```
    * @param ms The time, in milliseconds that the timer should wait.
    */
  inline def sleep(ms: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type CallbackWithResult[TResult] = js.Function2[/* err */ Any, /* result */ TResult, Unit]
  
  type CallbackWithoutResult = js.Function1[/* err */ js.UndefOr[Any], Unit]
  
  type PredicateFunction = js.Function0[Boolean]
}
