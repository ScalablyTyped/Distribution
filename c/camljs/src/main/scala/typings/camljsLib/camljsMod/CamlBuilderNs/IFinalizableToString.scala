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
  def apply(ToString: js.Function0[java.lang.String]): IFinalizableToString = {
    val __obj = js.Dynamic.literal(ToString = ToString)
  
    __obj.asInstanceOf[IFinalizableToString]
  }
}

