package typings.degit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Info extends js.Object {
  val code: String = js.native
  val dest: String = js.native
  val message: String = js.native
  val repo: Degit = js.native
}

object Info {
  @scala.inline
  def apply(code: String, dest: String, message: String, repo: Degit): Info = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDest(value: String): Self = this.set("dest", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepo(value: Degit): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
  
}

