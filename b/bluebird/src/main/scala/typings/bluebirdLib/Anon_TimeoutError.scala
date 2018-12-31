package typings
package bluebirdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimeoutError extends js.Object {
  /**
    * A collection of errors. `AggregateError` is an array-like object, with numeric indices and a `.length` property.
    *  It supports all generic array methods such as `.forEach` directly.
    *
    * `AggregateError`s are caught in `.error` handlers, even if the contained errors are not operational.
    *
    * `Promise.some` and `Promise.any` use `AggregateError` as rejection reason when they fail.
    */
  var AggregateError: org.scalablytyped.runtime.Instantiable0[bluebirdLib.bluebirdMod.BluebirdNs.AggregateError]
  /**
    * Signals that an operation has been aborted or cancelled. The default reason used by `.cancel`.
    */
  var CancellationError: org.scalablytyped.runtime.Instantiable0[bluebirdLib.bluebirdMod.BluebirdNs.CancellationError]
  /**
    * returned by `Bluebird.disposer()`.
    */
  var Disposer: org.scalablytyped.runtime.Instantiable0[
    bluebirdLib.bluebirdMod.BluebirdNs.Disposer[
      /* import warning: DefaultedTParams.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for R */ js.Any
    ]
  ]
  /**
    * Represents an error is an explicit promise rejection as opposed to a thrown error.
    *  For example, if an error is errbacked by a callback API promisified through undefined or undefined
    *  and is not a typed error, it will be converted to a `OperationalError` which has the original error in
    *  the `.cause` property.
    *
    * `OperationalError`s are caught in `.error` handlers.
    */
  var OperationalError: org.scalablytyped.runtime.Instantiable0[bluebirdLib.bluebirdMod.BluebirdNs.OperationalError]
  /**
    * Signals that an operation has timed out. Used as a custom cancellation reason in `.timeout`.
    */
  var TimeoutError: org.scalablytyped.runtime.Instantiable0[bluebirdLib.bluebirdMod.BluebirdNs.TimeoutError]
  /**
    * Returns a new independent copy of the Bluebird library.
    *
    * This method should be used before you use any of the methods which would otherwise alter the global Bluebird object - to avoid polluting global state.
    */
  def getNewLibraryCopy(): /* import warning: ImportType.apply Failed type conversion: typeof bluebird.bluebird.Bluebird */ js.Any
  /**
    * This is relevant to browser environments with no module loader.
    *
    * Release control of the Promise namespace to whatever it was before this library was loaded.
    * Returns a reference to the library namespace so you can attach it to something else.
    */
  def noConflict(): /* import warning: ImportType.apply Failed type conversion: typeof bluebird.bluebird.Bluebird */ js.Any
  /**
    * Changes how bluebird schedules calls a-synchronously.
    *
    * @param scheduler Should be a function that asynchronously schedules
    *                  the calling of the passed in function
    */
  def setScheduler(
    scheduler: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit]
  ): scala.Unit
}

