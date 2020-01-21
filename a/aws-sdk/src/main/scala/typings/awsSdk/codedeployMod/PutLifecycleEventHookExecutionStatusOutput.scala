package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLifecycleEventHookExecutionStatusOutput extends js.Object {
  /**
    * The execution ID of the lifecycle event hook. A hook is specified in the hooks section of the deployment's AppSpec file.
    */
  var lifecycleEventHookExecutionId: js.UndefOr[LifecycleEventHookExecutionId] = js.native
}

object PutLifecycleEventHookExecutionStatusOutput {
  @scala.inline
  def apply(lifecycleEventHookExecutionId: LifecycleEventHookExecutionId = null): PutLifecycleEventHookExecutionStatusOutput = {
    val __obj = js.Dynamic.literal()
    if (lifecycleEventHookExecutionId != null) __obj.updateDynamic("lifecycleEventHookExecutionId")(lifecycleEventHookExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLifecycleEventHookExecutionStatusOutput]
  }
}

