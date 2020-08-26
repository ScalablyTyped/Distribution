package typings.backboneFetchCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCacheKeyObject extends _GetCacheKeyOptions {
  var getCacheKey: js.UndefOr[js.Function1[/* opts */ js.UndefOr[GetCacheOptions], String]] = js.native
  var url: js.UndefOr[js.Function0[String]] = js.native
}

object GetCacheKeyObject {
  @scala.inline
  def apply(): GetCacheKeyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCacheKeyObject]
  }
  @scala.inline
  implicit class GetCacheKeyObjectOps[Self <: GetCacheKeyObject] (val x: Self) extends AnyVal {
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
    def setGetCacheKey(value: /* opts */ js.UndefOr[GetCacheOptions] => String): Self = this.set("getCacheKey", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetCacheKey: Self = this.set("getCacheKey", js.undefined)
    @scala.inline
    def setUrl(value: () => String): Self = this.set("url", js.Any.fromFunction0(value))
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

