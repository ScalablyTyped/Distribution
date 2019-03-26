package typings
package atBlueprintjsTableLib.libEsmCommonUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyWhitelist[T] extends js.Object {
  var include: js.Array[java.lang.String]
}

object IKeyWhitelist {
  @scala.inline
  def apply[T](include: js.Array[java.lang.String]): IKeyWhitelist[T] = {
    val __obj = js.Dynamic.literal(include = include)
  
    __obj.asInstanceOf[IKeyWhitelist[T]]
  }
}

