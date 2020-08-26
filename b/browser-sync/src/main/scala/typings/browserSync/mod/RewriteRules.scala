package typings.browserSync.mod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RewriteRules extends js.Object {
  var fn: js.UndefOr[
    js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* match */ String, String]
  ] = js.native
  var `match`: RegExp = js.native
  var replace: js.UndefOr[String] = js.native
}

object RewriteRules {
  @scala.inline
  def apply(`match`: RegExp): RewriteRules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RewriteRules]
  }
  @scala.inline
  implicit class RewriteRulesOps[Self <: RewriteRules] (val x: Self) extends AnyVal {
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
    def setMatch(value: RegExp): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setFn(value: (/* req */ IncomingMessage, /* res */ ServerResponse, /* match */ String) => String): Self = this.set("fn", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFn: Self = this.set("fn", js.undefined)
    @scala.inline
    def setReplace(value: String): Self = this.set("replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
  }
  
}

