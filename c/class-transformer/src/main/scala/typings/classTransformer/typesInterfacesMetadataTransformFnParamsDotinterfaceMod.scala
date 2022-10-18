package typings.classTransformer

import typings.classTransformer.typesEnumsTransformationTypeDotenumMod.TransformationType
import typings.classTransformer.typesInterfacesClassTransformerOptionsDotinterfaceMod.ClassTransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesMetadataTransformFnParamsDotinterfaceMod {
  
  trait TransformFnParams extends StObject {
    
    var key: String
    
    var obj: Any
    
    var options: ClassTransformOptions
    
    var `type`: TransformationType
    
    var value: Any
  }
  object TransformFnParams {
    
    inline def apply(key: String, obj: Any, options: ClassTransformOptions, `type`: TransformationType, value: Any): TransformFnParams = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransformFnParams]
    }
    
    extension [Self <: TransformFnParams](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setObj(value: Any): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ClassTransformOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setType(value: TransformationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
