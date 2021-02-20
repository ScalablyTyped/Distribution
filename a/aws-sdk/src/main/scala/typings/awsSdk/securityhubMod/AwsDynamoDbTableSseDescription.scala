package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsDynamoDbTableSseDescription extends StObject {
  
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
  implicit class AwsDynamoDbTableSseDescriptionMutableBuilder[Self <: AwsDynamoDbTableSseDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInaccessibleEncryptionDateTime(value: NonEmptyString): Self = StObject.set(x, "InaccessibleEncryptionDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInaccessibleEncryptionDateTimeUndefined: Self = StObject.set(x, "InaccessibleEncryptionDateTime", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyArn(value: NonEmptyString): Self = StObject.set(x, "KmsMasterKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsMasterKeyArnUndefined: Self = StObject.set(x, "KmsMasterKeyArn", js.undefined)
    
    @scala.inline
    def setSseType(value: NonEmptyString): Self = StObject.set(x, "SseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseTypeUndefined: Self = StObject.set(x, "SseType", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
