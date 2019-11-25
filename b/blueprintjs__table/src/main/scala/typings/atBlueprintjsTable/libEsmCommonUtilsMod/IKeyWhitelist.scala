package typings.atBlueprintjsTable.libEsmCommonUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyWhitelist[T] extends js.Object {
  var include: js.Array[String]
}

object IKeyWhitelist {
  @scala.inline
  def apply[T](include: js.Array[String]): IKeyWhitelist[T] = {
    val __obj = js.Dynamic.literal(include = include.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IKeyWhitelist[T]]
  }
}

