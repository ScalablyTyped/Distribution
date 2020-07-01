package typings.degit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  val code: String
  val dest: String
  val message: String
  val repo: Degit
}

object Info {
  @scala.inline
  def apply(code: String, dest: String, message: String, repo: Degit): Info = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}

