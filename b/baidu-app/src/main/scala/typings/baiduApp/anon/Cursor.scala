package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor extends js.Object {
  var cursor: Double
  var value: String
}

object Cursor {
  @scala.inline
  def apply(cursor: Double, value: String): Cursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
}

