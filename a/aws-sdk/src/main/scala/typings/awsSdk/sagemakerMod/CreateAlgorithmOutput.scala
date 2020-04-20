package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAlgorithmOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new algorithm.
    */
  var AlgorithmArn: typings.awsSdk.sagemakerMod.AlgorithmArn = js.native
}

object CreateAlgorithmOutput {
  @scala.inline
  def apply(AlgorithmArn: AlgorithmArn): CreateAlgorithmOutput = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAlgorithmOutput]
  }
}

