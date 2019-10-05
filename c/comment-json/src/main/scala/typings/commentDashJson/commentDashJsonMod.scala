package typings.commentDashJson

import typings.commentDashJson.commentDashJsonMod.Reviver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("comment-json", JSImport.Namespace)
@js.native
object commentDashJsonMod extends js.Object {
  def parse(json: String): js.Any = js.native
  def parse(json: String, reviver: Reviver): js.Any = js.native
  def parse(json: String, reviver: Reviver, removes_comments: Boolean): js.Any = js.native
  def stringify(value: js.Any): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String]): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Array[Double | String], space: Double): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _]): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: String): String = js.native
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, _], space: Double): String = js.native
  def stringify(value: js.Any, replacer: Null, space: String): String = js.native
  def stringify(value: js.Any, replacer: Null, space: Double): String = js.native
  type Reviver = js.Function2[/* k */ Double | String, /* v */ js.Any, js.Any]
}

