package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRuntimeVersionsResponse extends StObject {
  
  /**
    * A token that indicates that there is more data available. You can use this token in a subsequent DescribeRuntimeVersions operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * An array of objects that display the details about each Synthetics canary runtime version.
    */
  var RuntimeVersions: js.UndefOr[RuntimeVersionList] = js.undefined
}
object DescribeRuntimeVersionsResponse {
  
  inline def apply(): DescribeRuntimeVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuntimeVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRuntimeVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuntimeVersions(value: RuntimeVersionList): Self = StObject.set(x, "RuntimeVersions", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionsUndefined: Self = StObject.set(x, "RuntimeVersions", js.undefined)
    
    inline def setRuntimeVersionsVarargs(value: RuntimeVersion*): Self = StObject.set(x, "RuntimeVersions", js.Array(value*))
  }
}
