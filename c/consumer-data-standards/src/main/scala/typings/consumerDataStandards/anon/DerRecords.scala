package typings.consumerDataStandards.anon

import typings.consumerDataStandards.energyMod.EnergyDerRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DerRecords extends StObject {
  
  /**
    * Array of meter reads
    */
  var derRecords: js.Array[EnergyDerRecord]
}
object DerRecords {
  
  inline def apply(derRecords: js.Array[EnergyDerRecord]): DerRecords = {
    val __obj = js.Dynamic.literal(derRecords = derRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerRecords]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DerRecords] (val x: Self) extends AnyVal {
    
    inline def setDerRecords(value: js.Array[EnergyDerRecord]): Self = StObject.set(x, "derRecords", value.asInstanceOf[js.Any])
    
    inline def setDerRecordsVarargs(value: EnergyDerRecord*): Self = StObject.set(x, "derRecords", js.Array(value*))
  }
}
