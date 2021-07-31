package typings.babelTypes.ts36Mod

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
  
  @JSImport("babel-types/ts3.6", "TSPropertySignature")
  @js.native
  def apply(key: Expression): TSPropertySignature = js.native
  @JSImport("babel-types/ts3.6", "TSPropertySignature")
  @js.native
  def apply(key: Expression, typeAnnotation: Unit, initializer: Expression): TSPropertySignature = js.native
  @JSImport("babel-types/ts3.6", "TSPropertySignature")
  @js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation): TSPropertySignature = js.native
  @JSImport("babel-types/ts3.6", "TSPropertySignature")
  @js.native
  def apply(key: Expression, typeAnnotation: TSTypeAnnotation, initializer: Expression): TSPropertySignature = js.native
  
  @scala.inline
  implicit class TSPropertySignatureMutableBuilder[Self <: TSPropertySignature] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.babelTypes.babelTypesStrings.TSPropertySignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
