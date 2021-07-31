package typings.babelTypes.indexTs37Mod

import typings.babelTypes.babelTypesStrings.TSLiteralType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.babelTypes.indexTs37Mod._Node because Already inherited */ trait TSLiteralType_
  extends StObject
     with BaseNode
     with TSBaseType
     with TSType {
  
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_
  
  @JSName("type")
  var type_TSLiteralType_ : TSLiteralType
}
object TSLiteralType_ {
  
  @scala.inline
  def apply(literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_ | BigIntLiteral_): TSLiteralType_ = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TSLiteralType")
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
