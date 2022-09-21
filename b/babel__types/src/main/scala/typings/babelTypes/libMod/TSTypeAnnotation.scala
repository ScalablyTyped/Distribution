package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeAnnotation
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeAnnotation: typings.babelTypes.babelTypesStrings.TSTypeAnnotation
}
object TSTypeAnnotation {
  
  inline def apply(typeAnnotation: TSType): TSTypeAnnotation = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[TSTypeAnnotation]
  }
  
  extension [Self <: TSTypeAnnotation](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
