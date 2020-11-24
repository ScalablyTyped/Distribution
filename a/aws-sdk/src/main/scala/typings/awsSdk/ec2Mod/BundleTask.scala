package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundleTask extends js.Object {
  
  /**
    * The ID of the bundle task.
    */
  var BundleId: js.UndefOr[String] = js.native
  
  /**
    * If the task fails, a description of the error.
    */
  var BundleTaskError: js.UndefOr[typings.awsSdk.ec2Mod.BundleTaskError] = js.native
  
  /**
    * The ID of the instance associated with this bundle task.
    */
  var InstanceId: js.UndefOr[String] = js.native
  
  /**
    * The level of task completion, as a percent (for example, 20%).
    */
  var Progress: js.UndefOr[String] = js.native
  
  /**
    * The time this task started.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The state of the task.
    */
  var State: js.UndefOr[BundleTaskState] = js.native
  
  /**
    * The Amazon S3 storage locations.
    */
  var Storage: js.UndefOr[typings.awsSdk.ec2Mod.Storage] = js.native
  
  /**
    * The time of the most recent update for the task.
    */
  var UpdateTime: js.UndefOr[DateTime] = js.native
}
object BundleTask {
  
  @scala.inline
  def apply(): BundleTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleTask]
  }
  
  @scala.inline
  implicit class BundleTaskOps[Self <: BundleTask] (val x: Self) extends AnyVal {
    
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
    def setBundleId(value: String): Self = this.set("BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleId: Self = this.set("BundleId", js.undefined)
    
    @scala.inline
    def setBundleTaskError(value: BundleTaskError): Self = this.set("BundleTaskError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBundleTaskError: Self = this.set("BundleTaskError", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = this.set("Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setState(value: BundleTaskState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setStorage(value: Storage): Self = this.set("Storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("Storage", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: DateTime): Self = this.set("UpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("UpdateTime", js.undefined)
  }
}
