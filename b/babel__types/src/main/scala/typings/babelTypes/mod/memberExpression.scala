package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "memberExpression")
@js.native
object memberExpression extends js.Object {
  def apply(`object`: Expression, property: Expression): MemberExpression_ = js.native
  def apply(`object`: Expression, property: Expression, computed: Boolean): MemberExpression_ = js.native
  def apply(`object`: Expression, property: Identifier_): MemberExpression_ = js.native
  def apply(`object`: Expression, property: Identifier_, computed: Boolean): MemberExpression_ = js.native
  def apply(`object`: Expression, property: PrivateName_): MemberExpression_ = js.native
  def apply(`object`: Expression, property: PrivateName_, computed: Boolean): MemberExpression_ = js.native
}

