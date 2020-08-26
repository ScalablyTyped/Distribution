package typings.csonParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cson-parser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parse(text: String): js.Any = js.native
  def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, _]): js.Any = js.native
  def stringify(data: js.Any): String = js.native
  def stringify(data: js.Any, visitor: js.UndefOr[scala.Nothing], indent: String): String = js.native
  def stringify(data: js.Any, visitor: js.UndefOr[scala.Nothing], indent: Double): String = js.native
  def stringify(data: js.Any, visitor: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(data: js.Any, visitor: js.Function2[/* key */ String, /* value */ js.Any, _], indent: String): String = js.native
  def stringify(data: js.Any, visitor: js.Function2[/* key */ String, /* value */ js.Any, _], indent: Double): String = js.native
  def stringify(data: js.Any, visitor: Null, indent: String): String = js.native
  def stringify(data: js.Any, visitor: Null, indent: Double): String = js.native
}

