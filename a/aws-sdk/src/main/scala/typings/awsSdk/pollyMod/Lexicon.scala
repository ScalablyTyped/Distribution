package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lexicon extends js.Object {
  /**
    * Lexicon content in string format. The content of a lexicon must be in PLS format.
    */
  var Content: js.UndefOr[LexiconContent] = js.native
  /**
    * Name of the lexicon.
    */
  var Name: js.UndefOr[LexiconName] = js.native
}

object Lexicon {
  @scala.inline
  def apply(): Lexicon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lexicon]
  }
  @scala.inline
  implicit class LexiconOps[Self <: Lexicon] (val x: Self) extends AnyVal {
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
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setName(value: LexiconName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

