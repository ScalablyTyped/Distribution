package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentimentScore extends js.Object {
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the MIXED sentiment.
    */
  var Mixed: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEGATIVE sentiment.
    */
  var Negative: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the NEUTRAL sentiment.
    */
  var Neutral: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of its detection of the POSITIVE sentiment.
    */
  var Positive: js.UndefOr[Float] = js.native
}

object SentimentScore {
  @scala.inline
  def apply(
    Mixed: js.UndefOr[Float] = js.undefined,
    Negative: js.UndefOr[Float] = js.undefined,
    Neutral: js.UndefOr[Float] = js.undefined,
    Positive: js.UndefOr[Float] = js.undefined
  ): SentimentScore = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Mixed)) __obj.updateDynamic("Mixed")(Mixed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Negative)) __obj.updateDynamic("Negative")(Negative.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Neutral)) __obj.updateDynamic("Neutral")(Neutral.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Positive)) __obj.updateDynamic("Positive")(Positive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentimentScore]
  }
}

