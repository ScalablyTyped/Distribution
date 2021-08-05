package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel from which you want to remove tags.
    */
  var ResourceARN: typings.awsSdk.kinesisvideoMod.ResourceARN
  
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typings.awsSdk.kinesisvideoMod.TagKeyList
}
object UntagResourceInput {
  
  inline def apply(ResourceARN: ResourceARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  extension [Self <: UntagResourceInput](x: Self) {
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTagKeyList(value: TagKeyList): Self = StObject.set(x, "TagKeyList", value.asInstanceOf[js.Any])
    
    inline def setTagKeyListVarargs(value: TagKey*): Self = StObject.set(x, "TagKeyList", js.Array(value :_*))
  }
}
