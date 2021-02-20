package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSExternalModuleReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSExternalModuleReference_
  extends BaseNode
     with _Node {
  
  var expression: StringLiteral_ = js.native
  
  @JSName("type")
  var type_TSExternalModuleReference_ : TSExternalModuleReference = js.native
}
object TSExternalModuleReference_ {
  
  @scala.inline
  def apply(expression: StringLiteral_, `type`: TSExternalModuleReference): TSExternalModuleReference_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSExternalModuleReference_]
  }
  
  @scala.inline
  implicit class TSExternalModuleReference_MutableBuilder[Self <: TSExternalModuleReference_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpression(value: StringLiteral_): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSExternalModuleReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
