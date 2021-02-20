package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeActivationsResult extends StObject {
  
  /**
    * A list of activations for your AWS account.
    */
  var ActivationList: js.UndefOr[typings.awsSdk.ssmMod.ActivationList] = js.native
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeActivationsResult {
  
  @scala.inline
  def apply(): DescribeActivationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeActivationsResult]
  }
  
  @scala.inline
  implicit class DescribeActivationsResultMutableBuilder[Self <: DescribeActivationsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationList(value: ActivationList): Self = StObject.set(x, "ActivationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationListUndefined: Self = StObject.set(x, "ActivationList", js.undefined)
    
    @scala.inline
    def setActivationListVarargs(value: Activation*): Self = StObject.set(x, "ActivationList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
