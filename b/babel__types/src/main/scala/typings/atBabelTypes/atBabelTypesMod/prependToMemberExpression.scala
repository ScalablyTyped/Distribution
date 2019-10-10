package typings.atBabelTypes.atBabelTypesMod

import typings.atBabelTypes.atBabelTypesStrings.`object`
import typings.atBabelTypes.atBabelTypesStrings.property
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "prependToMemberExpression")
@js.native
object prependToMemberExpression extends js.Object {
  def apply[T /* <: Pick[MemberExpression, `object` | property] */](member: T, prepend: Expression): T = js.native
}

