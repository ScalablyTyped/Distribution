package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncHintFunction extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  def apply(cm: Editor, callback: js.Function1[/* hints */ Hints, _]): js.Any = js.native
}

