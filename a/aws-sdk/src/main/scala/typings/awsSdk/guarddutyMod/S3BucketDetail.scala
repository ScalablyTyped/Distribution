package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketDetail extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var Arn: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the bucket was created at.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Describes the server side encryption method used in the S3 bucket.
    */
  var DefaultServerSideEncryption: js.UndefOr[typings.awsSdk.guarddutyMod.DefaultServerSideEncryption] = js.undefined
  
  /**
    * The name of the S3 bucket.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the S3 bucket.
    */
  var Owner: js.UndefOr[typings.awsSdk.guarddutyMod.Owner] = js.undefined
  
  /**
    * Describes the public access policies that apply to the S3 bucket.
    */
  var PublicAccess: js.UndefOr[typings.awsSdk.guarddutyMod.PublicAccess] = js.undefined
  
  /**
    * All tags attached to the S3 bucket
    */
  var Tags: js.UndefOr[typings.awsSdk.guarddutyMod.Tags] = js.undefined
  
  /**
    * Describes whether the bucket is a source or destination bucket.
    */
  var Type: js.UndefOr[String] = js.undefined
}
object S3BucketDetail {
  
  inline def apply(): S3BucketDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketDetail]
  }
  
  extension [Self <: S3BucketDetail](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDefaultServerSideEncryption(value: DefaultServerSideEncryption): Self = StObject.set(x, "DefaultServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setDefaultServerSideEncryptionUndefined: Self = StObject.set(x, "DefaultServerSideEncryption", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setPublicAccess(value: PublicAccess): Self = StObject.set(x, "PublicAccess", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessUndefined: Self = StObject.set(x, "PublicAccess", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
