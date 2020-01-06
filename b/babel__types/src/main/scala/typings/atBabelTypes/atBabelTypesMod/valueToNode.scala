package typings.atBabelTypes.atBabelTypesMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/types", "valueToNode")
@js.native
object valueToNode extends js.Object {
  def apply(): Expression = js.native
  def apply(value: String): StringLiteral = js.native
  def apply(value: js.Array[js.UndefOr[Boolean | Null | String | Double | RegExp | js.Object]]): ArrayExpression = js.native
  def apply(value: js.Object): Expression = js.native
  def apply(value: Boolean): Expression = js.native
  def apply(value: Double): NumericLiteral | BinaryExpression | UnaryExpression = js.native
  def apply(value: RegExp): Expression = js.native
}

