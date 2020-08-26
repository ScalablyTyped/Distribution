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
  def apply(): SentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SentimentResponse]
  }
  @scala.inline
  implicit class SentimentResponseOps[Self <: SentimentResponse] (val x: Self) extends AnyVal {
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
    def setSentimentLabel(value: SentimentLabel): Self = this.set("sentimentLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentimentLabel: Self = this.set("sentimentLabel", js.undefined)
    @scala.inline
    def setSentimentScore(value: SentimentScore): Self = this.set("sentimentScore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSentimentScore: Self = this.set("sentimentScore", js.undefined)
  }
  
}

