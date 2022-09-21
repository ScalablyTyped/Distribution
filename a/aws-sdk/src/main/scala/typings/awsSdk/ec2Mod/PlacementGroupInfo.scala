package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementGroupInfo extends StObject {
  
  /**
    * The supported placement group types.
    */
  var SupportedStrategies: js.UndefOr[PlacementGroupStrategyList] = js.undefined
}
object PlacementGroupInfo {
  
  inline def apply(): PlacementGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroupInfo]
  }
  
  extension [Self <: PlacementGroupInfo](x: Self) {
    
    inline def setSupportedStrategies(value: PlacementGroupStrategyList): Self = StObject.set(x, "SupportedStrategies", value.asInstanceOf[js.Any])
    
    inline def setSupportedStrategiesUndefined: Self = StObject.set(x, "SupportedStrategies", js.undefined)
    
    inline def setSupportedStrategiesVarargs(value: PlacementGroupStrategy*): Self = StObject.set(x, "SupportedStrategies", js.Array(value*))
  }
}
