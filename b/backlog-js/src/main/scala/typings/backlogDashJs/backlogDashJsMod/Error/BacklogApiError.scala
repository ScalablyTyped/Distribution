package typings.backlogDashJs.backlogDashJsMod.Error

import typings.backlogDashJs.Anon_Errors
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backlog-js", "Error.BacklogApiError")
@js.native
class BacklogApiError protected () extends BacklogError {
  def this(response: Response) = this()
  def this(response: Response, body: Anon_Errors) = this()
}

