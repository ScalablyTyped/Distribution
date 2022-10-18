package typings.crocks

import typings.crocks.internalTypesMod.PredicateFunction
import typings.crocks.predMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logicMod {
  
  @JSImport("crocks/logic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def and[A](p: PredicateFunction[A]): js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]]]
  inline def and[A](p: PredicateFunction[A], q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  /**
    * and :: ((a -> Boolean) | Pred a) -> ((a -> Boolean) | Pred a) -> a -> Boolean
    */
  inline def and[A](p: PredicateFunction[A], q: PredicateFunction[A], x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def and[A](p: PredicateFunction[A], q: default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def and[A](p: PredicateFunction[A], q: default, x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def and[A](p: default): js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]]]
  inline def and[A](p: default, q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def and[A](p: default, q: PredicateFunction[A], x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def and[A](p: default, q: default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def and[A](p: default, q: default, x: A): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("and")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ifElse[A, C](p: PredicateFunction[A]): js.Function1[
    /* f */ js.Function1[/* x */ A, Any], 
    js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ A, Any], 
    js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]
  ]]
  inline def ifElse[A, C](p: PredicateFunction[A], f: js.Function1[/* x */ A, Any]): js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]]
  /**
    * ifElse :: ((a -> Boolean) | Pred a) -> (a -> b) -> (a -> b) -> a -> b
    */
  inline def ifElse[A, C](p: PredicateFunction[A], f: js.Function1[/* x */ A, Any], g: js.Function1[/* x */ A, C]): js.Function1[/* x */ A, A | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | C]]
  inline def ifElse[A, C](p: default): js.Function1[
    /* f */ js.Function1[/* x */ A, Any], 
    js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* f */ js.Function1[/* x */ A, Any], 
    js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]
  ]]
  inline def ifElse[A, C](p: default, f: js.Function1[/* x */ A, Any]): js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* g */ js.Function1[/* x */ A, C], js.Function1[/* x */ A, A | C]]]
  inline def ifElse[A, C](p: default, f: js.Function1[/* x */ A, Any], g: js.Function1[/* x */ A, C]): js.Function1[/* x */ A, A | C] = (^.asInstanceOf[js.Dynamic].applyDynamic("ifElse")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | C]]
  
  inline def implies[A](p: PredicateFunction[A]): js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]]]
  /**
    * implies :: ((a -> Boolean) | Pred a) -> ((a -> Boolean) | Pred a) -> a -> Boolean
    */
  inline def implies[A](p: PredicateFunction[A], q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def implies[A](p: PredicateFunction[A], q: default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def implies[A](p: default): js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]]]
  inline def implies[A](p: default, q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def implies[A](p: default, q: default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("implies")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  
  /**
    * not :: ((a -> Boolean) | Pred) -> a -> Boolean
    */
  inline def not[A](p: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def not[A](p: default): js.Function1[/* x */ A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  
  inline def or[A](p: PredicateFunction[A]): js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]]]
  /**
    * or :: ((a -> Boolean) | Pred) -> ((a -> Boolean) | Pred) -> a -> Boolean
    */
  inline def or[A](p: PredicateFunction[A], q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def or[A](p: PredicateFunction[A], q: default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def or[A](p: default): js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* q */ PredicateFunction[A] | default, js.Function1[/* x */ A, Boolean]]]
  inline def or[A](p: default, q: PredicateFunction[A]): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  inline def or[A](p: default, q: default): js.Function1[/* x */ A, Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("or")(p.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, Boolean]]
  
  inline def unless[A, B](p: PredicateFunction[A]): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unless")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
  /**
    * unless :: ((a -> Boolean) | Pred) -> (a -> a) -> a -> a
    */
  inline def unless[A, B](p: PredicateFunction[A], f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("unless")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
  inline def unless[A, B](p: default): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("unless")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
  inline def unless[A, B](p: default, f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("unless")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
  
  inline def when[A, B](p: PredicateFunction[A]): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
  /**
    * when :: ((a -> Boolean) | Pred) -> (a -> a) -> a -> a
    */
  inline def when[A, B](p: PredicateFunction[A], f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
  inline def when[A, B](p: default): js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(p.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* f */ js.Function1[/* x */ A, B], js.Function1[/* x */ A, A | B]]]
  inline def when[A, B](p: default, f: js.Function1[/* x */ A, B]): js.Function1[/* x */ A, A | B] = (^.asInstanceOf[js.Dynamic].applyDynamic("when")(p.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* x */ A, A | B]]
}
