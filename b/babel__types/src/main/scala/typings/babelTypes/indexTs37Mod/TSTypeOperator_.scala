package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSTypeOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSTypeOperator_
  extends TSType
     with BaseNode {
  
  var operator: String = js.native
  
  var typeAnnotation: TSType = js.native
  
  @JSName("type")
  var type_TSTypeOperator_ : TSTypeOperator = js.native
}
object TSTypeOperator_ {
  
  @scala.inline
  def apply(operator: String, `type`: TSTypeOperator, typeAnnotation: TSType): TSTypeOperator_ = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSTypeOperator_]
  }
  
  @scala.inline
  implicit class TSTypeOperator_MutableBuilder[Self <: TSTypeOperator_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSTypeOperator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSType): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}
