package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTaggingMod {
  
  @js.native
  trait Tagging extends StObject {
    
    /**
      * _TagSet shape
      */
    var TagSet: js.Array[Tag] | Iterable[Tag] = js.native
  }
  object Tagging {
    
    @scala.inline
    def apply(TagSet: js.Array[Tag] | Iterable[Tag]): Tagging = {
      val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tagging]
    }
    
    @scala.inline
    implicit class TaggingMutableBuilder[Self <: Tagging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagSet(value: js.Array[Tag] | Iterable[Tag]): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagSetVarargs(value: Tag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledTagging extends Tagging {
    
    /**
      * _TagSet shape
      */
    @JSName("TagSet")
    var TagSet_UnmarshalledTagging: js.Array[UnmarshalledTag] = js.native
  }
  object UnmarshalledTagging {
    
    @scala.inline
    def apply(TagSet: js.Array[UnmarshalledTag]): UnmarshalledTagging = {
      val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledTagging]
    }
    
    @scala.inline
    implicit class UnmarshalledTaggingMutableBuilder[Self <: UnmarshalledTagging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTagSet(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagSetVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
    }
  }
}
