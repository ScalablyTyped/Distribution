package typings.createDashReactDashContext.createDashReactDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerProps[T] extends js.Object {
  var children: RenderFn[T] | js.Array[RenderFn[T]]
  var observedBits: js.UndefOr[Double] = js.undefined
}

object ConsumerProps {
  @scala.inline
  def apply[T](children: RenderFn[T] | js.Array[RenderFn[T]], observedBits: Int | Double = null): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
}

