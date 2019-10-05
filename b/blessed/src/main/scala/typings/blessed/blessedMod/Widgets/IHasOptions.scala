package typings.blessed.blessedMod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHasOptions[T /* <: IOptions */] extends js.Object {
  var options: T
}

object IHasOptions {
  @scala.inline
  def apply[T /* <: IOptions */](options: T): IHasOptions[T] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IHasOptions[T]]
  }
}

