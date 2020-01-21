package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEntityRecognizerResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerArn] = js.native
}

object CreateEntityRecognizerResponse {
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn = null): CreateEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    if (EntityRecognizerArn != null) __obj.updateDynamic("EntityRecognizerArn")(EntityRecognizerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEntityRecognizerResponse]
  }
}

