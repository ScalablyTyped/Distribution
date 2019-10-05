package typings.cypress.typesBluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cypress/types/bluebird", "setScheduler")
@js.native
object setScheduler extends js.Object {
  /**
    * Changes how bluebird schedules calls a-synchronously.
    *
    * @param scheduler Should be a function that asynchronously schedules
    *                  the calling of the passed in function
    */
  def apply(scheduler: js.Function1[/* callback */ js.Function1[/* repeated */ js.Any, Unit], Unit]): Unit = js.native
}

