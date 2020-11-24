package typings.babelTypes.mod

import typings.babelTypes.babelTypesStrings.Exclamationmark
import typings.babelTypes.babelTypesStrings.Plussign
import typings.babelTypes.babelTypesStrings.Tilde
import typings.babelTypes.babelTypesStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/types", "unaryExpression")
@js.native
object unaryExpression extends js.Object {
  
  def apply(operator: Exclamationmark, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Exclamationmark, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Plussign, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Plussign, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: Tilde, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: Tilde, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
  def apply(operator: `-_`, argument: Expression): UnaryExpression_ = js.native
  def apply(operator: `-_`, argument: Expression, prefix: Boolean): UnaryExpression_ = js.native
}
