package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extendable[T] extends js.Object {
  /**
    * Extends the current observable with particular functionality depending on the parameters specified.
    * If the method is called without arguments and jsvalue framework is included the observable will be
    * extended with the methods available in jsvalue for the current type.
    * 
    * @param name Name of the extender
    * @param options Optional options
    */
  def extend(): T = js.native
  def extend(arg: js.Any): T = js.native
  def extend(name: String, options: js.Any*): T = js.native
}

