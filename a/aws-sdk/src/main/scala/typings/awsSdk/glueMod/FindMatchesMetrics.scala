package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindMatchesMetrics extends js.Object {
  /**
    * The area under the precision/recall curve (AUPRC) is a single number measuring the overall quality of the transform, that is independent of the choice made for precision vs. recall. Higher values indicate that you have a more attractive precision vs. recall tradeoff. For more information, see Precision and recall in Wikipedia.
    */
  var AreaUnderPRCurve: js.UndefOr[GenericBoundedDouble] = js.native
  /**
    * The confusion matrix shows you what your transform is predicting accurately and what types of errors it is making. For more information, see Confusion matrix in Wikipedia.
    */
  var ConfusionMatrix: js.UndefOr[typings.awsSdk.glueMod.ConfusionMatrix] = js.native
  /**
    * The maximum F1 metric indicates the transform's accuracy between 0 and 1, where 1 is the best accuracy. For more information, see F1 score in Wikipedia.
    */
  var F1: js.UndefOr[GenericBoundedDouble] = js.native
  /**
    * The precision metric indicates when often your transform is correct when it predicts a match. Specifically, it measures how well the transform finds true positives from the total true positives possible. For more information, see Precision and recall in Wikipedia.
    */
  var Precision: js.UndefOr[GenericBoundedDouble] = js.native
  /**
    * The recall metric indicates that for an actual match, how often your transform predicts the match. Specifically, it measures how well the transform finds true positives from the total records in the source data. For more information, see Precision and recall in Wikipedia.
    */
  var Recall: js.UndefOr[GenericBoundedDouble] = js.native
}

object FindMatchesMetrics {
  @scala.inline
  def apply(
    AreaUnderPRCurve: Int | Double = null,
    ConfusionMatrix: ConfusionMatrix = null,
    F1: Int | Double = null,
    Precision: Int | Double = null,
    Recall: Int | Double = null
  ): FindMatchesMetrics = {
    val __obj = js.Dynamic.literal()
    if (AreaUnderPRCurve != null) __obj.updateDynamic("AreaUnderPRCurve")(AreaUnderPRCurve.asInstanceOf[js.Any])
    if (ConfusionMatrix != null) __obj.updateDynamic("ConfusionMatrix")(ConfusionMatrix.asInstanceOf[js.Any])
    if (F1 != null) __obj.updateDynamic("F1")(F1.asInstanceOf[js.Any])
    if (Precision != null) __obj.updateDynamic("Precision")(Precision.asInstanceOf[js.Any])
    if (Recall != null) __obj.updateDynamic("Recall")(Recall.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMatchesMetrics]
  }
}

