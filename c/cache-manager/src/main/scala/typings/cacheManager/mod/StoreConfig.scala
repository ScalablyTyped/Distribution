package typings.cacheManager.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cacheManager.anon.Create
import typings.cacheManager.cacheManagerStrings.memory
import typings.cacheManager.cacheManagerStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreConfig
  extends CachingConfig
     with /**
  * You may pass in any other arguments these will be passed on to the `create` method of your store,
  * otherwise they will be ignored.
  */
/* key */ StringDictionary[js.Any] {
  var max: js.UndefOr[Double] = js.native
  var store: memory | none | Store | Create = js.native
}

object StoreConfig {
  @scala.inline
  def apply(store: memory | none | Store | Create, ttl: Double | TtlFunction): StoreConfig = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreConfig]
  }
  @scala.inline
  implicit class StoreConfigOps[Self <: StoreConfig] (val x: Self) extends AnyVal {
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
    def setStore(value: memory | none | Store | Create): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
  }
  
}

