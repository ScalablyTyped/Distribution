package typings.awsSdk.signerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SignedObject extends StObject {
  
  /**
    * Name of the S3 bucket.
    */
  var bucketName: js.UndefOr[BucketName] = js.undefined
  
  /**
    * Key name that uniquely identifies a signed code image in your bucket.
    */
  var key: js.UndefOr[typings.awsSdk.signerMod.key] = js.undefined
}
object S3SignedObject {
  
  @scala.inline
  def apply(): S3SignedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3SignedObject]
  }
  
  @scala.inline
  implicit class S3SignedObjectMutableBuilder[Self <: S3SignedObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
    
    @scala.inline
    def setKey(value: key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
  }
}
