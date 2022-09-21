package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineVersionsSummary extends StObject {
  
  /**
    * The type of target platform for the application.
    */
  var engineType: String
  
  /**
    * The version of the engine type used by the application.
    */
  var engineVersion: String
}
object EngineVersionsSummary {
  
  inline def apply(engineType: String, engineVersion: String): EngineVersionsSummary = {
    val __obj = js.Dynamic.literal(engineType = engineType.asInstanceOf[js.Any], engineVersion = engineVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineVersionsSummary]
  }
  
  extension [Self <: EngineVersionsSummary](x: Self) {
    
    inline def setEngineType(value: String): Self = StObject.set(x, "engineType", value.asInstanceOf[js.Any])
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
  }
}
