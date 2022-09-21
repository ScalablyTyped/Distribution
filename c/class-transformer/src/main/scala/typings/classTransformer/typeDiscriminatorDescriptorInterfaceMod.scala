package typings.classTransformer

import typings.classTransformer.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeDiscriminatorDescriptorInterfaceMod {
  
  trait DiscriminatorDescriptor extends StObject {
    
    /**
      * The name of the property which holds the type information in the received object.
      */
    var property: String
    
    /**
      * List of the available types. The transformer will try to lookup the object
      * with the same key as the value received in the defined discriminator property
      * and create an instance of the defined class.
      */
    var subTypes: js.Array[Name]
  }
  object DiscriminatorDescriptor {
    
    inline def apply(property: String, subTypes: js.Array[Name]): DiscriminatorDescriptor = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], subTypes = subTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DiscriminatorDescriptor]
    }
    
    extension [Self <: DiscriminatorDescriptor](x: Self) {
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setSubTypes(value: js.Array[Name]): Self = StObject.set(x, "subTypes", value.asInstanceOf[js.Any])
      
      inline def setSubTypesVarargs(value: Name*): Self = StObject.set(x, "subTypes", js.Array(value*))
    }
  }
}
