package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceInformationResult extends StObject {
  
  /**
    * The instance information list.
    */
  var InstanceInformationList: js.UndefOr[typings.awsSdk.ssmMod.InstanceInformationList] = js.native
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}
object DescribeInstanceInformationResult {
  
  @scala.inline
  def apply(): DescribeInstanceInformationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceInformationResult]
  }
  
  @scala.inline
  implicit class DescribeInstanceInformationResultMutableBuilder[Self <: DescribeInstanceInformationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceInformationList(value: InstanceInformationList): Self = StObject.set(x, "InstanceInformationList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceInformationListUndefined: Self = StObject.set(x, "InstanceInformationList", js.undefined)
    
    @scala.inline
    def setInstanceInformationListVarargs(value: InstanceInformation*): Self = StObject.set(x, "InstanceInformationList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
