package typings.bson.mod

import typings.bson.AnonRelaxed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "EJSON")
@js.native
object EJSON extends js.Object {
  def deserialize(ejson: js.Object): js.Object = js.native
  def deserialize(ejson: js.Object, options: AnonRelaxed): js.Object = js.native
  def parse(text: String): js.Object = js.native
  def parse(text: String, options: AnonRelaxed): js.Object = js.native
  def serialize(bson: js.Object): js.Object = js.native
  def serialize(bson: js.Object, options: AnonRelaxed): js.Object = js.native
  def stringify(value: js.Object): String = js.native
  def stringify(value: js.Object, options: AnonRelaxed): String = js.native
  def stringify(value: js.Object, replacer: js.Array[scala.Double | String]): String = js.native
  def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: String): String = js.native
  def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: String, options: AnonRelaxed): String = js.native
  def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: scala.Double): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Array[String | scala.Double],
    indents: scala.Double,
    options: AnonRelaxed
  ): String = js.native
  def stringify(value: js.Object, replacer: js.Array[String | scala.Double], options: AnonRelaxed): String = js.native
  def stringify(value: js.Object, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(value: js.Object, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], indents: String): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    indents: String,
    options: AnonRelaxed
  ): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    indents: scala.Double
  ): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    indents: scala.Double,
    options: AnonRelaxed
  ): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    options: AnonRelaxed
  ): String = js.native
}

