package typings.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlgorithmResponse extends js.Object {
  /**
    * A listing of the properties of the algorithm.
    */
  var algorithm: js.UndefOr[Algorithm] = js.native
}

object DescribeAlgorithmResponse {
  @scala.inline
  def apply(): DescribeAlgorithmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlgorithmResponse]
  }
  @scala.inline
  implicit class DescribeAlgorithmResponseOps[Self <: DescribeAlgorithmResponse] (val x: Self) extends AnyVal {
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
    def setAlgorithm(value: Algorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
  }
  
}

