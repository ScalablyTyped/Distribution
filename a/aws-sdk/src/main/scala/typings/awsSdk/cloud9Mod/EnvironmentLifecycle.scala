package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentLifecycle extends js.Object {
  
  /**
    * If the environment failed to delete, the Amazon Resource Name (ARN) of the related AWS resource.
    */
  var failureResource: js.UndefOr[String] = js.native
  
  /**
    * Any informational message about the lifecycle state of the environment.
    */
  var reason: js.UndefOr[String] = js.native
  
  /**
    * The current creation or deletion lifecycle state of the environment.    CREATING: The environment is in the process of being created.    CREATED: The environment was successfully created.    CREATE_FAILED: The environment failed to be created.    DELETING: The environment is in the process of being deleted.    DELETE_FAILED: The environment failed to delete.  
    */
  var status: js.UndefOr[EnvironmentLifecycleStatus] = js.native
}
object EnvironmentLifecycle {
  
  @scala.inline
  def apply(): EnvironmentLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentLifecycle]
  }
  
  @scala.inline
  implicit class EnvironmentLifecycleOps[Self <: EnvironmentLifecycle] (val x: Self) extends AnyVal {
    
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
    def setFailureResource(value: String): Self = this.set("failureResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureResource: Self = this.set("failureResource", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setStatus(value: EnvironmentLifecycleStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
