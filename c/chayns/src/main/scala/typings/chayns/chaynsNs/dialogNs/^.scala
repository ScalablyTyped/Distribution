package typings.chayns.chaynsNs.dialogNs

import typings.chayns.DialogButton
import typings.chayns.DialogDateConfig
import typings.chayns.DialogDateResult
import typings.chayns.DialogFacebookOptions
import typings.chayns.DialogFacebookResult
import typings.chayns.DialogInputConfig
import typings.chayns.DialogInputResult
import typings.chayns.DialogSelectConfig
import typings.chayns.DialogSelectResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chayns.dialog")
@js.native
object ^ extends js.Object {
  def alert(title: String): js.Promise[buttonType] = js.native
  def alert(title: String, message: String): js.Promise[buttonType] = js.native
  def confirm(title: String): js.Promise[buttonType] = js.native
  def confirm(title: String, message: String): js.Promise[buttonType] = js.native
  def confirm(title: String, message: String, buttons: js.Array[DialogButton]): js.Promise[buttonType] = js.native
  def date(config: DialogDateConfig): js.Promise[DialogDateResult] = js.native
  def facebook(options: DialogFacebookOptions): js.Promise[DialogFacebookResult] = js.native
  def input(config: DialogInputConfig): js.Promise[DialogInputResult] = js.native
  def select(config: DialogSelectConfig): js.Promise[DialogSelectResult] = js.native
}

