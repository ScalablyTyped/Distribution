package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheEngineVersionMessage extends js.Object {
  /**
    * A list of cache engine version details. Each element in the list contains detailed information about one cache engine version.
    */
  var CacheEngineVersions: js.UndefOr[CacheEngineVersionList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheEngineVersionMessage {
  @scala.inline
  def apply(): CacheEngineVersionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheEngineVersionMessage]
  }
  @scala.inline
  implicit class CacheEngineVersionMessageOps[Self <: CacheEngineVersionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheEngineVersionsVarargs(value: CacheEngineVersion*): Self = this.set("CacheEngineVersions", js.Array(value :_*))
    @scala.inline
    def setCacheEngineVersions(value: CacheEngineVersionList): Self = this.set("CacheEngineVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheEngineVersions: Self = this.set("CacheEngineVersions", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

