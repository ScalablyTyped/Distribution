package typings.baconjs.mod

import typings.baconjs.FnA
import typings.baconjs.FnAF
import typings.baconjs.FnAcc
import typings.baconjs.FnF
import typings.baconjs.FnFKey
import typings.baconjs.FnFX
import typings.baconjs.FnFXV
import typings.baconjs.FnFXXs
import typings.baconjs.FnFXXsA
import typings.baconjs.FnFn
import typings.baconjs.FnX
import typings.baconjs.FnXA
import typings.baconjs.FnXA1483268902
import typings.baconjs.FnXXs
import typings.baconjs.FnXXsA
import typings.baconjs.FnXXsArray
import typings.baconjs.FnXs
import typings.baconjs.FnXsA
import typings.baconjs.FnXsAArray
import typings.baconjs.FnXsAArray1891462469
import typings.baconjs.FnXsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "_")
@js.native
object _underscore extends js.Object {
  @JSName("all")
  var all_Original: FnFXXs = js.native
  @JSName("always")
  var always_Original: FnXA = js.native
  var any: js.Any = js.native
  @JSName("bind")
  var bind_Original: FnFn = js.native
  @JSName("contains")
  var contains_Original: FnXXs = js.native
  @JSName("each")
  var each_Original: FnFKey = js.native
  @JSName("empty")
  var empty_Original: FnXsA = js.native
  @JSName("filter")
  var filter_Original: FnA = js.native
  @JSName("flatMap")
  var flatMap_Original: FnFXXsA = js.native
  @JSName("fold")
  var fold_Original: FnAcc = js.native
  @JSName("head")
  var head_Original: FnXs = js.native
  @JSName("id")
  var id_Original: FnXA1483268902 = js.native
  @JSName("indexOf")
  var indexOf_Original: FnX = js.native
  @JSName("indexWhere")
  var indexWhere_Original: FnF = js.native
  @JSName("isFunction")
  var isFunction_Original: js.Function1[/* f */ js.Any, /* is std.Function */ Boolean] = js.native
  @JSName("last")
  var last_Original: FnXsAArray1891462469 = js.native
  @JSName("map")
  var map_Original: FnAF = js.native
  @JSName("negate")
  var negate_Original: FnFX = js.native
  @JSName("remove")
  var remove_Original: FnXXsArray = js.native
  @JSName("tail")
  var tail_Original: FnXsArray = js.native
  @JSName("toArray")
  var toArray_Original: FnXsAArray = js.native
  @JSName("toFunction")
  var toFunction_Original: FnFXV = js.native
  @JSName("toString")
  var toString_Original: js.Function1[/* obj */ js.Any, String] = js.native
  @JSName("without")
  var without_Original: FnXXsA = js.native
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

