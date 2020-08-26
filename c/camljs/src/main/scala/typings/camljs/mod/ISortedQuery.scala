package typings.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISortedQuery extends IFinalizable {
  /** Specifies next order field (ascending) */
  def ThenBy(fieldInternalName: String): js.Any = js.native
  /** Specifies next order field (descending) */
  def ThenByDesc(fieldInternalName: String): js.Any = js.native
}

object ISortedQuery {
  @scala.inline
  def apply(
    ThenBy: String => js.Any,
    ThenByDesc: String => js.Any,
    ToCamlQuery: () => js.Any,
    ToString: () => String
  ): ISortedQuery = {
    val __obj = js.Dynamic.literal(ThenBy = js.Any.fromFunction1(ThenBy), ThenByDesc = js.Any.fromFunction1(ThenByDesc), ToCamlQuery = js.Any.fromFunction0(ToCamlQuery), ToString = js.Any.fromFunction0(ToString))
    __obj.asInstanceOf[ISortedQuery]
  }
  @scala.inline
  implicit class ISortedQueryOps[Self <: ISortedQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setThenBy(value: String => js.Any): Self = this.set("ThenBy", js.Any.fromFunction1(value))
    @scala.inline
    def setThenByDesc(value: String => js.Any): Self = this.set("ThenByDesc", js.Any.fromFunction1(value))
  }
  
}

