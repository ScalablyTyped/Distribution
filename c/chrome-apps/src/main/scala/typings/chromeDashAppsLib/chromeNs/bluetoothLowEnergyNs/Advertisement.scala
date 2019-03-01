package typings
package chromeDashAppsLib.chromeNs.bluetoothLowEnergyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertisement extends js.Object {
  /** List of manufacturer specific data to be included in 'Manufacturer Specific Data' fields of the advertising data. */
  var manufacturerData: js.UndefOr[chromeDashAppsLib.Anon_Data] = js.undefined
  /** List of service data to be included in 'Service Data' fields of the advertising data. */
  var serviceData: chromeDashAppsLib.Anon_DataUuid
  /** List of UUIDs to include in the 'Service UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
  var serviceUuids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** List of UUIDs to include in the 'Solicit UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
  var solicitUuids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Type of advertisement. */
  var `type`: AdvertisementType
}

object Advertisement {
  @scala.inline
  def apply(
    serviceData: chromeDashAppsLib.Anon_DataUuid,
    `type`: AdvertisementType,
    manufacturerData: chromeDashAppsLib.Anon_Data = null,
    serviceUuids: js.Array[java.lang.String] = null,
    solicitUuids: js.Array[java.lang.String] = null
  ): Advertisement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("serviceData")(serviceData)
    if (manufacturerData != null) __obj.updateDynamic("manufacturerData")(manufacturerData)
    if (serviceUuids != null) __obj.updateDynamic("serviceUuids")(serviceUuids)
    if (solicitUuids != null) __obj.updateDynamic("solicitUuids")(solicitUuids)
    __obj.asInstanceOf[Advertisement]
  }
}

