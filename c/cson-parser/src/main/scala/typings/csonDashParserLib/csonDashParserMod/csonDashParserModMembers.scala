package typings
package csonDashParserLib.csonDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cson-parser", JSImport.Namespace)
@js.native
object csonDashParserModMembers extends js.Object {
  def parse(text: java.lang.String): js.Any = js.native
  def parse(text: java.lang.String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, replacer: ReplacerFunction): java.lang.String = js.native
  def stringify(value: js.Any, replacer: ReplacerFunction, space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: ReplacerFunction, space: scala.Double): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String]): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: scala.Double): java.lang.String = js.native
  def stringify(value: js.Any, replacer: scala.Null, space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: scala.Null, space: scala.Double): java.lang.String = js.native
}

