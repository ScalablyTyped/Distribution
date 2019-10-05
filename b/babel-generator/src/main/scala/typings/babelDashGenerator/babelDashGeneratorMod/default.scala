package typings.babelDashGenerator.babelDashGeneratorMod

import org.scalablytyped.runtime.StringDictionary
import typings.babelDashTypes.babelDashTypesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babel-generator", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(ast: Node): GeneratorResult = js.native
  def apply(ast: Node, opts: GeneratorOptions): GeneratorResult = js.native
  def apply(ast: Node, opts: GeneratorOptions, code: String): GeneratorResult = js.native
  def apply(ast: Node, opts: GeneratorOptions, code: StringDictionary[String]): GeneratorResult = js.native
}

