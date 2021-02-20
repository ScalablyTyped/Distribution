package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunCommandParameters extends StObject {
  
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
  implicit class RunCommandParametersMutableBuilder[Self <: RunCommandParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunCommandTargets(value: RunCommandTargets): Self = StObject.set(x, "RunCommandTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunCommandTargetsVarargs(value: RunCommandTarget*): Self = StObject.set(x, "RunCommandTargets", js.Array(value :_*))
  }
}
