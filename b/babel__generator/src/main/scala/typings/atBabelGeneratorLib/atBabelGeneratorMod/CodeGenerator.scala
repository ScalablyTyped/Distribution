package typings
package atBabelGeneratorLib.atBabelGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/generator", "CodeGenerator")
@js.native
class CodeGenerator protected () extends js.Object {
  def this(ast: atBabelTypesLib.atBabelTypesMod.Node) = this()
  def this(ast: atBabelTypesLib.atBabelTypesMod.Node, opts: GeneratorOptions) = this()
  def this(ast: atBabelTypesLib.atBabelTypesMod.Node, opts: GeneratorOptions, code: java.lang.String) = this()
  def generate(): GeneratorResult = js.native
}

