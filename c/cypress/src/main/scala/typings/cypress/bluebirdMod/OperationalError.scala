package typings.cypress.bluebirdMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an error is an explicit promise rejection as opposed to a thrown error.
  *  For example, if an error is errbacked by a callback API promisified through undefined or undefined
  *  and is not a typed error, it will be converted to a `OperationalError` which has the original error in
  *  the `.cause` property.
  *
  * `OperationalError`s are caught in `.error` handlers.
  */
@JSImport("cypress/types/bluebird", "OperationalError")
@js.native
class OperationalError () extends Error {
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

