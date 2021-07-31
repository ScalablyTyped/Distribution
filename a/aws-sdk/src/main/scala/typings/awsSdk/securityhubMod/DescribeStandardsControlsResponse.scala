package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStandardsControlsResponse extends StObject {
  
  /**
    * A list of security standards controls.
    */
  var Controls: js.UndefOr[StandardsControls] = js.undefined
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.undefined
}
object DescribeStandardsControlsResponse {
  
  @scala.inline
  def apply(): DescribeStandardsControlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStandardsControlsResponse]
  }
  
  @scala.inline
  implicit class DescribeStandardsControlsResponseMutableBuilder[Self <: DescribeStandardsControlsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setControls(value: StandardsControls): Self = StObject.set(x, "Controls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControlsUndefined: Self = StObject.set(x, "Controls", js.undefined)
    
    @scala.inline
    def setControlsVarargs(value: StandardsControl*): Self = StObject.set(x, "Controls", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
