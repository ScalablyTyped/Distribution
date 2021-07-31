package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.mod._Node because Already inherited */ trait Identifier_
  extends StObject
     with BaseNode
     with Expression
     with LVal
     with PatternLike
     with TSEntityName {
  
  var decorators: js.Array[Decorator_] | Null
  
  var name: String
  
  var optional: Boolean | Null
  
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  @JSName("type")
  var type_Identifier_ : Identifier
}
object Identifier_ {
  
  @scala.inline
  def apply(name: String): Identifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], decorators = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[Identifier_]
  }
  
  @scala.inline
  implicit class Identifier_MutableBuilder[Self <: Identifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
