package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfusionMatrix extends js.Object {
  /**
    * The number of matches in the data that the transform didn't find, in the confusion matrix for your transform.
    */
  var NumFalseNegatives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of nonmatches in the data that the transform incorrectly classified as a match, in the confusion matrix for your transform.
    */
  var NumFalsePositives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of nonmatches in the data that the transform correctly rejected, in the confusion matrix for your transform.
    */
  var NumTrueNegatives: js.UndefOr[RecordsCount] = js.native
  /**
    * The number of matches in the data that the transform correctly found, in the confusion matrix for your transform.
    */
  var NumTruePositives: js.UndefOr[RecordsCount] = js.native
}

object ConfusionMatrix {
  @scala.inline
  def apply(
    NumFalseNegatives: Int | Double = null,
    NumFalsePositives: Int | Double = null,
    NumTrueNegatives: Int | Double = null,
    NumTruePositives: Int | Double = null
  ): ConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    if (NumFalseNegatives != null) __obj.updateDynamic("NumFalseNegatives")(NumFalseNegatives.asInstanceOf[js.Any])
    if (NumFalsePositives != null) __obj.updateDynamic("NumFalsePositives")(NumFalsePositives.asInstanceOf[js.Any])
    if (NumTrueNegatives != null) __obj.updateDynamic("NumTrueNegatives")(NumTrueNegatives.asInstanceOf[js.Any])
    if (NumTruePositives != null) __obj.updateDynamic("NumTruePositives")(NumTruePositives.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfusionMatrix]
  }
}

