package typings.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunCommandParameters extends js.Object {
  
  /**
    * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds or a tag.
    */
  var RunCommandTargets: typings.awsSdk.cloudwatcheventsMod.RunCommandTargets = js.native
}
object RunCommandParameters {
  
  @scala.inline
  def apply(RunCommandTargets: RunCommandTargets): RunCommandParameters = {
    val __obj = js.Dynamic.literal(RunCommandTargets = RunCommandTargets.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunCommandParameters]
  }
  
  @scala.inline
  implicit class RunCommandParametersOps[Self <: RunCommandParameters] (val x: Self) extends AnyVal {
    
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
    def setRunCommandTargetsVarargs(value: RunCommandTarget*): Self = this.set("RunCommandTargets", js.Array(value :_*))
    
    @scala.inline
    def setRunCommandTargets(value: RunCommandTargets): Self = this.set("RunCommandTargets", value.asInstanceOf[js.Any])
  }
}
