package typings.cesium.anon

import typings.cesium.mod.GoogleEarthEnterpriseMetadata
import typings.cesium.mod.Resource
import typings.cesium.mod.TileDiscardPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var credit: js.UndefOr[typings.cesium.mod.Credit | String] = js.native
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var metadata: GoogleEarthEnterpriseMetadata = js.native
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  var url: Resource | String = js.native
}

object Metadata {
  @scala.inline
  def apply(metadata: GoogleEarthEnterpriseMetadata, url: Resource | String): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setMetadata(value: GoogleEarthEnterpriseMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: Resource | String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredit(value: typings.cesium.mod.Credit | String): Self = this.set("credit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredit: Self = this.set("credit", js.undefined)
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = this.set("tileDiscardPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileDiscardPolicy: Self = this.set("tileDiscardPolicy", js.undefined)
  }
  
}

