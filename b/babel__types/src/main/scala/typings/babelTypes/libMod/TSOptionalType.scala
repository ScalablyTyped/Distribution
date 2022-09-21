package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSOptionalType
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSOptionalType: typings.babelTypes.babelTypesStrings.TSOptionalType
}
object TSOptionalType {
  
  inline def apply(typeAnnotation: TSType): TSOptionalType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[TSOptionalType]
  }
  
  extension [Self <: TSOptionalType](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
