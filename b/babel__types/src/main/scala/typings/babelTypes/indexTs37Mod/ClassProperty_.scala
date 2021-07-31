package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.ClassProperty
import typings.babelTypes.babelTypesStrings.`private`
import typings.babelTypes.babelTypesStrings.`protected`
import typings.babelTypes.babelTypesStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait ClassProperty_
  extends StObject
     with BaseNode
     with Property {
  
  var `abstract`: Boolean | Null
  
  var accessibility: public | `private` | `protected` | Null
  
  var computed: Boolean
  
  var declare: Boolean | Null
  
  var decorators: js.Array[Decorator_] | Null
  
  var definite: Boolean | Null
  
  var key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression
  
  var optional: Boolean | Null
  
  var readonly: Boolean | Null
  
  var static: Boolean
  
  var typeAnnotation: TypeAnnotation_ | TSTypeAnnotation_ | Noop_ | Null
  
  @JSName("type")
  var type_ClassProperty_ : ClassProperty
  
  var value: Expression | Null
}
object ClassProperty_ {
  
  @scala.inline
  def apply(
    computed: Boolean,
    key: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression,
    static: Boolean
  ): ClassProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], accessibility = null, declare = null, decorators = null, definite = null, end = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null, value = null)
    __obj.updateDynamic("type")("ClassProperty")
    __obj.updateDynamic("abstract")(null)
    __obj.asInstanceOf[ClassProperty_]
  }
  
  @scala.inline
  implicit class ClassProperty_MutableBuilder[Self <: ClassProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbstractNull: Self = StObject.set(x, "abstract", null)
    
    @scala.inline
    def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareNull: Self = StObject.set(x, "declare", null)
    
    @scala.inline
    def setDecorators(value: js.Array[Decorator_]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsVarargs(value: Decorator_ *): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setDefinite(value: Boolean): Self = StObject.set(x, "definite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefiniteNull: Self = StObject.set(x, "definite", null)
    
    @scala.inline
    def setKey(value: Identifier_ | StringLiteral_ | NumericLiteral_ | Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ClassProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_ | TSTypeAnnotation_ | Noop_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setValue(value: Expression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
  }
}
