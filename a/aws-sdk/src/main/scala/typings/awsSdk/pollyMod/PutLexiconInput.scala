package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLexiconInput extends js.Object {
  /**
    * Content of the PLS lexicon as string data.
    */
  var Content: LexiconContent = js.native
  /**
    * Name of the lexicon. The name must follow the regular express format [0-9A-Za-z]{1,20}. That is, the name is a case-sensitive alphanumeric string up to 20 characters long. 
    */
  var Name: LexiconName = js.native
}

object PutLexiconInput {
  @scala.inline
  def apply(Content: LexiconContent, Name: LexiconName): PutLexiconInput = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLexiconInput]
  }
  @scala.inline
  implicit class PutLexiconInputOps[Self <: PutLexiconInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: LexiconContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: LexiconName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

