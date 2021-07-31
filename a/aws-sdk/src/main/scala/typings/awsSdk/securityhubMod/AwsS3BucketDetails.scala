package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsS3BucketDetails extends StObject {
  
  /**
    * Indicates when the S3 bucket was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreatedAt: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The canonical user ID of the owner of the S3 bucket.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The display name of the owner of the S3 bucket.
    */
  var OwnerName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The encryption rules that are applied to the S3 bucket.
    */
  var ServerSideEncryptionConfiguration: js.UndefOr[AwsS3BucketServerSideEncryptionConfiguration] = js.undefined
}
object AwsS3BucketDetails {
  
  @scala.inline
  def apply(): AwsS3BucketDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsS3BucketDetails]
  }
  
  @scala.inline
  implicit class AwsS3BucketDetailsMutableBuilder[Self <: AwsS3BucketDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: NonEmptyString): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setOwnerId(value: NonEmptyString): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setOwnerName(value: NonEmptyString): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNameUndefined: Self = StObject.set(x, "OwnerName", js.undefined)
    
    @scala.inline
    def setServerSideEncryptionConfiguration(value: AwsS3BucketServerSideEncryptionConfiguration): Self = StObject.set(x, "ServerSideEncryptionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSideEncryptionConfigurationUndefined: Self = StObject.set(x, "ServerSideEncryptionConfiguration", js.undefined)
  }
}
