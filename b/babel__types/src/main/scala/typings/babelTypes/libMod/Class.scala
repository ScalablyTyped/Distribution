package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.ClassExpression_
  - typings.babelTypes.libMod.ClassDeclaration_
*/
trait Class extends StObject
object Class {
  
  inline def ClassDeclaration_(body: ClassBody_, id: Identifier_): typings.babelTypes.libMod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassDeclaration_]
  }
  
  inline def ClassExpression_(body: ClassBody_): typings.babelTypes.libMod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.babelTypes.libMod.ClassExpression_]
  }
}
