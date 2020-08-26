package typings.builderUtilRuntime.publishOptionsMod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishConfiguration extends js.Object {
  /**
    * The provider.
    */
  val provider: PublishProvider = js.native
  /**
    * Whether to publish auto update info files.
    *
    * Auto update relies only on the first provider in the list (you can specify several publishers).
    * Thus, probably, there`s no need to upload the metadata files for the other configured providers. But by default will be uploaded.
    *
    * @default true
    */
  val publishAutoUpdate: js.UndefOr[Boolean] = js.native
  /**
    * @private
    * win-only
    */
  var publisherName: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * Any custom request headers
    */
  val requestHeaders: js.UndefOr[OutgoingHttpHeaders] = js.native
  /**
    * @private
    * win-only
    */
  val updaterCacheDirName: js.UndefOr[String | Null] = js.native
}

object PublishConfiguration {
  @scala.inline
  def apply(provider: PublishProvider): PublishConfiguration = {
    val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishConfiguration]
  }
  @scala.inline
  implicit class PublishConfigurationOps[Self <: PublishConfiguration] (val x: Self) extends AnyVal {
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
    def setProvider(value: PublishProvider): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublishAutoUpdate(value: Boolean): Self = this.set("publishAutoUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublishAutoUpdate: Self = this.set("publishAutoUpdate", js.undefined)
    @scala.inline
    def setPublisherNameVarargs(value: String*): Self = this.set("publisherName", js.Array(value :_*))
    @scala.inline
    def setPublisherName(value: js.Array[String]): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherName: Self = this.set("publisherName", js.undefined)
    @scala.inline
    def setPublisherNameNull: Self = this.set("publisherName", null)
    @scala.inline
    def setRequestHeaders(value: OutgoingHttpHeaders): Self = this.set("requestHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestHeaders: Self = this.set("requestHeaders", js.undefined)
    @scala.inline
    def setUpdaterCacheDirName(value: String): Self = this.set("updaterCacheDirName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdaterCacheDirName: Self = this.set("updaterCacheDirName", js.undefined)
    @scala.inline
    def setUpdaterCacheDirNameNull: Self = this.set("updaterCacheDirName", null)
  }
  
}

