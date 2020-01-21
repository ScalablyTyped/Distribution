package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryTaskFilter extends js.Object {
  /**
    * Name of the task property to use in filtering the tasks returned in the response.   Use file-system-id to retrieve data repository tasks for specific file systems.   Use task-lifecycle to retrieve data repository tasks with one or more specific lifecycle states, as follows: CANCELED, EXECUTING, FAILED, PENDING, and SUCCEEDED.  
    */
  var Name: js.UndefOr[DataRepositoryTaskFilterName] = js.native
  /**
    * Use Values to include the specific file system IDs and task lifecycle states for the filters you are using.
    */
  var Values: js.UndefOr[DataRepositoryTaskFilterValues] = js.native
}

object DataRepositoryTaskFilter {
  @scala.inline
  def apply(Name: DataRepositoryTaskFilterName = null, Values: DataRepositoryTaskFilterValues = null): DataRepositoryTaskFilter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRepositoryTaskFilter]
  }
}

