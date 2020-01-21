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
}

