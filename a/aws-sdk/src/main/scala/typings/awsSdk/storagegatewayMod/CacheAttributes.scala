package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheAttributes extends js.Object {
  /**
    * Refreshes a file share's cache by using Time To Live (TTL). TTL is the length of time since the last refresh after which access to the directory would cause the file gateway to first refresh that directory's contents from the Amazon S3 bucket. The TTL duration is in seconds. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
    */
  var CacheStaleTimeoutInSeconds: js.UndefOr[typings.awsSdk.storagegatewayMod.CacheStaleTimeoutInSeconds] = js.native
}

object CacheAttributes {
  @scala.inline
  def apply(): CacheAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheAttributes]
  }
  @scala.inline
  implicit class CacheAttributesOps[Self <: CacheAttributes] (val x: Self) extends AnyVal {
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
    def setCacheStaleTimeoutInSeconds(value: CacheStaleTimeoutInSeconds): Self = this.set("CacheStaleTimeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheStaleTimeoutInSeconds: Self = this.set("CacheStaleTimeoutInSeconds", js.undefined)
  }
  
}

