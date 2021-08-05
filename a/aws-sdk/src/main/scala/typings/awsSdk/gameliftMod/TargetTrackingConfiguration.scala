package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTrackingConfiguration extends StObject {
  
  /**
    * Desired value to use with a game server group target-based scaling policy. 
    */
  var TargetValue: NonNegativeDouble
}
object TargetTrackingConfiguration {
  
  inline def apply(TargetValue: NonNegativeDouble): TargetTrackingConfiguration = {
    val __obj = js.Dynamic.literal(TargetValue = TargetValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTrackingConfiguration]
  }
  
  extension [Self <: TargetTrackingConfiguration](x: Self) {
    
    inline def setTargetValue(value: NonNegativeDouble): Self = StObject.set(x, "TargetValue", value.asInstanceOf[js.Any])
  }
}
