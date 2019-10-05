package typings.commander.commanderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("commander", "Option")
@js.native
class OptionCls protected ()
  extends typings.commander.commanderMod.local.Option {
  /**
    * Initialize a new `Option` with the given `flags` and `description`.
    *
    * @param {string} flags
    * @param {string} [description]
    */
  def this(flags: String) = this()
  def this(flags: String, description: String) = this()
  /* CompleteClass */
  override var bool: Boolean = js.native
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var flags: String = js.native
  /* CompleteClass */
  override var long: String = js.native
  /* CompleteClass */
  override var optional: Boolean = js.native
  /* CompleteClass */
  override var required: Boolean = js.native
}

