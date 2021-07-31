package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobTaggingResult extends StObject {
  
  /**
    * The set of tags associated with the S3 Batch Operations job.
    */
  var Tags: js.UndefOr[S3TagSet] = js.undefined
}
object GetJobTaggingResult {
  
  @scala.inline
  def apply(): GetJobTaggingResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobTaggingResult]
  }
  
  @scala.inline
  implicit class GetJobTaggingResultMutableBuilder[Self <: GetJobTaggingResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTags(value: S3TagSet): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: S3Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
