package typings.babelTypes.anon

import typings.babelTypes.mod.Expression
import typings.babelTypes.mod.Identifier_
import typings.babelTypes.mod.PrivateName_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@babel/types.@babel/types.MemberExpression, 'object' | 'property'> */
trait PickMemberExpressionobjec extends js.Object {
  var `object`: Expression
  var property: Expression | Identifier_ | PrivateName_
}

object PickMemberExpressionobjec {
  @scala.inline
  def apply(`object`: Expression, property: Expression | Identifier_ | PrivateName_): PickMemberExpressionobjec = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMemberExpressionobjec]
  }
}

