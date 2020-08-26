package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectOperation extends js.Object {
  /**
    * Projected columns.
    */
  var ProjectedColumns: ProjectedColumnList = js.native
}

object ProjectOperation {
  @scala.inline
  def apply(ProjectedColumns: ProjectedColumnList): ProjectOperation = {
    val __obj = js.Dynamic.literal(ProjectedColumns = ProjectedColumns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectOperation]
  }
  @scala.inline
  implicit class ProjectOperationOps[Self <: ProjectOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProjectedColumnsVarargs(value: String*): Self = this.set("ProjectedColumns", js.Array(value :_*))
    @scala.inline
    def setProjectedColumns(value: ProjectedColumnList): Self = this.set("ProjectedColumns", value.asInstanceOf[js.Any])
  }
  
}

