package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidMetadataUrl extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.Credit | java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.Ellipsoid] = js.undefined
  var metadata: cesiumLib.cesiumMod.GoogleEarthEnterpriseMetadata
  var url: cesiumLib.cesiumMod.Resource | java.lang.String
}

object Anon_CreditEllipsoidMetadataUrl {
  @scala.inline
  def apply(
    metadata: cesiumLib.cesiumMod.GoogleEarthEnterpriseMetadata,
    url: cesiumLib.cesiumMod.Resource | java.lang.String,
    credit: cesiumLib.cesiumMod.Credit | java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.Ellipsoid = null
  ): Anon_CreditEllipsoidMetadataUrl = {
    val __obj = js.Dynamic.literal(metadata = metadata, url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    __obj.asInstanceOf[Anon_CreditEllipsoidMetadataUrl]
  }
}

