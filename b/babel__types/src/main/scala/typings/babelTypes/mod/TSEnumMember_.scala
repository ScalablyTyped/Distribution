package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.TSEnumMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSEnumMember_
  extends BaseNode
     with _Node {
  
  var id: Identifier_ | StringLiteral_ = js.native
  
  var initializer: Expression | Null = js.native
  
  @JSName("type")
  var type_TSEnumMember_ : TSEnumMember = js.native
}
object TSEnumMember_ {
  
  @scala.inline
  def apply(id: Identifier_ | StringLiteral_, `type`: TSEnumMember): TSEnumMember_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
