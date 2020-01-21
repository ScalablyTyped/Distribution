package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectSentimentResponse extends js.Object {
  /**
    * The inferred sentiment that Amazon Comprehend has the highest level of confidence in.
    */
  var Sentiment: js.UndefOr[SentimentType] = js.native
  /**
    * An object that lists the sentiments, and their corresponding confidence levels.
    */
  var SentimentScore: js.UndefOr[typings.awsSdk.comprehendMod.SentimentScore] = js.native
}

object DetectSentimentResponse {
  @scala.inline
  def apply(Sentiment: SentimentType = null, SentimentScore: SentimentScore = null): DetectSentimentResponse = {
    val __obj = js.Dynamic.literal()
    if (Sentiment != null) __obj.updateDynamic("Sentiment")(Sentiment.asInstanceOf[js.Any])
    if (SentimentScore != null) __obj.updateDynamic("SentimentScore")(SentimentScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectSentimentResponse]
  }
}

