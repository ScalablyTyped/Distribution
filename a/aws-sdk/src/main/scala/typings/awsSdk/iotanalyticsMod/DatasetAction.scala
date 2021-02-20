package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetAction extends StObject {
  
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
  implicit class DatasetActionMutableBuilder[Self <: DatasetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionName(value: DatasetActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    @scala.inline
    def setContainerAction(value: ContainerDatasetAction): Self = StObject.set(x, "containerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerActionUndefined: Self = StObject.set(x, "containerAction", js.undefined)
    
    @scala.inline
    def setQueryAction(value: SqlQueryDatasetAction): Self = StObject.set(x, "queryAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryActionUndefined: Self = StObject.set(x, "queryAction", js.undefined)
  }
}
