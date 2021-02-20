package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStaleSecurityGroupsResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the stale security groups.
    */
  var StaleSecurityGroupSet: js.UndefOr[typings.awsSdk.ec2Mod.StaleSecurityGroupSet] = js.native
}
object DescribeStaleSecurityGroupsResult {
  
  @scala.inline
  def apply(): DescribeStaleSecurityGroupsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStaleSecurityGroupsResult]
  }
  
  @scala.inline
  implicit class DescribeStaleSecurityGroupsResultMutableBuilder[Self <: DescribeStaleSecurityGroupsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStaleSecurityGroupSet(value: StaleSecurityGroupSet): Self = StObject.set(x, "StaleSecurityGroupSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleSecurityGroupSetUndefined: Self = StObject.set(x, "StaleSecurityGroupSet", js.undefined)
    
    @scala.inline
    def setStaleSecurityGroupSetVarargs(value: StaleSecurityGroup*): Self = StObject.set(x, "StaleSecurityGroupSet", js.Array(value :_*))
  }
}
