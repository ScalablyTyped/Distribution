package typings
package bsonLib.bsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bson", "EJSON")
@js.native
object EJSONNs extends js.Object {
  def deserialize(ejson: js.Object): js.Object = js.native
  def deserialize(ejson: js.Object, options: bsonLib.Anon_Relaxed): js.Object = js.native
  def parse(text: java.lang.String): js.Object = js.native
  def parse(text: java.lang.String, options: bsonLib.Anon_Relaxed): js.Object = js.native
  def serialize(bson: js.Object): js.Object = js.native
  def serialize(bson: js.Object, options: bsonLib.Anon_Relaxed): js.Object = js.native
  def stringify(value: js.Object): java.lang.String = js.native
  def stringify(value: js.Object, options: bsonLib.Anon_Relaxed): java.lang.String = js.native
  def stringify(value: js.Object, replacer: js.Array[scala.Double | java.lang.String]): java.lang.String = js.native
  def stringify(value: js.Object, replacer: js.Array[java.lang.String | scala.Double], indents: java.lang.String): java.lang.String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Array[java.lang.String | scala.Double],
    indents: java.lang.String,
    options: bsonLib.Anon_Relaxed
  ): java.lang.String = js.native
  def stringify(value: js.Object, replacer: js.Array[java.lang.String | scala.Double], indents: scala.Double): java.lang.String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Array[java.lang.String | scala.Double],
    indents: scala.Double,
    options: bsonLib.Anon_Relaxed
  ): java.lang.String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Array[java.lang.String | scala.Double],
    options: bsonLib.Anon_Relaxed
  ): java.lang.String = js.native
  def stringify(value: js.Object, replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): java.lang.String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    indents: java.lang.String
  ): java.lang.String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    indents: java.lang.String,
    options: bsonLib.Anon_Relaxed
  ): java.lang.String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    indents: scala.Double
  ): java.lang.String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    indents: scala.Double,
    options: bsonLib.Anon_Relaxed
  ): java.lang.String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    options: bsonLib.Anon_Relaxed
  ): java.lang.String = js.native
}

