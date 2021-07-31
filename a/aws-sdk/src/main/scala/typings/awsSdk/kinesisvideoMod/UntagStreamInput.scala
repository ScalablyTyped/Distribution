package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagStreamInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream that you want to remove tags from.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.undefined
  
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typings.awsSdk.kinesisvideoMod.TagKeyList
}
object UntagStreamInput {
  
  @scala.inline
  def apply(TagKeyList: TagKeyList): UntagStreamInput = {
    val __obj = js.Dynamic.literal(TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagStreamInput]
  }
  
  @scala.inline
  implicit class UntagStreamInputMutableBuilder[Self <: UntagStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    @scala.inline
    def setTagKeyList(value: TagKeyList): Self = StObject.set(x, "TagKeyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyListVarargs(value: TagKey*): Self = StObject.set(x, "TagKeyList", js.Array(value :_*))
  }
}
