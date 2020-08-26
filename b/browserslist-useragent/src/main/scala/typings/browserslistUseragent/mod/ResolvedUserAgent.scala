package typings.browserslistUseragent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolvedUserAgent extends js.Object {
  var family: String = js.native
  var version: String = js.native
}

object ResolvedUserAgent {
  @scala.inline
  def apply(family: String, version: String): ResolvedUserAgent = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedUserAgent]
  }
  @scala.inline
  implicit class ResolvedUserAgentOps[Self <: ResolvedUserAgent] (val x: Self) extends AnyVal {
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

