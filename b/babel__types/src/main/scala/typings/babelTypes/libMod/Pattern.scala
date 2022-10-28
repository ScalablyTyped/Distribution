package typings.babelTypes.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.libMod.AssignmentPattern_
  - typings.babelTypes.libMod.ArrayPattern_
  - typings.babelTypes.libMod.ObjectPattern_
*/
trait Pattern extends StObject
object Pattern {
  
  inline def ArrayPattern_(elements: js.Array[Null | PatternLike | LVal]): typings.babelTypes.libMod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.ArrayPattern_]
  }
  
  inline def AssignmentPattern_(
    left: Identifier_ | ObjectPattern_ | ArrayPattern_ | MemberExpression_ | TSAsExpression__ | TSSatisfiesExpression__ | TSTypeAssertion__ | TSNonNullExpression__,
    right: Expression
  ): typings.babelTypes.libMod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.AssignmentPattern_]
  }
  
  inline def ObjectPattern_(properties: js.Array[RestElement_ | ObjectProperty_]): typings.babelTypes.libMod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.libMod.ObjectPattern_]
  }
}
