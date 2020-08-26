package typings.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnWildcard extends js.Object {
  /**
    * Excludes column names. Any column with this name will be excluded.
    */
  var ExcludedColumnNames: js.UndefOr[ColumnNames] = js.native
}

object ColumnWildcard {
  @scala.inline
  def apply(): ColumnWildcard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnWildcard]
  }
  @scala.inline
  implicit class ColumnWildcardOps[Self <: ColumnWildcard] (val x: Self) extends AnyVal {
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
    def setExcludedColumnNamesVarargs(value: NameString*): Self = this.set("ExcludedColumnNames", js.Array(value :_*))
    @scala.inline
    def setExcludedColumnNames(value: ColumnNames): Self = this.set("ExcludedColumnNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludedColumnNames: Self = this.set("ExcludedColumnNames", js.undefined)
  }
  
}

