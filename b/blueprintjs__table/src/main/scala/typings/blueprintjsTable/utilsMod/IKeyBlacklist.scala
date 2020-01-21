package typings.blueprintjsTable.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyBlacklist[T] extends js.Object {
  var exclude: js.Array[String]
}

object IKeyBlacklist {
  @scala.inline
  def apply[T](exclude: js.Array[String]): IKeyBlacklist[T] = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeyBlacklist[T]]
  }
}

