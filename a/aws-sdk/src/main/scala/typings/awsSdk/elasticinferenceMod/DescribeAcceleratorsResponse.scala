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
  def apply(): DescribeAcceleratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAcceleratorsResponse]
  }
  @scala.inline
  implicit class DescribeAcceleratorsResponseOps[Self <: DescribeAcceleratorsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcceleratorSetVarargs(value: ElasticInferenceAccelerator*): Self = this.set("acceleratorSet", js.Array(value :_*))
    @scala.inline
    def setAcceleratorSet(value: ElasticInferenceAcceleratorSet): Self = this.set("acceleratorSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcceleratorSet: Self = this.set("acceleratorSet", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

