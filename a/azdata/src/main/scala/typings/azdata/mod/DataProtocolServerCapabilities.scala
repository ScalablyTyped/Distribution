package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataProtocolServerCapabilities extends StObject {
  
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
  implicit class DataProtocolServerCapabilitiesMutableBuilder[Self <: DataProtocolServerCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminServicesProvider(value: AdminServicesOptions): Self = StObject.set(x, "adminServicesProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionProvider(value: ConnectionProviderOptions): Self = StObject.set(x, "connectionProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatures(value: js.Array[FeatureMetadataProvider]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: FeatureMetadataProvider*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderDisplayName(value: String): Self = StObject.set(x, "providerDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
  }
}
