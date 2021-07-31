package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics application from which to remove the tags.
    */
  var ResourceARN: KinesisAnalyticsARN
  
  /**
    * A list of keys of tags to remove from the specified application.
    */
  var TagKeys: typings.awsSdk.kinesisanalyticsMod.TagKeys
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(ResourceARN: KinesisAnalyticsARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceARN(value: KinesisAnalyticsARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
