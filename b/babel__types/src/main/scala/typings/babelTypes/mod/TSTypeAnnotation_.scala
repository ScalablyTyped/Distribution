package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypeAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypeAnnotation_
  extends StObject
     with BaseNode
     with TypeScript {
  
  var typeAnnotation: TSType
  
  @JSName("type")
  var type_TSTypeAnnotation_ : TSTypeAnnotation
}
object TSTypeAnnotation_ {
  
  inline def apply(typeAnnotation: TSType): TSTypeAnnotation_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSTypeAnnotation")
    __obj.asInstanceOf[TSTypeAnnotation_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSTypeAnnotation_] (val x: Self) extends AnyVal {
    
    inline def setType(value: TSTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
