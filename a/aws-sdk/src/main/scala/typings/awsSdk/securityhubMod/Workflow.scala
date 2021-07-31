package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Workflow extends StObject {
  
  /**
    * The status of the investigation into the finding. The allowed values are the following.    NEW - The initial state of a finding, before it is reviewed.    NOTIFIED - Indicates that you notified the resource owner about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner.    SUPPRESSED - The finding will not be reviewed again and will not be acted upon.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.   
    */
  var Status: js.UndefOr[WorkflowStatus] = js.undefined
}
object Workflow {
  
  @scala.inline
  def apply(): Workflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Workflow]
  }
  
  @scala.inline
  implicit class WorkflowMutableBuilder[Self <: Workflow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: WorkflowStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
