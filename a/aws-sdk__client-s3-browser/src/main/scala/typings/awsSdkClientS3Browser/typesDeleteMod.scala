package typings.awsSdkClientS3Browser

import typings.awsSdkClientS3Browser.typesObjectIdentifierMod.ObjectIdentifier
import typings.awsSdkClientS3Browser.typesObjectIdentifierMod.UnmarshalledObjectIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDeleteMod {
  
  trait Delete extends StObject {
    
    /**
      * _ObjectIdentifierList shape
      */
    var Objects: js.Array[ObjectIdentifier] | js.Iterable[ObjectIdentifier]
    
    /**
      * <p>Element to enable quiet mode for the request. When you add this element, you must set its value to true.</p>
      */
    var Quiet: js.UndefOr[Boolean] = js.undefined
  }
  object Delete {
    
    inline def apply(Objects: js.Array[ObjectIdentifier] | js.Iterable[ObjectIdentifier]): Delete = {
      val __obj = js.Dynamic.literal(Objects = Objects.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setObjects(value: js.Array[ObjectIdentifier] | js.Iterable[ObjectIdentifier]): Self = StObject.set(x, "Objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsVarargs(value: ObjectIdentifier*): Self = StObject.set(x, "Objects", js.Array(value*))
      
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
      
      inline def setObjectsVarargs(value: UnmarshalledObjectIdentifier*): Self = StObject.set(x, "Objects", js.Array(value*))
    }
  }
}
