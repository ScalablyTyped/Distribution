package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Monitoring extends StObject {
  
  /**
    * Indicates whether detailed monitoring is enabled. Otherwise, basic monitoring is enabled.
    */
  var State: js.UndefOr[MonitoringState] = js.undefined
}
object Monitoring {
  
  inline def apply(): Monitoring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Monitoring]
  }
  
  extension [Self <: Monitoring](x: Self) {
    
    inline def setState(value: MonitoringState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
