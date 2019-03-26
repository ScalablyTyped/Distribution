package typings
package cypressLib.typesBluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that an operation has been aborted or cancelled. The default reason used by `.cancel`.
  */
@JSImport("cypress/types/bluebird", "CancellationError")
@js.native
class CancellationError ()
  extends cypressLib.typesBluebirdMod.BluebirdNs.CancellationError {
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

