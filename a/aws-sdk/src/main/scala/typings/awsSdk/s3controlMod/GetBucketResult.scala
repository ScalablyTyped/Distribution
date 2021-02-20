package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketResult extends StObject {
  
  /**
    * The Outposts bucket requested.
    */
  var Bucket: js.UndefOr[BucketName] = js.native
  
  /**
    * The creation date of the Outposts bucket.
    */
  var CreationDate: js.UndefOr[typings.awsSdk.s3controlMod.CreationDate] = js.native
  
  /**
    * 
    */
  var PublicAccessBlockEnabled: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockEnabled] = js.native
}
object GetBucketResult {
  
  @scala.inline
  def apply(): GetBucketResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketResult]
  }
  
  @scala.inline
  implicit class GetBucketResultMutableBuilder[Self <: GetBucketResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setPublicAccessBlockEnabled(value: PublicAccessBlockEnabled): Self = StObject.set(x, "PublicAccessBlockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessBlockEnabledUndefined: Self = StObject.set(x, "PublicAccessBlockEnabled", js.undefined)
  }
}
