package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3BucketDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var Arn: js.UndefOr[String] = js.native
  
  /**
    * The date and time the bucket was created at.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  
  /**
    * Describes the server side encryption method used in the S3 bucket.
    */
  var DefaultServerSideEncryption: js.UndefOr[typings.awsSdk.guarddutyMod.DefaultServerSideEncryption] = js.native
  
  /**
    * The name of the S3 bucket.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The owner of the S3 bucket.
    */
  var Owner: js.UndefOr[typings.awsSdk.guarddutyMod.Owner] = js.native
  
  /**
    * Describes the public access policies that apply to the S3 bucket.
    */
  var PublicAccess: js.UndefOr[typings.awsSdk.guarddutyMod.PublicAccess] = js.native
  
  /**
    * All tags attached to the S3 bucket
    */
  var Tags: js.UndefOr[typings.awsSdk.guarddutyMod.Tags] = js.native
  
  /**
    * Describes whether the bucket is a source or destination bucket.
    */
  var Type: js.UndefOr[String] = js.native
}
object S3BucketDetail {
  
  @scala.inline
  def apply(): S3BucketDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketDetail]
  }
  
  @scala.inline
  implicit class S3BucketDetailMutableBuilder[Self <: S3BucketDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: Timestamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setDefaultServerSideEncryption(value: DefaultServerSideEncryption): Self = StObject.set(x, "DefaultServerSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultServerSideEncryptionUndefined: Self = StObject.set(x, "DefaultServerSideEncryption", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    @scala.inline
    def setPublicAccess(value: PublicAccess): Self = StObject.set(x, "PublicAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessUndefined: Self = StObject.set(x, "PublicAccess", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
