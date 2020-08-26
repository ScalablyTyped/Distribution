package typings.cacheableRequest.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheErrorCls extends Error {
  @JSName("name")
  val name_CacheErrorCls: typings.cacheableRequest.cacheableRequestStrings.CacheError = js.native
}

object CacheErrorCls {
  @scala.inline
  def apply(message: String, name: typings.cacheableRequest.cacheableRequestStrings.CacheError): CacheErrorCls = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheErrorCls]
  }
  @scala.inline
  implicit class CacheErrorClsOps[Self <: CacheErrorCls] (val x: Self) extends AnyVal {
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
    def setName(value: typings.cacheableRequest.cacheableRequestStrings.CacheError): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

