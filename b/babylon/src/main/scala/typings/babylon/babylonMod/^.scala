package typings.babylon.babylonMod

import typings.babelDashTypes.babelDashTypesMod.Expression
import typings.babelDashTypes.babelDashTypesMod.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylon", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(code: String): File = js.native
  def parse(code: String, opts: BabylonOptions): File = js.native
  def parseExpression(input: String): Expression = js.native
  def parseExpression(input: String, options: BabylonOptions): Expression = js.native
}

