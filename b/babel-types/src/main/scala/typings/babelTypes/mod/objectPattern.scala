package typings.babelTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-types", "objectPattern")
@js.native
object objectPattern extends js.Object {
  def apply(): ObjectPattern_ = js.native
  def apply(properties: js.UndefOr[scala.Nothing], typeAnnotation: TypeAnnotation_): ObjectPattern_ = js.native
  def apply(properties: js.Array[AssignmentProperty | RestProperty_]): ObjectPattern_ = js.native
  def apply(properties: js.Array[AssignmentProperty | RestProperty_], typeAnnotation: TypeAnnotation_): ObjectPattern_ = js.native
}

