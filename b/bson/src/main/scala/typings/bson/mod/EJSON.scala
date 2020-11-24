package typings.bson.mod

import typings.bson.anon.Relaxed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("bson", "EJSON")
@js.native
object EJSON extends js.Object {
  
  def deserialize(ejson: js.Object): js.Object = js.native
  def deserialize(ejson: js.Object, options: Relaxed): js.Object = js.native
  
  def parse(text: String): js.Object = js.native
  def parse(text: String, options: Relaxed): js.Object = js.native
  
  def serialize(bson: js.Object): js.Object = js.native
  def serialize(bson: js.Object, options: Relaxed): js.Object = js.native
  
  def stringify(value: js.Object): String = js.native
  def stringify(value: js.Object, options: Relaxed): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.UndefOr[scala.Nothing],
    indents: js.UndefOr[scala.Nothing],
    options: Relaxed
  ): String = js.native
  def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], indents: String): String = js.native
  def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], indents: String, options: Relaxed): String = js.native
  def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], indents: scala.Double): String = js.native
  def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], indents: scala.Double, options: Relaxed): String = js.native
  def stringify(value: js.Object, replacer: js.UndefOr[scala.Nothing], options: Relaxed): String = js.native
  def stringify(value: js.Object, replacer: js.Array[scala.Double | String]): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Array[String | scala.Double],
    indents: js.UndefOr[scala.Nothing],
    options: Relaxed
  ): String = js.native
  def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: String): String = js.native
  def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: String, options: Relaxed): String = js.native
  def stringify(value: js.Object, replacer: js.Array[String | scala.Double], indents: scala.Double): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Array[String | scala.Double],
    indents: scala.Double,
    options: Relaxed
  ): String = js.native
  def stringify(value: js.Object, replacer: js.Array[String | scala.Double], options: Relaxed): String = js.native
  def stringify(value: js.Object, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    indents: js.UndefOr[scala.Nothing],
    options: Relaxed
  ): String = js.native
  def stringify(value: js.Object, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], indents: String): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    indents: String,
    options: Relaxed
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
    options: Relaxed
  ): String = js.native
  def stringify(
    value: js.Object,
    replacer: js.Function2[/* key */ String, /* value */ js.Any, _],
    options: Relaxed
  ): String = js.native
  def stringify(value: js.Object, replacer: Null, indents: js.UndefOr[scala.Nothing], options: Relaxed): String = js.native
  def stringify(value: js.Object, replacer: Null, indents: String): String = js.native
  def stringify(value: js.Object, replacer: Null, indents: String, options: Relaxed): String = js.native
  def stringify(value: js.Object, replacer: Null, indents: scala.Double): String = js.native
  def stringify(value: js.Object, replacer: Null, indents: scala.Double, options: Relaxed): String = js.native
  def stringify(value: js.Object, replacer: Null, options: Relaxed): String = js.native
}
