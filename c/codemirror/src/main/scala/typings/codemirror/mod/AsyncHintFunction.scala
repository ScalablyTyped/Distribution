package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncHintFunction extends js.Object {
  
  def apply(cm: Editor, callback: js.Function1[/* hints */ Hints, _]): js.Any = js.native
  
  var async: js.UndefOr[Boolean] = js.native
}
