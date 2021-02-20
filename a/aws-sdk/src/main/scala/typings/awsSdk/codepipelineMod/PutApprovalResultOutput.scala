package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutApprovalResultOutput extends StObject {
  
  /**
    * The timestamp showing when the approval or rejection was submitted.
    */
  var approvedAt: js.UndefOr[Timestamp] = js.native
}
object PutApprovalResultOutput {
  
  @scala.inline
  def apply(): PutApprovalResultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutApprovalResultOutput]
  }
  
  @scala.inline
  implicit class PutApprovalResultOutputMutableBuilder[Self <: PutApprovalResultOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovedAt(value: Timestamp): Self = StObject.set(x, "approvedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovedAtUndefined: Self = StObject.set(x, "approvedAt", js.undefined)
  }
}
