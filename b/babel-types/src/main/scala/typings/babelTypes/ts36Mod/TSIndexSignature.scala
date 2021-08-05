package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSIndexSignature
  extends StObject
     with Node
     with TSTypeElement {
  
  var parameters: js.Array[Identifier_]
  
  var readonly: Boolean | Null
  
  var typeAnnotation: TSTypeAnnotation | Null
  
  @JSName("type")
  var type_TSIndexSignature: typings.babelTypes.babelTypesStrings.TSIndexSignature
}
object TSIndexSignature {
  
  @JSImport("babel-types/ts3.6", "TSIndexSignature")
  @js.native
  def apply(parameters: js.Array[Identifier_]): TSIndexSignature = js.native
  @JSImport("babel-types/ts3.6", "TSIndexSignature")
  @js.native
  def apply(parameters: js.Array[Identifier_], typeAnnotation: TSTypeAnnotation): TSIndexSignature = js.native
  
  extension [Self <: TSIndexSignature](x: Self) {
    
    inline def setParameters(value: js.Array[Identifier_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: Identifier_ *): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSIndexSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
  }
}
