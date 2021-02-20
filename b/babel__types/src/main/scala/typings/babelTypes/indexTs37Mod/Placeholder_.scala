package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.BlockStatement
import typings.babelTypes.babelTypesStrings.ClassBody
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.Placeholder
import typings.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Placeholder_
  extends BaseNode
     with _Node {
  
  var expectedNode: Identifier | StringLiteral | typings.babelTypes.babelTypesStrings.Expression | typings.babelTypes.babelTypesStrings.Statement | typings.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typings.babelTypes.babelTypesStrings.Pattern = js.native
  
  var name: Identifier_ = js.native
  
  @JSName("type")
  var type_Placeholder_ : Placeholder = js.native
}
object Placeholder_ {
  
  @scala.inline
  def apply(
    expectedNode: Identifier | StringLiteral | typings.babelTypes.babelTypesStrings.Expression | typings.babelTypes.babelTypesStrings.Statement | typings.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typings.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_,
    `type`: Placeholder
  ): Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placeholder_]
  }
  
  @scala.inline
  implicit class Placeholder_MutableBuilder[Self <: Placeholder_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpectedNode(
      value: Identifier | StringLiteral | typings.babelTypes.babelTypesStrings.Expression | typings.babelTypes.babelTypesStrings.Statement | typings.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typings.babelTypes.babelTypesStrings.Pattern
    ): Self = StObject.set(x, "expectedNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Identifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
