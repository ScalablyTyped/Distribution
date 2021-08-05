package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttackVolumeStatistics extends StObject {
  
  /**
    * The maximum attack volume observed for the given unit.
    */
  var Max: Double
}
object AttackVolumeStatistics {
  
  inline def apply(Max: Double): AttackVolumeStatistics = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackVolumeStatistics]
  }
  
  extension [Self <: AttackVolumeStatistics](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
  }
}
