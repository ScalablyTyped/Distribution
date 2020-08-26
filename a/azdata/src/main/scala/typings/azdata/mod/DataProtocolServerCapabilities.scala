package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProtocolServerCapabilities extends js.Object {
  var adminServicesProvider: AdminServicesOptions = js.native
  var connectionProvider: ConnectionProviderOptions = js.native
  var features: js.Array[FeatureMetadataProvider] = js.native
  var protocolVersion: String = js.native
  var providerDisplayName: String = js.native
  var providerName: String = js.native
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
  @scala.inline
  implicit class DataProtocolServerCapabilitiesOps[Self <: DataProtocolServerCapabilities] (val x: Self) extends AnyVal {
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
    def setAdminServicesProvider(value: AdminServicesOptions): Self = this.set("adminServicesProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionProvider(value: ConnectionProviderOptions): Self = this.set("connectionProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeaturesVarargs(value: FeatureMetadataProvider*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[FeatureMetadataProvider]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolVersion(value: String): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderDisplayName(value: String): Self = this.set("providerDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
  }
  
}

