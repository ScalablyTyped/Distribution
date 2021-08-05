package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMatchmakingConfigurationsOutput extends StObject {
  
  /**
    * A collection of requested matchmaking configurations.
    */
  var Configurations: js.UndefOr[MatchmakingConfigurationList] = js.undefined
  
  /**
    * A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object DescribeMatchmakingConfigurationsOutput {
  
  inline def apply(): DescribeMatchmakingConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMatchmakingConfigurationsOutput]
  }
  
  extension [Self <: DescribeMatchmakingConfigurationsOutput](x: Self) {
    
    inline def setConfigurations(value: MatchmakingConfigurationList): Self = StObject.set(x, "Configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "Configurations", js.undefined)
    
    inline def setConfigurationsVarargs(value: MatchmakingConfiguration*): Self = StObject.set(x, "Configurations", js.Array(value :_*))
    
    inline def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
