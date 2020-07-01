package typings.callbackToAsyncIterator.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncifyOptions[T, R] extends js.Object {
  var buffering: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function1[/* arg */ R, Unit | T]] = js.undefined
  var onError: js.UndefOr[js.Function0[Error]] = js.undefined
}

object AsyncifyOptions {
  @scala.inline
  def apply[T, R](
    buffering: js.UndefOr[Boolean] = js.undefined,
    onClose: /* arg */ R => Unit | T = null,
    onError: () => Error = null
  ): AsyncifyOptions[T, R] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(buffering)) __obj.updateDynamic("buffering")(buffering.get.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction0(onError))
    __obj.asInstanceOf[AsyncifyOptions[T, R]]
  }
}

