package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionDefaultExecutionConfig extends js.Object {
  var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.native
  var RunAs: js.UndefOr[FunctionRunAsConfig] = js.native
}

object FunctionDefaultExecutionConfig {
  @scala.inline
  def apply(IsolationMode: FunctionIsolationMode = null, RunAs: FunctionRunAsConfig = null): FunctionDefaultExecutionConfig = {
    val __obj = js.Dynamic.literal()
    if (IsolationMode != null) __obj.updateDynamic("IsolationMode")(IsolationMode.asInstanceOf[js.Any])
    if (RunAs != null) __obj.updateDynamic("RunAs")(RunAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionDefaultExecutionConfig]
  }
}

