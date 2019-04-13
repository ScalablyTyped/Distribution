package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowHintOptions extends js.Object {
  var completeSingle: scala.Boolean
  var hint: HintFunction | AsyncHintFunction
}

object ShowHintOptions {
  @scala.inline
  def apply(completeSingle: scala.Boolean, hint: HintFunction | AsyncHintFunction): ShowHintOptions = {
    val __obj = js.Dynamic.literal(completeSingle = completeSingle, hint = hint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ShowHintOptions]
  }
}

