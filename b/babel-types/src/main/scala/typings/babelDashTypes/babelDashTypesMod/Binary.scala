package typings.babelDashTypes.babelDashTypesMod

import typings.babelDashTypes.babelDashTypesStrings.Ampersand
import typings.babelDashTypes.babelDashTypesStrings.AmpersandAmpersand
import typings.babelDashTypes.babelDashTypesStrings.Asterisk
import typings.babelDashTypes.babelDashTypesStrings.AsteriskAsterisk
import typings.babelDashTypes.babelDashTypesStrings.EqualssignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.EqualssignEqualssignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.ExclamationmarkEqualssign
import typings.babelDashTypes.babelDashTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.Greaterthansign
import typings.babelDashTypes.babelDashTypesStrings.GreaterthansignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.GreaterthansignGreaterthansign
import typings.babelDashTypes.babelDashTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.babelDashTypes.babelDashTypesStrings.Lessthansign
import typings.babelDashTypes.babelDashTypesStrings.LessthansignEqualssign
import typings.babelDashTypes.babelDashTypesStrings.LessthansignLessthansign
import typings.babelDashTypes.babelDashTypesStrings.Percentsign
import typings.babelDashTypes.babelDashTypesStrings.Plussign
import typings.babelDashTypes.babelDashTypesStrings.Slash
import typings.babelDashTypes.babelDashTypesStrings.Verticalline
import typings.babelDashTypes.babelDashTypesStrings.VerticallineVerticalline
import typings.babelDashTypes.babelDashTypesStrings.^
import typings.babelDashTypes.babelDashTypesStrings.`-_`
import typings.babelDashTypes.babelDashTypesStrings.in
import typings.babelDashTypes.babelDashTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.babelDashTypes.babelDashTypesMod.BinaryExpression
  - typings.babelDashTypes.babelDashTypesMod.LogicalExpression
*/
trait Binary extends js.Object

object Binary {
  @scala.inline
  def BinaryExpression(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.BinaryExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): Binary = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
  @scala.inline
  def LogicalExpression(
    end: Double,
    left: Expression,
    loc: SourceLocation,
    operator: VerticallineVerticalline | AmpersandAmpersand,
    right: Expression,
    start: Double,
    `type`: typings.babelDashTypes.babelDashTypesStrings.LogicalExpression,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    trailingComments: js.Array[Comment] = null
  ): Binary = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binary]
  }
}

