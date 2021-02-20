package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BundleTask extends StObject {
  
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
  implicit class BundleTaskMutableBuilder[Self <: BundleTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundleId(value: String): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    @scala.inline
    def setBundleTaskError(value: BundleTaskError): Self = StObject.set(x, "BundleTaskError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundleTaskErrorUndefined: Self = StObject.set(x, "BundleTaskError", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setState(value: BundleTaskState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStorage(value: Storage): Self = StObject.set(x, "Storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "Storage", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: DateTime): Self = StObject.set(x, "UpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "UpdateTime", js.undefined)
  }
}
