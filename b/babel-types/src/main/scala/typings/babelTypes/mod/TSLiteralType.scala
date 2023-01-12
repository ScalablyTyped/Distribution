package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSLiteralType
  extends StObject
     with Node
     with TSType {
  
  var literal: NumericLiteral_ | StringLiteral_ | BooleanLiteral_
  
  @JSName("type")
  var type_TSLiteralType: typings.babelTypes.babelTypesStrings.TSLiteralType
}
object TSLiteralType {
  
  @JSImport("babel-types", "TSLiteralType")
  @js.native
  def apply(literal: BooleanLiteral_): TSLiteralType = js.native
  @JSImport("babel-types", "TSLiteralType")
  @js.native
  def apply(literal: NumericLiteral_): TSLiteralType = js.native
  @JSImport("babel-types", "TSLiteralType")
  @js.native
  def apply(literal: StringLiteral_): TSLiteralType = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSLiteralType] (val x: Self) extends AnyVal {
    
    inline def setLiteral(value: NumericLiteral_ | StringLiteral_ | BooleanLiteral_): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.babelTypes.babelTypesStrings.TSLiteralType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
