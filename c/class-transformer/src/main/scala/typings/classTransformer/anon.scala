package typings.classTransformer

import typings.classTransformer.typesInterfacesClassConstructorDottypeMod.ClassConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    /**
      * Name of the type.
      */
    var name: String
    
    /**
      * A class constructor which can be used to create the object.
      */
    var value: ClassConstructor[Any]
  }
  object Name {
    
    inline def apply(name: String, value: ClassConstructor[Any]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ClassConstructor[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
