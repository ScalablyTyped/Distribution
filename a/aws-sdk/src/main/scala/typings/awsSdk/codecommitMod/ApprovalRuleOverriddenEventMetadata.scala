package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApprovalRuleOverriddenEventMetadata extends StObject {
  
  /**
    * The status of the override event.
    */
  var overrideStatus: js.UndefOr[OverrideStatus] = js.undefined
  
  /**
    * The revision ID of the pull request when the override event occurred.
    */
  var revisionId: js.UndefOr[RevisionId] = js.undefined
}
object ApprovalRuleOverriddenEventMetadata {
  
  @scala.inline
  def apply(): ApprovalRuleOverriddenEventMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApprovalRuleOverriddenEventMetadata]
  }
  
  @scala.inline
  implicit class ApprovalRuleOverriddenEventMetadataMutableBuilder[Self <: ApprovalRuleOverriddenEventMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverrideStatus(value: OverrideStatus): Self = StObject.set(x, "overrideStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrideStatusUndefined: Self = StObject.set(x, "overrideStatus", js.undefined)
    
    @scala.inline
    def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
