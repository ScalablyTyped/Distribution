package typings.awsSdkClientS3Node

import typings.awsSdkClientS3Node.typesObjectIdentifierMod.ObjectIdentifier
import typings.awsSdkClientS3Node.typesObjectIdentifierMod.UnmarshalledObjectIdentifier
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMod {
  
  trait Delete extends StObject {
    
    /**
      * _ObjectIdentifierList shape
      */
    var Objects: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier]
    
    /**
      * <p>Element to enable quiet mode for the request. When you add this element, you must set its value to true.</p>
      */
    var Quiet: js.UndefOr[Boolean] = js.undefined
  }
  object Delete {
    
    inline def apply(Objects: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier]): Delete = {
      val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setObjects(value: js.Array[ObjectIdentifier] | Iterable[ObjectIdentifier]): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "Objects", js.Array(value :_*))
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "Quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "Quiet", js.undefined)
    }
  }
  
  trait UnmarshalledDelete
    extends StObject
       with Delete {
    
    /**
      * _ObjectIdentifierList shape
      */
    @JSName("Objects")
    var Objects_UnmarshalledDelete: js.Array[UnmarshalledObjectIdentifier]
  }
  object UnmarshalledDelete {
    
    inline def apply(Objects: js.Array[UnmarshalledObjectIdentifier]): UnmarshalledDelete = {
      val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledDelete]
    }
    
    extension [Self <: UnmarshalledDelete](x: Self) {
      
      inline def setObjects(value: js.Array[UnmarshalledObjectIdentifier]): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: UnmarshalledObjectIdentifier*): Self = StObject.set(x, "Objects", js.Array(value :_*))
    }
  }
}
