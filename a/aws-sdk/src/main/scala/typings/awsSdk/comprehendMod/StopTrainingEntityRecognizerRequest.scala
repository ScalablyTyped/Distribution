package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTrainingEntityRecognizerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer currently being trained.
    */
  var EntityRecognizerArn: typings.awsSdk.comprehendMod.EntityRecognizerArn = js.native
}

object StopTrainingEntityRecognizerRequest {
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn): StopTrainingEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTrainingEntityRecognizerRequest]
  }
}

