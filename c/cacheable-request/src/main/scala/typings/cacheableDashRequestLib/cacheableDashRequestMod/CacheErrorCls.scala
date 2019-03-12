package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheErrorCls
  extends stdLib.Error {
  @JSName("name")
  val name_CacheErrorCls: cacheableDashRequestLib.cacheableDashRequestLibStrings.CacheError
}

object CacheErrorCls {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: cacheableDashRequestLib.cacheableDashRequestLibStrings.CacheError,
    stack: java.lang.String = null
  ): CacheErrorCls = {
    val __obj = js.Dynamic.literal(message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CacheErrorCls]
  }
}

