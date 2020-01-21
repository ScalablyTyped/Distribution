package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEntityRecognizerResponse extends js.Object {
  /**
    * Describes information associated with an entity recognizer.
    */
  var EntityRecognizerProperties: js.UndefOr[typings.awsSdk.comprehendMod.EntityRecognizerProperties] = js.native
}

object DescribeEntityRecognizerResponse {
  @scala.inline
  def apply(EntityRecognizerProperties: EntityRecognizerProperties = null): DescribeEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    if (EntityRecognizerProperties != null) __obj.updateDynamic("EntityRecognizerProperties")(EntityRecognizerProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntityRecognizerResponse]
  }
}

