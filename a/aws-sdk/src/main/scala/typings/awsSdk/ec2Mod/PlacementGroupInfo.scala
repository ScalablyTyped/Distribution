package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementGroupInfo extends StObject {
  
  /**
    * The supported placement group types.
    */
  var SupportedStrategies: js.UndefOr[PlacementGroupStrategyList] = js.native
}
object PlacementGroupInfo {
  
  @scala.inline
  def apply(): PlacementGroupInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroupInfo]
  }
  
  @scala.inline
  implicit class PlacementGroupInfoMutableBuilder[Self <: PlacementGroupInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSupportedStrategies(value: PlacementGroupStrategyList): Self = StObject.set(x, "SupportedStrategies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedStrategiesUndefined: Self = StObject.set(x, "SupportedStrategies", js.undefined)
    
    @scala.inline
    def setSupportedStrategiesVarargs(value: PlacementGroupStrategy*): Self = StObject.set(x, "SupportedStrategies", js.Array(value :_*))
  }
}
