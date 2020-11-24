package typings.babelParser.mod

import typings.babelTypes.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@babel/parser", "parseExpression")
@js.native
object parseExpression extends js.Object {
  
  def apply(input: String): Expression = js.native
  def apply(input: String, options: ParserOptions): Expression = js.native
}
