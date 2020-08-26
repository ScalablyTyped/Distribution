package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "optionalMemberExpression")
@js.native
object optionalMemberExpression extends js.Object {
  def apply(`object`: Expression, property: Expression, computed: js.UndefOr[scala.Nothing], optional: Boolean): OptionalMemberExpression_ = js.native
  def apply(`object`: Expression, property: Expression, computed: Boolean, optional: Boolean): OptionalMemberExpression_ = js.native
  def apply(
    `object`: Expression,
    property: Identifier_,
    computed: js.UndefOr[scala.Nothing],
    optional: Boolean
  ): OptionalMemberExpression_ = js.native
  def apply(`object`: Expression, property: Identifier_, computed: Boolean, optional: Boolean): OptionalMemberExpression_ = js.native
}

