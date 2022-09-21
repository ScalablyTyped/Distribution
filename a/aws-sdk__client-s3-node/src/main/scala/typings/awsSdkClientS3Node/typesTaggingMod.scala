package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
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
    
    extension [Self <: Tagging](x: Self) {
      
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
    
    extension [Self <: UnmarshalledTagging](x: Self) {
      
      inline def setTagSet(value: js.Array[UnmarshalledTag]): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
      
      inline def setTagSetVarargs(value: UnmarshalledTag*): Self = StObject.set(x, "TagSet", js.Array(value*))
    }
  }
}
