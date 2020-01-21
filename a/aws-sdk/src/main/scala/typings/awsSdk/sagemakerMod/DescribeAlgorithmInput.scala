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
}

