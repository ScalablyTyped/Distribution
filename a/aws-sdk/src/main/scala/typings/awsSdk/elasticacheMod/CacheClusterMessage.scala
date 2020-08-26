package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CacheClusterMessage extends js.Object {
  /**
    * A list of clusters. Each item in the list contains detailed information about one cluster.
    */
  var CacheClusters: js.UndefOr[CacheClusterList] = js.native
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var Marker: js.UndefOr[String] = js.native
}

object CacheClusterMessage {
  @scala.inline
  def apply(): CacheClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheClusterMessage]
  }
  @scala.inline
  implicit class CacheClusterMessageOps[Self <: CacheClusterMessage] (val x: Self) extends AnyVal {
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
    def setCacheClustersVarargs(value: CacheCluster*): Self = this.set("CacheClusters", js.Array(value :_*))
    @scala.inline
    def setCacheClusters(value: CacheClusterList): Self = this.set("CacheClusters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCacheClusters: Self = this.set("CacheClusters", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("Marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("Marker", js.undefined)
  }
  
}

