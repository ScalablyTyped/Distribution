package typings.azureCoreClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpanConfig extends StObject {
  
  /**
    * Service namespace
    */
  var namespace: String
  
  /**
    * Package name prefix
    */
  var packagePrefix: String
}
object SpanConfig {
  
  inline def apply(namespace: String, packagePrefix: String): SpanConfig = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], packagePrefix = packagePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanConfig]
  }
  
  extension [Self <: SpanConfig](x: Self) {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setPackagePrefix(value: String): Self = StObject.set(x, "packagePrefix", value.asInstanceOf[js.Any])
  }
}
