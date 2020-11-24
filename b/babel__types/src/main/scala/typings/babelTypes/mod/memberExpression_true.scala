package typings.babelTypes.mod

import typings.babelTypes.babelTypesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "memberExpression")
@js.native
object memberExpression_true extends js.Object {
  
  def apply(`object`: Expression, property: Expression, computed: js.UndefOr[scala.Nothing], optional: `true`): MemberExpression_ = js.native
  def apply(`object`: Expression, property: Expression, computed: Boolean, optional: `true`): MemberExpression_ = js.native
  def apply(`object`: Expression, property: Identifier_, computed: js.UndefOr[scala.Nothing], optional: `true`): MemberExpression_ = js.native
  def apply(`object`: Expression, property: Identifier_, computed: Boolean, optional: `true`): MemberExpression_ = js.native
  def apply(
    `object`: Expression,
    property: PrivateName_,
    computed: js.UndefOr[scala.Nothing],
    optional: `true`
  ): MemberExpression_ = js.native
  def apply(`object`: Expression, property: PrivateName_, computed: Boolean, optional: `true`): MemberExpression_ = js.native
}
