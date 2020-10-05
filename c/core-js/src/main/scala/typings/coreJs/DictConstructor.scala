package typings.coreJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.IterableIterator
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictConstructor
  extends Instantiable0[Dict[js.Any | js.Object]]
     with Instantiable1[(/* value */ js.Any) | (/* value */ Dict[js.Object]), Dict[js.Any | js.Object]] {
  def apply(): Dict[_] = js.native
  def apply(value: js.Any): Dict[_] = js.native
  def apply[T](value: Dict[T]): Dict[T] = js.native
  def entries[T](`object`: Dict[T]): IterableIterator[js.Tuple2[PropertyKey, T]] = js.native
  def every[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean]
  ): Boolean = js.native
  def every[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  def filter[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean]
  ): Dict[T] = js.native
  def filter[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean],
    thisArg: js.Any
  ): Dict[T] = js.native
  def find[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean]
  ): js.UndefOr[T] = js.native
  def find[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean],
    thisArg: js.Any
  ): js.UndefOr[T] = js.native
  def findKey[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean]
  ): PropertyKey = js.native
  def findKey[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean],
    thisArg: js.Any
  ): PropertyKey = js.native
  def forEach[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Unit]
  ): Unit = js.native
  def forEach[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
  def get[T](`object`: Dict[T], key: PropertyKey): js.UndefOr[T] = js.native
  def has[T](`object`: Dict[T], key: PropertyKey): Boolean = js.native
  def includes[T](`object`: Dict[T], value: T): Boolean = js.native
  def isDict(value: js.Any): /* is core-js.Dict<any> */ Boolean = js.native
  def keyOf[T](`object`: Dict[T], value: T): PropertyKey = js.native
  def keys[T](`object`: Dict[T]): IterableIterator[PropertyKey] = js.native
  def map[T, U](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], U]
  ): Dict[U] = js.native
  def map[T, U](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], U],
    thisArg: js.Any
  ): Dict[U] = js.native
  def mapPairs[T, U](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], js.Tuple2[PropertyKey, U]]
  ): Dict[U] = js.native
  def mapPairs[T, U](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], js.Tuple2[PropertyKey, U]],
    thisArg: js.Any
  ): Dict[U] = js.native
  def reduce[T](
    `object`: Dict[T],
    callbackfn: js.Function4[/* previousValue */ T, /* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], T]
  ): T = js.native
  def reduce[T](
    `object`: Dict[T],
    callbackfn: js.Function4[/* previousValue */ T, /* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], T],
    initialValue: T
  ): T = js.native
  @JSName("reduce")
  def reduce_TU_U[T, U](
    `object`: Dict[T],
    callbackfn: js.Function4[/* previousValue */ U, /* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], U],
    initialValue: U
  ): U = js.native
  def set[T](`object`: Dict[T], key: PropertyKey, value: T): Dict[T] = js.native
  def some[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean]
  ): Boolean = js.native
  def some[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  def turn[T](
    `object`: Dict[T],
    callbackfn: js.Function4[/* memo */ Dict[T], /* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Unit]
  ): Dict[T] = js.native
  def turn[T](
    `object`: Dict[T],
    callbackfn: js.Function4[/* memo */ Dict[T], /* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Unit],
    memo: Dict[T]
  ): Dict[T] = js.native
  @JSName("turn")
  def turn_TU[T, U](
    `object`: Dict[T],
    callbackfn: js.Function4[/* memo */ Dict[U], /* value */ T, /* key */ PropertyKey, /* dict */ Dict[T], Unit],
    memo: Dict[U]
  ): Dict[U] = js.native
  def values[T](`object`: Dict[T]): IterableIterator[T] = js.native
}

