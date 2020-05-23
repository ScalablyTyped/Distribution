package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FalsyOptions extends js.Object {
  var pool: js.Array[FalsyType]
}

object FalsyOptions {
  @scala.inline
  def apply(pool: js.Array[FalsyType]): FalsyOptions = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[FalsyOptions]
  }
}

