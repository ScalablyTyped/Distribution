package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetAction extends js.Object {
  
  /**
    * The name of the data set action by which data set contents are automatically created.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.native
  
  /**
    * Information that allows the system to run a containerized application to create the dataset contents. The application must be in a Docker container along with any required support libraries.
    */
  var containerAction: js.UndefOr[ContainerDatasetAction] = js.native
  
  /**
    * An SqlQueryDatasetAction object that uses an SQL query to automatically create data set contents.
    */
  var queryAction: js.UndefOr[SqlQueryDatasetAction] = js.native
}
object DatasetAction {
  
  @scala.inline
  def apply(): DatasetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetAction]
  }
  
  @scala.inline
  implicit class DatasetActionOps[Self <: DatasetAction] (val x: Self) extends AnyVal {
    
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
    def setActionName(value: DatasetActionName): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionName: Self = this.set("actionName", js.undefined)
    
    @scala.inline
    def setContainerAction(value: ContainerDatasetAction): Self = this.set("containerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerAction: Self = this.set("containerAction", js.undefined)
    
    @scala.inline
    def setQueryAction(value: SqlQueryDatasetAction): Self = this.set("queryAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryAction: Self = this.set("queryAction", js.undefined)
  }
}
