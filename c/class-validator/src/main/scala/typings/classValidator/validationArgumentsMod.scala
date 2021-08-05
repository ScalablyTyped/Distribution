package typings.classValidator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validationArgumentsMod {
  
  trait ValidationArguments extends StObject {
    
    /**
      * Constraints set by this validation type.
      */
    var constraints: js.Array[js.Any]
    
    /**
      * Object that is being validated.
      */
    var `object`: js.Object
    
    /**
      * Name of the object's property being validated.
      */
    var property: String
    
    /**
      * Name of the target that is being validated.
      */
    var targetName: String
    
    /**
      * Validating value.
      */
    var value: js.Any
  }
  object ValidationArguments {
    
    inline def apply(
      constraints: js.Array[js.Any],
      `object`: js.Object,
      property: String,
      targetName: String,
      value: js.Any
    ): ValidationArguments = {
      val __obj = js.Dynamic.literal(constraints = constraints.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], targetName = targetName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationArguments]
    }
    
    extension [Self <: ValidationArguments](x: Self) {
      
      inline def setConstraints(value: js.Array[js.Any]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setConstraintsVarargs(value: js.Any*): Self = StObject.set(x, "constraints", js.Array(value :_*))
      
      inline def setObject(value: js.Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setTargetName(value: String): Self = StObject.set(x, "targetName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
