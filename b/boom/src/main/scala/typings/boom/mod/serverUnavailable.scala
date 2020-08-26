package typings.boom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boom", "serverUnavailable")
@js.native
object serverUnavailable extends js.Object {
  /**
    * Returns a 503 Service Unavailable error with your error message to the user
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomserverunavailablemessage-data}
    */
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
}

