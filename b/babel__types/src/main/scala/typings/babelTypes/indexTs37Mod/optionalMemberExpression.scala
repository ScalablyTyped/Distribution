package typings.babelTypes.indexTs37Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types/lib/index-ts3.7", "optionalMemberExpression")
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
