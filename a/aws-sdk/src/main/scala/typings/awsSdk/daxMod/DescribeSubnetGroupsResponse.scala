package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSubnetGroupsResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * An array of subnet groups. Each element in the array represents a single subnet group.
    */
  var SubnetGroups: js.UndefOr[SubnetGroupList] = js.native
}
object DescribeSubnetGroupsResponse {
  
  @scala.inline
  def apply(): DescribeSubnetGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubnetGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeSubnetGroupsResponseMutableBuilder[Self <: DescribeSubnetGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSubnetGroups(value: SubnetGroupList): Self = StObject.set(x, "SubnetGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetGroupsUndefined: Self = StObject.set(x, "SubnetGroups", js.undefined)
    
    @scala.inline
    def setSubnetGroupsVarargs(value: SubnetGroup*): Self = StObject.set(x, "SubnetGroups", js.Array(value :_*))
  }
}
