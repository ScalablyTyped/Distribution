package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMemberResponse extends StObject {
  
  /**
    * The AWS account ID for the account.
    */
  var accountId: js.UndefOr[string] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the account.
    */
  var arn: js.UndefOr[string] = js.native
  
  /**
    * The email address for the account.
    */
  var email: js.UndefOr[string] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
    */
  var invitedAt: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The AWS account ID for the master account.
    */
  var masterAccountId: js.UndefOr[string] = js.native
  
  /**
    * The current status of the relationship between the account and the master account.
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.native
  
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the member account in Amazon Macie.
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the relationship between the account and the master account.
    */
  var updatedAt: js.UndefOr[timestampIso8601] = js.native
}
object GetMemberResponse {
  
  @scala.inline
  def apply(): GetMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMemberResponse]
  }
  
  @scala.inline
  implicit class GetMemberResponseMutableBuilder[Self <: GetMemberResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setEmail(value: string): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setInvitedAt(value: timestampIso8601): Self = StObject.set(x, "invitedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvitedAtUndefined: Self = StObject.set(x, "invitedAt", js.undefined)
    
    @scala.inline
    def setMasterAccountId(value: string): Self = StObject.set(x, "masterAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterAccountIdUndefined: Self = StObject.set(x, "masterAccountId", js.undefined)
    
    @scala.inline
    def setRelationshipStatus(value: RelationshipStatus): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: timestampIso8601): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
