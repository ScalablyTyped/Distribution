package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectDominantLanguageRequest extends js.Object {
  /**
    * A UTF-8 text string. Each string should contain at least 20 characters and must contain fewer that 5,000 bytes of UTF-8 encoded characters.
    */
  var Text: String = js.native
}

object DetectDominantLanguageRequest {
  @scala.inline
  def apply(Text: String): DetectDominantLanguageRequest = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectDominantLanguageRequest]
  }
}

