package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowHintOptions extends js.Object {
  var completeSingle: Boolean
  var hint: HintFunction | AsyncHintFunction
}

object ShowHintOptions {
  @scala.inline
  def apply(completeSingle: Boolean, hint: HintFunction | AsyncHintFunction): ShowHintOptions = {
    val __obj = js.Dynamic.literal(completeSingle = completeSingle.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShowHintOptions]
  }
}

