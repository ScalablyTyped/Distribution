package typings.awsSdk.pollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLexiconInput extends js.Object {
  /**
    * The name of the lexicon to delete. Must be an existing lexicon in the region.
    */
  var Name: LexiconName = js.native
}

object DeleteLexiconInput {
  @scala.inline
  def apply(Name: LexiconName): DeleteLexiconInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLexiconInput]
  }
}

