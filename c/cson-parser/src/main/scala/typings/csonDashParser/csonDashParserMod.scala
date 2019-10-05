package typings.csonDashParser

import typings.csonDashParser.csonDashParserMod.ReplacerFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cson-parser", JSImport.Namespace)
@js.native
object csonDashParserMod extends js.Object {
  def parse(text: String): js.Any = js.native
  def parse(text: String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
  def stringify(value: js.Any, replacer: Null, space: String): String = js.native
  def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
  def stringify(value: js.Any, replacer: ReplacerFunction): String = js.native
  def stringify(value: js.Any, replacer: ReplacerFunction, space: String): String = js.native
  def stringify(value: js.Any, replacer: ReplacerFunction, space: Double): String = js.native
  type ReplacerFunction = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}

