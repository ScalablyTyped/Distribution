package typings
package atBabelGeneratorLib.generatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/generator", "CodeGenerator")
@js.native
class CodeGenerator protected () extends js.Object {
  def this(ast: atBabelTypesLib.typesMod.Node) = this()
  def this(ast: atBabelTypesLib.typesMod.Node, opts: GeneratorOptions) = this()
  def this(ast: atBabelTypesLib.typesMod.Node, opts: GeneratorOptions, code: java.lang.String) = this()
  def generate(): GeneratorResult = js.native
}

