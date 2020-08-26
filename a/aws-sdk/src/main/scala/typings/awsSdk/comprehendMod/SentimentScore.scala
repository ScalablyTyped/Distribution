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
  def apply(): SentimentScore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentScore]
  }
  @scala.inline
  implicit class SentimentScoreOps[Self <: SentimentScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMixed(value: Float): Self = this.set("Mixed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixed: Self = this.set("Mixed", js.undefined)
    @scala.inline
    def setNegative(value: Float): Self = this.set("Negative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative: Self = this.set("Negative", js.undefined)
    @scala.inline
    def setNeutral(value: Float): Self = this.set("Neutral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeutral: Self = this.set("Neutral", js.undefined)
    @scala.inline
    def setPositive(value: Float): Self = this.set("Positive", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositive: Self = this.set("Positive", js.undefined)
  }
  
}

