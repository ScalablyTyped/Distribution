package typings.awsSdkClientKmsBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTagMod {
  
  @js.native
  trait Tag extends StObject {
    
    /**
      * <p>The key of the tag.</p>
      */
    var TagKey: String = js.native
    
    /**
      * <p>The value of the tag.</p>
      */
    var TagValue: String = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(TagKey: String, TagValue: String): Tag = {
      val __obj = js.Dynamic.literal(TagKey = TagKey.asInstanceOf[js.Any], TagValue = TagValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagKey(value: String): Self = StObject.set(x, "TagKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagValue(value: String): Self = StObject.set(x, "TagValue", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledTag = Tag
}
