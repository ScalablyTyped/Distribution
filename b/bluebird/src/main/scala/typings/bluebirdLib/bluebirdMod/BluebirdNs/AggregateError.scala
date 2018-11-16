package typings
package bluebirdLib.bluebirdMod.BluebirdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * A collection of errors. `AggregateError` is an array-like object, with numeric indices and a `.length` property.
   *  It supports all generic array methods such as `.forEach` directly.
   *
   * `AggregateError`s are caught in `.error` handlers, even if the contained errors are not operational.
   *
   * `Promise.some` and `Promise.any` use `AggregateError` as rejection reason when they fail.
   */
@js.native
trait AggregateError
  extends stdLib.Error
     with stdLib.ArrayLike[stdLib.Error] {
  def every(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def every(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ],
    thisArg: js.Any
  ): scala.Boolean = js.native
  def filter(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ]
  ): AggregateError = js.native
  def filter(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ],
    thisArg: js.Any
  ): AggregateError = js.native
  def forEach(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Unit
    ]
  ): js.UndefOr[scala.Nothing] = js.native
  def forEach(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Unit
    ],
    thisArg: js.Any
  ): js.UndefOr[scala.Nothing] = js.native
  def indexOf(searchElement: stdLib.Error): scala.Double = js.native
  def indexOf(searchElement: stdLib.Error, fromIndex: scala.Double): scala.Double = js.native
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  def lastIndexOf(searchElement: stdLib.Error): scala.Double = js.native
  def lastIndexOf(searchElement: stdLib.Error, fromIndex: scala.Double): scala.Double = js.native
  def map(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ]
  ): AggregateError = js.native
  def map(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ],
    thisArg: js.Any
  ): AggregateError = js.native
  def pop(): stdLib.Error = js.native
  def push(errors: stdLib.Error*): scala.Double = js.native
  def reduce(
    callback: js.Function4[
      /* accumulator */ js.Any, 
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      _
    ]
  ): js.Any = js.native
  def reduce(
    callback: js.Function4[
      /* accumulator */ js.Any, 
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      _
    ],
    initialValue: js.Any
  ): js.Any = js.native
  def reduceRight(
    callback: js.Function4[
      /* previousValue */ js.Any, 
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      _
    ]
  ): js.Any = js.native
  def reduceRight(
    callback: js.Function4[
      /* previousValue */ js.Any, 
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      _
    ],
    initialValue: js.Any
  ): js.Any = js.native
  def reverse(): AggregateError = js.native
  def shift(): stdLib.Error = js.native
  def slice(): AggregateError = js.native
  def slice(begin: scala.Double): AggregateError = js.native
  def slice(begin: scala.Double, end: scala.Double): AggregateError = js.native
  def some(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def some(
    callback: js.Function3[
      /* element */ stdLib.Error, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ],
    thisArg: js.Any
  ): scala.Boolean = js.native
  def sort(): AggregateError = js.native
  def sort(
    compareFunction: js.Function2[/* errLeft */ stdLib.Error, /* errRight */ stdLib.Error, scala.Double]
  ): AggregateError = js.native
  def unshift(errors: stdLib.Error*): scala.Double = js.native
}

