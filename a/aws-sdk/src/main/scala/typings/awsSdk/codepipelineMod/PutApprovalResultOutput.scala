package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutApprovalResultOutput extends StObject {
  
  /**
    * The timestamp showing when the approval or rejection was submitted.
    */
  var approvedAt: js.UndefOr[Timestamp] = js.undefined
}
object PutApprovalResultOutput {
  
  inline def apply(): PutApprovalResultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutApprovalResultOutput]
  }
  
  extension [Self <: PutApprovalResultOutput](x: Self) {
    
    inline def setApprovedAt(value: Timestamp): Self = StObject.set(x, "approvedAt", value.asInstanceOf[js.Any])
    
    inline def setApprovedAtUndefined: Self = StObject.set(x, "approvedAt", js.undefined)
  }
}
