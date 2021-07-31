package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSTypePredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait TSTypePredicate_
  extends StObject
     with BaseNode
     with TSType {
  
  var asserts: Boolean | Null
  
  var parameterName: Identifier_ | TSThisType_
  
  var typeAnnotation: TSTypeAnnotation_ | Null
  
  @JSName("type")
  var type_TSTypePredicate_ : TSTypePredicate
}
object TSTypePredicate_ {
  
  @scala.inline
  def apply(parameterName: Identifier_ | TSThisType_): TSTypePredicate_ = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any], asserts = null, end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSTypePredicate")
    __obj.asInstanceOf[TSTypePredicate_]
  }
  
  @scala.inline
  implicit class TSTypePredicate_MutableBuilder[Self <: TSTypePredicate_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsserts(value: Boolean): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertsNull: Self = StObject.set(x, "asserts", null)
    
    @scala.inline
    def setParameterName(value: Identifier_ | TSThisType_): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSTypePredicate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
