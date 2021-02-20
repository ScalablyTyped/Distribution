package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApprovalStateChangedEventMetadata extends StObject {
  
  /**
    * The approval status for the pull request.
    */
  var approvalStatus: js.UndefOr[ApprovalState] = js.native
  
  /**
    * The revision ID of the pull request when the approval state changed.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}
object ApprovalStateChangedEventMetadata {
  
  @scala.inline
  def apply(): ApprovalStateChangedEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalStateChangedEventMetadata]
  }
  
  @scala.inline
  implicit class ApprovalStateChangedEventMetadataMutableBuilder[Self <: ApprovalStateChangedEventMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApprovalStatus(value: ApprovalState): Self = StObject.set(x, "approvalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApprovalStatusUndefined: Self = StObject.set(x, "approvalStatus", js.undefined)
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
