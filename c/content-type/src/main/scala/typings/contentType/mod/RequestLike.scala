package typings.contentType.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestLike extends js.Object {
  var headers: StringDictionary[js.UndefOr[String | js.Array[String]]] = js.native
}

object RequestLike {
  @scala.inline
  def apply(headers: StringDictionary[js.UndefOr[String | js.Array[String]]]): RequestLike = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestLike]
  }
  @scala.inline
  implicit class RequestLikeOps[Self <: RequestLike] (val x: Self) extends AnyVal {
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
    def setHeaders(value: StringDictionary[js.UndefOr[String | js.Array[String]]]): Self = this.set("headers", value.asInstanceOf[js.Any])
  }
  
}

