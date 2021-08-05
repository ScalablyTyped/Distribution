package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMemberResponse extends StObject {
  
  /**
    * The AWS account ID for the account.
    */
  var accountId: js.UndefOr[string] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the account.
    */
  var arn: js.UndefOr[string] = js.undefined
  
  /**
    * The email address for the account.
    */
  var email: js.UndefOr[string] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
    */
  var invitedAt: js.UndefOr[timestampIso8601] = js.undefined
  
  /**
    * The AWS account ID for the master account.
    */
  var masterAccountId: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of the relationship between the account and the master account.
    */
  var relationshipStatus: js.UndefOr[RelationshipStatus] = js.undefined
  
  /**
    * A map of key-value pairs that identifies the tags (keys and values) that are associated with the member account in Amazon Macie.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The date and time, in UTC and extended ISO 8601 format, of the most recent change to the status of the relationship between the account and the master account.
    */
  var updatedAt: js.UndefOr[timestampIso8601] = js.undefined
}
object GetMemberResponse {
  
  inline def apply(): GetMemberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMemberResponse]
  }
  
  extension [Self <: GetMemberResponse](x: Self) {
    
    inline def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setArn(value: string): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setEmail(value: string): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setInvitedAt(value: timestampIso8601): Self = StObject.set(x, "invitedAt", value.asInstanceOf[js.Any])
    
    inline def setInvitedAtUndefined: Self = StObject.set(x, "invitedAt", js.undefined)
    
    inline def setMasterAccountId(value: string): Self = StObject.set(x, "masterAccountId", value.asInstanceOf[js.Any])
    
    inline def setMasterAccountIdUndefined: Self = StObject.set(x, "masterAccountId", js.undefined)
    
    inline def setRelationshipStatus(value: RelationshipStatus): Self = StObject.set(x, "relationshipStatus", value.asInstanceOf[js.Any])
    
    inline def setRelationshipStatusUndefined: Self = StObject.set(x, "relationshipStatus", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setUpdatedAt(value: timestampIso8601): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
