package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartOfSpeechTag extends js.Object {
  /**
    * The confidence that Amazon Comprehend has that the part of speech was correctly identified.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * Identifies the part of speech that the token represents.
    */
  var Tag: js.UndefOr[PartOfSpeechTagType] = js.native
}

object PartOfSpeechTag {
  @scala.inline
  def apply(): PartOfSpeechTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartOfSpeechTag]
  }
  @scala.inline
  implicit class PartOfSpeechTagOps[Self <: PartOfSpeechTag] (val x: Self) extends AnyVal {
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
    def setScore(value: Float): Self = this.set("Score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("Score", js.undefined)
    @scala.inline
    def setTag(value: PartOfSpeechTagType): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("Tag", js.undefined)
  }
  
}

