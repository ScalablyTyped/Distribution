package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSPropertySignature
  extends StObject
     with Node
     with TSTypeElement {
  
  var computed: Boolean | Null
  
  var initializer: Expression | Null
  
  var key: Expression
  
  var optional: Boolean | Null
  
  var readonly: Boolean | Null
  
  var typeAnnotation: TSTypeAnnotation | Null
  
  @JSName("type")
  var type_TSPropertySignature: typings.babelTypes.babelTypesStrings.TSPropertySignature
}
object TSPropertySignature {
  
  @JSImport("babel-types", "TSPropertySignature")
  @js.native
  def apply(key: Expression): TSPropertySignature = js.native
  @JSImport("babel-types", "TSPropertySignature")
  @js.native
  def apply(key: Expression, typeAnnotation: Unit, initializer: Expression): TSPropertySignature = js.native
  @JSImport("babel-types", "TSPropertySignature")
  @js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation): TSPropertySignature = js.native
  @JSImport("babel-types", "TSPropertySignature")
  @js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): TSPropertySignature = js.native
  
  extension [Self <: TSPropertySignature](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedNull: Self = StObject.set(x, "computed", null)
    
    inline def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    inline def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSPropertySignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
