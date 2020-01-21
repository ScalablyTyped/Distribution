package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.`object`
import typings.babelTypes.babelTypesStrings.property
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "prependToMemberExpression")
@js.native
object prependToMemberExpression extends js.Object {
  def apply[T /* <: Pick[MemberExpression_, `object` | property] */](member: T, prepend: Expression): T = js.native
}

