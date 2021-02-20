package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.FunctionTypeParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait FunctionTypeParam_
  extends Flow
     with BaseNode {
  
  var name: Identifier_ | Null = js.native
  
  var optional: Boolean | Null = js.native
  
  var typeAnnotation: FlowType = js.native
  
  @JSName("type")
  var type_FunctionTypeParam_ : FunctionTypeParam = js.native
}
object FunctionTypeParam_ {
  
  @scala.inline
  def apply(`type`: FunctionTypeParam, typeAnnotation: FlowType): FunctionTypeParam_ = {
    val __obj = js.Dynamic.literal(typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionTypeParam_]
  }
  
  @scala.inline
  implicit class FunctionTypeParam_MutableBuilder[Self <: FunctionTypeParam_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: Identifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalNull: Self = StObject.set(x, "optional", null)
    
    @scala.inline
    def setType(value: FunctionTypeParam): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: FlowType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
