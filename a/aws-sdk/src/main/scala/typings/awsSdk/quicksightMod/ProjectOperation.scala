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
}

