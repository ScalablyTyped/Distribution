package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalizableToString extends js.Object {
  /** Get the resulting CAML query as string */
  def ToString(): String
}

object IFinalizableToString {
  @scala.inline
  def apply(ToString: () => String): IFinalizableToString = {
    val __obj = js.Dynamic.literal(ToString = js.Any.fromFunction0(ToString))
  
    __obj.asInstanceOf[IFinalizableToString]
  }
}

