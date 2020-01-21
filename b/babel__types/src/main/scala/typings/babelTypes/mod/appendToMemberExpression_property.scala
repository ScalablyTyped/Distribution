package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.`object`
import typings.babelTypes.babelTypesStrings.property
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "appendToMemberExpression")
@js.native
object appendToMemberExpression_property extends js.Object {
  def apply[T /* <: Pick[MemberExpression_, `object` | property] */](
    member: T,
    append: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.MemberExpression['property'] */ js.Any
  ): T = js.native
  def apply[T /* <: Pick[MemberExpression_, `object` | property] */](
    member: T,
    append: /* import warning: importer.ImportType#apply Failed type conversion: @babel/types.@babel/types.MemberExpression['property'] */ js.Any,
    computed: Boolean
  ): T = js.native
}

