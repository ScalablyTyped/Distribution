package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRunSortCriteria extends js.Object {
  /**
    * The column to be used to sort the list of task runs for the machine learning transform.
    */
  var Column: TaskRunSortColumnType = js.native
  /**
    * The sort direction to be used to sort the list of task runs for the machine learning transform.
    */
  var SortDirection: SortDirectionType = js.native
}

object TaskRunSortCriteria {
  @scala.inline
  def apply(Column: TaskRunSortColumnType, SortDirection: SortDirectionType): TaskRunSortCriteria = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], SortDirection = SortDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskRunSortCriteria]
  }
}

