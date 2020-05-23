package typings.cypress.bluebirdMod

import typings.std.ArrayLike
import typings.std.Error
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
@JSImport("cypress/types/bluebird", "AggregateError")
@js.native
class AggregateError ()
  extends ArrayLike[Error]
     with Error {
  /* CompleteClass */
  override val length: Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  def every(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean]): Boolean = js.native
  def every(
    callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  def filter(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean]): AggregateError = js.native
  def filter(
    callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean],
    thisArg: js.Any
  ): AggregateError = js.native
  def forEach(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Unit]): js.UndefOr[scala.Nothing] = js.native
  def forEach(
    callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Unit],
    thisArg: js.Any
  ): js.UndefOr[scala.Nothing] = js.native
  def indexOf(searchElement: Error): Double = js.native
  def indexOf(searchElement: Error, fromIndex: Double): Double = js.native
  def join(): String = js.native
  def join(separator: String): String = js.native
  def lastIndexOf(searchElement: Error): Double = js.native
  def lastIndexOf(searchElement: Error, fromIndex: Double): Double = js.native
  def map(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean]): AggregateError = js.native
  def map(
    callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean],
    thisArg: js.Any
  ): AggregateError = js.native
  def pop(): Error = js.native
  def push(errors: Error*): Double = js.native
  def reduce(
    callback: js.Function4[
      /* accumulator */ js.Any, 
      /* element */ Error, 
      /* index */ Double, 
      /* array */ this.type, 
      _
    ]
  ): js.Any = js.native
  def reduce(
    callback: js.Function4[
      /* accumulator */ js.Any, 
      /* element */ Error, 
      /* index */ Double, 
      /* array */ this.type, 
      _
    ],
    initialValue: js.Any
  ): js.Any = js.native
  def reduceRight(
    callback: js.Function4[
      /* previousValue */ js.Any, 
      /* element */ Error, 
      /* index */ Double, 
      /* array */ this.type, 
      _
    ]
  ): js.Any = js.native
  def reduceRight(
    callback: js.Function4[
      /* previousValue */ js.Any, 
      /* element */ Error, 
      /* index */ Double, 
      /* array */ this.type, 
      _
    ],
    initialValue: js.Any
  ): js.Any = js.native
  def reverse(): AggregateError = js.native
  def shift(): Error = js.native
  def slice(): AggregateError = js.native
  def slice(begin: Double): AggregateError = js.native
  def slice(begin: Double, end: Double): AggregateError = js.native
  def some(callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean]): Boolean = js.native
  def some(
    callback: js.Function3[/* element */ Error, /* index */ Double, /* array */ this.type, Boolean],
    thisArg: js.Any
  ): Boolean = js.native
  def sort(): AggregateError = js.native
  def sort(compareFunction: js.Function2[/* errLeft */ Error, /* errRight */ Error, Double]): AggregateError = js.native
  def unshift(errors: Error*): Double = js.native
}

