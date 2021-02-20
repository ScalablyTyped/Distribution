package typings.awsSdkClientS3Node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTagMod {
  
  @js.native
  trait Tag extends StObject {
    
    /**
      * <p>Name of the tag.</p>
      */
    var Key: String = js.native
    
    /**
      * <p>Value of the tag.</p>
      */
    var Value: String = js.native
  }
  object Tag {
    
    @scala.inline
    def apply(Key: String, Value: String): Tag = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    }
  }
  
  type UnmarshalledTag = Tag
}
