package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SSEDescription extends StObject {
  
  /**
    * Indicates the time, in UNIX epoch date format, when DynamoDB detected that the table's AWS KMS key was inaccessible. This attribute will automatically be cleared when DynamoDB detects that the table's AWS KMS key is accessible again. DynamoDB will initiate the table archival process when table's AWS KMS key remains inaccessible for more than seven days from this date.
    */
  var InaccessibleEncryptionDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The AWS KMS customer master key (CMK) ARN used for the AWS KMS encryption.
    */
  var KMSMasterKeyArn: js.UndefOr[typings.awsSdk.dynamodbMod.KMSMasterKeyArn] = js.native
  
  /**
    * Server-side encryption type. The only supported value is:    KMS - Server-side encryption that uses AWS Key Management Service. The key is stored in your account and is managed by AWS KMS (AWS KMS charges apply).  
    */
  var SSEType: js.UndefOr[typings.awsSdk.dynamodbMod.SSEType] = js.native
  
  /**
    * Represents the current state of server-side encryption. The only supported values are:    ENABLED - Server-side encryption is enabled.    UPDATING - Server-side encryption is being updated.  
    */
  var Status: js.UndefOr[SSEStatus] = js.native
}
object SSEDescription {
  
  @scala.inline
  def apply(): SSEDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSEDescription]
  }
  
  @scala.inline
  implicit class SSEDescriptionMutableBuilder[Self <: SSEDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInaccessibleEncryptionDateTime(value: Date): Self = StObject.set(x, "InaccessibleEncryptionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInaccessibleEncryptionDateTimeUndefined: Self = StObject.set(x, "InaccessibleEncryptionDateTime", js.undefined)
    
    @scala.inline
    def setKMSMasterKeyArn(value: KMSMasterKeyArn): Self = StObject.set(x, "KMSMasterKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKMSMasterKeyArnUndefined: Self = StObject.set(x, "KMSMasterKeyArn", js.undefined)
    
    @scala.inline
    def setSSEType(value: SSEType): Self = StObject.set(x, "SSEType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSETypeUndefined: Self = StObject.set(x, "SSEType", js.undefined)
    
    @scala.inline
    def setStatus(value: SSEStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
