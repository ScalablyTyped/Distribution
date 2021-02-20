package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateJobFlowsInput extends StObject {
  
  /**
    * A list of job flows to be shutdown.
    */
  var JobFlowIds: XmlStringList = js.native
}
object TerminateJobFlowsInput {
  
  @scala.inline
  def apply(JobFlowIds: XmlStringList): TerminateJobFlowsInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateJobFlowsInput]
  }
  
  @scala.inline
  implicit class TerminateJobFlowsInputMutableBuilder[Self <: TerminateJobFlowsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobFlowIds(value: XmlStringList): Self = StObject.set(x, "JobFlowIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobFlowIdsVarargs(value: XmlString*): Self = StObject.set(x, "JobFlowIds", js.Array(value :_*))
  }
}
