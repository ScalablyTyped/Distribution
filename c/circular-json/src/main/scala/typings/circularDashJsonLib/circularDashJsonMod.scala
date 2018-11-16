package typings
package circularDashJsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("circular-json", JSImport.Namespace)
@js.native
object circularDashJsonMod extends js.Object {
  def parse(text: java.lang.String): js.Any = js.native
  def parse(text: java.lang.String, reviver: js.Function2[/* key */ js.Any, /* value */ js.Any, _]): js.Any = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String]): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: js.Any): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Array[scala.Double | java.lang.String],
    space: js.Any,
    placeholder: scala.Boolean
  ): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: js.Any
  ): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: js.Any,
    placeholder: scala.Boolean
  ): java.lang.String = js.native
  def stringify(value: js.Any, replacer: scala.Null, space: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, replacer: scala.Null, space: js.Any, placeholder: scala.Boolean): java.lang.String = js.native
}

