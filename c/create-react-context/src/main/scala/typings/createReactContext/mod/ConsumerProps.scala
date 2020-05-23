package typings.createReactContext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerProps[T] extends js.Object {
  var children: RenderFn[T] | js.Array[RenderFn[T]]
  var observedBits: js.UndefOr[Double] = js.undefined
}

object ConsumerProps {
  @scala.inline
  def apply[T](children: RenderFn[T] | js.Array[RenderFn[T]], observedBits: js.UndefOr[Double] = js.undefined): ConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(observedBits)) __obj.updateDynamic("observedBits")(observedBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerProps[T]]
  }
}

