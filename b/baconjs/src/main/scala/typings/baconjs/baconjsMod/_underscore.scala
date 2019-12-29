package typings.baconjs.baconjsMod

import typings.baconjs.Fn_A
import typings.baconjs.Fn_AF
import typings.baconjs.Fn_Acc
import typings.baconjs.Fn_F
import typings.baconjs.Fn_FKey
import typings.baconjs.Fn_FX
import typings.baconjs.Fn_FXV
import typings.baconjs.Fn_FXXs
import typings.baconjs.Fn_FXXsA
import typings.baconjs.Fn_Fn
import typings.baconjs.Fn_X
import typings.baconjs.Fn_XA
import typings.baconjs.Fn_XA_2056052176
import typings.baconjs.Fn_XXs
import typings.baconjs.Fn_XXsA
import typings.baconjs.Fn_XXsArray
import typings.baconjs.Fn_Xs
import typings.baconjs.Fn_XsA
import typings.baconjs.Fn_XsAArray
import typings.baconjs.Fn_XsAArray_988238076
import typings.baconjs.Fn_XsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "_")
@js.native
object _underscore extends js.Object {
  @JSName("all")
  var all_Original: Fn_FXXs = js.native
  @JSName("always")
  var always_Original: Fn_XA = js.native
  var any: js.Any = js.native
  @JSName("bind")
  var bind_Original: Fn_Fn = js.native
  @JSName("contains")
  var contains_Original: Fn_XXs = js.native
  @JSName("each")
  var each_Original: Fn_FKey = js.native
  @JSName("empty")
  var empty_Original: Fn_XsA = js.native
  @JSName("filter")
  var filter_Original: Fn_A = js.native
  @JSName("flatMap")
  var flatMap_Original: Fn_FXXsA = js.native
  @JSName("fold")
  var fold_Original: Fn_Acc = js.native
  @JSName("head")
  var head_Original: Fn_Xs = js.native
  @JSName("id")
  var id_Original: Fn_XA_2056052176 = js.native
  @JSName("indexOf")
  var indexOf_Original: Fn_X = js.native
  @JSName("indexWhere")
  var indexWhere_Original: Fn_F = js.native
  @JSName("isFunction")
  var isFunction_Original: js.Function1[/* f */ js.Any, /* is std.Function */ Boolean] = js.native
  @JSName("last")
  var last_Original: Fn_XsAArray_988238076 = js.native
  @JSName("map")
  var map_Original: Fn_AF = js.native
  @JSName("negate")
  var negate_Original: Fn_FX = js.native
  @JSName("remove")
  var remove_Original: Fn_XXsArray = js.native
  @JSName("tail")
  var tail_Original: Fn_XsArray = js.native
  @JSName("toArray")
  var toArray_Original: Fn_XsAArray = js.native
  @JSName("toFunction")
  var toFunction_Original: Fn_FXV = js.native
  @JSName("toString")
  var toString_Original: js.Function1[/* obj */ js.Any, String] = js.native
  @JSName("without")
  var without_Original: Fn_XXsA = js.native
  def all[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Boolean = js.native
  def always[A](x: A): js.Function0[A] = js.native
  def bind[F /* <: js.Function */](fn: F, me: js.Any): F = js.native
  def contains[A](xs: js.Array[A], x: A): Boolean = js.native
  def each[A](xs: js.Any, f: js.Function2[/* key */ String, /* x */ A, _]): Unit = js.native
  def empty[A](xs: js.Array[A]): Boolean = js.native
  def filter[A](f: js.Function1[/* a */ A, Boolean], xs: js.Array[A]): js.Array[A] = js.native
  def flatMap[A, B](f: js.Function1[/* x */ A, js.Array[B]], xs: js.Array[A]): js.Array[B] = js.native
  def fold[V, A](xs: js.Array[V], seed: A, f: js.Function2[/* acc */ A, /* x */ V, A]): A = js.native
  def head[V](xs: js.Array[V]): V = js.native
  def id[A](x: A): A = js.native
  def indexOf[A](xs: js.Array[A], x: A): Double = js.native
  def indexWhere[A](xs: js.Array[A], f: js.Function1[/* x */ A, Boolean]): Double = js.native
  def isFunction(f: js.Any): /* is std.Function */ Boolean = js.native
  def last[A](xs: js.Array[A]): A = js.native
  def map[A, B](f: js.Function1[/* a */ A, B], xs: js.Array[A]): js.Array[B] = js.native
  def negate[A](f: js.Function1[/* x */ A, Boolean]): js.Function1[/* x */ A, Boolean] = js.native
  def remove[V](x: V, xs: js.Array[V]): js.UndefOr[js.Array[V]] = js.native
  def tail[V](xs: js.Array[V]): js.Array[V] = js.native
  def toArray[A](xs: A): js.Array[A] = js.native
  def toArray[A](xs: js.Array[A]): js.Array[A] = js.native
  def toFunction[V, V2](f: V2): js.Function1[/* x */ V, V2] = js.native
  def toFunction[V, V2](f: js.Function1[/* x */ V, V2]): js.Function1[/* x */ V, V2] = js.native
  def toString(obj: js.Any): String = js.native
  def without[A](x: A, xs: js.Array[A]): js.Array[A] = js.native
}

