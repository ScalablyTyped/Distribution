package typings
package camljsLib.camljsMod

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
    ThenBy: java.lang.String => js.Any,
    ThenByDesc: java.lang.String => js.Any,
    ToCamlQuery: () => js.Any,
    ToString: () => java.lang.String
  ): ISortedQuery = {
    val __obj = js.Dynamic.literal(ThenBy = js.Any.fromFunction1(ThenBy), ThenByDesc = js.Any.fromFunction1(ThenByDesc), ToCamlQuery = js.Any.fromFunction0(ToCamlQuery), ToString = js.Any.fromFunction0(ToString))
  
    __obj.asInstanceOf[ISortedQuery]
  }
}

