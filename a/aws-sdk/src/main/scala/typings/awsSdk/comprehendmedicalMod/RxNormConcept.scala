package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxNormConcept extends js.Object {
  /**
    * RxNorm concept ID, also known as the RxCUI.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The description of the RxNorm concept.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has that the entity is accurately linked to the reported RxNorm concept.
    */
  var Score: js.UndefOr[Float] = js.native
}

object RxNormConcept {
  @scala.inline
  def apply(Code: String = null, Description: String = null, Score: js.UndefOr[Float] = js.undefined): RxNormConcept = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RxNormConcept]
  }
}

