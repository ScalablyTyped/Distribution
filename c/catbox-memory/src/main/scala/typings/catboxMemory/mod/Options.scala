package typings.catboxMemory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * by default, all data is cached as JSON strings, and converted to an object using JSON.parse() on retrieval.
    * By setting this option to true, Buffer data can be stored alongside the stringified data.
    * Buffers are not stringified, and are copied before storage to prevent the value from changing while in the cache.
    * @default false
    */
  var allowMixedContent: js.UndefOr[Boolean] = js.native
  /**
    * by default, buffers stored in the cache with allowMixedContent set to true are copied when they are set but not when they are retrieved.
    * This means a change to the buffer returned by a get() will change the value in the cache. To prevent this,
    * set cloneBuffersOnGet to true to always return a copy of the cached buffer.
    * @default false
    */
  var cloneBuffersOnGet: js.UndefOr[Boolean] = js.native
  /**
    * Sets an upper limit on the number of bytes that can be stored in the cache.
    * Once this limit is reached no additional items will be added to the cache until some expire.
    * The utilized memory calculation is a rough approximation and must not be relied on.
    * @default 104857600 (100MB).
    */
  var maxByteSize: js.UndefOr[Double] = js.native
  /**
    * The minimum number of milliseconds in between each cache cleanup.
    * @default 1000 (1 second)
    */
  var minCleanupIntervalMsec: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAllowMixedContent(value: Boolean): Self = this.set("allowMixedContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMixedContent: Self = this.set("allowMixedContent", js.undefined)
    @scala.inline
    def setCloneBuffersOnGet(value: Boolean): Self = this.set("cloneBuffersOnGet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloneBuffersOnGet: Self = this.set("cloneBuffersOnGet", js.undefined)
    @scala.inline
    def setMaxByteSize(value: Double): Self = this.set("maxByteSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxByteSize: Self = this.set("maxByteSize", js.undefined)
    @scala.inline
    def setMinCleanupIntervalMsec(value: Double): Self = this.set("minCleanupIntervalMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCleanupIntervalMsec: Self = this.set("minCleanupIntervalMsec", js.undefined)
  }
  
}

