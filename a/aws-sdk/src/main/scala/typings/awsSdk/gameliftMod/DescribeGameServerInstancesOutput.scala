package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameServerInstancesOutput extends StObject {
  
  /**
    *  The collection of requested game server instances. 
    */
  var GameServerInstances: js.UndefOr[typings.awsSdk.gameliftMod.GameServerInstances] = js.native
  
  /**
    *  A token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list. 
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeGameServerInstancesOutput {
  
  @scala.inline
  def apply(): DescribeGameServerInstancesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameServerInstancesOutput]
  }
  
  @scala.inline
  implicit class DescribeGameServerInstancesOutputMutableBuilder[Self <: DescribeGameServerInstancesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameServerInstances(value: GameServerInstances): Self = StObject.set(x, "GameServerInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameServerInstancesUndefined: Self = StObject.set(x, "GameServerInstances", js.undefined)
    
    @scala.inline
    def setGameServerInstancesVarargs(value: GameServerInstance*): Self = StObject.set(x, "GameServerInstances", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
