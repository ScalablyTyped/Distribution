package typings
package camljsLib.camljsMod.CamlBuilderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISortedQuery extends IFinalizable {
  /** Specifies next order field (ascending) */
  def ThenBy(fieldInternalName: java.lang.String): js.Any
  /** Specifies next order field (descending) */
  def ThenByDesc(fieldInternalName: java.lang.String): js.Any
}

object ISortedQuery {
  @scala.inline
  def apply(
    ThenBy: js.Function1[java.lang.String, js.Any],
    ThenByDesc: js.Function1[java.lang.String, js.Any],
    ToCamlQuery: js.Function0[js.Any],
    ToString: js.Function0[java.lang.String]
  ): ISortedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ThenBy")(ThenBy)
    __obj.updateDynamic("ThenByDesc")(ThenByDesc)
    __obj.updateDynamic("ToCamlQuery")(ToCamlQuery)
    __obj.updateDynamic("ToString")(ToString)
    __obj.asInstanceOf[ISortedQuery]
  }
}

