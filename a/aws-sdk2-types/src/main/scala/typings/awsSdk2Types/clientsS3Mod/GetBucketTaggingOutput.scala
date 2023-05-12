package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketTaggingOutput extends StObject {
  
  /**
    * Contains the tag set.
    */
  var TagSet: typings.awsSdk2Types.clientsS3Mod.TagSet
}
object GetBucketTaggingOutput {
  
  inline def apply(TagSet: TagSet): GetBucketTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketTaggingOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketTaggingOutput] (val x: Self) extends AnyVal {
    
    inline def setTagSet(value: TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    inline def setTagSetVarargs(value: Tag*): Self = StObject.set(x, "TagSet", js.Array(value*))
  }
}
