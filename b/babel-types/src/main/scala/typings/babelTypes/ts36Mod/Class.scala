package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.ClassDeclaration_
  - typings.babelTypes.ts36Mod.ClassExpression_
*/
trait Class extends StObject
object Class {
  
  @scala.inline
  def ClassDeclaration_(
    body: ClassBody_,
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    superClass: Expression
  ): typings.babelTypes.ts36Mod.ClassDeclaration_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ClassDeclaration_]
  }
  
  @scala.inline
  def ClassExpression_(
    body: ClassBody_,
    end: Double,
    id: Identifier_,
    loc: SourceLocation,
    start: Double,
    superClass: Expression
  ): typings.babelTypes.ts36Mod.ClassExpression_ = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], superClass = superClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassExpression")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ClassExpression_]
  }
}
