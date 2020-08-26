package typings.boom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boom", "badImplementation")
@js.native
object badImplementation extends js.Object {
  // 5xx
  /**
    * Returns a 500 Internal Server Error error
    * Only 500 errors will hide your message from the end user. Your message is recorded in the server log.
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boombadimplementationmessage-data---alias-internal}
    */
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
}

