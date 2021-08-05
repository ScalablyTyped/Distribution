package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowUpdate extends StObject {
  
  /**
    * The status of the investigation into the finding. The allowed values are the following.    NEW - The initial state of a finding, before it is reviewed.    NOTIFIED - Indicates that you notified the resource owner about the security issue. Used when the initial reviewer is not the resource owner, and needs intervention from the resource owner.    RESOLVED - The finding was reviewed and remediated and is now considered resolved.    SUPPRESSED - The finding will not be reviewed again and will not be acted upon.  
    */
  var Status: js.UndefOr[WorkflowStatus] = js.undefined
}
object WorkflowUpdate {
  
  inline def apply(): WorkflowUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowUpdate]
  }
  
  extension [Self <: WorkflowUpdate](x: Self) {
    
    inline def setStatus(value: WorkflowStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
