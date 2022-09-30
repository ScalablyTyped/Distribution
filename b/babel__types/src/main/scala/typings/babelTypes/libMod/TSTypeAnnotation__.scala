package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSTypeAnnotation__
  extends StObject
     with BaseNode
     with Node
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeAnnotation__ : TSTypeAnnotation
}
object TSTypeAnnotation__ {
  
  inline def apply(typeAnnotation: TSType): TSTypeAnnotation__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[TSTypeAnnotation__]
  }
  
  extension [Self <: TSTypeAnnotation__](x: Self) {
    
    inline def setType(value: TSTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
