package typings.classValidator

import org.scalablytyped.runtime.StringDictionary
import typings.classValidator.anon.Always
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesValidationSchemaValidationSchemaMod {
  
  trait ValidationSchema extends StObject {
    
    /**
      * Schema name. This is required, because we tell validator to validate by this schema using its name.
      */
    var name: String
    
    /**
      * Validated properties.
      */
    var properties: /**
      * Name of the object's property to be validated which holds an array of validation constraints.
      */
    StringDictionary[js.Array[Always]]
  }
  object ValidationSchema {
    
    inline def apply(
      name: String,
      properties: /**
      * Name of the object's property to be validated which holds an array of validation constraints.
      */
    StringDictionary[js.Array[Always]]
    ): ValidationSchema = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationSchema]
    }
    
    extension [Self <: ValidationSchema](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProperties(
        value: /**
        * Name of the object's property to be validated which holds an array of validation constraints.
        */
      StringDictionary[js.Array[Always]]
      ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    }
  }
}
