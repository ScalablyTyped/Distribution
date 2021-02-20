package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRuntimeVersionsResponse extends StObject {
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeRuntimeVersions operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * An array of objects that display the details about each Synthetics canary runtime version.
    */
  var RuntimeVersions: js.UndefOr[RuntimeVersionList] = js.native
}
object DescribeRuntimeVersionsResponse {
  
  @scala.inline
  def apply(): DescribeRuntimeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuntimeVersionsResponse]
  }
  
  @scala.inline
  implicit class DescribeRuntimeVersionsResponseMutableBuilder[Self <: DescribeRuntimeVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setRuntimeVersions(value: RuntimeVersionList): Self = StObject.set(x, "RuntimeVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeVersionsUndefined: Self = StObject.set(x, "RuntimeVersions", js.undefined)
    
    @scala.inline
    def setRuntimeVersionsVarargs(value: RuntimeVersion*): Self = StObject.set(x, "RuntimeVersions", js.Array(value :_*))
  }
}
