package typings.callbackToAsyncIterator.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncifyOptions[T, R] extends js.Object {
  var buffering: js.UndefOr[Boolean] = js.native
  var onClose: js.UndefOr[js.Function1[/* arg */ R, Unit | T]] = js.native
  var onError: js.UndefOr[js.Function0[Error]] = js.native
}

object AsyncifyOptions {
  @scala.inline
  def apply[T, R](): AsyncifyOptions[T, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncifyOptions[T, R]]
  }
  @scala.inline
  implicit class AsyncifyOptionsOps[Self <: AsyncifyOptions[_, _], T, R] (val x: Self with (AsyncifyOptions[T, R])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBuffering(value: Boolean): Self = this.set("buffering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffering: Self = this.set("buffering", js.undefined)
    @scala.inline
    def setOnClose(value: /* arg */ R => Unit | T): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnError(value: () => Error): Self = this.set("onError", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
  }
  
}

