package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAssetsProgressEvent extends StObject {
  
  /**
    * Defines the number of remaining tasks to process
    */
  var remainingCount: Double
  
  /**
    * Defines the task that was just processed
    */
  var task: AbstractAssetTask
  
  /**
    * Defines the total number of tasks
    */
  var totalCount: Double
}
object IAssetsProgressEvent {
  
  inline def apply(remainingCount: Double, task: AbstractAssetTask, totalCount: Double): IAssetsProgressEvent = {
    val __obj = js.Dynamic.literal(remainingCount = remainingCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssetsProgressEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAssetsProgressEvent] (val x: Self) extends AnyVal {
    
    inline def setRemainingCount(value: Double): Self = StObject.set(x, "remainingCount", value.asInstanceOf[js.Any])
    
    inline def setTask(value: AbstractAssetTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTotalCount(value: Double): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
  }
}
