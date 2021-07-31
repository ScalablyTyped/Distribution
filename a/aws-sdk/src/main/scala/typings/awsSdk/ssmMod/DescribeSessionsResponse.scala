package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSessionsResponse extends StObject {
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * A list of sessions meeting the request parameters.
    */
  var Sessions: js.UndefOr[SessionList] = js.undefined
}
object DescribeSessionsResponse {
  
  @scala.inline
  def apply(): DescribeSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSessionsResponse]
  }
  
  @scala.inline
  implicit class DescribeSessionsResponseMutableBuilder[Self <: DescribeSessionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSessions(value: SessionList): Self = StObject.set(x, "Sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionsUndefined: Self = StObject.set(x, "Sessions", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: Session*): Self = StObject.set(x, "Sessions", js.Array(value :_*))
  }
}
