package typings.azure.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var Enabled: Boolean
  
  var IncludeAPIs: Boolean
  
  var RetentionPolicy: Days
  
  var Version: Double
}
object Enabled {
  
  inline def apply(Enabled: Boolean, IncludeAPIs: Boolean, RetentionPolicy: Days, Version: Double): Enabled = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], IncludeAPIs = IncludeAPIs.asInstanceOf[js.Any], RetentionPolicy = RetentionPolicy.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setIncludeAPIs(value: Boolean): Self = StObject.set(x, "IncludeAPIs", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicy(value: Days): Self = StObject.set(x, "RetentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
