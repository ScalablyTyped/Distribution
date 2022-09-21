package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetAction extends StObject {
  
  /**
    * The name of the dataset action by which dataset contents are automatically created.
    */
  var actionName: js.UndefOr[DatasetActionName] = js.undefined
  
  /**
    * Information that allows the system to run a containerized application to create the dataset contents. The application must be in a Docker container along with any required support libraries.
    */
  var containerAction: js.UndefOr[ContainerDatasetAction] = js.undefined
  
  /**
    * An SqlQueryDatasetAction object that uses an SQL query to automatically create dataset contents.
    */
  var queryAction: js.UndefOr[SqlQueryDatasetAction] = js.undefined
}
object DatasetAction {
  
  inline def apply(): DatasetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetAction]
  }
  
  extension [Self <: DatasetAction](x: Self) {
    
    inline def setActionName(value: DatasetActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionNameUndefined: Self = StObject.set(x, "actionName", js.undefined)
    
    inline def setContainerAction(value: ContainerDatasetAction): Self = StObject.set(x, "containerAction", value.asInstanceOf[js.Any])
    
    inline def setContainerActionUndefined: Self = StObject.set(x, "containerAction", js.undefined)
    
    inline def setQueryAction(value: SqlQueryDatasetAction): Self = StObject.set(x, "queryAction", value.asInstanceOf[js.Any])
    
    inline def setQueryActionUndefined: Self = StObject.set(x, "queryAction", js.undefined)
  }
}
