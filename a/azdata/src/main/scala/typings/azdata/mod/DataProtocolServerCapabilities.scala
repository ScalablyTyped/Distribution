package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataProtocolServerCapabilities extends js.Object {
  var adminServicesProvider: AdminServicesOptions
  var connectionProvider: ConnectionProviderOptions
  var features: js.Array[FeatureMetadataProvider]
  var protocolVersion: String
  var providerDisplayName: String
  var providerName: String
}

object DataProtocolServerCapabilities {
  @scala.inline
  def apply(
    adminServicesProvider: AdminServicesOptions,
    connectionProvider: ConnectionProviderOptions,
    features: js.Array[FeatureMetadataProvider],
    protocolVersion: String,
    providerDisplayName: String,
    providerName: String
  ): DataProtocolServerCapabilities = {
    val __obj = js.Dynamic.literal(adminServicesProvider = adminServicesProvider.asInstanceOf[js.Any], connectionProvider = connectionProvider.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], providerDisplayName = providerDisplayName.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProtocolServerCapabilities]
  }
}

