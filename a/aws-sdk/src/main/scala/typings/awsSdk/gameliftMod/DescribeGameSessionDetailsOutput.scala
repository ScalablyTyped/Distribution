package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGameSessionDetailsOutput extends StObject {
  
  /**
    * A collection of objects containing game session properties and the protection policy currently in force for each session matching the request.
    */
  var GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.native
  
  /**
    * Token that indicates where to resume retrieving results on the next call to this operation. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.native
}
object DescribeGameSessionDetailsOutput {
  
  @scala.inline
  def apply(): DescribeGameSessionDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeGameSessionDetailsOutput]
  }
  
  @scala.inline
  implicit class DescribeGameSessionDetailsOutputMutableBuilder[Self <: DescribeGameSessionDetailsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGameSessionDetails(value: GameSessionDetailList): Self = StObject.set(x, "GameSessionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameSessionDetailsUndefined: Self = StObject.set(x, "GameSessionDetails", js.undefined)
    
    @scala.inline
    def setGameSessionDetailsVarargs(value: GameSessionDetail*): Self = StObject.set(x, "GameSessionDetails", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NonZeroAndMaxString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
