package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSLiteralType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ @js.native
trait TSLiteralType_
  extends TSBaseType
     with BaseNode
     with TSType {
  
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_ = js.native
  
  @JSName("type")
  var type_TSLiteralType_ : TSLiteralType = js.native
}
object TSLiteralType_ {
  
  @scala.inline
  def apply(
    literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_,
    `type`: TSLiteralType
  ): TSLiteralType_ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSLiteralType_]
  }
  
  @scala.inline
  implicit class TSLiteralType_MutableBuilder[Self <: TSLiteralType_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLiteral(value: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TSLiteralType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
