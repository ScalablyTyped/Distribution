package typings.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.AssignmentPattern_
  - typings.babelTypes.ts36Mod.ArrayPattern_
  - typings.babelTypes.ts36Mod.ObjectPattern_
*/
trait Pattern extends StObject
object Pattern {
  
  @scala.inline
  def ArrayPattern_(elements: js.Array[Expression], end: Double, loc: SourceLocation, start: Double): typings.babelTypes.ts36Mod.ArrayPattern_ = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ArrayPattern_]
  }
  
  @scala.inline
  def AssignmentPattern_(end: Double, left: Identifier_, loc: SourceLocation, right: Expression, start: Double): typings.babelTypes.ts36Mod.AssignmentPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("AssignmentPattern")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.AssignmentPattern_]
  }
  
  @scala.inline
  def ObjectPattern_(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[AssignmentProperty | RestProperty_],
    start: Double
  ): typings.babelTypes.ts36Mod.ObjectPattern_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectPattern")
    __obj.asInstanceOf[typings.babelTypes.ts36Mod.ObjectPattern_]
  }
}
