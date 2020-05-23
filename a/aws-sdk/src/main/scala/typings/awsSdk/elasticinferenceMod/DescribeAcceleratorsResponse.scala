package typings.awsSdk.elasticinferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAcceleratorsResponse extends js.Object {
  /**
    *  The details of the Elastic Inference Accelerators. 
    */
  var acceleratorSet: js.UndefOr[ElasticInferenceAcceleratorSet] = js.native
  /**
    *  A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object DescribeAcceleratorsResponse {
  @scala.inline
  def apply(acceleratorSet: ElasticInferenceAcceleratorSet = null, nextToken: NextToken = null): DescribeAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    if (acceleratorSet != null) __obj.updateDynamic("acceleratorSet")(acceleratorSet.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorsResponse]
  }
}

