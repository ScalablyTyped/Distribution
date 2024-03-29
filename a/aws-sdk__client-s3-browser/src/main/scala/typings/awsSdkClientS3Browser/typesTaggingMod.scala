package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesTagMod.Tag
import typings.awsSdkClientS3Browser.typesTagMod.UnmarshalledTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTaggingMod {
  
  trait Tagging extends StObject {
    
    /**
      * _TagSet shape
      */
    var TagSet: js.Array[Tag] | js.Iterable[Tag]
  }
  object Tagging {
    
    inline def apply(TagSet: js.Array[Tag] | js.Iterable[Tag]): Tagging = {
      val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tagging]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tagging] (val x: Self) extends AnyVal {
      
      inline def setTagSet(value: js.Array[Tag] | js.Iterable[Tag]): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
      
      inline def setTagSetVarargs(value: Tag*): Self = StObject.set(x, "TagSet", js.Array(value*))
    }
  }
  
  trait UnmarshalledTagging
    extends StObject
       with Tagging {
    
    /**
      * _TagSet shape
      */
    @JSName("TagSet")
    var TagSet_UnmarshalledTagging: js.Array[UnmarshalledTag]
  }
  object UnmarshalledTagging {
    
    inline def apply(TagSet: js.Array[UnmarshalledTag]): UnmarshalledTagging = {
      val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledTagging]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledTagging] (val x: Self) extends AnyVal {
      
      inline def setTagSet(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
      
      inline def setTagSetVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "TagSet", js.Array(value*))
    }
  }
}
