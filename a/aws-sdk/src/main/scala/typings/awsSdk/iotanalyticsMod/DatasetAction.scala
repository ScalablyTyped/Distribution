package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetAction extends js.Object {
  /**
    * The name of the data set action by which data set contents are automatically created.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.native
  /**
    * Information which allows the system to run a containerized application in order to create the data set contents. The application must be in a Docker container along with any needed support libraries.
    */
  var containerAction: js.UndefOr[ContainerDatasetAction] = js.native
  /**
    * An "SqlQueryDatasetAction" object that uses an SQL query to automatically create data set contents.
    */
  var queryAction: js.UndefOr[SqlQueryDatasetAction] = js.native
}

object DatasetAction {
  @scala.inline
  def apply(
    actionName: DatasetActionName = null,
    containerAction: ContainerDatasetAction = null,
    queryAction: SqlQueryDatasetAction = null
  ): DatasetAction = {
    val __obj = js.Dynamic.literal()
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (containerAction != null) __obj.updateDynamic("containerAction")(containerAction.asInstanceOf[js.Any])
    if (queryAction != null) __obj.updateDynamic("queryAction")(queryAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatasetAction]
  }
}

