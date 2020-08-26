package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectKeyPhrasesResponse extends js.Object {
  /**
    * A collection of key phrases that Amazon Comprehend identified in the input text. For each key phrase, the response provides the text of the key phrase, where the key phrase begins and ends, and the level of confidence that Amazon Comprehend has in the accuracy of the detection. 
    */
  var KeyPhrases: js.UndefOr[ListOfKeyPhrases] = js.native
}

object DetectKeyPhrasesResponse {
  @scala.inline
  def apply(): DetectKeyPhrasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectKeyPhrasesResponse]
  }
  @scala.inline
  implicit class DetectKeyPhrasesResponseOps[Self <: DetectKeyPhrasesResponse] (val x: Self) extends AnyVal {
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
    def setKeyPhrasesVarargs(value: KeyPhrase*): Self = this.set("KeyPhrases", js.Array(value :_*))
    @scala.inline
    def setKeyPhrases(value: ListOfKeyPhrases): Self = this.set("KeyPhrases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPhrases: Self = this.set("KeyPhrases", js.undefined)
  }
  
}

