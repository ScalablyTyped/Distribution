package typings.contentType.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseLike extends js.Object {
  def getHeader(name: String): js.UndefOr[Double | String | js.Array[String]]
}

object ResponseLike {
  @scala.inline
  def apply(getHeader: String => js.UndefOr[Double | String | js.Array[String]]): ResponseLike = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader))
    __obj.asInstanceOf[ResponseLike]
  }
}

