package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSPropertySignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSPropertySignature_
  extends StObject
     with BaseNode
     with TSTypeElement {
  
  var computed: Boolean | Null
  
  var initializer: Expression | Null
  
  var key: Expression
  
  var optional: Boolean | Null
  
  var readonly: Boolean | Null
  
  var typeAnnotation: TSTypeAnnotation_ | Null
  
  @JSName("type")
  var type_TSPropertySignature_ : TSPropertySignature
}
object TSPropertySignature_ {
  
  @scala.inline
  def apply(key: Expression): TSPropertySignature_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], computed = null, end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, optional = null, readonly = null, start = null, trailingComments = null, typeAnnotation = null)
    __obj.updateDynamic("type")("TSPropertySignature")
    __obj.asInstanceOf[TSPropertySignature_]
  }
  
  @scala.inline
  implicit class TSPropertySignature_MutableBuilder[Self <: TSPropertySignature_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedNull: Self = StObject.set(x, "computed", null)
    
    @scala.inline
    def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    @scala.inline
    def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    @scala.inline
    def setType(value: TSPropertySignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
