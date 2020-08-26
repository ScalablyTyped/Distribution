package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAnomalyDetectorsOutput extends js.Object {
  /**
    * The list of anomaly detection models returned by the operation.
    */
  var AnomalyDetectors: js.UndefOr[typings.awsSdk.cloudwatchMod.AnomalyDetectors] = js.native
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatchMod.NextToken] = js.native
}

object DescribeAnomalyDetectorsOutput {
  @scala.inline
  def apply(): DescribeAnomalyDetectorsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAnomalyDetectorsOutput]
  }
  @scala.inline
  implicit class DescribeAnomalyDetectorsOutputOps[Self <: DescribeAnomalyDetectorsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnomalyDetectorsVarargs(value: AnomalyDetector*): Self = this.set("AnomalyDetectors", js.Array(value :_*))
    @scala.inline
    def setAnomalyDetectors(value: AnomalyDetectors): Self = this.set("AnomalyDetectors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnomalyDetectors: Self = this.set("AnomalyDetectors", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

