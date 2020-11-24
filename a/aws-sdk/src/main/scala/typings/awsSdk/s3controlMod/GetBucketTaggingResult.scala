package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketTaggingResult extends js.Object {
  
  /**
    * The tags set of the Outposts bucket.
    */
  var TagSet: S3TagSet = js.native
}
object GetBucketTaggingResult {
  
  @scala.inline
  def apply(TagSet: S3TagSet): GetBucketTaggingResult = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingResult]
  }
  
  @scala.inline
  implicit class GetBucketTaggingResultOps[Self <: GetBucketTaggingResult] (val x: Self) extends AnyVal {
    
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
    def setTagSetVarargs(value: S3Tag*): Self = this.set("TagSet", js.Array(value :_*))
    
    @scala.inline
    def setTagSet(value: S3TagSet): Self = this.set("TagSet", value.asInstanceOf[js.Any])
  }
}
