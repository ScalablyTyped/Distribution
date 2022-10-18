package typings.classTransformer

import typings.classTransformer.typesInterfacesDecoratorOptionsExcludeOptionsDotinterfaceMod.ExcludeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterfacesMetadataExcludeMetadataDotinterfaceMod {
  
  trait ExcludeMetadata extends StObject {
    
    /**
      * Options passed to the @Exclude operator for this property.
      */
    var options: ExcludeOptions
    
    /**
      * The property name this metadata belongs to on the target (class or property).
      *
      * Note: If the decorator is applied to a class the propertyName will be undefined.
      */
    var propertyName: js.UndefOr[String] = js.undefined
    
    var target: js.Function
  }
  object ExcludeMetadata {
    
    inline def apply(options: ExcludeOptions, target: js.Function): ExcludeMetadata = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcludeMetadata]
    }
    
    extension [Self <: ExcludeMetadata](x: Self) {
      
      inline def setOptions(value: ExcludeOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      inline def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
      
      inline def setTarget(value: js.Function): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
