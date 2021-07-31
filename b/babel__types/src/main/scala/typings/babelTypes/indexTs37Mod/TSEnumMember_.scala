package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSEnumMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSEnumMember_
  extends StObject
     with BaseNode
     with _Node {
  
  var id: Identifier_ | StringLiteral_
  
  var initializer: Expression | Null
  
  @JSName("type")
  var type_TSEnumMember_ : TSEnumMember
}
object TSEnumMember_ {
  
  @scala.inline
  def apply(id: Identifier_ | StringLiteral_): TSEnumMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], end = null, initializer = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSEnumMember")
    __obj.asInstanceOf[TSEnumMember_]
  }
  
  @scala.inline
  implicit class TSEnumMember_MutableBuilder[Self <: TSEnumMember_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_ | StringLiteral_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializer(value: Expression): Self = StObject.set(x, "initializer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializerNull: Self = StObject.set(x, "initializer", null)
    
    @scala.inline
    def setType(value: TSEnumMember): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
