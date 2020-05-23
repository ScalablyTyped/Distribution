package typings.blueprintjsCore.refsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRefObject[T] extends js.Object {
  val current: T | Null
}

object IRefObject {
  @scala.inline
  def apply[T](current: T = null): IRefObject[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefObject[T]]
  }
}

