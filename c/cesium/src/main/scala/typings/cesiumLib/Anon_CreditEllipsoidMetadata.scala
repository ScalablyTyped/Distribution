package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditEllipsoidMetadata extends js.Object {
  var credit: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String] = js.undefined
  var ellipsoid: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.Ellipsoid] = js.undefined
  var metadata: cesiumLib.cesiumMod.CesiumNs.GoogleEarthEnterpriseMetadata
  var tileDiscardPolicy: js.UndefOr[cesiumLib.cesiumMod.CesiumNs.TileDiscardPolicy] = js.undefined
  var url: cesiumLib.cesiumMod.CesiumNs.Resource | java.lang.String
}

object Anon_CreditEllipsoidMetadata {
  @scala.inline
  def apply(
    metadata: cesiumLib.cesiumMod.CesiumNs.GoogleEarthEnterpriseMetadata,
    url: cesiumLib.cesiumMod.CesiumNs.Resource | java.lang.String,
    credit: cesiumLib.cesiumMod.CesiumNs.Credit | java.lang.String = null,
    ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid = null,
    tileDiscardPolicy: cesiumLib.cesiumMod.CesiumNs.TileDiscardPolicy = null
  ): Anon_CreditEllipsoidMetadata = {
    val __obj = js.Dynamic.literal(metadata = metadata, url = url.asInstanceOf[js.Any])
    if (credit != null) __obj.updateDynamic("credit")(credit.asInstanceOf[js.Any])
    if (ellipsoid != null) __obj.updateDynamic("ellipsoid")(ellipsoid)
    if (tileDiscardPolicy != null) __obj.updateDynamic("tileDiscardPolicy")(tileDiscardPolicy)
    __obj.asInstanceOf[Anon_CreditEllipsoidMetadata]
  }
}

