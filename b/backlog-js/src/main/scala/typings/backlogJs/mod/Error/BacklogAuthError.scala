package typings.backlogJs.mod.Error

import typings.backlogJs.anon.Errors
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error.BacklogAuthError")
@js.native
class BacklogAuthError protected () extends BacklogError {
  def this(response: Response) = this()
  def this(response: Response, body: Errors) = this()
}

