package typings.awsSdk.lexruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SentimentResponse extends js.Object {
  /**
    * The inferred sentiment that Amazon Comprehend has the highest confidence in.
    */
  var sentimentLabel: js.UndefOr[SentimentLabel] = js.native
  /**
    * The likelihood that the sentiment was correctly inferred.
    */
  var sentimentScore: js.UndefOr[SentimentScore] = js.native
}

object SentimentResponse {
  @scala.inline
  def apply(sentimentLabel: SentimentLabel = null, sentimentScore: SentimentScore = null): SentimentResponse = {
    val __obj = js.Dynamic.literal()
    if (sentimentLabel != null) __obj.updateDynamic("sentimentLabel")(sentimentLabel.asInstanceOf[js.Any])
    if (sentimentScore != null) __obj.updateDynamic("sentimentScore")(sentimentScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentimentResponse]
  }
}

