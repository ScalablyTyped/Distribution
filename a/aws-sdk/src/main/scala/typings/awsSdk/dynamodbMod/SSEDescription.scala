package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSEDescription extends js.Object {
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
  implicit class SSEDescriptionOps[Self <: SSEDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInaccessibleEncryptionDateTime(value: Date): Self = this.set("InaccessibleEncryptionDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInaccessibleEncryptionDateTime: Self = this.set("InaccessibleEncryptionDateTime", js.undefined)
    @scala.inline
    def setKMSMasterKeyArn(value: KMSMasterKeyArn): Self = this.set("KMSMasterKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKMSMasterKeyArn: Self = this.set("KMSMasterKeyArn", js.undefined)
    @scala.inline
    def setSSEType(value: SSEType): Self = this.set("SSEType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSSEType: Self = this.set("SSEType", js.undefined)
    @scala.inline
    def setStatus(value: SSEStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

