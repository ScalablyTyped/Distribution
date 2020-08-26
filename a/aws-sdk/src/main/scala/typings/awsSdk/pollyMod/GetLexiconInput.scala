package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLexiconInput extends js.Object {
  /**
    * Name of the lexicon.
    */
  var Name: LexiconName = js.native
}

object GetLexiconInput {
  @scala.inline
  def apply(Name: LexiconName): GetLexiconInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLexiconInput]
  }
  @scala.inline
  implicit class GetLexiconInputOps[Self <: GetLexiconInput] (val x: Self) extends AnyVal {
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
    def setName(value: LexiconName): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
  
}

