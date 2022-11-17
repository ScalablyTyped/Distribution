package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placeholder_
  extends StObject
     with BaseNode {
  
  var expectedNode: "Identifier" | "StringLiteral" | "Expression" | "Statement" | "Declaration" | "BlockStatement" | "ClassBody" | "Pattern"
  
  var name: Identifier_
  
  @JSName("type")
  var type_Placeholder_ : "Placeholder"
}
object Placeholder_ {
  
  inline def apply(
    expectedNode: "Identifier" | "StringLiteral" | "Expression" | "Statement" | "Declaration" | "BlockStatement" | "ClassBody" | "Pattern",
    name: Identifier_
  ): Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[Placeholder_]
  }
  
  extension [Self <: Placeholder_](x: Self) {
    
    inline def setExpectedNode(
      value: "Identifier" | "StringLiteral" | "Expression" | "Statement" | "Declaration" | "BlockStatement" | "ClassBody" | "Pattern"
    ): Self = StObject.set(x, "expectedNode", value.asInstanceOf[js.Any])
    
    inline def setName(value: Identifier_): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: "Placeholder"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
