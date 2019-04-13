package typings
package commanderLib.commanderMod

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
    extends commanderLib.commanderMod.localNs.Command {
    def this(name: java.lang.String) = this()
  }
  
  @js.native
  class Option protected ()
    extends commanderLib.commanderMod.localNs.Option {
    /**
      * Initialize a new `Option` with the given `flags` and `description`.
      *
      * @param {string} flags
      * @param {string} [description]
      */
    def this(flags: java.lang.String) = this()
    def this(flags: java.lang.String, description: java.lang.String) = this()
    /* CompleteClass */
    override var bool: scala.Boolean = js.native
    /* CompleteClass */
    override var description: java.lang.String = js.native
    /* CompleteClass */
    override var flags: java.lang.String = js.native
    /* CompleteClass */
    override var long: java.lang.String = js.native
    /* CompleteClass */
    override var optional: scala.Boolean = js.native
    /* CompleteClass */
    override var required: scala.Boolean = js.native
  }
  
}

