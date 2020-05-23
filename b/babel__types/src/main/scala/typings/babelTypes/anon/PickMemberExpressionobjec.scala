package typings.babelTypes.anon

import typings.babelTypes.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@babel/types.@babel/types.MemberExpression, 'object' | 'property'> */
trait PickMemberExpressionobjec extends js.Object {
  var `object`: Expression
  var property: js.Any
}

object PickMemberExpressionobjec {
  @scala.inline
  def apply(`object`: Expression, property: js.Any): PickMemberExpressionobjec = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMemberExpressionobjec]
  }
}

