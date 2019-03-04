package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheErrorCls
  extends nodeLib.Error {
  val name: cacheableDashRequestLib.cacheableDashRequestLibStrings.CacheError
}

object CacheErrorCls {
  @scala.inline
  def apply(
    name: cacheableDashRequestLib.cacheableDashRequestLibStrings.CacheError,
    stack: java.lang.String = null
  ): CacheErrorCls = {
    val __obj = js.Dynamic.literal(name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CacheErrorCls]
  }
}

