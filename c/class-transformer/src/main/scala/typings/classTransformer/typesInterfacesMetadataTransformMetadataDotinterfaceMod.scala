package typings.classTransformer

import typings.classTransformer.typesInterfacesDecoratorOptionsTransformOptionsDotinterfaceMod.TransformOptions
import typings.classTransformer.typesInterfacesMetadataTransformFnParamsDotinterfaceMod.TransformFnParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesMetadataTransformMetadataDotinterfaceMod {
  
  trait TransformMetadata extends StObject {
    
    /**
      * Options passed to the @Transform operator for this property.
      */
    var options: TransformOptions
    
    /**
      * The property name this metadata belongs to on the target (property only).
      */
    var propertyName: String
    
    var target: js.Function
    
    /**
      * The custom transformation function provided by the user in the @Transform decorator.
      */
    def transformFn(params: TransformFnParams): Any
  }
  object TransformMetadata {
    
    inline def apply(
      options: TransformOptions,
      propertyName: String,
      target: js.Function,
      transformFn: TransformFnParams => Any
    ): TransformMetadata = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transformFn = js.Any.fromFunction1(transformFn))
      __obj.asInstanceOf[TransformMetadata]
    }
    
    extension [Self <: TransformMetadata](x: Self) {
      
      inline def setOptions(value: TransformOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTransformFn(value: TransformFnParams => Any): Self = StObject.set(x, "transformFn", js.Any.fromFunction1(value))
    }
  }
}
