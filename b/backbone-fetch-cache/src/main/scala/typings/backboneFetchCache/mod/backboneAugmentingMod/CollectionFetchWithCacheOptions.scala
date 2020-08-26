package typings.backboneFetchCache.mod.backboneAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionFetchWithCacheOptions extends ModelFetchWithCacheOptions {
  @JSName("prefillSuccess")
  var prefillSuccess_CollectionFetchWithCacheOptions: js.UndefOr[js.Function1[/* self */ js.Any, Unit]] = js.native
}

object CollectionFetchWithCacheOptions {
  @scala.inline
  def apply(): CollectionFetchWithCacheOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionFetchWithCacheOptions]
  }
  @scala.inline
  implicit class CollectionFetchWithCacheOptionsOps[Self <: CollectionFetchWithCacheOptions] (val x: Self) extends AnyVal {
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
    def setPrefillSuccess(value: /* self */ js.Any => Unit): Self = this.set("prefillSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deletePrefillSuccess: Self = this.set("prefillSuccess", js.undefined)
  }
  
}

