package typings.builderDashUtil.builderDashUtilMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("builder-util", "InvalidConfigurationError")
@js.native
class InvalidConfigurationError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

