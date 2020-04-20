package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalizable extends IFinalizableToString {
  /** Get the resulting CAML query as SP.CamlQuery object */
  def ToCamlQuery(): js.Any
}

object IFinalizable {
  @scala.inline
  def apply(ToCamlQuery: () => js.Any, ToString: () => String): IFinalizable = {
    val __obj = js.Dynamic.literal(ToCamlQuery = js.Any.fromFunction0(ToCamlQuery), ToString = js.Any.fromFunction0(ToString))
    __obj.asInstanceOf[IFinalizable]
  }
}

