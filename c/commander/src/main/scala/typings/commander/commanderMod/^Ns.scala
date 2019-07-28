package typings.commander.commanderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("commander", JSImport.Namespace)
@js.native
object `^Ns` extends js.Object {
  @js.native
  /**
    * Initialize a new `Command`.
    *
    * @param {string} [name]
    */
  class Command ()
    extends typings.commander.commanderMod.localNs.Command {
    def this(name: String) = this()
  }
  
  @js.native
  class Option protected ()
    extends typings.commander.commanderMod.localNs.Option {
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
  
}

