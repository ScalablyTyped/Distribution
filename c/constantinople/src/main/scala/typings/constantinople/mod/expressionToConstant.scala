package typings.constantinople.mod

import typings.babelTypes.mod.Expression
import typings.constantinople.anon.Constant
import typings.constantinople.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("constantinople", "expressionToConstant")
@js.native
object expressionToConstant extends js.Object {
  
  def apply(expression: Expression): Constant | Result = js.native
  def apply(expression: Expression, options: ExpressionToConstantOptions): Constant | Result = js.native
}
