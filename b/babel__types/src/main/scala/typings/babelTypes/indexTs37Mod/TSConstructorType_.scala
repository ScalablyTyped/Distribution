package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSConstructorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSConstructorType_
  extends StObject
     with BaseNode
     with TSType {
  
  var parameters: js.Array[Identifier_ | RestElement_]
  
  var typeAnnotation: TSTypeAnnotation_ | Null
  
  var typeParameters: TSTypeParameterDeclaration_ | Null
  
  @JSName("type")
  var type_TSConstructorType_ : TSConstructorType
}
object TSConstructorType_ {
  
  @scala.inline
  def apply(parameters: js.Array[Identifier_ | RestElement_]): TSConstructorType_ = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null, typeParameters = null)
    __obj.updateDynamic("type")("TSConstructorType")
    __obj.asInstanceOf[TSConstructorType_]
  }
  
  @scala.inline
  implicit class TSConstructorType_MutableBuilder[Self <: TSConstructorType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSConstructorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclaration_): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
  }
}
