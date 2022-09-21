package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSRestType
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSRestType: typings.babelTypes.babelTypesStrings.TSRestType
}
object TSRestType {
  
  inline def apply(typeAnnotation: TSType): TSRestType = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSRestType")
    __obj.asInstanceOf[TSRestType]
  }
  
  extension [Self <: TSRestType](x: Self) {
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSRestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
