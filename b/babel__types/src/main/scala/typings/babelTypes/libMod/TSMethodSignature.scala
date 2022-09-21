package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.get
import typings.babelTypes.babelTypesStrings.method_
import typings.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSMethodSignature
  extends StObject
     with BaseNode
     with Node
     with TSTypeElement
     with TypeScript {
  
  var computed: js.UndefOr[Boolean] = js.undefined
  
  var key: Expression
  
  var kind: method_ | get | set
  
  var optional: js.UndefOr[Boolean | Null] = js.undefined
  
  var parameters: js.Array[Identifier_ | RestElement_]
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotation | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclaration | Null] = js.undefined
  
  @JSName("type")
  var type_TSMethodSignature: typings.babelTypes.babelTypesStrings.TSMethodSignature
}
object TSMethodSignature {
  
  inline def apply(key: Expression, kind: method_ | get | set, parameters: js.Array[Identifier_ | RestElement_]): TSMethodSignature = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TSMethodSignature")
    __obj.asInstanceOf[TSMethodSignature]
  }
  
  extension [Self <: TSMethodSignature](x: Self) {
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: method_ | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSMethodSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    inline def setTypeParameters(value: TSTypeParameterDeclaration): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}
