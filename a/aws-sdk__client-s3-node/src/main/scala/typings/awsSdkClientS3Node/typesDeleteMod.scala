package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesObjectIdentifierMod.ObjectIdentifier
import typings.awsSdkClientS3Node.typesObjectIdentifierMod.UnmarshalledObjectIdentifier
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMod {
  
  @js.native
  trait Delete extends StObject {
    
    /**
      * _ObjectIdentifierList shape
      */
    var Objects: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier] = js.native
    
    /**
      * <p>Element to enable quiet mode for the request. When you add this element, you must set its value to true.</p>
      */
    var Quiet: js.UndefOr[Boolean] = js.native
  }
  object Delete {
    
    @scala.inline
    def apply(Objects: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier]): Delete = {
      val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjects(value: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier]): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "Objects", js.Array(value :_*))
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "Quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "Quiet", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledDelete extends Delete {
    
    /**
      * _ObjectIdentifierList shape
      */
    @JSName("Objects")
    var Objects_UnmarshalledDelete: js.Array[UnmarshalledObjectIdentifier] = js.native
  }
  object UnmarshalledDelete {
    
    @scala.inline
    def apply(Objects: js.Array[UnmarshalledObjectIdentifier]): UnmarshalledDelete = {
      val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledDelete]
    }
    
    @scala.inline
    implicit class UnmarshalledDeleteMutableBuilder[Self <: UnmarshalledDelete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setObjects(value: js.Array[UnmarshalledObjectIdentifier]): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsVarargs(value: UnmarshalledObjectIdentifier*): Self = StObject.set(x, "Objects", js.Array(value :_*))
    }
  }
}
