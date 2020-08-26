package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAlgorithmInput extends js.Object {
  /**
    * The name of the algorithm to describe.
    */
  var AlgorithmName: ArnOrName = js.native
}

object DescribeAlgorithmInput {
  @scala.inline
  def apply(AlgorithmName: ArnOrName): DescribeAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmInput]
  }
  @scala.inline
  implicit class DescribeAlgorithmInputOps[Self <: DescribeAlgorithmInput] (val x: Self) extends AnyVal {
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
    def setAlgorithmName(value: ArnOrName): Self = this.set("AlgorithmName", value.asInstanceOf[js.Any])
  }
  
}

