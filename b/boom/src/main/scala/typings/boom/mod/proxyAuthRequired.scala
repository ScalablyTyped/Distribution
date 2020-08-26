package typings.boom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boom", "proxyAuthRequired")
@js.native
object proxyAuthRequired extends js.Object {
  /**
    * Returns a 407 Proxy Authentication Required error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomproxyauthrequiredmessage-data}
    */
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
}

