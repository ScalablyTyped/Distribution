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
  def apply(algorithm: Algorithm = null): DescribeAlgorithmResponse = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlgorithmResponse]
  }
}

