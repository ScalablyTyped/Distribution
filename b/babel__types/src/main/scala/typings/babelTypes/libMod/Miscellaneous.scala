package typings.babelTypes.libMod

import typings.babelTypes.babelTypesStrings.BlockStatement
import typings.babelTypes.babelTypesStrings.ClassBody
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.StringLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.Noop_
  - typings.babelTypes.libMod.Placeholder_
  - typings.babelTypes.libMod.V8IntrinsicIdentifier_
*/
trait Miscellaneous extends StObject
object Miscellaneous {
  
  inline def Noop_(): typings.babelTypes.libMod.Noop_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Noop")
    __obj.asInstanceOf[typings.babelTypes.libMod.Noop_]
  }
  
  inline def Placeholder_(
    expectedNode: Identifier | StringLiteral | typings.babelTypes.babelTypesStrings.Expression | typings.babelTypes.babelTypesStrings.Statement | typings.babelTypes.babelTypesStrings.Declaration | BlockStatement | ClassBody | typings.babelTypes.babelTypesStrings.Pattern,
    name: Identifier_
  ): typings.babelTypes.libMod.Placeholder_ = {
    val __obj = js.Dynamic.literal(expectedNode = expectedNode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Placeholder")
    __obj.asInstanceOf[typings.babelTypes.libMod.Placeholder_]
  }
  
  inline def V8IntrinsicIdentifier_(name: String): typings.babelTypes.libMod.V8IntrinsicIdentifier_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("V8IntrinsicIdentifier")
    __obj.asInstanceOf[typings.babelTypes.libMod.V8IntrinsicIdentifier_]
  }
}
