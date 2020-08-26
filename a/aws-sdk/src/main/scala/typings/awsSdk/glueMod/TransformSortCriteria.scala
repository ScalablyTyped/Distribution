package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformSortCriteria extends js.Object {
  /**
    * The column to be used in the sorting criteria that are associated with the machine learning transform.
    */
  var Column: TransformSortColumnType = js.native
  /**
    * The sort direction to be used in the sorting criteria that are associated with the machine learning transform.
    */
  var SortDirection: SortDirectionType = js.native
}

object TransformSortCriteria {
  @scala.inline
  def apply(Column: TransformSortColumnType, SortDirection: SortDirectionType): TransformSortCriteria = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], SortDirection = SortDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformSortCriteria]
  }
  @scala.inline
  implicit class TransformSortCriteriaOps[Self <: TransformSortCriteria] (val x: Self) extends AnyVal {
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
    def setColumn(value: TransformSortColumnType): Self = this.set("Column", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortDirection(value: SortDirectionType): Self = this.set("SortDirection", value.asInstanceOf[js.Any])
  }
  
}

