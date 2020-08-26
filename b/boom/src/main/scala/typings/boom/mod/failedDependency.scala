package typings.boom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("boom", "failedDependency")
@js.native
object failedDependency extends js.Object {
  /**
    * Returns a 424 Failed Dependency error
    * @param message optional message.
    * @param data optional additional error data.
    * @see {@link https://github.com/hapijs/boom#boomfaileddependencymessage-data}
    */
  def apply[Data](): Boom[Data] = js.native
  def apply[Data](message: js.UndefOr[scala.Nothing], data: Data): Boom[Data] = js.native
  def apply[Data](message: String): Boom[Data] = js.native
  def apply[Data](message: String, data: Data): Boom[Data] = js.native
}

