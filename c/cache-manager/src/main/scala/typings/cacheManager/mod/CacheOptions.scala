package typings.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheOptions extends js.Object {
  var isCacheableValue: js.UndefOr[js.Function1[/* value */ js.Any, Boolean]] = js.native
  /**
    * Promise library to replace global.Promise
    */
  var promiseDependency: js.UndefOr[js.Any] = js.native
}

object CacheOptions {
  @scala.inline
  def apply(): CacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheOptions]
  }
  @scala.inline
  implicit class CacheOptionsOps[Self <: CacheOptions] (val x: Self) extends AnyVal {
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
    def setIsCacheableValue(value: /* value */ js.Any => Boolean): Self = this.set("isCacheableValue", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsCacheableValue: Self = this.set("isCacheableValue", js.undefined)
    @scala.inline
    def setPromiseDependency(value: js.Any): Self = this.set("promiseDependency", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromiseDependency: Self = this.set("promiseDependency", js.undefined)
  }
  
}

