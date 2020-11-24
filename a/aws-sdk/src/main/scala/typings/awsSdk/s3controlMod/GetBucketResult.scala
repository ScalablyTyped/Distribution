package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketResult extends js.Object {
  
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
  implicit class GetBucketResultOps[Self <: GetBucketResult] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket: Self = this.set("Bucket", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    
    @scala.inline
    def setPublicAccessBlockEnabled(value: PublicAccessBlockEnabled): Self = this.set("PublicAccessBlockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicAccessBlockEnabled: Self = this.set("PublicAccessBlockEnabled", js.undefined)
  }
}
