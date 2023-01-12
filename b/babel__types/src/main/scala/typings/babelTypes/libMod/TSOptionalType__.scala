package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.TSOptionalType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSOptionalType__
  extends StObject
     with BaseNode
     with Node
     with TSType
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSOptionalType__ : TSOptionalType
}
object TSOptionalType__ {
  
  inline def apply(typeAnnotation: TSType): TSOptionalType__ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSOptionalType")
    __obj.asInstanceOf[TSOptionalType__]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSOptionalType__] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSOptionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
