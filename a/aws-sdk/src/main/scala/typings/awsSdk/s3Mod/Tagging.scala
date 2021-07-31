package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tagging extends StObject {
  
  /**
    * A collection for a set of tags
    */
  var TagSet: typings.awsSdk.s3Mod.TagSet
}
object Tagging {
  
  @scala.inline
  def apply(TagSet: TagSet): Tagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagging]
  }
  
  @scala.inline
  implicit class TaggingMutableBuilder[Self <: Tagging] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagSet(value: TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSetVarargs(value: Tag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
  }
}
