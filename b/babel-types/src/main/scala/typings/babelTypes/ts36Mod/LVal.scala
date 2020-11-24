package typings.babelTypes.ts36Mod

import typings.babelTypes.babelTypesStrings.ArrayPattern
import typings.babelTypes.babelTypesStrings.AssignmentPattern
import typings.babelTypes.babelTypesStrings.Identifier
import typings.babelTypes.babelTypesStrings.MemberExpression
import typings.babelTypes.babelTypesStrings.ObjectPattern
import typings.babelTypes.babelTypesStrings.RestElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.ts36Mod.Identifier_
  - typings.babelTypes.ts36Mod.MemberExpression_
  - typings.babelTypes.ts36Mod.RestElement_
  - typings.babelTypes.ts36Mod.AssignmentPattern_
  - typings.babelTypes.ts36Mod.ArrayPattern_
  - typings.babelTypes.ts36Mod.ObjectPattern_
  - typings.babelTypes.ts36Mod.TSParameterProperty
*/
trait LVal extends js.Object
object LVal {
  
  @scala.inline
  def RestElement_(argument: LVal, end: Double, loc: SourceLocation, start: Double, `type`: RestElement): LVal = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  
  @scala.inline
  def MemberExpression_(
    computed: Boolean,
    end: Double,
    loc: SourceLocation,
    `object`: Expression | Super,
    property: Expression,
    start: Double,
    `type`: MemberExpression
  ): LVal = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  
  @scala.inline
  def ObjectPattern_(
    end: Double,
    loc: SourceLocation,
    properties: js.Array[AssignmentProperty | RestProperty_],
    start: Double,
    `type`: ObjectPattern
  ): LVal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  
  @scala.inline
  def AssignmentPattern_(
    end: Double,
    left: Identifier_,
    loc: SourceLocation,
    right: Expression,
    start: Double,
    `type`: AssignmentPattern
  ): LVal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  
  @scala.inline
  def TSParameterProperty(
    end: Double,
    loc: SourceLocation,
    parameter: Identifier_ | AssignmentPattern_,
    start: Double,
    `type`: typings.babelTypes.babelTypesStrings.TSParameterProperty
  ): LVal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parameter = parameter.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  
  @scala.inline
  def Identifier_(end: Double, loc: SourceLocation, name: String, start: Double, `type`: Identifier): LVal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
  
  @scala.inline
  def ArrayPattern_(
    elements: js.Array[Expression],
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ArrayPattern
  ): LVal = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVal]
  }
}
