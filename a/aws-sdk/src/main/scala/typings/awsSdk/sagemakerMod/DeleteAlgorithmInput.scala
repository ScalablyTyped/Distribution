package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAlgorithmInput extends js.Object {
  /**
    * The name of the algorithm to delete.
    */
  var AlgorithmName: EntityName = js.native
}

object DeleteAlgorithmInput {
  @scala.inline
  def apply(AlgorithmName: EntityName): DeleteAlgorithmInput = {
    val __obj = js.Dynamic.literal(AlgorithmName = AlgorithmName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAlgorithmInput]
  }
}

