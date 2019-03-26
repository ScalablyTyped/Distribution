package typings
package cypressLib.typesBluebirdMod

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
  extends cypressLib.typesBluebirdMod.BluebirdNs.AggregateError {
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

