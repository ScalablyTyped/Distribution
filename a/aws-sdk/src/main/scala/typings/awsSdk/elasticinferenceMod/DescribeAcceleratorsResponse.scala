package typings.awsSdk.elasticinferenceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorsResponse extends StObject {
  
  /**
    *  The details of the Elastic Inference Accelerators. 
    */
  var acceleratorSet: js.UndefOr[ElasticInferenceAcceleratorSet] = js.undefined
  
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeAcceleratorsResponse {
  
  @scala.inline
  def apply(): DescribeAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorsResponse]
  }
  
  @scala.inline
  implicit class DescribeAcceleratorsResponseMutableBuilder[Self <: DescribeAcceleratorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceleratorSet(value: ElasticInferenceAcceleratorSet): Self = StObject.set(x, "acceleratorSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceleratorSetUndefined: Self = StObject.set(x, "acceleratorSet", js.undefined)
    
    @scala.inline
    def setAcceleratorSetVarargs(value: ElasticInferenceAccelerator*): Self = StObject.set(x, "acceleratorSet", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
