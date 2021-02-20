package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSIndexSignature
  extends Node
     with TSTypeElement {
  
  var parameters: js.Array[Identifier_] = js.native
  
  var readonly: Boolean | Null = js.native
  
  var typeAnnotation: TSTypeAnnotation | Null = js.native
  
  @JSName("type")
  var type_TSIndexSignature: typings.babelTypes.babelTypesStrings.TSIndexSignature = js.native
}
object TSIndexSignature {
  
  @JSImport("babel-types/ts3.6", "TSIndexSignature")
  @js.native
  def apply(parameters: js.Array[Identifier_]): TSIndexSignature = js.native
  @JSImport("babel-types/ts3.6", "TSIndexSignature")
  @js.native
  def apply(parameters: js.Array[Identifier_], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
  
  @scala.inline
  implicit class TSIndexSignatureMutableBuilder[Self <: TSIndexSignature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: Identifier_ *): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    @scala.inline
    def setType(value: typings.babelTypes.babelTypesStrings.TSIndexSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
