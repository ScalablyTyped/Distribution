package typings
package bluebirdLib.bluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object BluebirdNs {
  /**
     * Signals that an operation has been aborted or cancelled. The default reason used by `.cancel`.
     */
  type CancellationError = stdLib.Error
  /**
     * Represents an error is an explicit promise rejection as opposed to a thrown error.
     *  For example, if an error is errbacked by a callback API promisified through undefined or undefined
     *  and is not a typed error, it will be converted to a `OperationalError` which has the original error in
     *  the `.cause` property.
     *
     * `OperationalError`s are caught in `.error` handlers.
     */
  type OperationalError = stdLib.Error
  type ResolvableProps[T] = js.Object with bluebirdLib.bluebirdLibStrings.ResolvableProps with T
  /** @deprecated Use PromiseLike<T> directly. */
  type Thenable[T] = js.Thenable[T]
  /**
     * Signals that an operation has timed out. Used as a custom cancellation reason in `.timeout`.
     */
  type TimeoutError = stdLib.Error
}
