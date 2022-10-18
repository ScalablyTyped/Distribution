package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.energyMod.EnergyUsageRead
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reads
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Array of meter reads sorted by NMI in ascending order followed by readStartDate in descending order
    */
  var reads: js.Array[EnergyUsageRead]
}
object Reads {
  
  inline def apply(reads: js.Array[EnergyUsageRead]): Reads = {
    val __obj = js.Dynamic.literal(reads = reads.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reads]
  }
  
  extension [Self <: Reads](x: Self) {
    
    inline def setReads(value: js.Array[EnergyUsageRead]): Self = StObject.set(x, "reads", value.asInstanceOf[js.Any])
    
    inline def setReadsVarargs(value: EnergyUsageRead*): Self = StObject.set(x, "reads", js.Array(value*))
  }
}
