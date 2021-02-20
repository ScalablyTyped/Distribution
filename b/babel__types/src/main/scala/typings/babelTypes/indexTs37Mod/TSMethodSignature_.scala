package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSMethodSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSMethodSignature_
  extends TSTypeElement
     with BaseNode {
  
  var computed: Boolean | Null = js.native
  
  var key: Expression = js.native
  
  var optional: Boolean | Null = js.native
  
  var parameters: js.Array[Identifier_ | RestElement_] = js.native
  
  var typeAnnotation: TSTypeAnnotation_ | Null = js.native
  
  var typeParameters: TSTypeParameterDeclaration_ | Null = js.native
  
  @JSName("type")
  var type_TSMethodSignature_ : TSMethodSignature = js.native
}
object TSMethodSignature_ {
  
  @scala.inline
  def apply(key: Expression, parameters: js.Array[Identifier_ | RestElement_], `type`: TSMethodSignature): TSMethodSignature_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSMethodSignature_]
  }
  
  @scala.inline
  implicit class TSMethodSignature_MutableBuilder[Self <: TSMethodSignature_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedNull: Self = StObject.set(x, "computed", null)
    
    @scala.inline
    def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setParameters(value: js.Array[Identifier_ | RestElement_]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: (Identifier_ | RestElement_)*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: TSMethodSignature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
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
