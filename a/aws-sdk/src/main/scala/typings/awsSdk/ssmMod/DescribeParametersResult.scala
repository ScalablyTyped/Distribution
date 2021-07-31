package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeParametersResult extends StObject {
  
  /**
    * The token to use when requesting the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * Parameters returned by the request.
    */
  var Parameters: js.UndefOr[ParameterMetadataList] = js.undefined
}
object DescribeParametersResult {
  
  @scala.inline
  def apply(): DescribeParametersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeParametersResult]
  }
  
  @scala.inline
  implicit class DescribeParametersResultMutableBuilder[Self <: DescribeParametersResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setParameters(value: ParameterMetadataList): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ParameterMetadata*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
  }
}
