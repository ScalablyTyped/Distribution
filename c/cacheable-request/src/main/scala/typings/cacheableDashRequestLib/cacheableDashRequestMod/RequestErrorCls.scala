package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestErrorCls
  extends nodeLib.Error {
  val name: cacheableDashRequestLib.cacheableDashRequestLibStrings.RequestError
}

object RequestErrorCls {
  @scala.inline
  def apply(
    name: cacheableDashRequestLib.cacheableDashRequestLibStrings.RequestError,
    stack: java.lang.String = null
  ): RequestErrorCls = {
    val __obj = js.Dynamic.literal(name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[RequestErrorCls]
  }
}

