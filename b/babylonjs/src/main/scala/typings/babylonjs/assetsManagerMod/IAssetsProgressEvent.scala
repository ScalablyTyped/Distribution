package typings.babylonjs.assetsManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAssetsProgressEvent extends js.Object {
  
  /**
    * Defines the number of remaining tasks to process
    */
  var remainingCount: Double = js.native
  
  /**
    * Defines the task that was just processed
    */
  var task: AbstractAssetTask = js.native
  
  /**
    * Defines the total number of tasks
    */
  var totalCount: Double = js.native
}
object IAssetsProgressEvent {
  
  @scala.inline
  def apply(remainingCount: Double, task: AbstractAssetTask, totalCount: Double): IAssetsProgressEvent = {
    val __obj = js.Dynamic.literal(remainingCount = remainingCount.asInstanceOf[js.Any], task = task.asInstanceOf[js.Any], totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssetsProgressEvent]
  }
  
  @scala.inline
  implicit class IAssetsProgressEventOps[Self <: IAssetsProgressEvent] (val x: Self) extends AnyVal {
    
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
    def setRemainingCount(value: Double): Self = this.set("remainingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTask(value: AbstractAssetTask): Self = this.set("task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
  }
}
