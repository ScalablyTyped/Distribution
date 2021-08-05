package typings.azure.mod

import typings.azure.anon.Delete
import typings.azure.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageServiceProperties extends StObject {
  
  var DefaultServiceVersion: String
  
  var Logging: Delete
  
  var Metrics: Enabled
}
object StorageServiceProperties {
  
  inline def apply(DefaultServiceVersion: String, Logging: Delete, Metrics: Enabled): StorageServiceProperties = {
    val __obj = js.Dynamic.literal(DefaultServiceVersion = DefaultServiceVersion.asInstanceOf[js.Any], Logging = Logging.asInstanceOf[js.Any], Metrics = Metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageServiceProperties]
  }
  
  extension [Self <: StorageServiceProperties](x: Self) {
    
    inline def setDefaultServiceVersion(value: String): Self = StObject.set(x, "DefaultServiceVersion", value.asInstanceOf[js.Any])
    
    inline def setLogging(value: Delete): Self = StObject.set(x, "Logging", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: Enabled): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
  }
}
