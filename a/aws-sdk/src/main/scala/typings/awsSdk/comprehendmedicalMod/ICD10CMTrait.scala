package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICD10CMTrait extends js.Object {
  /**
    * Provides a name or contextual description about the trait.
    */
  var Name: js.UndefOr[ICD10CMTraitName] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as a trait.
    */
  var Score: js.UndefOr[Float] = js.native
}

object ICD10CMTrait {
  @scala.inline
  def apply(Name: ICD10CMTraitName = null, Score: js.UndefOr[Float] = js.undefined): ICD10CMTrait = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICD10CMTrait]
  }
}

