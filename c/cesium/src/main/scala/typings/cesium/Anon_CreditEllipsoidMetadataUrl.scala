package typings.cesium

import typings.cesium.cesiumMod.Credit
import typings.cesium.cesiumMod.Ellipsoid
import typings.cesium.cesiumMod.GoogleEarthEnterpriseMetadata
import typings.cesium.cesiumMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidMetadataUrl extends js.Object {
  var credit: js.UndefOr[Credit | String] = js.undefined
  var ellipsoid: js.UndefOr[Ellipsoid] = js.undefined
  var metadata: GoogleEarthEnterpriseMetadata
  var url: Resource | String
}

object Anon_CreditEllipsoidMetadataUrl {
  @scala.inline
  def apply(
    metadata: GoogleEarthEnterpriseMetadata,
    url: Resource | String,
    credit: Credit | String = null,
    ellipsoid: Ellipsoid = null
  ): Anon_CreditEllipsoidMetadataUrl = {
    val __obj = js.Dynamic.literal(metadata = metadata, url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    __obj.asInstanceOf[Anon_CreditEllipsoidMetadataUrl]
  }
}

