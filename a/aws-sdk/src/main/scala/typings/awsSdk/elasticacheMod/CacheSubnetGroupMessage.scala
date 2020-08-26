package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheSubnetGroupMessage extends js.Object {
  /**
    * A list of cache subnet groups. Each element in the list contains detailed information about one group.
    */
  var CacheSubnetGroups: js.UndefOr[typings.awsSdk.elasticacheMod.CacheSubnetGroups] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheSubnetGroupMessage {
  @scala.inline
  def apply(): CacheSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSubnetGroupMessage]
  }
  @scala.inline
  implicit class CacheSubnetGroupMessageOps[Self <: CacheSubnetGroupMessage] (val x: Self) extends AnyVal {
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
    def setCacheSubnetGroupsVarargs(value: CacheSubnetGroup*): Self = this.set("CacheSubnetGroups", js.Array(value :_*))
    @scala.inline
    def setCacheSubnetGroups(value: CacheSubnetGroups): Self = this.set("CacheSubnetGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheSubnetGroups: Self = this.set("CacheSubnetGroups", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

