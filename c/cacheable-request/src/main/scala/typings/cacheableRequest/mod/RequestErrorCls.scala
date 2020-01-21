package typings.cacheableRequest.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorCls extends Error {
  @JSName("name")
  val name_RequestErrorCls: typings.cacheableRequest.cacheableRequestStrings.RequestError
}

object RequestErrorCls {
  @scala.inline
  def apply(
    message: String,
    name: typings.cacheableRequest.cacheableRequestStrings.RequestError,
    stack: String = null
  ): RequestErrorCls = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestErrorCls]
  }
}

