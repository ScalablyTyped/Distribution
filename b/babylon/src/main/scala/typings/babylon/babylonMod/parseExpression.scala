package typings.babylon.babylonMod

import typings.babelDashTypes.babelDashTypesMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylon", "parseExpression")
@js.native
object parseExpression extends js.Object {
  def apply(input: String): Expression = js.native
  def apply(input: String, options: BabylonOptions): Expression = js.native
}

