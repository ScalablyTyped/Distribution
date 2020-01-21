package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestingData extends js.Object {
  /**
    * The assets used for testing.
    */
  var Assets: js.UndefOr[typings.awsSdk.rekognitionMod.Assets] = js.native
  /**
    * If specified, Amazon Rekognition Custom Labels creates a testing dataset with an 80/20 split of the training dataset.
    */
  var AutoCreate: js.UndefOr[Boolean] = js.native
}

object TestingData {
  @scala.inline
  def apply(Assets: Assets = null, AutoCreate: js.UndefOr[scala.Boolean] = js.undefined): TestingData = {
    val __obj = js.Dynamic.literal()
    if (Assets != null) __obj.updateDynamic("Assets")(Assets.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoCreate)) __obj.updateDynamic("AutoCreate")(AutoCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestingData]
  }
}

