package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymbolConstructor extends js.Object {
  /**
    * A String value that is used in the creation of the default string description of an object.
    * Called by the built-in method Object.prototype.toString.
    */
  val toStringTag: js.Symbol
}

object SymbolConstructor {
  @scala.inline
  def apply(toStringTag: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal(toStringTag = toStringTag.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SymbolConstructor]
  }
}

