package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.BlockStatement
import typings.babelTypes.babelTypesStrings.ClassBody
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.Noop_
  - typings.babelTypes.mod.Placeholder_
  - typings.babelTypes.mod.V8IntrinsicIdentifier_
*/
trait Miscellaneous
  extends StObject
     with _Node
object Miscellaneous {
  
  inline def Noop_(): typings.babelTypes.mod.Noop_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Noop")
    __obj.asInstanceOf[typings.babelTypes.mod.Noop_]
  }
  
  inline def Placeholder_(
    expectedNode: Identifier | StringLiteral | typings.babelTypes.babelTypesStrings.Expression | typings.babelTypes.babelTypesStrings.Statement | typings.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typings.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_
  ): typings.babelTypes.mod.Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[typings.babelTypes.mod.Placeholder_]
  }
  
  inline def V8IntrinsicIdentifier_(name: String): typings.babelTypes.mod.V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[typings.babelTypes.mod.V8IntrinsicIdentifier_]
  }
}
