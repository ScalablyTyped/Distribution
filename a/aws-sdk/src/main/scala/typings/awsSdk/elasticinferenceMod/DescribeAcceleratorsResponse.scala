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
  
  inline def apply(): DescribeAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorsResponse]
  }
  
  extension [Self <: DescribeAcceleratorsResponse](x: Self) {
    
    inline def setAcceleratorSet(value: ElasticInferenceAcceleratorSet): Self = StObject.set(x, "acceleratorSet", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorSetUndefined: Self = StObject.set(x, "acceleratorSet", js.undefined)
    
    inline def setAcceleratorSetVarargs(value: ElasticInferenceAccelerator*): Self = StObject.set(x, "acceleratorSet", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
