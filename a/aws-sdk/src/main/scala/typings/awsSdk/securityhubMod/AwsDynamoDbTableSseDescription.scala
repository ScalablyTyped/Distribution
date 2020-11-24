package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableSseDescription extends js.Object {
  
  /**
    * If the key is inaccessible, the date and time when DynamoDB detected that the key was inaccessible. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var InaccessibleEncryptionDateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The ARN of the AWS KMS customer master key (CMK) that is used for the AWS KMS encryption.
    */
  var KmsMasterKeyArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The type of server-side encryption.
    */
  var SseType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the server-side encryption.
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
}
object AwsDynamoDbTableSseDescription {
  
  @scala.inline
  def apply(): AwsDynamoDbTableSseDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsDynamoDbTableSseDescription]
  }
  
  @scala.inline
  implicit class AwsDynamoDbTableSseDescriptionOps[Self <: AwsDynamoDbTableSseDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInaccessibleEncryptionDateTime(value: NonEmptyString): Self = this.set("InaccessibleEncryptionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInaccessibleEncryptionDateTime: Self = this.set("InaccessibleEncryptionDateTime", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyArn(value: NonEmptyString): Self = this.set("KmsMasterKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsMasterKeyArn: Self = this.set("KmsMasterKeyArn", js.undefined)
    
    @scala.inline
    def setSseType(value: NonEmptyString): Self = this.set("SseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseType: Self = this.set("SseType", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
