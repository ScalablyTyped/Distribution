package typings.connectHistoryApiFallback.mod

import typings.node.urlMod.Url
import typings.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var `match`: RegExpMatchArray = js.native
  var parsedUrl: Url = js.native
}

object Context {
  @scala.inline
  def apply(`match`: RegExpMatchArray, parsedUrl: Url): Context = {
    val __obj = js.Dynamic.literal(parsedUrl = parsedUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
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
    def setMatch(value: RegExpMatchArray): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsedUrl(value: Url): Self = this.set("parsedUrl", value.asInstanceOf[js.Any])
  }
  
}

