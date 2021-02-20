package typings.baconjs

import typings.baconjs.anon.Fn0
import typings.baconjs.anon.Fn1
import typings.baconjs.anon.Fn10
import typings.baconjs.anon.Fn2
import typings.baconjs.anon.Fn3
import typings.baconjs.anon.Fn4
import typings.baconjs.anon.Fn5
import typings.baconjs.anon.Fn6
import typings.baconjs.anon.Fn7
import typings.baconjs.anon.Fn8
import typings.baconjs.anon.Fn9
import typings.baconjs.anon.FnCall
import typings.baconjs.anon.FnCallF
import typings.baconjs.anon.FnCallFXs
import typings.baconjs.anon.FnCallFnMe
import typings.baconjs.anon.FnCallX
import typings.baconjs.anon.FnCallXXs
import typings.baconjs.anon.FnCallXs
import typings.baconjs.anon.FnCallXsF
import typings.baconjs.anon.FnCallXsSeedF
import typings.baconjs.anon.FnCallXsX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baconjsMod {
  
  object default {
    
    @JSImport("baconjs/types/_", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baconjs/types/_", "default.all")
    @js.native
    def all: Fn7 = js.native
    @JSImport("baconjs/types/_", "default.all")
    @js.native
    def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = js.native
    @scala.inline
    def all_=(x: Fn7): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("all")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.always")
    @js.native
    def always: FnCallX = js.native
    @JSImport("baconjs/types/_", "default.always")
    @js.native
    def always[A](x: A): js.Function0[A] = js.native
    @scala.inline
    def always_=(x: FnCallX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("always")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.any")
    @js.native
    def any: js.Any = js.native
    @scala.inline
    def any_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("any")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.bind")
    @js.native
    def bind: FnCallFnMe = js.native
    @JSImport("baconjs/types/_", "default.bind")
    @js.native
    def bind[F /* <: js.Function */](fn: F, me: js.Any): F = js.native
    @scala.inline
    def bind_=(x: FnCallFnMe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bind")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.contains")
    @js.native
    def contains: FnCallXsX = js.native
    @JSImport("baconjs/types/_", "default.contains")
    @js.native
    def contains[A](xs: js.Array[A], x: A): Boolean = js.native
    @scala.inline
    def contains_=(x: FnCallXsX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contains")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.each")
    @js.native
    def each: Fn3 = js.native
    @JSImport("baconjs/types/_", "default.each")
    @js.native
    def each[A](xs: js.Any, f: js.Function2[/* key */ String, /* x */ A, _]): Unit = js.native
    @scala.inline
    def each_=(x: Fn3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("each")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.empty")
    @js.native
    def empty: Fn0 = js.native
    @JSImport("baconjs/types/_", "default.empty")
    @js.native
    def empty[A](xs: js.Array[A]): Boolean = js.native
    @scala.inline
    def empty_=(x: Fn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.filter")
    @js.native
    def filter: FnCallFXs = js.native
    @JSImport("baconjs/types/_", "default.filter")
    @js.native
    def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
    @scala.inline
    def filter_=(x: FnCallFXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("filter")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.flatMap")
    @js.native
    def flatMap: Fn9 = js.native
    @JSImport("baconjs/types/_", "default.flatMap")
    @js.native
    def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
    @scala.inline
    def flatMap_=(x: Fn9): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("flatMap")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.fold")
    @js.native
    def fold: FnCallXsSeedF = js.native
    @JSImport("baconjs/types/_", "default.fold")
    @js.native
    def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = js.native
    @scala.inline
    def fold_=(x: FnCallXsSeedF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fold")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.head")
    @js.native
    def head: FnCallXs = js.native
    @JSImport("baconjs/types/_", "default.head")
    @js.native
    def head[V](xs: js.Array[V]): V = js.native
    @scala.inline
    def head_=(x: FnCallXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.id")
    @js.native
    def id: Fn5 = js.native
    @JSImport("baconjs/types/_", "default.id")
    @js.native
    def id[A](x: A): A = js.native
    @scala.inline
    def id_=(x: Fn5): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.indexOf")
    @js.native
    def indexOf: FnCall = js.native
    @JSImport("baconjs/types/_", "default.indexOf")
    @js.native
    def indexOf[A](xs: js.Array[A], x: A): Double = js.native
    @scala.inline
    def indexOf_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexOf")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.indexWhere")
    @js.native
    def indexWhere: FnCallXsF = js.native
    @JSImport("baconjs/types/_", "default.indexWhere")
    @js.native
    def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = js.native
    @scala.inline
    def indexWhere_=(x: FnCallXsF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indexWhere")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.isFunction")
    @js.native
    def isFunction: js.Function1[/* f */ js.Any, /* is std.Function */ Boolean] = js.native
    @JSImport("baconjs/types/_", "default.isFunction")
    @js.native
    def isFunction(f: js.Any): /* is std.Function */ Boolean = js.native
    @scala.inline
    def isFunction_=(x: js.Function1[/* f */ js.Any, /* is std.Function */ Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.last")
    @js.native
    def last: Fn6 = js.native
    @JSImport("baconjs/types/_", "default.last")
    @js.native
    def last[A](xs: js.Array[A]): A = js.native
    @scala.inline
    def last_=(x: Fn6): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("last")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.map")
    @js.native
    def map: Fn2 = js.native
    @JSImport("baconjs/types/_", "default.map")
    @js.native
    def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = js.native
    @scala.inline
    def map_=(x: Fn2): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("map")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.negate")
    @js.native
    def negate: FnCallF = js.native
    @JSImport("baconjs/types/_", "default.negate")
    @js.native
    def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = js.native
    @scala.inline
    def negate_=(x: FnCallF): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("negate")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.remove")
    @js.native
    def remove: Fn8 = js.native
    @JSImport("baconjs/types/_", "default.remove")
    @js.native
    def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = js.native
    @scala.inline
    def remove_=(x: Fn8): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("remove")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.tail")
    @js.native
    def tail: Fn1 = js.native
    @JSImport("baconjs/types/_", "default.tail")
    @js.native
    def tail[V](xs: js.Array[V]): js.Array[V] = js.native
    @scala.inline
    def tail_=(x: Fn1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tail")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.toArray")
    @js.native
    def toArray: Fn4 = js.native
    @JSImport("baconjs/types/_", "default.toArray")
    @js.native
    def toArray[A](xs: A): js.Array[A] = js.native
    @JSImport("baconjs/types/_", "default.toArray")
    @js.native
    def toArray[A](xs: js.Array[A]): js.Array[A] = js.native
    @scala.inline
    def toArray_=(x: Fn4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toArray")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.toFunction")
    @js.native
    def toFunction: Fn10 = js.native
    @JSImport("baconjs/types/_", "default.toFunction")
    @js.native
    def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = js.native
    @JSImport("baconjs/types/_", "default.toFunction")
    @js.native
    def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = js.native
    @scala.inline
    def toFunction_=(x: Fn10): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.toString")
    @js.native
    def toString_ : js.Function1[/* obj */ js.Any, String] = js.native
    @JSImport("baconjs/types/_", "default.toString")
    @js.native
    def toString_(obj: js.Any): String = js.native
    
    @scala.inline
    def toString__=(x: js.Function1[/* obj */ js.Any, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toString")(x.asInstanceOf[js.Any])
    
    @JSImport("baconjs/types/_", "default.without")
    @js.native
    def without: FnCallXXs = js.native
    @JSImport("baconjs/types/_", "default.without")
    @js.native
    def without[A](x: A, xs: js.Array[A]): js.Array[A] = js.native
    @scala.inline
    def without_=(x: FnCallXXs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("without")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baconjs/types/_", "all")
  @js.native
  def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = js.native
  
  @JSImport("baconjs/types/_", "always")
  @js.native
  def always[A](x: A): js.Function0[A] = js.native
  
  @JSImport("baconjs/types/_", "any")
  @js.native
  def any[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = js.native
  
  @JSImport("baconjs/types/_", "bind")
  @js.native
  def bind[F /* <: js.Function */](fn: F, me: js.Any): F = js.native
  
  @JSImport("baconjs/types/_", "contains")
  @js.native
  def contains[A](xs: js.Array[A], x: A): Boolean = js.native
  
  @JSImport("baconjs/types/_", "each")
  @js.native
  def each[A](xs: js.Any, f: js.Function2[/* key */ String, /* x */ A, _]): Unit = js.native
  
  @JSImport("baconjs/types/_", "empty")
  @js.native
  def empty[A](xs: js.Array[A]): Boolean = js.native
  
  @JSImport("baconjs/types/_", "filter")
  @js.native
  def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("baconjs/types/_", "flatMap")
  @js.native
  def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
  
  @JSImport("baconjs/types/_", "flip")
  @js.native
  def flip[A, B, C](f: js.Function2[/* a */ A, /* b */ B, C]): js.Function2[/* b */ B, /* a */ A, C] = js.native
  
  @JSImport("baconjs/types/_", "fold")
  @js.native
  def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = js.native
  
  @JSImport("baconjs/types/_", "head")
  @js.native
  def head[V](xs: js.Array[V]): V = js.native
  
  @JSImport("baconjs/types/_", "id")
  @js.native
  def id[A](x: A): A = js.native
  
  @JSImport("baconjs/types/_", "indexOf")
  @js.native
  def indexOf[A](xs: js.Array[A], x: A): Double = js.native
  
  @JSImport("baconjs/types/_", "indexWhere")
  @js.native
  def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = js.native
  
  @JSImport("baconjs/types/_", "isFunction")
  @js.native
  def isFunction(f: js.Any): /* is std.Function */ Boolean = js.native
  
  @JSImport("baconjs/types/_", "last")
  @js.native
  def last[A](xs: js.Array[A]): A = js.native
  
  @JSImport("baconjs/types/_", "map")
  @js.native
  def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = js.native
  
  @JSImport("baconjs/types/_", "negate")
  @js.native
  def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = js.native
  
  @JSImport("baconjs/types/_", "remove")
  @js.native
  def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = js.native
  
  @JSImport("baconjs/types/_", "tail")
  @js.native
  def tail[V](xs: js.Array[V]): js.Array[V] = js.native
  
  @JSImport("baconjs/types/_", "toArray")
  @js.native
  def toArray[A](xs: A): js.Array[A] = js.native
  @JSImport("baconjs/types/_", "toArray")
  @js.native
  def toArray[A](xs: js.Array[A]): js.Array[A] = js.native
  
  @JSImport("baconjs/types/_", "toFunction")
  @js.native
  def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = js.native
  @JSImport("baconjs/types/_", "toFunction")
  @js.native
  def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = js.native
  
  @JSImport("baconjs/types/_", "toString")
  @js.native
  def toString_(obj: js.Any): String = js.native
  
  @JSImport("baconjs/types/_", "without")
  @js.native
  def without[A](x: A, xs: js.Array[A]): js.Array[A] = js.native
}
