package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeParameterGroupsResponse extends StObject {
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * An array of parameter groups. Each element in the array represents one parameter group.
    */
  var ParameterGroups: js.UndefOr[ParameterGroupList] = js.native
}
object DescribeParameterGroupsResponse {
  
  @scala.inline
  def apply(): DescribeParameterGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParameterGroupsResponse]
  }
  
  @scala.inline
  implicit class DescribeParameterGroupsResponseMutableBuilder[Self <: DescribeParameterGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setParameterGroups(value: ParameterGroupList): Self = StObject.set(x, "ParameterGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterGroupsUndefined: Self = StObject.set(x, "ParameterGroups", js.undefined)
    
    @scala.inline
    def setParameterGroupsVarargs(value: ParameterGroup*): Self = StObject.set(x, "ParameterGroups", js.Array(value :_*))
  }
}
