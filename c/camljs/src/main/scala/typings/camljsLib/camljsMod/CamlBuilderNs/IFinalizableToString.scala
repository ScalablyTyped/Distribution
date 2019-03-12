package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalizableToString extends js.Object {
  /** Get the resulting CAML query as string */
  def ToString(): java.lang.String
}

object IFinalizableToString {
  @scala.inline
  def apply(ToString: () => java.lang.String): IFinalizableToString = {
    val __obj = js.Dynamic.literal(ToString = js.Any.fromFunction0(ToString))
  
    __obj.asInstanceOf[IFinalizableToString]
  }
}

