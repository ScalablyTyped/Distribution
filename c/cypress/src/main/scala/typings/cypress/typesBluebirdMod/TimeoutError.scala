package typings.cypress.typesBluebirdMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Signals that an operation has timed out. Used as a custom cancellation reason in `.timeout`.
  */
@JSImport("cypress/types/bluebird", "TimeoutError")
@js.native
class TimeoutError () extends Error {
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

