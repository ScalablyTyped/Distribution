package typings
package commentDashJsonLib.commentDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("comment-json", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(json: java.lang.String): js.Any = js.native
  def parse(json: java.lang.String, reviver: commentDashJsonLib.commentDashJsonMod.Reviver): js.Any = js.native
  def parse(
    json: java.lang.String,
    reviver: commentDashJsonLib.commentDashJsonMod.Reviver,
    removes_comments: scala.Boolean
  ): js.Any = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String]): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Array[scala.Double | java.lang.String], space: scala.Double): java.lang.String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: java.lang.String
  ): java.lang.String = js.native
  def stringify(
    value: js.Any,
    replacer: js.Function2[/* key */ java.lang.String, /* value */ js.Any, _],
    space: scala.Double
  ): java.lang.String = js.native
  def stringify(value: js.Any, replacer: scala.Null, space: java.lang.String): java.lang.String = js.native
  def stringify(value: js.Any, replacer: scala.Null, space: scala.Double): java.lang.String = js.native
}

