package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStandardsResponse extends StObject {
  
  /**
    * The pagination token to use to request the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.securityhubMod.NextToken] = js.native
  
  /**
    * A list of available standards.
    */
  var Standards: js.UndefOr[typings.awsSdk.securityhubMod.Standards] = js.native
}
object DescribeStandardsResponse {
  
  @scala.inline
  def apply(): DescribeStandardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStandardsResponse]
  }
  
  @scala.inline
  implicit class DescribeStandardsResponseMutableBuilder[Self <: DescribeStandardsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStandards(value: Standards): Self = StObject.set(x, "Standards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardsUndefined: Self = StObject.set(x, "Standards", js.undefined)
    
    @scala.inline
    def setStandardsVarargs(value: Standard*): Self = StObject.set(x, "Standards", js.Array(value :_*))
  }
}
