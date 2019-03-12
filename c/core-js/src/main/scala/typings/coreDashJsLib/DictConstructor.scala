package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictConstructor
  extends org.scalablytyped.runtime.Instantiable0[Dict[js.Object] | Dict[js.Any]]
     with org.scalablytyped.runtime.Instantiable1[
      (/* value */ js.Any) | (/* value */ Dict[js.Object]), 
      Dict[js.Object] | Dict[js.Any]
    ] {
  def apply(): Dict[_] = js.native
  def apply(value: js.Any): Dict[_] = js.native
  def apply[T](value: Dict[T]): Dict[T] = js.native
  def entries[T](`object`: Dict[T]): stdLib.IterableIterator[js.Tuple2[stdLib.PropertyKey, T]] = js.native
  def every[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean]
  ): scala.Boolean = js.native
  def every[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean],
    thisArg: js.Any
  ): scala.Boolean = js.native
  def filter[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean]
  ): Dict[T] = js.native
  def filter[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean],
    thisArg: js.Any
  ): Dict[T] = js.native
  def find[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean]
  ): T = js.native
  def find[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean],
    thisArg: js.Any
  ): T = js.native
  def findKey[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean]
  ): stdLib.PropertyKey = js.native
  def findKey[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean],
    thisArg: js.Any
  ): stdLib.PropertyKey = js.native
  def forEach[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Unit]
  ): scala.Unit = js.native
  def forEach[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  def get[T](`object`: Dict[T], key: stdLib.PropertyKey): T = js.native
  def has[T](`object`: Dict[T], key: stdLib.PropertyKey): scala.Boolean = js.native
  def includes[T](`object`: Dict[T], value: T): scala.Boolean = js.native
  def isDict(value: js.Any): scala.Boolean = js.native
  def keyOf[T](`object`: Dict[T], value: T): stdLib.PropertyKey = js.native
  def keys[T](`object`: Dict[T]): stdLib.IterableIterator[stdLib.PropertyKey] = js.native
  def map[T, U](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], U]
  ): Dict[U] = js.native
  def map[T, U](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], U],
    thisArg: js.Any
  ): Dict[U] = js.native
  def mapPairs[T, U](
    `object`: Dict[T],
    callbackfn: js.Function3[
      /* value */ T, 
      /* key */ stdLib.PropertyKey, 
      /* dict */ Dict[T], 
      js.Tuple2[stdLib.PropertyKey, U]
    ]
  ): Dict[U] = js.native
  def mapPairs[T, U](
    `object`: Dict[T],
    callbackfn: js.Function3[
      /* value */ T, 
      /* key */ stdLib.PropertyKey, 
      /* dict */ Dict[T], 
      js.Tuple2[stdLib.PropertyKey, U]
    ],
    thisArg: js.Any
  ): Dict[U] = js.native
  def reduce[T](
    `object`: Dict[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* value */ T, 
      /* key */ stdLib.PropertyKey, 
      /* dict */ Dict[T], 
      T
    ]
  ): T = js.native
  def reduce[T](
    `object`: Dict[T],
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* value */ T, 
      /* key */ stdLib.PropertyKey, 
      /* dict */ Dict[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  @JSName("reduce")
  def reduce_TUU[T, U](
    `object`: Dict[T],
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* value */ T, 
      /* key */ stdLib.PropertyKey, 
      /* dict */ Dict[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  def set[T](`object`: Dict[T], key: stdLib.PropertyKey, value: T): Dict[T] = js.native
  def some[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean]
  ): scala.Boolean = js.native
  def some[T](
    `object`: Dict[T],
    callbackfn: js.Function3[/* value */ T, /* key */ stdLib.PropertyKey, /* dict */ Dict[T], scala.Boolean],
    thisArg: js.Any
  ): scala.Boolean = js.native
  def turn[T](
    `object`: Dict[T],
    callbackfn: js.Function4[
      /* memo */ Dict[T], 
      /* value */ T, 
      /* key */ stdLib.PropertyKey, 
      /* dict */ Dict[T], 
      scala.Unit
    ]
  ): Dict[T] = js.native
  def turn[T](
    `object`: Dict[T],
    callbackfn: js.Function4[
      /* memo */ Dict[T], 
      /* value */ T, 
      /* key */ stdLib.PropertyKey, 
      /* dict */ Dict[T], 
      scala.Unit
    ],
    memo: Dict[T]
  ): Dict[T] = js.native
  @JSName("turn")
  def turn_TU[T, U](
    `object`: Dict[T],
    callbackfn: js.Function4[
      /* memo */ Dict[U], 
      /* value */ T, 
      /* key */ stdLib.PropertyKey, 
      /* dict */ Dict[T], 
      scala.Unit
    ],
    memo: Dict[U]
  ): Dict[U] = js.native
  def values[T](`object`: Dict[T]): stdLib.IterableIterator[T] = js.native
}

