package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerEngineType extends StObject {
  
  /**
    * The type of broker engine.
    */
  var EngineType: js.UndefOr[typings.awsSdk.mqMod.EngineType] = js.undefined
  
  /**
    * The list of engine versions.
    */
  var EngineVersions: js.UndefOr[listOfEngineVersion] = js.undefined
}
object BrokerEngineType {
  
  inline def apply(): BrokerEngineType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerEngineType]
  }
  
  extension [Self <: BrokerEngineType](x: Self) {
    
    inline def setEngineType(value: EngineType): Self = StObject.set(x, "EngineType", value.asInstanceOf[js.Any])
    
    inline def setEngineTypeUndefined: Self = StObject.set(x, "EngineType", js.undefined)
    
    inline def setEngineVersions(value: listOfEngineVersion): Self = StObject.set(x, "EngineVersions", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionsUndefined: Self = StObject.set(x, "EngineVersions", js.undefined)
    
    inline def setEngineVersionsVarargs(value: EngineVersion*): Self = StObject.set(x, "EngineVersions", js.Array(value :_*))
  }
}
