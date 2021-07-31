package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketTaggingOutput extends StObject {
  
  /**
    * Contains the tag set.
    */
  var TagSet: typings.awsSdk.s3Mod.TagSet
}
object GetBucketTaggingOutput {
  
  @scala.inline
  def apply(TagSet: TagSet): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
  
  @scala.inline
  implicit class GetBucketTaggingOutputMutableBuilder[Self <: GetBucketTaggingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagSet(value: TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSetVarargs(value: Tag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
  }
}
