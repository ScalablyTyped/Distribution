package typings.bashGlob.mod

import typings.bashGlob.bashGlobStrings.`match`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bash-glob", "on")
@js.native
object on_match extends js.Object {
  def apply(event: `match`, callback: js.Function2[/* files */ String, /* cwd */ String, Unit]): Unit = js.native
}

