package typings.baconjs

import typings.baconjs.typesMod.Subscribe
import typings.baconjs.updatebarrierMod.EventSink
import typings.baconjs.updatebarrierMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[A](xs: js.Array[A]): Boolean = js.native
  }
  
  @js.native
  trait Fn1 extends StObject {
    
    def apply[V](xs: js.Array[V]): js.Array[V] = js.native
  }
  
  @js.native
  trait Fn10 extends StObject {
    
    def apply[V, V2](f: V2): js.Function1[/* x */ V, V2] = js.native
    def apply[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = js.native
  }
  
  @js.native
  trait Fn2 extends StObject {
    
    def apply[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = js.native
  }
  
  @js.native
  trait Fn3 extends StObject {
    
    def apply[A](xs: js.Any, f: js.Function2[/* key */ String, /* x */ A, js.Any]): Unit = js.native
  }
  
  @js.native
  trait Fn4 extends StObject {
    
    def apply[A](xs: A): js.Array[A] = js.native
    def apply[A](xs: js.Array[A]): js.Array[A] = js.native
  }
  
  @js.native
  trait Fn5 extends StObject {
    
    def apply[A](x: A): A = js.native
  }
  
  @js.native
  trait Fn6 extends StObject {
    
    def apply[A](xs: js.Array[A]): A = js.native
  }
  
  @js.native
  trait Fn7 extends StObject {
    
    def apply[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = js.native
  }
  
  @js.native
  trait Fn8 extends StObject {
    
    def apply[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = js.native
  }
  
  @js.native
  trait Fn9 extends StObject {
    
    def apply[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[A](xs: js.Array[A], x: A): Double = js.native
  }
  
  @js.native
  trait FnCallF extends StObject {
    
    def apply[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = js.native
  }
  
  @js.native
  trait FnCallFXs extends StObject {
    
    def apply[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  }
  
  @js.native
  trait FnCallFnMe extends StObject {
    
    def apply[F /* <: js.Function */](fn: F, me: js.Any): F = js.native
  }
  
  @js.native
  trait FnCallObsSubscribeSink extends StObject {
    
    def apply[V](obs: Observable, subscribe: Subscribe[V], sink: EventSink[V]): js.Function0[Unit] = js.native
  }
  
  @js.native
  trait FnCallX extends StObject {
    
    def apply[A](x: A): js.Function0[A] = js.native
  }
  
  @js.native
  trait FnCallXXs extends StObject {
    
    def apply[A](x: A, xs: js.Array[A]): js.Array[A] = js.native
  }
  
  @js.native
  trait FnCallXs extends StObject {
    
    def apply[V](xs: js.Array[V]): V = js.native
  }
  
  @js.native
  trait FnCallXsF extends StObject {
    
    def apply[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = js.native
  }
  
  @js.native
  trait FnCallXsSeedF extends StObject {
    
    def apply[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = js.native
  }
  
  @js.native
  trait FnCallXsX extends StObject {
    
    def apply[A](xs: js.Array[A], x: A): Boolean = js.native
  }
}
