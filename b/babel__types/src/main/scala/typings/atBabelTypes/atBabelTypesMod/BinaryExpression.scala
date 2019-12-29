package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.Ampersand
import typings.atBabelTypes.atBabelTypesStrings.Asterisk
import typings.atBabelTypes.atBabelTypesStrings.AsteriskAsterisk
import typings.atBabelTypes.atBabelTypesStrings.EqualssignEqualssign
import typings.atBabelTypes.atBabelTypesStrings.EqualssignEqualssignEqualssign
import typings.atBabelTypes.atBabelTypesStrings.ExclamationmarkEqualssign
import typings.atBabelTypes.atBabelTypesStrings.ExclamationmarkEqualssignEqualssign
import typings.atBabelTypes.atBabelTypesStrings.Greaterthansign
import typings.atBabelTypes.atBabelTypesStrings.GreaterthansignEqualssign
import typings.atBabelTypes.atBabelTypesStrings.GreaterthansignGreaterthansign
import typings.atBabelTypes.atBabelTypesStrings.GreaterthansignGreaterthansignGreaterthansign
import typings.atBabelTypes.atBabelTypesStrings.Lessthansign
import typings.atBabelTypes.atBabelTypesStrings.LessthansignEqualssign
import typings.atBabelTypes.atBabelTypesStrings.LessthansignLessthansign
import typings.atBabelTypes.atBabelTypesStrings.Percentsign
import typings.atBabelTypes.atBabelTypesStrings.Plussign
import typings.atBabelTypes.atBabelTypesStrings.Slash
import typings.atBabelTypes.atBabelTypesStrings.Verticalline
import typings.atBabelTypes.atBabelTypesStrings.^
import typings.atBabelTypes.atBabelTypesStrings.`-_`
import typings.atBabelTypes.atBabelTypesStrings.in
import typings.atBabelTypes.atBabelTypesStrings.instanceof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atBabelTypes.atBabelTypesMod._Node because Already inherited */ trait BinaryExpression
  extends Binary
     with BaseNode
     with Expression {
  var left: Expression
  var operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign
  var right: Expression
  @JSName("type")
  var type_BinaryExpression: typings.atBabelTypes.atBabelTypesStrings.BinaryExpression
}

object BinaryExpression {
  @scala.inline
  def apply(
    left: Expression,
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    right: Expression,
    `type`: typings.atBabelTypes.atBabelTypesStrings.BinaryExpression,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): BinaryExpression = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryExpression]
  }
}

@JSImport("@babel/types", "binaryExpression")
@js.native
object binaryExpression extends js.Object {
  def apply(
    operator: Plussign | `-_` | Slash | Percentsign | Asterisk | AsteriskAsterisk | Ampersand | Verticalline | GreaterthansignGreaterthansign | GreaterthansignGreaterthansignGreaterthansign | LessthansignLessthansign | ^  | EqualssignEqualssign | EqualssignEqualssignEqualssign | ExclamationmarkEqualssign | ExclamationmarkEqualssignEqualssign | in | instanceof | Greaterthansign | Lessthansign | GreaterthansignEqualssign | LessthansignEqualssign,
    left: Expression,
    right: Expression
  ): BinaryExpression = js.native
}

