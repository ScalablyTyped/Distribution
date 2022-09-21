package typings.awsSdk.memorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EngineVersionInfo extends StObject {
  
  /**
    * The patched engine version
    */
  var EnginePatchVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The engine version
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the parameter group family to which the engine default parameters apply.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.undefined
}
object EngineVersionInfo {
  
  inline def apply(): EngineVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EngineVersionInfo]
  }
  
  extension [Self <: EngineVersionInfo](x: Self) {
    
    inline def setEnginePatchVersion(value: String): Self = StObject.set(x, "EnginePatchVersion", value.asInstanceOf[js.Any])
    
    inline def setEnginePatchVersionUndefined: Self = StObject.set(x, "EnginePatchVersion", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setParameterGroupFamily(value: String): Self = StObject.set(x, "ParameterGroupFamily", value.asInstanceOf[js.Any])
    
    inline def setParameterGroupFamilyUndefined: Self = StObject.set(x, "ParameterGroupFamily", js.undefined)
  }
}
