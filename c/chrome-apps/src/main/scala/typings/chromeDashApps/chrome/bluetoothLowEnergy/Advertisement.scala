package typings.chromeDashApps.chrome.bluetoothLowEnergy

import typings.chromeDashApps.Anon_Data
import typings.chromeDashApps.Anon_DataUuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advertisement extends js.Object {
  /** List of manufacturer specific data to be included in 'Manufacturer Specific Data' fields of the advertising data. */
  var manufacturerData: js.UndefOr[Anon_Data] = js.undefined
  /** List of service data to be included in 'Service Data' fields of the advertising data. */
  var serviceData: Anon_DataUuid
  /** List of UUIDs to include in the 'Service UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
  var serviceUuids: js.UndefOr[js.Array[String]] = js.undefined
  /** List of UUIDs to include in the 'Solicit UUIDs' field of the Advertising Data. These UUIDs can be of the 16bit, 32bit or 128 formats. */
  var solicitUuids: js.UndefOr[js.Array[String]] = js.undefined
  /** Type of advertisement. */
  var `type`: AdvertisementType
}

object Advertisement {
  @scala.inline
  def apply(
    serviceData: Anon_DataUuid,
    `type`: AdvertisementType,
    manufacturerData: Anon_Data = null,
    serviceUuids: js.Array[String] = null,
    solicitUuids: js.Array[String] = null
  ): Advertisement = {
    val __obj = js.Dynamic.literal(serviceData = serviceData)
    __obj.updateDynamic("type")(`type`)
    if (manufacturerData != null) __obj.updateDynamic("manufacturerData")(manufacturerData)
    if (serviceUuids != null) __obj.updateDynamic("serviceUuids")(serviceUuids)
    if (solicitUuids != null) __obj.updateDynamic("solicitUuids")(solicitUuids)
    __obj.asInstanceOf[Advertisement]
  }
}

