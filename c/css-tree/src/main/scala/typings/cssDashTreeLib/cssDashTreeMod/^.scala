package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("css-tree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def clone(node: CssNode): CssNode = js.native
  def fromPlainObject(node: CssNodePlain): CssNode = js.native
  def generate(ast: CssNode): java.lang.String = js.native
  def generate(ast: CssNode, options: GenerateOptions): java.lang.String = js.native
  def keyword(value: java.lang.String): Keyword = js.native
  def parse(text: java.lang.String): CssNode = js.native
  def parse(text: java.lang.String, options: ParseOptions): CssNode = js.native
  def property(value: java.lang.String): Property = js.native
  def toPlainObject(node: CssNode): CssNodePlain = js.native
  def walk(ast: CssNode, options: EnterOrLeaveFn): scala.Unit = js.native
  def walk(ast: CssNode, options: WalkOptions): scala.Unit = js.native
}

