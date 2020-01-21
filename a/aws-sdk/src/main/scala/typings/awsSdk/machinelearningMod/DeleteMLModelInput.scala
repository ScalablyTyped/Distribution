package typings.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMLModelInput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the MLModel.
    */
  var MLModelId: EntityId = js.native
}

object DeleteMLModelInput {
  @scala.inline
  def apply(MLModelId: EntityId): DeleteMLModelInput = {
    val __obj = js.Dynamic.literal(MLModelId = MLModelId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteMLModelInput]
  }
}

