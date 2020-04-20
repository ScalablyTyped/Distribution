package typings.blueprintjsCore.compareUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyBlacklist[T] extends js.Object {
  var exclude: js.Array[/* keyof T */ String]
}

object IKeyBlacklist {
  @scala.inline
  def apply[T](exclude: js.Array[/* keyof T */ String]): IKeyBlacklist[T] = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyBlacklist[T]]
  }
}

