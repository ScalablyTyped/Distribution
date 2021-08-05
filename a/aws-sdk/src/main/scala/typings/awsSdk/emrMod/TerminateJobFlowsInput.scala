package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateJobFlowsInput extends StObject {
  
  /**
    * A list of job flows to be shutdown.
    */
  var JobFlowIds: XmlStringList
}
object TerminateJobFlowsInput {
  
  inline def apply(JobFlowIds: XmlStringList): TerminateJobFlowsInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateJobFlowsInput]
  }
  
  extension [Self <: TerminateJobFlowsInput](x: Self) {
    
    inline def setJobFlowIds(value: XmlStringList): Self = StObject.set(x, "JobFlowIds", value.asInstanceOf[js.Any])
    
    inline def setJobFlowIdsVarargs(value: XmlString*): Self = StObject.set(x, "JobFlowIds", js.Array(value :_*))
  }
}
