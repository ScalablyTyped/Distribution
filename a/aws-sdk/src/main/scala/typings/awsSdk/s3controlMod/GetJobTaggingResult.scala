package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobTaggingResult extends js.Object {
  
  /**
    * The set of tags associated with the S3 Batch Operations job.
    */
  var Tags: js.UndefOr[S3TagSet] = js.native
}
object GetJobTaggingResult {
  
  @scala.inline
  def apply(): GetJobTaggingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobTaggingResult]
  }
  
  @scala.inline
  implicit class GetJobTaggingResultOps[Self <: GetJobTaggingResult] (val x: Self) extends AnyVal {
    
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
    def setTagsVarargs(value: S3Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: S3TagSet): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
