package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxNormTrait extends js.Object {
  /**
    * Provides a name or contextual description about the trait.
    */
  var Name: js.UndefOr[RxNormTraitName] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detected trait.
    */
  var Score: js.UndefOr[Float] = js.native
}

object RxNormTrait {
  @scala.inline
  def apply(Name: RxNormTraitName = null, Score: js.UndefOr[Float] = js.undefined): RxNormTrait = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RxNormTrait]
  }
}

