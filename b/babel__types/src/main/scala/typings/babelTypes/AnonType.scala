package typings.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237 */ js.Any */] extends js.Object {
  var `type`: T
}

object AnonType {
  @scala.inline
  def apply[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 237 */ js.Any */](`type`: T): AnonType[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType[T]]
  }
}

