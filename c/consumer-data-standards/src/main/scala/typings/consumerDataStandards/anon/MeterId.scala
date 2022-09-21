package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeterId
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The meter ID uniquely identifies a meter for a given service point.  It is unique in the context of the service point.  It is not globally unique
    */
  var meterId: String
  
  /**
    * Usage data registers available from the meter. This may be empty where there are no meters physically installed at the service point
    */
  var registers: js.UndefOr[js.Array[AveragedDailyLoad]] = js.undefined
  
  /**
    * Technical characteristics of the meter
    */
  var specifications: InstallationType
}
object MeterId {
  
  inline def apply(meterId: String, specifications: InstallationType): MeterId = {
    val __obj = js.Dynamic.literal(meterId = meterId.asInstanceOf[js.Any], specifications = specifications.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeterId]
  }
  
  extension [Self <: MeterId](x: Self) {
    
    inline def setMeterId(value: String): Self = StObject.set(x, "meterId", value.asInstanceOf[js.Any])
    
    inline def setRegisters(value: js.Array[AveragedDailyLoad]): Self = StObject.set(x, "registers", value.asInstanceOf[js.Any])
    
    inline def setRegistersUndefined: Self = StObject.set(x, "registers", js.undefined)
    
    inline def setRegistersVarargs(value: AveragedDailyLoad*): Self = StObject.set(x, "registers", js.Array(value*))
    
    inline def setSpecifications(value: InstallationType): Self = StObject.set(x, "specifications", value.asInstanceOf[js.Any])
  }
}
