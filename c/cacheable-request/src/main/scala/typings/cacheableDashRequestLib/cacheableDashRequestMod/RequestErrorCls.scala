package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorCls
  extends stdLib.Error {
  @JSName("name")
  val name_RequestErrorCls: cacheableDashRequestLib.cacheableDashRequestLibStrings.RequestError
}

object RequestErrorCls {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: cacheableDashRequestLib.cacheableDashRequestLibStrings.RequestError,
    stack: java.lang.String = null
  ): RequestErrorCls = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestErrorCls]
  }
}

