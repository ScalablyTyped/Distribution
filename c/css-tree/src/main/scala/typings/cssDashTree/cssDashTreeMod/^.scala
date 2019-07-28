package typings.cssDashTree.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clone(node: CssNode): CssNode = js.native
  def fromPlainObject(node: CssNodePlain): CssNode = js.native
  def generate(ast: CssNode): String = js.native
  def generate(ast: CssNode, options: GenerateOptions): String = js.native
  def keyword(value: String): Keyword = js.native
  def parse(text: String): CssNode = js.native
  def parse(text: String, options: ParseOptions): CssNode = js.native
  def property(value: String): Property = js.native
  def toPlainObject(node: CssNode): CssNodePlain = js.native
  def walk(ast: CssNode, options: EnterOrLeaveFn): Unit = js.native
  def walk(ast: CssNode, options: WalkOptions): Unit = js.native
}

