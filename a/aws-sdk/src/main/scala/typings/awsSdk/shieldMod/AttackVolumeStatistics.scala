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
  
  @scala.inline
  def apply(Max: Double): AttackVolumeStatistics = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttackVolumeStatistics]
  }
  
  @scala.inline
  implicit class AttackVolumeStatisticsMutableBuilder[Self <: AttackVolumeStatistics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
  }
}
