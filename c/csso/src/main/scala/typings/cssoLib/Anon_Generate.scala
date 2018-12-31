package typings
package cssoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Generate extends js.Object {
  var List: org.scalablytyped.runtime.Instantiable0[cssDashTreeLib.cssDashTreeMod.List[js.Object]] = js.native
  def clone(node: cssDashTreeLib.cssDashTreeMod.CssNode): cssDashTreeLib.cssDashTreeMod.CssNode = js.native
  def fromPlainObject(node: cssDashTreeLib.cssDashTreeMod.CssNodePlain): cssDashTreeLib.cssDashTreeMod.CssNode = js.native
  def generate(ast: cssDashTreeLib.cssDashTreeMod.CssNode): java.lang.String = js.native
  def generate(ast: cssDashTreeLib.cssDashTreeMod.CssNode, options: cssDashTreeLib.cssDashTreeMod.GenerateOptions): java.lang.String = js.native
  def keyword(value: java.lang.String): cssDashTreeLib.cssDashTreeMod.Keyword = js.native
  def parse(text: java.lang.String): cssDashTreeLib.cssDashTreeMod.CssNode = js.native
  def parse(text: java.lang.String, options: cssDashTreeLib.cssDashTreeMod.ParseOptions): cssDashTreeLib.cssDashTreeMod.CssNode = js.native
  def property(value: java.lang.String): cssDashTreeLib.cssDashTreeMod.Property = js.native
  def toPlainObject(node: cssDashTreeLib.cssDashTreeMod.CssNode): cssDashTreeLib.cssDashTreeMod.CssNodePlain = js.native
  def walk(ast: cssDashTreeLib.cssDashTreeMod.CssNode, options: cssDashTreeLib.cssDashTreeMod.EnterOrLeaveFn): scala.Unit = js.native
  def walk(ast: cssDashTreeLib.cssDashTreeMod.CssNode, options: cssDashTreeLib.cssDashTreeMod.WalkOptions): scala.Unit = js.native
}

