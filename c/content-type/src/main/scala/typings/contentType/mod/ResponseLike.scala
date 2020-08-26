package typings.contentType.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseLike extends js.Object {
  def getHeader(name: String): js.UndefOr[Double | String | js.Array[String]] = js.native
}

object ResponseLike {
  @scala.inline
  def apply(getHeader: String => js.UndefOr[Double | String | js.Array[String]]): ResponseLike = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader))
    __obj.asInstanceOf[ResponseLike]
  }
  @scala.inline
  implicit class ResponseLikeOps[Self <: ResponseLike] (val x: Self) extends AnyVal {
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
    def setGetHeader(value: String => js.UndefOr[Double | String | js.Array[String]]): Self = this.set("getHeader", js.Any.fromFunction1(value))
  }
  
}

