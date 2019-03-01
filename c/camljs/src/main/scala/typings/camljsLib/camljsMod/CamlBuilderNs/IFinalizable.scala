package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFinalizable extends IFinalizableToString {
  /** Get the resulting CAML query as SP.CamlQuery object */
  def ToCamlQuery(): js.Any
}

object IFinalizable {
  @scala.inline
  def apply(ToCamlQuery: js.Function0[js.Any], ToString: js.Function0[java.lang.String]): IFinalizable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ToCamlQuery")(ToCamlQuery)
    __obj.updateDynamic("ToString")(ToString)
    __obj.asInstanceOf[IFinalizable]
  }
}

