package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProtocolServerCapabilities extends StObject {
  
  var adminServicesProvider: AdminServicesOptions
  
  var connectionProvider: ConnectionProviderOptions
  
  var features: js.Array[FeatureMetadataProvider]
  
  var protocolVersion: String
  
  var providerDisplayName: String
  
  var providerName: String
}
object DataProtocolServerCapabilities {
  
  inline def apply(
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
  
  extension [Self <: DataProtocolServerCapabilities](x: Self) {
    
    inline def setAdminServicesProvider(value: AdminServicesOptions): Self = StObject.set(x, "adminServicesProvider", value.asInstanceOf[js.Any])
    
    inline def setConnectionProvider(value: ConnectionProviderOptions): Self = StObject.set(x, "connectionProvider", value.asInstanceOf[js.Any])
    
    inline def setFeatures(value: js.Array[FeatureMetadataProvider]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: FeatureMetadataProvider*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProviderDisplayName(value: String): Self = StObject.set(x, "providerDisplayName", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
  }
}
