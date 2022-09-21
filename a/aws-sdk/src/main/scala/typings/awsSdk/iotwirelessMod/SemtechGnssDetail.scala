package typings.awsSdk.iotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SemtechGnssDetail extends StObject {
  
  /**
    * Whether forward error correction is enabled.
    */
  var Fec: js.UndefOr[PositionConfigurationFec] = js.undefined
  
  /**
    * The vendor of the solver object.
    */
  var Provider: js.UndefOr[PositionSolverProvider] = js.undefined
  
  /**
    * The status indicating whether the solver is enabled.
    */
  var Status: js.UndefOr[PositionConfigurationStatus] = js.undefined
  
  /**
    * The type of positioning solver used.
    */
  var Type: js.UndefOr[PositionSolverType] = js.undefined
}
object SemtechGnssDetail {
  
  inline def apply(): SemtechGnssDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SemtechGnssDetail]
  }
  
  extension [Self <: SemtechGnssDetail](x: Self) {
    
    inline def setFec(value: PositionConfigurationFec): Self = StObject.set(x, "Fec", value.asInstanceOf[js.Any])
    
    inline def setFecUndefined: Self = StObject.set(x, "Fec", js.undefined)
    
    inline def setProvider(value: PositionSolverProvider): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "Provider", js.undefined)
    
    inline def setStatus(value: PositionConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: PositionSolverType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
